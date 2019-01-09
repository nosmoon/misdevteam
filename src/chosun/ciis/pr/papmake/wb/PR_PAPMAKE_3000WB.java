package chosun.ciis.pr.papmake.wb;

import java.rmi.RemoteException;


import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;
 
public class PR_PAPMAKE_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /*
	 *  인쇄용역비 기준정보 조회
	*/
	public void pr_papmake_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3000_LDataSet ds = null;
		
		PR_PAPMAKE_3000_LDM dm = new PR_PAPMAKE_3000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
		dm.aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_3000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/*
	 *  인쇄용역비 기준정보 조회를 위한 공장구분코드 조회
	*/
	public void pr_papmake_3001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3001_LDataSet ds = null;
		
		PR_PAPMAKE_3001_LDM dm = new PR_PAPMAKE_3001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PAPMAKE_3001_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 *  인쇄용역비 기준정보 등록,수정,삭제
	*/
	public void pr_papmake_3010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3010_ADataSet ds = null;
		
		PR_PAPMAKE_3010_ADM dm = new PR_PAPMAKE_3010_ADM();
        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
	    String[] converted                = convertMultiUpdateData(multiUpdateData);
		String gubun 	                  = converted[0];
		String occr_dt                    = converted[2];
		String seq    	                  = converted[4];
		String aply_dt 	                  = converted[5];
		String fac_clsf 	              = converted[6];
		String basi_prt_qty               = converted[7];		
		String base_servcost              = converted[8];
		String basi_excs_qty              = converted[9];
		String basi_excs_servcost         = converted[10];
		String basi_make_pcnt             = converted[11];
		String base_make_servcost         = converted[12];
		String basi_excs_pcnt             = converted[13];
		String basi_excs_make_servcost    = converted[14];
		String basi_ovt_prt_qty           = converted[15];
		String basi_sep_prtn_servcost     = converted[16];
		String crps_cost     			  = converted[17];

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setOccr_dt(occr_dt);
		dm.setAply_dt(aply_dt);
		dm.setSeq(seq);
		dm.setFac_clsf(fac_clsf);
		dm.setBasi_prt_qty(basi_prt_qty);
		dm.setBase_servcost(base_servcost);
		dm.setBasi_excs_qty(basi_excs_qty);
		dm.setBasi_excs_servcost(basi_excs_servcost);
		dm.setBasi_make_pcnt(basi_make_pcnt);
		dm.setBase_make_servcost(base_make_servcost);
		dm.setBasi_excs_pcnt(basi_excs_pcnt);
		dm.setBasi_excs_make_servcost(basi_excs_make_servcost);
		dm.setBasi_ovt_prt_qty(basi_ovt_prt_qty);
		dm.setBasi_sep_prtn_servcost(basi_sep_prtn_servcost);
		dm.setCrps_cost(crps_cost);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (PR_PAPMAKE_3010_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	/*
	 *  인쇄용역비 기준정보 조회를 위한 공장구분코드 조회
	*/
	public void pr_papmake_3100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3100_MDataSet ds = null;
		
		PR_PAPMAKE_3100_MDM dm = new PR_PAPMAKE_3100_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PAPMAKE_3100_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	/*
	 *  인쇄용역비 기준정보 조회
	*/
	public void pr_papmake_3101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3101_LDataSet ds = null;
		
		PR_PAPMAKE_3101_LDM dm = new PR_PAPMAKE_3101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_3101_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	/*
	 *  기타자재비 단가관리 조회
	*/
	public void pr_papmake_3201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3201_LDataSet ds = null;
		
		PR_PAPMAKE_3201_LDM dm = new PR_PAPMAKE_3201_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_3201_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	/*
	 *  자재사용량관리 조회
	*/
	public void pr_papmake_3301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3301_LDataSet ds = null;
		
		PR_PAPMAKE_3301_LDM dm = new PR_PAPMAKE_3301_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_3301_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	/*
	 *  인쇄비출력물 조회
	*/
	public void pr_papmake_3501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3501_LDataSet ds = null;
		
		PR_PAPMAKE_3501_LDM dm = new PR_PAPMAKE_3501_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_3501_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	/*
	 *  인쇄비출력물 조회
	*/
	public void pr_papmake_3502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3502_LDataSet ds = null;
		
		PR_PAPMAKE_3502_LDM dm = new PR_PAPMAKE_3502_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.print();
		
		ds = (PR_PAPMAKE_3502_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_3600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3600_MDataSet ds = null;
		
		PR_PAPMAKE_3600_MDM dm = new PR_PAPMAKE_3600_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PAPMAKE_3600_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}