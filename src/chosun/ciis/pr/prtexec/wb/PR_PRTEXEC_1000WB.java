package chosun.ciis.pr.prtexec.wb;

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
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1000_MDataSet;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

public class PR_PRTEXEC_1000WB extends BaseWB {

	/**
	 * 멀티레코드처리 row 구분자
	 */
	public final String ROW_SEPARATOR = "|";
	/**
	 * 멀티레코드처리 column 구분자
	 */
	public final String COL_SEPARATOR = "#";

	/**
	 * 광고면수단수정보 조회
	 */
	public void pr_prtexec_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1001_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1001_LDM dm = new PR_PRTEXEC_1001_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
		dm.print();
		
		ds = (PR_PRTEXEC_1001_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
    	req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행정보 조회
	 */
	public void pr_prtexec_1100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1100_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1100_LDM dm = new PR_PRTEXEC_1100_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setPrt_dt(Util.checkString(req.getParameter("prt_dt")));
		dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
		dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.print();
		
		ds = (PR_PRTEXEC_1100_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행을 구성하기 위한 발송정보 조회
	 */
	public void pr_prtexec_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1101_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1101_LDM dm = new PR_PRTEXEC_1101_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPrt_dt(Util.checkString(req.getParameter("prt_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1101_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행 등록,수정,삭제
	 */
	public void pr_prtexec_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_1102_ADataSet ds = null;
    	
        // DM Setting
    	PR_PRTEXEC_1102_ADM dm = new PR_PRTEXEC_1102_ADM();
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		String mode = Util.checkString(req.getParameter("mode"));
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun			= converted[0];
		String fac_clsf_nm		= converted[2];
		String fac_clsf			= converted[3];
		String medi_nm			= converted[4];
		String sect_nm			= converted[5];
		String medi_cd			= converted[6];
		String sect_cd			= converted[7];
		String ecnt				= converted[8];
		String clr_off_plat_tm	= converted[9];
		String off_plat_tm		= converted[10];
		String rmsg_tm			= converted[11];
		String prt_bgn_tm		= converted[12];
		String prt_end_tm		= converted[13];
		
		String slip_qty			= converted[14];
		String real_prt_qty		= converted[15];
		String bad_nwsp_qty		= converted[16];
		String card_qty			= converted[17];
		String dqty				= converted[18];
		String apcut_err		= converted[19];
		String driv_cut_err		= converted[20];
		
		String prt_ex_qunt		= converted[21];
		String remk				= converted[22];
		String seq				= converted[23];
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMode(Util.checkString(req.getParameter("mode")));
    	dm.setGubun(gubun.toUpperCase());
    	dm.setSeq(seq);
    	dm.setPrt_dt(Util.checkString(req.getParameter("prt_dt")));
   	    dm.setFac_clsf(fac_clsf);
   	    dm.setMedi_cd(medi_cd);
   	    dm.setMedi_nm(medi_nm);
   	    dm.setSect_cd(sect_cd);
   	    dm.setEcnt(ecnt);
   	    dm.setClr_off_plat_tm(clr_off_plat_tm);
   	    dm.setOff_plat_tm(off_plat_tm);
   	    dm.setTrsm_end_tm(rmsg_tm);
   	    dm.setPrt_bgn_tm(prt_bgn_tm);
   	    dm.setPrt_end_tm(prt_end_tm);
   	    dm.setSlip_qty(slip_qty);
   	    dm.setReal_prt_qty(real_prt_qty);
   	    dm.setBad_nwsp_qty(bad_nwsp_qty);
   	    dm.setCard_qty(card_qty);
   	    dm.setDqty(dqty);
   	    dm.setApcut_err(apcut_err);
   	    dm.setDriv_cut_err(driv_cut_err);
   	    dm.setPrt_ex_qunt(prt_ex_qunt);
   	    dm.setRemk(remk);
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1102_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
	
	/**
	 * 인쇄실행 특기사항 조회
	 */
	public void pr_prtexec_1103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1103_SDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1103_SDM dm = new PR_PRTEXEC_1103_SDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1103_SDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행 특기사항 등록
	 */
	public void pr_prtexec_1104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1104_ADataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1104_ADM dm = new PR_PRTEXEC_1104_ADM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMode(Util.checkString(req.getParameter("mode")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setRef_matt(Util.checkString(req.getParameter("ref_matt")));
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1104_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행 특기사항 초기화면
	 */
	public void pr_prtexec_1105(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1105_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1105_LDM dm = new PR_PRTEXEC_1105_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();
		
		ds = (PR_PRTEXEC_1105_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
	 * 제작시간현황 조회
	 */
	public void pr_prtexec_1200(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1200_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1200_LDM dm = new PR_PRTEXEC_1200_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
		dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.print();
		
		ds = (PR_PRTEXEC_1200_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄기준정보 조회
	 */
	public void pr_prtexec_1300(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1300_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1300_LDM dm = new PR_PRTEXEC_1300_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setAply_dt(Util.checkString(req.getParameter("aply_dt")));
		dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
		dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
		dm.setPcnt(Util.checkString(req.getParameter("pcnt")));
		dm.setClr_pcnt(Util.checkString(req.getParameter("clr_pcnt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.print();
		
		ds = (PR_PRTEXEC_1300_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	/**
	 * 주간발행기준정보 조회
	 */
	public void pr_prtexec_1301(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1301_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1301_LDM dm = new PR_PRTEXEC_1301_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1301_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}
    
	/**
	 * 인쇄기준 등록,수정,삭제
	 */
	public void pr_prtexec_1302(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_1302_ADataSet ds = null;
    	
    	// DM Setting
    	PR_PRTEXEC_1302_ADM dm = new PR_PRTEXEC_1302_ADM();
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun			= converted[0];

		String aply_dt			= converted[2];
		String fac_clsf			= converted[3];
		String medi_cd			= converted[4];
		String sect_cd			= converted[6];
		String ecnt				= converted[7];
		String issu_pcnt		= converted[8];
		String clr_pcnt			= converted[9];
		String clr_off_plat_tm	= converted[10];
		String off_plat_tm		= converted[11];
		String trsm_end_tm		= converted[12];
		String prt_bgn_tm		= converted[13];
		String prt_end_tm		= converted[14];
		String prt_qty			= converted[15];
		String occr_dt			= converted[16];
		String seq				= converted[17];
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setGubun(gubun.toUpperCase());
    	dm.setAply_dt(aply_dt);
   	    dm.setFac_clsf(fac_clsf);
   	    dm.setMedi_cd(medi_cd);
   	    dm.setSect_cd(sect_cd);
   	    dm.setEcnt(ecnt);
   	    dm.setIssu_pcnt(issu_pcnt);
   	    dm.setClr_pcnt(clr_pcnt);
   	    dm.setOff_plat_tm(off_plat_tm);
   	    dm.setClr_off_plat_tm(clr_off_plat_tm);
   	    dm.setTrsm_end_tm(trsm_end_tm);
   	    dm.setPrt_bgn_tm(prt_bgn_tm);
   	    dm.setPrt_end_tm(prt_end_tm);
   	    dm.setPrt_qty(prt_qty);
   	    dm.setOccr_dt(occr_dt);
   	    dm.setSeq(seq);
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1302_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

    	req.setAttribute("ds", ds);
    }
	
	/**
	 * 인쇄실행면수 조회
	 */
	public void pr_prtexec_1400(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_1400_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_1400_LDM dm = new PR_PRTEXEC_1400_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setMedi_clsf(Util.checkString(req.getParameter("medi_clsf")));
		dm.print();
		
		ds = (PR_PRTEXEC_1400_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
	 * 인쇄실행면수 등록,수정,삭제
	 */
	public void pr_prtexec_1401(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_1401_ADataSet ds = null;
    	
        // DM Setting
    	PR_PRTEXEC_1401_ADM dm = new PR_PRTEXEC_1401_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMode(Util.checkString(req.getParameter("mode")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setMedi_clsf(Util.checkString(req.getParameter("medi_clsf")));
   	    dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
   	    dm.setIssu_pcnt(Util.checkString(req.getParameter("issu_pcnt")));
   	    dm.setClr_pcnt(Util.checkString(req.getParameter("clr_pcnt")));
   	    dm.setBw_pcnt(Util.checkString(req.getParameter("bw_pcnt")));
   	    dm.setSep_prtn_pcnt(Util.checkString(req.getParameter("sep_prtn_pcnt")));
   	    dm.setRemk(Util.checkString(req.getParameter("remk")));
   	    dm.setHdqt_paper_nm(Util.checkString(req.getParameter("hdqt_paper_nm")));
   	    dm.setPc_paper_nm(Util.checkString(req.getParameter("pc_paper_nm")));
   	    dm.setSn_paper_nm(Util.checkString(req.getParameter("sn_paper_nm")));
   	    dm.setBp_paper_nm(Util.checkString(req.getParameter("bp_paper_nm")));
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_1401_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
}