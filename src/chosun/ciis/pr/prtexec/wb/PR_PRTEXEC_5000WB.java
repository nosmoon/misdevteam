package chosun.ciis.pr.prtexec.wb;

import java.rmi.RemoteException;

import java.util.Hashtable;

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

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

public class PR_PRTEXEC_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 전체발행내역
     */
    /**
     * 콤보 셋팅
     */
	public void pr_prtexec_5000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5000_LDataSet ds = null;
		
		PR_PRTEXEC_5000_LDM dm = new PR_PRTEXEC_5000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();

		ds = (PR_PRTEXEC_5000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	/*
	 * 		전표부수 변경확인
	 */
	public void pr_prtexec_5011_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5011_ADataSet ds = null;
		
		PR_PRTEXEC_5011_ADM dm = new PR_PRTEXEC_5011_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (PR_PRTEXEC_5011_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 		전표부수 이력조회
	 */
	public void pr_prtexec_5012_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5012_LDataSet ds = null;
		
		PR_PRTEXEC_5012_LDM dm = new PR_PRTEXEC_5012_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
		dm.clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();

		ds = (PR_PRTEXEC_5012_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 		매체별 자재
	 */
	public void pr_prtexec_5013_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5013_LDataSet ds = null;
		
		PR_PRTEXEC_5013_LDM dm = new PR_PRTEXEC_5013_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (PR_PRTEXEC_5013_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 		매체별 자재
	 */
	public void pr_prtexec_5014_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5014_ADataSet ds = null;
		
		PR_PRTEXEC_5014_ADM dm = new PR_PRTEXEC_5014_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.setIncmg_pers_ipaddr(Util.checkString(req.getRemoteAddr()));
		dm.setIncmg_pers(Util.getSessionParameterValue(req,"emp_no",true));
		dm.setChg_pers(Util.getSessionParameterValue(req,"emp_no",true));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);

   	    dm.gubun                = (String)hash.get("m");
   	    dm.gubun				= dm.gubun.toUpperCase();
   	    dm.issu_dt              = (String)hash.get("issu_dt");
	    dm.prt_dt               = (String)hash.get("prt_dt");
	    dm.fac_clsf         	= (String)hash.get("fac_clsf");
	    dm.medi_cd				= (String)hash.get("medi_cd");
	    dm.sect_cd         		= (String)hash.get("sect_cd");
	    dm.pap_std         		= (String)hash.get("pap_std");
	    dm.prt_clsf         	= (String)hash.get("prt_clsf");
	    dm.issu_pcnt         	= (String)hash.get("issu_pcnt");
	    dm.matr_cd              = (String)hash.get("matr_cd");
   	    dm.slip_qty              = (String)hash.get("slip_qty");
		dm.print();

		ds = (PR_PRTEXEC_5014_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	/*
	 * 		전체발행내역 마감
	 */
	public void pr_prtexec_5020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5020_ADataSet ds = null;
		
		PR_PRTEXEC_5020_ADM dm = new PR_PRTEXEC_5020_ADM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req,"cmpycd",true));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIncmg_pers_ipaddr(Util.checkString(req.getRemoteAddr()));
		dm.setIncmg_pers(Util.getSessionParameterValue(req,"emp_no",true));
		dm.print();

		ds = (PR_PRTEXEC_5020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5030_ADataSet ds = null;
		
		PR_PRTEXEC_5030_ADM dm = new PR_PRTEXEC_5030_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PRTEXEC_5030_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5031_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5031_ADataSet ds = null;
		
		PR_PRTEXEC_5031_ADM dm = new PR_PRTEXEC_5031_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PRTEXEC_5031_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5032_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5032_ADataSet ds = null;
		
		PR_PRTEXEC_5032_ADM dm = new PR_PRTEXEC_5032_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PRTEXEC_5032_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	/**
	 * 자재 참고사항 조회
	 */
	public void pr_prtexec_5033_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5033_SDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_5033_SDM dm = new PR_PRTEXEC_5033_SDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setPrt_dt(Util.checkString(req.getParameter("prt_dt")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_5033_SDataSet)manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5034_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5034_ADataSet ds = null;
		
		PR_PRTEXEC_5034_ADM dm = new PR_PRTEXEC_5034_ADM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMode(Util.checkString(req.getParameter("mode")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setPrt_dt(Util.checkString(req.getParameter("prt_dt")));
    	dm.setRef_matt(Util.checkString(req.getParameter("ref_matt")));
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (PR_PRTEXEC_5034_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5040_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5040_LDataSet ds = null;
		
		PR_PRTEXEC_5040_LDM dm = new PR_PRTEXEC_5040_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PRTEXEC_5040_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5050_LDataSet ds = null;
		
		PR_PRTEXEC_5050_LDM dm = new PR_PRTEXEC_5050_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PRTEXEC_5050_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5060_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5060_LDataSet ds = null;
		
		PR_PRTEXEC_5060_LDM dm = new PR_PRTEXEC_5060_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.uprc_yn	= Util.checkString(req.getParameter("uprc_yn"));
		dm.print();

		ds = (PR_PRTEXEC_5060_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5070_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5070_ADataSet ds = null;
		PR_PRTEXEC_5070_ADM dm 	= new PR_PRTEXEC_5070_ADM();
		String gubun          	= "";
		String issu_dt        	= "";
		String fac_clsf       	= "";
		String medi_cd        	= "";
		String sect_cd        	= "";
		String prt_clsf        	= "";
		String pap_std        	= "";
		String issu_pcnt      	= "";
		String bw_pcnt        	= "";
		String clr_pcnt       	= "";
		String slip_qty       	= "";
		String is_cnt_ex_yn   	= "";
		String is_qty_inc_yn  	= "";
		String add_prt_seq    	= "";
		String dual_out_clsf  	= "";
		String duty_ovt_prt_yn	= "";
		String remk           	= "";
		String prt_dt         	= "";
		String seq				= "";
		String occr_dt			= "";

		String gubun2          	= "";
		String issu_dt2        	= "";
		String fac_clsf2       	= "";
		String medi_cd2        	= "";
		String sect_cd2        	= "";
		String prt_clsf2		= "";
		String pap_std2        	= "";
		String issu_pcnt2      	= "";
		String bw_pcnt2        	= "";
		String clr_pcnt2       	= "";
		String slip_qty2       	= "";
		String is_cnt_ex_yn2   	= "";
		String is_qty_inc_yn2  	= "";
		String remk2           	= "";
		String prt_dt2         	= "";
		String seq2				= "";
		String occr_dt2			= "";
		
		String gubun3          	= "";
		String issu_dt3        	= "";
		String fac_clsf3       	= "";
		String medi_cd3        	= "";
		String sect_cd3        	= "";
		String prt_clsf3       	= "";
		String pap_std3        	= "";
		String papcmpy_cd3		= "";
		String issu_pcnt3      	= "";
		String bw_pcnt3        	= "";
		String clr_pcnt3       	= "";
		String slip_qty3       	= "";
		String is_cnt_ex_yn3   	= "";
		String is_qty_inc_yn3  	= "";
		String add_prt_seq3    	= "";
		String dual_out_clsf3  	= "";
		String duty_ovt_prt_yn3	= "";
		String remk3           	= "";
		String prt_dt3         	= "";
		String seq3				= "";
		String occr_dt3			= "";

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String[] converted1      = convertMultiUpdateData(multiUpdateData1);
		//for (int i=0; i<converted1.length; i++){
		//	System.out.println("converted1[" + i + "]=" + converted1[i] );
		//}

		gubun          	= converted1[0];
		issu_dt        	= converted1[2];
		prt_dt         	= converted1[3];
		fac_clsf       	= converted1[4];
		medi_cd        	= converted1[5];
		sect_cd        	= converted1[7];
		prt_clsf       	= converted1[8];
		pap_std        	= converted1[9];
		issu_pcnt      	= converted1[10];
		clr_pcnt       	= converted1[11];
		bw_pcnt        	= converted1[12];
		slip_qty       	= converted1[13];
		is_cnt_ex_yn   	= converted1[14];
		is_qty_inc_yn  	= converted1[15];
		add_prt_seq    	= converted1[16];
		dual_out_clsf  	= converted1[17];
		duty_ovt_prt_yn	= converted1[18];
		remk           	= converted1[19];
		seq            	= converted1[21];
		occr_dt         = converted1[22];

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		String[] converted2      = convertMultiUpdateData(multiUpdateData2);
		//for (int i=0; i<converted2.length; i++){
		//	System.out.println("converted2[" + i + "]=" + converted2[i] );
		//}

		gubun2         	= converted2[0];
		issu_dt2       	= converted2[2];
		prt_dt2        	= converted2[3];
		fac_clsf2      	= converted2[4];
		medi_cd2       	= converted2[5];
		sect_cd2       	= converted2[6];
		prt_clsf2      	= converted2[7];
		pap_std2       	= converted2[8];
		issu_pcnt2     	= converted2[9];
		clr_pcnt2      	= converted2[10];
		bw_pcnt2       	= converted2[11];
		slip_qty2      	= converted2[12];
		is_cnt_ex_yn2   = converted2[13];
		is_qty_inc_yn2  = converted2[14];
		remk2          	= converted2[15];
		seq2           	= converted2[17];
		occr_dt2        = converted2[18];

		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
		String[] converted3      = convertMultiUpdateData(multiUpdateData3);
		//for (int i=0; i<converted3.length; i++){
		//	System.out.println("converted3[" + i + "]=" + converted3[i] );
		//}

		gubun3         	= converted3[0];
		issu_dt3       	= converted3[2];
		prt_dt3        	= converted3[3];
		fac_clsf3      	= converted3[4];
		medi_cd3       	= converted3[5];
		sect_cd3       	= converted3[6];
		prt_clsf3      	= converted3[7];
		pap_std3       	= converted3[8];
		papcmpy_cd3    	= converted3[9];
		issu_pcnt3     	= converted3[10];
		clr_pcnt3      	= converted3[11];
		bw_pcnt3       	= converted3[12];
		slip_qty3      	= converted3[13];
		is_cnt_ex_yn3   = converted3[14];
		is_qty_inc_yn3  = converted3[15];
		remk3          	= converted3[16];
		seq3           	= converted3[18];
		occr_dt3        = converted3[19];
		
		dm.setGubun(gubun.toUpperCase());
		dm.setIssu_dt(issu_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setSect_cd(sect_cd);
		dm.setPrt_clsf(prt_clsf);
		dm.setPap_std(pap_std);
		dm.setIssu_pcnt(issu_pcnt);
		dm.setBw_pcnt(bw_pcnt);
		dm.setClr_pcnt(clr_pcnt);
		dm.setSlip_qty(slip_qty);
		dm.setIs_cnt_ex_yn(is_cnt_ex_yn);
		dm.setIs_qty_inc_yn(is_qty_inc_yn);
		dm.setAdd_prt_seq(add_prt_seq);
		dm.setDual_out_clsf(dual_out_clsf);
		dm.setDuty_ovt_prt_yn(duty_ovt_prt_yn);
		dm.setRemk(remk);
		dm.setPrt_dt(prt_dt);
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);

		dm.setGubun2(gubun2.toUpperCase());
		dm.setIssu_dt2(issu_dt2);
		dm.setFac_clsf2(fac_clsf2);
		dm.setMedi_cd2(medi_cd2);
		dm.setSect_cd2(sect_cd2);
		dm.setPrt_clsf2(prt_clsf2);
		dm.setPap_std2(pap_std2);
		dm.setIssu_pcnt2(issu_pcnt2);
		dm.setBw_pcnt2(bw_pcnt2);
		dm.setClr_pcnt2(clr_pcnt2);
		dm.setSlip_qty2(slip_qty2);
		dm.setIs_cnt_ex_yn2(is_cnt_ex_yn2);
		dm.setIs_qty_inc_yn2(is_qty_inc_yn2);
		dm.setRemk2(remk2);
		dm.setPrt_dt2(prt_dt2);
		dm.setSeq2(seq2);
		dm.setOccr_dt2(occr_dt2);

		dm.setGubun3(gubun3.toUpperCase());
		dm.setIssu_dt3(issu_dt3);
		dm.setFac_clsf3(fac_clsf3);
		dm.setMedi_cd3(medi_cd3);
		dm.setSect_cd3(sect_cd3);
		dm.setPrt_clsf3(prt_clsf3);
		dm.setPap_std3(pap_std3);
		dm.setPapcmpy_cd3(papcmpy_cd3);
		dm.setIssu_pcnt3(issu_pcnt3);
		dm.setBw_pcnt3(bw_pcnt3);
		dm.setClr_pcnt3(clr_pcnt3);
		dm.setSlip_qty3(slip_qty3);
		dm.setIs_cnt_ex_yn3(is_cnt_ex_yn3);
		dm.setIs_qty_inc_yn3(is_qty_inc_yn3);
		dm.setAdd_prt_seq3(add_prt_seq3);
		dm.setDual_out_clsf3(dual_out_clsf3);
		dm.setDuty_ovt_prt_yn3(duty_ovt_prt_yn3);
		dm.setRemk3(remk3);
		dm.setPrt_dt3(prt_dt3);
		dm.setSeq3(seq3);
		dm.setOccr_dt3(occr_dt3);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PRTEXEC_5070_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_prtexec_5090_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5090_ADataSet ds = null;
		PR_PRTEXEC_5090_ADM dm = new PR_PRTEXEC_5090_ADM();

		String multiUpdateData_h = Util.checkString(req.getParameter("multiUpData_h"));
		String multiUpdateData_s = Util.checkString(req.getParameter("multiUpData_s"));

		String[] converted_h = convertMultiUpdateData(multiUpdateData_h);
		String[] converted_s = convertMultiUpdateData(multiUpdateData_s);

		String gubun_s          =converted_s[0];
		String slip_qty_s       =converted_s[10];
		String is_cnt_ex_yn_s   =converted_s[11];
		String is_qty_inc_yn_s  =converted_s[12];
		String remk_s           =converted_s[16];
		String seq_s            =converted_s[19];
		String occr_dt_s        =converted_s[20];
        String endgbn_s = "";

		if(gubun_s.equals("")) {
			endgbn_s = "E";
		} else {
			endgbn_s = "C";
		}
		dm.setGubun_s(gubun_s);
		dm.setSlip_qty_s(slip_qty_s);
		dm.setIs_cnt_ex_yn_s(is_cnt_ex_yn_s);
		dm.setIs_qty_inc_yn_s(is_qty_inc_yn_s);
		dm.setRemk_s(remk_s);
		dm.setSeq_s(seq_s);
		dm.setOccr_dt_s(occr_dt_s);
		dm.setEndgbn_s(endgbn_s);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		String gubun_h          =converted_h[0];
		String issu_dt_h        =converted_h[2];
		String fac_clsf_h       =converted_h[3];
		String medi_cd_h        =converted_h[4];
		String sect_cd_h        =converted_h[5];
		String pap_std_h        =converted_h[6];
		String issu_pcnt_h      =converted_h[7];
		String bw_pcnt_h        =converted_h[9];
		String clr_pcnt_h       =converted_h[8];
		String slip_qty_h       =converted_h[10];
		String remk_h           =converted_h[11];
		String hdqt_paper_clsf_h=converted_h[12];
		String seq_h            =converted_h[13];
		String occr_dt_h        =converted_h[14];

        String endgbn_h = "";
		if(gubun_h.equals("")) {
			endgbn_h = "E";
		} else {
			endgbn_h = "C";
		}
		dm.setGubun_h(gubun_h);
		dm.setIssu_dt_h(issu_dt_h);
		dm.setFac_clsf_h(fac_clsf_h);
		dm.setMedi_cd_h(medi_cd_h);
		dm.setSect_cd_h(sect_cd_h);
		dm.setPap_std_h(pap_std_h);
		dm.setIssu_pcnt_h(issu_pcnt_h);
		dm.setBw_pcnt_h(bw_pcnt_h);
		dm.setClr_pcnt_h(clr_pcnt_h);
		dm.setSlip_qty_h(slip_qty_h);
		dm.setRemk_h(remk_h);
		dm.setHdqt_paper_clsf_h(hdqt_paper_clsf_h);
		dm.setSeq_h(seq_h);
		dm.setOccr_dt_h(occr_dt_h);
		dm.setEndgbn_h(endgbn_h);

		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PRTEXEC_5090_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	/*
	 * 		부재료출고매체체크
	 */
	public void pr_prtexec_5080_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5080_LDataSet ds = null;
		
		PR_PRTEXEC_5080_LDM dm = new PR_PRTEXEC_5080_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();

		ds = (PR_PRTEXEC_5080_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}