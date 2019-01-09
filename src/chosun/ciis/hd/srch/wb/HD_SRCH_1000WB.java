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

package chosun.ciis.hd.srch.wb;

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
import chosun.ciis.hd.cost.dm.HD_COST_1202_ADM;
import chosun.ciis.hd.cost.ds.HD_COST_1202_ADataSet;
import chosun.ciis.hd.saly.ds.HD_SALY_5003_LDataSet;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;


/**
 * 
 */
 
public class HD_SRCH_1000WB extends BaseWB {
 
	public void hd_srch_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1000_LDataSet ds = null;
		HD_SRCH_1000_LDM dm = new HD_SRCH_1000_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_SRCH_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1010_LDataSet ds = null;
		HD_SRCH_1010_LDM dm = new HD_SRCH_1010_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.cur_job_cd = Util.checkString(req.getParameter("cur_job_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
		dm.print();
		
		ds = (HD_SRCH_1010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1020_LDataSet ds = null;
		HD_SRCH_1020_LDM dm = new HD_SRCH_1020_LDM();
		System.out.println("2222222222");
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.cur_job_cd = Util.checkString(req.getParameter("cur_job_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SRCH_1020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_srch_1030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1030_LDataSet ds = null;
		HD_SRCH_1030_LDM dm = new HD_SRCH_1030_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.cur_job_cd = Util.checkString(req.getParameter("cur_job_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
		
		ds = (HD_SRCH_1030_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_srch_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1200_LDataSet ds = null;
		HD_SRCH_1200_LDM dm = new HD_SRCH_1200_LDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.search_ck = Util.checkString(req.getParameter("search_ck"));
		dm.lvcmpy_ck = Util.checkString(req.getParameter("lvcmpy_ck"));
		
		ds = (HD_SRCH_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1300_LDataSet ds = null;
		HD_SRCH_1300_LDM dm = new HD_SRCH_1300_LDM();
		
		String st_j_dt = Util.checkString(req.getParameter("st_j_dt"));
		String et_j_dt = Util.checkString(req.getParameter("et_j_dt"));
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.st_j_dt = st_j_dt;
		dm.et_j_dt = et_j_dt;
		
		dm.print();
		
		ds = (HD_SRCH_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_srch_1300_100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1300_100_LDataSet ds = null;
		HD_SRCH_1300_100_LDM dm = new HD_SRCH_1300_100_LDM();
		
		String st_j_dt = Util.checkString(req.getParameter("st_j_dt"));
		String et_j_dt = Util.checkString(req.getParameter("et_j_dt"));
		
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.st_j_dt = st_j_dt;
		dm.et_j_dt = et_j_dt;
		
		dm.print();
		
		ds = (HD_SRCH_1300_100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_srch_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1400_LDataSet ds = null;
		HD_SRCH_1400_LDM dm = new HD_SRCH_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.pick_st_dt = Util.checkString(req.getParameter("pick_st_dt")+"01");
		dm.pick_et_dt = Util.checkString(req.getParameter("pick_et_dt")+"01");
		dm.print();
		
		ds = (HD_SRCH_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1400_100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1400_100_LDataSet ds = null;
		HD_SRCH_1400_100_LDM dm = new HD_SRCH_1400_100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.pick_st_dt = Util.checkString(req.getParameter("pick_st_dt")+"01");
		dm.pick_et_dt = Util.checkString(req.getParameter("pick_et_dt")+"01");
		dm.print();
		
		ds = (HD_SRCH_1400_100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1500_LDataSet ds = null;
		HD_SRCH_1500_LDM dm = new HD_SRCH_1500_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_st_dt = Util.checkString(req.getParameter("in_cmpy_st_dt"));
		dm.in_cmpy_et_dt = Util.checkString(req.getParameter("in_cmpy_et_dt"));
		dm.std_dt = Util.checkString(req.getParameter("std_dt"));
		dm.stay_ck = Util.checkString(req.getParameter("stay_ck"));

		dm.print();
		
		ds = (HD_SRCH_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_srch_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1600_LDataSet ds = null;
		HD_SRCH_1600_LDM dm = new HD_SRCH_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SRCH_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1601_LDataSet ds = null;
		HD_SRCH_1601_LDM dm = new HD_SRCH_1601_LDM();

		dm.cmpy_cd = dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.stay_ck = Util.checkString(req.getParameter("stay_ck"));
		dm.basic_dt = Util.checkString(req.getParameter("basic_dt"));

		dm.print();
		
		ds = (HD_SRCH_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1602_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1602_MDataSet ds = null;
		HD_SRCH_1602_MDM dm = new HD_SRCH_1602_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SRCH_1602_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1700_LDataSet ds = null;
		HD_SRCH_1700_LDM dm = new HD_SRCH_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));

		dm.print();
		
		ds = (HD_SRCH_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_srch_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1800_LDataSet ds = null;
		HD_SRCH_1800_LDM dm = new HD_SRCH_1800_LDM();

		String vaca_ck=Util.checkString(req.getParameter("vaca_ck"));
		String vaca_ck_10 ="";
		String vaca_ck_20 ="";
		String vaca_ck_30 ="";
		String vaca_ck_40 ="";
		String vaca_ck_50 ="";
		String vaca_ck_60 ="";
		String vaca_ck_70 ="";
		String whereStr ="";
		
		String[] vaca_ck_arr = vaca_ck.split("\\|");

		boolean vaca_or_ck = false;
		int vaca_len = vaca_ck_arr.length;
		
		for(int i = 0; i < vaca_len; i++)
		{
			System.out.println("i=====>"+vaca_ck_arr[i]);
			if(vaca_ck_arr[i].equals("10")) vaca_ck_10 = "10";
			if(vaca_ck_arr[i].equals("20")) vaca_ck_20 = "20";
			if(vaca_ck_arr[i].equals("30")) vaca_ck_30 = "30";
			if(vaca_ck_arr[i].equals("40")) vaca_ck_40 = "40";
			if(vaca_ck_arr[i].equals("50")) vaca_ck_50 = "50";
			if(vaca_ck_arr[i].equals("60")) vaca_ck_60 = "60";
			if(vaca_ck_arr[i].equals("70")) vaca_ck_70 = "70";
		}
		
		
		if("10".equals(vaca_ck_10) || "20".equals(vaca_ck_20) || "30".equals(vaca_ck_30) || "40".equals(vaca_ck_40) || "60".equals(vaca_ck_60)|| "70".equals(vaca_ck_70)){
		
			whereStr = " AND (";
			
			if("10".equals(vaca_ck_10)) {
				whereStr += "  B.APPMT_CD = 'A03' ";
				vaca_or_ck = true;
			}
			
			if("20".equals(vaca_ck_20) ) {
				if(vaca_or_ck == false)
				{
					whereStr += " B.APPMT_CD = 'A41' ";
					vaca_or_ck = true;
				}else{
					whereStr += " OR B.APPMT_CD = 'A41' ";
				}
			}
			if("30".equals(vaca_ck_30)) {
				if(vaca_or_ck == false)
				{
					whereStr += "  B.APPMT_CD IN ('A53','A56','A57') ";
					vaca_or_ck = true;
				}else{
					whereStr += " OR B.APPMT_CD IN ('A53','A56','A57') ";
				}
			}
	
			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			 // 2013.10.14 오인성 과장님 요청으로 인해  tv조선일 경우 계약사원의 구분 코드를  41 -> 30,40,41로 추가함 
			if(dm.cmpy_cd == "100")
			{
				if("40".equals(vaca_ck_40)) {
					if(vaca_or_ck == false)
					{
						whereStr += " (A.EMP_CLSF ='41' AND B.APPMT_CD IN ('A01','A02','A03','A07')) "; // 40 계약사원에서 41유기계약사원으로 변경 2013.1.18 윤세영대리 요청 
						vaca_or_ck = true;
					} else {
						whereStr += " OR (A.EMP_CLSF ='41' AND B.APPMT_CD IN ('A01','A02','A03','A07')) ";
					}
				}
			}
			else 
			{
				if("40".equals(vaca_ck_40)) {
					if(vaca_or_ck == false)
					{
						whereStr += " (A.EMP_CLSF IN ('30','40','41') AND B.APPMT_CD IN ('A01','A02','A03','A07')) "; // 40 계약사원에서 41유기계약사원으로 변경 2013.1.18 윤세영대리 요청 
						vaca_or_ck = true;
					} else {
						whereStr += " OR (A.EMP_CLSF IN ('30','40','41') AND B.APPMT_CD IN ('A01','A02','A03','A07')) ";
					}
				}
			}
			if("60".equals(vaca_ck_60)) {
				if(vaca_or_ck == false)
				{
					whereStr += " B.APPMT_CD = 'A82'  ";
					vaca_or_ck = true;
				} else {
					whereStr += " OR B.APPMT_CD = 'A82'  ";
					
				}
			}
			
			if("70".equals(vaca_ck_70)) { //공준완씨 요청으로 파견 조건 생성 
				if(vaca_or_ck == false)
				{
					whereStr += "  B.APPMT_CD IN ('A24','A25','A26','A27','A52','A54','A55') "; // 2016.10.18 'A24','A25','A26','A27' 코드 추가함  tv조선 송관석 요청(조선일보 강승훈 승인)
					vaca_or_ck = true;
				}else{
					whereStr += " OR B.APPMT_CD IN ('A24','A25','A26','A27','A52','A54','A55') ";// 2016.10.18 'A24','A25','A26','A27' 코드 추가함  tv조선 송관석 요청(조선일보 강승훈 승인)
				}
			}
			
			whereStr += " )";
		}else{
			
			whereStr += " AND TRIM(B.APPMT_CD) IS NULL";
		}

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basic_dt = Util.checkString(req.getParameter("basic_dt"));
		dm.query = whereStr;
		dm.vaca_ck = Util.checkString(vaca_ck_50);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SRCH_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1100_LDataSet ds = null;
		HD_SRCH_1100_LDM dm = new HD_SRCH_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.open_invit_clsf = Util.checkString(req.getParameter("open_invit_clsf"));
		dm.open_invit_desty_min = Util.checkString(req.getParameter("open_invit_desty_min"));
		dm.open_invit_desty_max = Util.checkString(req.getParameter("open_invit_desty_max"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();
		
		ds = (HD_SRCH_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1101_LDataSet ds = null;
		HD_SRCH_1101_LDM dm = new HD_SRCH_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_SRCH_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_srch_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_2000_LDataSet ds = null;
		HD_SRCH_2000_LDM dm = new HD_SRCH_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_clsf1 = Util.checkString(req.getParameter("srch_clsf1"));
		dm.srch_clsf2 = Util.checkString(req.getParameter("srch_clsf2"));
		dm.lvcmpy_yy = Util.checkString(req.getParameter("lvcmpy_yy"));

		dm.print();

		ds = (HD_SRCH_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_3000_LDataSet ds = null;
		HD_SRCH_3000_LDM dm = new HD_SRCH_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
		dm.gb = Util.checkString(req.getParameter("gb"));
		dm.print();

		ds = (HD_SRCH_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_srch_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5101_LDataSet ds = null;
		HD_SRCH_5101_LDM dm = new HD_SRCH_5101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.clsf1  = Util.checkString(req.getParameter("clsf1"));
		dm.clsf2  = Util.checkString(req.getParameter("dtls_item"));
		dm.print();

		ds = (HD_SRCH_5101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_srch_5111_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5111_LDataSet ds = null;
		HD_SRCH_5111_LDM dm = new HD_SRCH_5111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5111_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_srch_5112_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5112_ADataSet ds = null;
	    HD_SRCH_5112_ADM dm = new HD_SRCH_5112_ADM();

	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.clas_clsf = ((String)hash.get("clas_clsf"));
	    dm.emp_clsf = ((String)hash.get("emp_clsf"));
	    dm.prv_nops = ((String)hash.get("prv_nops"));
	    dm.this_nops = ((String)hash.get("this_nops"));
	    dm.cmpr_nops = ((String)hash.get("cmpr_nops"));
	    dm.flag   = ((String)hash.get("flag"));
	    
	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 

	    dm.print();

	    ds = (HD_SRCH_5112_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	
	
	public void hd_srch_5114_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5114_LDataSet ds = null;
		HD_SRCH_5114_LDM dm = new HD_SRCH_5114_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5114_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_srch_5121_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5121_LDataSet ds = null;
		HD_SRCH_5121_LDM dm = new HD_SRCH_5121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5121_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_srch_5122_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5122_ADataSet ds = null;
	    HD_SRCH_5122_ADM dm = new HD_SRCH_5122_ADM();

	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.emp_clsf = ((String)hash.get("emp_clsf"));
	    dm.dept_nops1 = ((String)hash.get("dept_nops1"));
	    dm.dept_nops2 = ((String)hash.get("dept_nops2"));
	    dm.dept_nops3 = ((String)hash.get("dept_nops3"));
	    dm.dept_nops4 = ((String)hash.get("dept_nops4"));
	    dm.dept_nops5 = ((String)hash.get("dept_nops5"));
	    dm.dept_nops6 = ((String)hash.get("dept_nops6"));
	    dm.dept_nops7 = ((String)hash.get("dept_nops7"));
	    dm.dept_nops8 = ((String)hash.get("dept_nops8"));
	    dm.dept_nops9 = ((String)hash.get("dept_nops9"));
	    dm.dept_nops10 = ((String)hash.get("dept_nops10"));
	    dm.sum_nops    = ((String)hash.get("sum_nops"));
	    dm.ratio_nops  = ((String)hash.get("ratio_nops"));
	    dm.flag   = ((String)hash.get("flag"));
	    
	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 

	    dm.print();

	    ds = (HD_SRCH_5122_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }


	public void hd_srch_5123_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5123_LDataSet ds = null;
		HD_SRCH_5123_LDM dm = new HD_SRCH_5123_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5123_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_srch_5131_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5131_LDataSet ds = null;
		HD_SRCH_5131_LDM dm = new HD_SRCH_5131_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5131_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}

	
	public void hd_srch_5132_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5132_ADataSet ds = null;
	    HD_SRCH_5132_ADM dm = new HD_SRCH_5132_ADM();

	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.guk_nm = ((String)hash.get("guk_nm"));
	    dm.dept_nm = ((String)hash.get("dept_nm"));
	    dm.emp_clsf1 = ((String)hash.get("emp_clsf1"));
	    dm.emp_clsf2 = ((String)hash.get("emp_clsf2"));
	    dm.emp_clsf3 = ((String)hash.get("emp_clsf3"));
	    dm.emp_clsf4 = ((String)hash.get("emp_clsf4"));
	    dm.emp_cnt   = ((String)hash.get("emp_cnt"));
	    dm.in_cmpy   = ((String)hash.get("in_cmpy"));
	    dm.lvcmpy    = ((String)hash.get("lvcmpy"));
	    dm.remk      = ((String)hash.get("remk"));
	    
	    dm.flag   = ((String)hash.get("flag"));
	    
	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    dm.print();

	    ds = (HD_SRCH_5132_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	


	public void hd_srch_5133_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5133_LDataSet ds = null;
		HD_SRCH_5133_LDM dm = new HD_SRCH_5133_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5133_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	 // 인사현황 
	public void hd_srch_5211_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5211_LDataSet ds = null;
		HD_SRCH_5211_LDM dm = new HD_SRCH_5211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5211_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_srch_5212_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5212_ADataSet ds = null;
	    HD_SRCH_5212_ADM dm = new HD_SRCH_5212_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*사내파견*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.addm_dept_nm = ((String)hash.get("addm_dept_nm"));
	    dm.dept_nm = ((String)hash.get("dept_nm"));
	    dm.flnm = ((String)hash.get("flnm"));
	    dm.dspch_prd = ((String)hash.get("dspch_prd"));
	    dm.remk = ((String)hash.get("remk"));
	    dm.mode1   =   ((String) hash.get("m")).toUpperCase();
	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

        /*사외파견*/
	    String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
	    Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

	    dm.dept_nm2 = ((String)hash2.get("dept_nm"));
	    dm.flnm2 = ((String)hash2.get("flnm"));
	    dm.posi_nm2 = ((String)hash2.get("posi_nm"));
	    dm.dspch_prd2 = ((String)hash2.get("dspch_prd"));
	    dm.mode2   = ((String) hash2.get("m")).toUpperCase();
	    
	    dm.gridtitle2 = Util.checkString(req.getParameter("gridTitle2")); 
	    dm.head_clsf_02_01 = Util.checkString(req.getParameter("head_clsf_02_01")); 
	    dm.head_clsf_02_02 = Util.checkString(req.getParameter("head_clsf_02_02")); 
	    

	    dm.print();

	    ds = (HD_SRCH_5212_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	public void hd_srch_5213_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5213_LDataSet ds = null;
		HD_SRCH_5213_LDM dm = new HD_SRCH_5213_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5213_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
	public void hd_srch_5221_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5221_LDataSet ds = null;
		HD_SRCH_5221_LDM dm = new HD_SRCH_5221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5221_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	


	public void hd_srch_5222_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5222_ADataSet ds = null;
	    HD_SRCH_5222_ADM dm = new HD_SRCH_5222_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*사내파견*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.emp_clsf_nm = ((String)hash.get("emp_clsf_nm"));
	    dm.dept_nm = ((String)hash.get("dept_nm"));
	    dm.flnm = ((String)hash.get("flnm"));
	    dm.posi_nm = ((String)hash.get("posi_nm"));
	    dm.dspch_prd = ((String)hash.get("dspch_prd"));
	    dm.remk = ((String)hash.get("remk"));
		dm.mode = ((String) hash.get("m")).toUpperCase(); 
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5222_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	public void hd_srch_5223_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5223_LDataSet ds = null;
		HD_SRCH_5223_LDM dm = new HD_SRCH_5223_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5223_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

    
	public void hd_srch_5231_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5231_LDataSet ds = null;
		HD_SRCH_5231_LDM dm = new HD_SRCH_5231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5231_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}



	public void hd_srch_5232_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5232_ADataSet ds = null;
	    HD_SRCH_5232_ADM dm = new HD_SRCH_5232_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*사내파견*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.appmt_resn_nm = ((String)hash.get("appmt_resn_nm"));
	    dm.dept_nm = ((String)hash.get("dept_nm"));
	    dm.flnm = ((String)hash.get("flnm"));
	    dm.dspch_prd = ((String)hash.get("dspch_prd"));
	    dm.remk = ((String)hash.get("remk"));
		dm.mode = ((String) hash.get("m")).toUpperCase();
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5232_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	
	public void hd_srch_5233_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5233_LDataSet ds = null;
		HD_SRCH_5233_LDM dm = new HD_SRCH_5233_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5233_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}

	
	public void hd_srch_5311_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5311_LDataSet ds = null;
		HD_SRCH_5311_LDM dm = new HD_SRCH_5311_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5311_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}

	public void hd_srch_5312_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5312_ADataSet ds = null;
	    HD_SRCH_5312_ADM dm = new HD_SRCH_5312_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*사내파견*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.clas_clsf1 = ((String)hash.get("clas_clsf1"));
	    dm.clas_clsf2 = ((String)hash.get("clas_clsf2"));
	    dm.prv_mm_amt = ((String)hash.get("prv_mm_amt"));
	    dm.base_mm_amt = ((String)hash.get("base_mm_amt"));
	    dm.prvmm_cmpr = ((String)hash.get("prvmm_cmpr"));
	    dm.remk = ((String)hash.get("remk"));
		dm.mode = ((String) hash.get("m")).toUpperCase();

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5312_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	
	public void hd_srch_5313_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5313_LDataSet ds = null;
		HD_SRCH_5313_LDM dm = new HD_SRCH_5313_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5313_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	public void hd_srch_5321_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5321_LDataSet ds = null;
		HD_SRCH_5321_LDM dm = new HD_SRCH_5321_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5321_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_srch_5322_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5322_ADataSet ds = null;
	    HD_SRCH_5322_ADM dm = new HD_SRCH_5322_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*임직원급여지급*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.clsf1 = ((String)hash.get("clsf1"));
	    dm.clsf2 = ((String)hash.get("clsf2"));
	    dm.emp_clsf1 = ((String)hash.get("emp_clsf1"));
	    dm.emp_clsf2 = ((String)hash.get("emp_clsf2"));
	    dm.emp_clsf3 = ((String)hash.get("emp_clsf3"));
	    dm.emp_clsf4 = ((String)hash.get("emp_clsf4"));
	    dm.tot_stot = ((String)hash.get("tot_stot"));
		dm.mode = ((String) hash.get("m")).toUpperCase();

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5322_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }

	
	public void hd_srch_5323_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5323_LDataSet ds = null;
		HD_SRCH_5323_LDM dm = new HD_SRCH_5323_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5323_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	public void hd_srch_5332_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5332_ADataSet ds = null;
	    HD_SRCH_5332_ADM dm = new HD_SRCH_5332_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*직무별*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.clas_clsf1_01 = ((String)hash.get("clas_clsf1_01"));
	    dm.clas_clsf2_01 = ((String)hash.get("clas_clsf2_01"));
	    dm.pre_emp_cnt_01 = ((String)hash.get("pre_emp_cnt_01"));
	    dm.pre_servcost_01 = ((String)hash.get("pre_servcost_01"));
	    dm.emp_cnt_01 = ((String)hash.get("emp_cnt_01"));
	    dm.servcost_01 = ((String)hash.get("servcost_01"));
	    dm.icdc_amt_01 = ((String)hash.get("icdc_amt_01"));
		dm.mode_01 = ((String) hash.get("m")).toUpperCase();

	    
	    dm.gridtitle_01 = Util.checkString(req.getParameter("gridTitle_01")); 
	    
	    

	    /*회사별*/
	    dm.head_clsf_02_01 = Util.checkString(req.getParameter("head_clsf_02_01")); 
	    dm.head_clsf_02_02 = Util.checkString(req.getParameter("head_clsf_02_02")); 
	    
	    String multiUpdateData_02 = Util.checkString(req.getParameter("multiUpDate2"));
	    Hashtable hash_02 = getHashMultiUpdateData(multiUpdateData_02);

	    dm.clas_clsf1_02 = ((String)hash_02.get("clas_clsf1_02"));
	    dm.clas_clsf2_02 = ((String)hash_02.get("clas_clsf2_02"));
	    dm.pre_emp_cnt_02 = ((String)hash_02.get("pre_emp_cnt_02"));
	    dm.pre_servcost_02 = ((String)hash_02.get("pre_servcost_02"));
	    dm.emp_cnt_02 = ((String)hash_02.get("emp_cnt_02"));
	    dm.servcost_02 = ((String)hash_02.get("servcost_02"));
	    dm.remk_02 = ((String)hash_02.get("remk_02"));
		dm.mode_02 = ((String) hash_02.get("m")).toUpperCase();

	    
	    dm.gridtitle_02 = Util.checkString(req.getParameter("gridTitle_02")); 

	    
	    dm.print();

	    ds = (HD_SRCH_5332_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	
	public void hd_srch_5333_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5333_LDataSet ds = null;
		HD_SRCH_5333_LDM dm = new HD_SRCH_5333_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5333_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	
	public void hd_srch_5411_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5411_LDataSet ds = null;
		HD_SRCH_5411_LDM dm = new HD_SRCH_5411_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5411_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}


	public void hd_srch_5412_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5412_ADataSet ds = null;
	    HD_SRCH_5412_ADM dm = new HD_SRCH_5412_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*임직원급여지급*/
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.clas_clsf1 = ((String)hash.get("clas_clsf1"));
	    dm.clas_clsf2 = ((String)hash.get("clas_clsf2"));
	    dm.prv_mm_amt = ((String)hash.get("prv_mm_amt"));
	    dm.base_mm_amt = ((String)hash.get("base_mm_amt"));
	    dm.prvmm_cmpr = ((String)hash.get("prvmm_cmpr"));
	    dm.remk = ((String)hash.get("remk"));
		dm.mode = ((String) hash.get("m")).toUpperCase();

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5412_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }

	public void hd_srch_5413_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5413_LDataSet ds = null;
		HD_SRCH_5413_LDM dm = new HD_SRCH_5413_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5413_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	

	public void hd_srch_5511_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5511_LDataSet ds = null;
		HD_SRCH_5511_LDM dm = new HD_SRCH_5511_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5511_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}

	public void hd_srch_5512_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5512_ADataSet ds = null;
	    HD_SRCH_5512_ADM dm = new HD_SRCH_5512_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /*방송평가지표 */
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.yymm = ((String)hash.get("yymm"));
	    dm.human_resour_1 = ((String)hash.get("human_resour_1"));
	    dm.human_resour_2 = ((String)hash.get("human_resour_2"));
	    dm.tot_nops_cnt = ((String)hash.get("tot_nops_cnt"));
	    dm.emp_clsf_30_cnt = ((String)hash.get("emp_clsf_30_cnt"));
	    dm.emp_ratio = ((String)hash.get("emp_ratio"));
	    dm.emp_fml_cnt = ((String)hash.get("emp_fml_cnt"));
		dm.mode = ((String) hash.get("m")).toUpperCase();
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5512_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	public void hd_srch_5513_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5513_LDataSet ds = null;
		HD_SRCH_5513_LDM dm = new HD_SRCH_5513_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5513_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	
	public void hd_srch_5521_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5521_LDataSet ds = null;
		HD_SRCH_5521_LDM dm = new HD_SRCH_5521_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5521_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}

	public void hd_srch_5522_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5522_ADataSet ds = null;
	    HD_SRCH_5522_ADM dm = new HD_SRCH_5522_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /* 비정규직 비율  */
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.emp_clsf = ((String)hash.get("emp_clsf"));
	    dm.prv_mm = ((String)hash.get("prv_mm"));
	    dm.base_mm = ((String)hash.get("base_mm"));
	    dm.prvmm_cmpr = ((String)hash.get("prvmm_cmpr"));
	    dm.icdc_rate = ((String)hash.get("icdc_rate"));
		dm.mode = ((String) hash.get("m")).toUpperCase();
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5522_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	public void hd_srch_5523_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5523_LDataSet ds = null;
		HD_SRCH_5523_LDM dm = new HD_SRCH_5523_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5523_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	
	public void hd_srch_5531_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5531_LDataSet ds = null;
		HD_SRCH_5531_LDM dm = new HD_SRCH_5531_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5531_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	

	public void hd_srch_5532_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5532_ADataSet ds = null;
	    HD_SRCH_5532_ADM dm = new HD_SRCH_5532_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /* 직종별 연본현황   */
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.posk_gbn = ((String)hash.get("posk_gbn"));
	    dm.m_cnt = ((String)hash.get("m_cnt"));
	    dm.m_avg_saly = ((String)hash.get("m_avg_saly"));
	    dm.m_sum_saly = ((String)hash.get("m_sum_saly"));
	    dm.w_cnt = ((String)hash.get("w_cnt"));
	    dm.w_avg_saly = ((String)hash.get("w_avg_saly"));
	    dm.w_sum_saly = ((String)hash.get("w_sum_saly"));
	    dm.tot_cnt = ((String)hash.get("tot_cnt"));
	    dm.tot_avg_saly = ((String)hash.get("tot_avg_saly"));
	    dm.tot_sum_saly = ((String)hash.get("tot_sum_saly"));
	    
		dm.mode = ((String) hash.get("m")).toUpperCase();
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5532_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
	

	public void hd_srch_5533_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5533_LDataSet ds = null;
		HD_SRCH_5533_LDM dm = new HD_SRCH_5533_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5533_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
	public void hd_srch_5541_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5541_LDataSet ds = null;
		HD_SRCH_5541_LDM dm = new HD_SRCH_5541_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5541_LDataSet)manager.executeCall(dm);

		
		if (!"".equals(ds.errcode)) {

        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	

	public void hd_srch_5542_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_SRCH_5542_ADataSet ds = null;
	    HD_SRCH_5542_ADM dm = new HD_SRCH_5542_ADM();


	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    
	    dm.basi_dt = Util.checkString(req.getParameter("basi_dt")); 
	    dm.text_tag = Util.checkString(req.getParameter("text_tag")); 
	    
	    /* 직종별 연본현황   */
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

	    dm.guk_nm = ((String)hash.get("guk_nm"));
	    dm.dept_nm = ((String)hash.get("dept_nm"));
	    dm.emp_clsf1 = ((String)hash.get("emp_clsf1"));
	    dm.emp_clsf2 = ((String)hash.get("emp_clsf2"));
	    dm.emp_clsf3 = ((String)hash.get("emp_clsf3"));
	    dm.emp_clsf4 = ((String)hash.get("emp_clsf4"));
	    dm.emp_clsf5 = ((String)hash.get("emp_clsf5"));
	    dm.emp_clsf6 = ((String)hash.get("emp_clsf6"));
	    dm.emp_clsf7 = ((String)hash.get("emp_clsf7"));
	    dm.emp_clsf8 = ((String)hash.get("emp_clsf8"));
	    dm.emp_clsf9 = ((String)hash.get("emp_clsf9"));
	    dm.emp_clsf10 = ((String)hash.get("emp_clsf10"));
	    dm.emp_clsf11 = ((String)hash.get("emp_clsf11"));
	    dm.tot_sum = ((String)hash.get("tot_sum"));
	    
		dm.mode = ((String) hash.get("m")).toUpperCase();
		
	    dm.head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01")); 
	    dm.head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01")); 
	    dm.head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02")); 

	    
	    dm.gridtitle = Util.checkString(req.getParameter("gridTitle")); 

	    dm.print();

	    ds = (HD_SRCH_5542_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }

	public void hd_srch_5543_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SRCH_5543_LDataSet ds = null;
		HD_SRCH_5543_LDM dm = new HD_SRCH_5543_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt  = Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_SRCH_5543_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
 	}
	
}