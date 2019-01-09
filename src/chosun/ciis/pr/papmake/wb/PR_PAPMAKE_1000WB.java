package chosun.ciis.pr.papmake.wb;

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

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;
 
public class PR_PAPMAKE_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * TAB 1 자재 내역 등록
     */
    /**  
     * 콤보 셋팅
     */
    public void pr_papmake_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PAPMAKE_1000_LDataSet ds = null;
		PR_PAPMAKE_1000_LDM dm = new PR_PAPMAKE_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt_fr = Util.checkString(req.getParameter("duty_dt_fr"));
		dm.duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	public void pr_papmake_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1001_LDataSet ds = null;
		PR_PAPMAKE_1001_LDM dm = new PR_PAPMAKE_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (PR_PAPMAKE_1001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1004_ADataSet ds = null;
		
		PR_PAPMAKE_1004_ADM dm = new PR_PAPMAKE_1004_ADM();
	    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
	    String[] converted1      = convertMultiUpdateData(multiUpdateData1);
	    //for (int i=0; i<converted1.length; i++){
		//	System.out.println("converted1[" + i + "]=" + converted1[i] );
		//}
		
		String gubun 	        = converted1[0];
		String medi_cd          = converted1[2];
		String seq				= converted1[3];
		String medi_nm			= converted1[4];
		String ecnt    	    	= converted1[5];
		String ledt_nm 	    	= converted1[6];
		String last_side		= converted1[7];		
		String rmsg_tm			= converted1[8];
		String prt_bgn_tm		= converted1[9];
		String prt_end_tm		= converted1[10];
		String prt_qty			= converted1[11];
		String out_gate			= converted1[12];
		String apcut_err		= converted1[13];
		String runcut_err		= converted1[14];
		String remk				= converted1[15];
		
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
	    String[] converted2      = convertMultiUpdateData(multiUpdateData2);
	    //for (int i=0; i<converted2.length; i++){
		//	System.out.println("converted2[" + i + "]=" + converted2[i] );
		//}
	    String medi_cd_2		= converted2[3];
	    String pcnt				= converted2[6];
	    String clr_pcnt			= converted2[7];
	    String pj_qty			= converted2[8];
	    String remk2			= converted2[9];
	    String seq2				= converted2[10];
		//String sect_cd_2		= converted2[9];
		
		
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
	    String[] converted3      = convertMultiUpdateData(multiUpdateData3);
	    //for (int i=0; i<converted3.length; i++){
		//	System.out.println("converted3[" + i + "]=" + converted3[i] );
		//}
	    
	    String medi_cd_3		= converted3[2];
		String seq3				= converted3[3];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setIssu_dt(Util.checkString(req.getParameter("duty_dt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setMedi_cd(medi_cd);
		dm.setSeq(seq);
		dm.setMedi_nm(medi_nm);
		dm.setLast_side(last_side);
		dm.setEcnt(ecnt);
		dm.setLedt_nm(ledt_nm);
		dm.setRmsg_tm(rmsg_tm);
		dm.setPrt_bgn_tm(prt_bgn_tm);
		dm.setPrt_end_tm(prt_end_tm);
		dm.setPrt_qty(prt_qty);
		dm.setOut_gate(out_gate);
		dm.setApcut_err(apcut_err);
		dm.setRuncut_err(runcut_err);
		dm.setRemk(remk);
		
		dm.setDuty_dt(Util.checkString(req.getParameter("duty_dt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setPcnt(pcnt);
		dm.setClr_pcnt(clr_pcnt);
		dm.setPj_qty(pj_qty);
		dm.setRemk_2(remk2);
		dm.setMedi_cd_2(medi_cd_2);
		dm.setSeq2(seq2);
		
		dm.setSeq3(seq3);
		dm.setMedi_cd_3(medi_cd_3);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1004_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1005_LDataSet ds = null;
		
		PR_PAPMAKE_1005_LDM dm = new PR_PAPMAKE_1005_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1005_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1006_ADataSet ds = null;
		
		PR_PAPMAKE_1006_ADM dm = new PR_PAPMAKE_1006_ADM();
	    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
	    String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
	    String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
	    String multiUpdateData4 = Util.checkString(req.getParameter("multiUpData4"));

	    String[] converted1      = convertMultiUpdateData(multiUpdateData1);
	    String[] converted2      = convertMultiUpdateData(multiUpdateData2);
	    String[] converted3      = convertMultiUpdateData(multiUpdateData3);
	    String[] converted4      = convertMultiUpdateData(multiUpdateData4);
	    
	    /*
	    for (int i=0; i<converted1.length; i++){
			System.out.println("converted1[" + i + "]=" + converted1[i] );
		}
	    for (int i=0; i<converted2.length; i++){
			System.out.println("converted2[" + i + "]=" + converted2[i] );
		}
	    for (int i=0; i<converted3.length; i++){
			System.out.println("converted3[" + i + "]=" + converted3[i] );
		}
	    for (int i=0; i<converted4.length; i++){
			System.out.println("converted4[" + i + "]=" + converted4[i] );
		}
		*/
	    
	    String vip_matr_clsf	= converted1[3];
	    String seq_1			= converted1[4];
		String matr_cd_1		= converted1[5];
		String dlco_cd_1		= converted1[6];
		String use_qunt_1_1	    = converted1[8];
		String use_qunt_2_1		= converted1[9];
		String dlco_nm_1		= converted1[10];
		
		String seq_2			= converted2[4];
		String matr_cd_2		= converted2[5];
		String dlco_cd_2		= converted2[6];
		String use_qunt_1_2	    = converted2[8];
		String dlco_nm_2		= converted2[9];
		
		String seq_3			= converted3[4];
		String matr_cd_3	    = converted3[5];
		String dlco_cd_3		= converted3[6];
		String use_qunt_1_3	    = converted3[8];
		String dlco_nm_3		= converted3[9];
		
		String medi_cd			= converted4[3] + COL_SEPARATOR + converted4[3] + COL_SEPARATOR + converted4[3] + COL_SEPARATOR + converted4[3];
		String use_qunt_1_4		= converted4[4] + COL_SEPARATOR + converted4[6] + COL_SEPARATOR + converted4[8] + COL_SEPARATOR + converted4[11];
		String matr_cd_4		= converted4[5] + COL_SEPARATOR + converted4[7] + COL_SEPARATOR + converted4[9] + COL_SEPARATOR + converted4[12];

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setDuty_dt(Util.checkString(req.getParameter("duty_dt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		
		dm.setVip_matr_clsf(vip_matr_clsf);
		dm.setSeq_1(seq_1);
		dm.setMatr_cd_1(matr_cd_1);
		dm.setDlco_cd_1(dlco_cd_1);
		dm.setDlco_nm_1(dlco_nm_1);
		dm.setUse_qunt_1_1(use_qunt_1_1);
		dm.setUse_qunt_2_1(use_qunt_2_1);
		
		dm.setSeq_2(seq_2);
		dm.setMatr_cd_2(matr_cd_2);
		dm.setDlco_cd_2(dlco_cd_2);
		dm.setDlco_nm_2(dlco_nm_2);
		dm.setUse_qunt_1_2(use_qunt_1_2);
		
		dm.setSeq_3(seq_3);
		dm.setMatr_cd_3(matr_cd_3);
		dm.setDlco_cd_3(dlco_cd_3);
		dm.setDlco_nm_3(dlco_nm_3);
		dm.setUse_qunt_1_3(use_qunt_1_3);
		
		dm.setMatr_cd_4(matr_cd_4);
		dm.setMedi_cd(medi_cd);
		dm.setUse_qunt_1_4(use_qunt_1_4);
		
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1006_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1007_LDataSet ds = null;
		
		PR_PAPMAKE_1007_LDM dm = new PR_PAPMAKE_1007_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1007_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1008_LDataSet ds = null;
		
		PR_PAPMAKE_1008_LDM dm = new PR_PAPMAKE_1008_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1008_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1009_LDataSet ds = null;
		
		PR_PAPMAKE_1009_LDM dm = new PR_PAPMAKE_1009_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1009_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	//	제작일지 제작사항 정보 삭제
	public void pr_papmake_1010_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1010_DDataSet ds = null;
		
		PR_PAPMAKE_1010_DDM dm = new PR_PAPMAKE_1010_DDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1010_DDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1011_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1011_ADataSet ds = null;
		
		PR_PAPMAKE_1011_ADM dm = new PR_PAPMAKE_1011_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.wk_duty_nops = Util.checkString(req.getParameter("wk_duty_nops"));
		dm.ngt_duty_nops = Util.checkString(req.getParameter("ngt_duty_nops"));
		dm.dtfree_nops = Util.checkString(req.getParameter("dtfree_nops"));
		dm.vaca_nops = Util.checkString(req.getParameter("vaca_nops"));
		dm.dspch_nops = Util.checkString(req.getParameter("dspch_nops"));
		dm.etc_nops = Util.checkString(req.getParameter("etc_nops"));
		dm.night_shift_liab_pers = Util.checkString(req.getParameter("night_shift_liab_pers"));
		dm.mchn_1_duty_pers = Util.checkString(req.getParameter("mchn_1_duty_pers"));
		dm.mchn_2_duty_pers = Util.checkString(req.getParameter("mchn_2_duty_pers"));
		dm.mchn_3_duty_pers = Util.checkString(req.getParameter("mchn_3_duty_pers"));
		dm.mchn_4_duty_pers = Util.checkString(req.getParameter("mchn_4_duty_pers"));
		dm.mchn_duty_pers = Util.checkString(req.getParameter("mchn_duty_pers"));
		dm.befo_duty_pers = Util.checkString(req.getParameter("befo_duty_pers"));
		dm.prt_board_duty_pers = Util.checkString(req.getParameter("prt_board_duty_pers"));
		dm.send_duty_pers = Util.checkString(req.getParameter("send_duty_pers"));
		dm.etc_duty_pers = Util.checkString(req.getParameter("etc_duty_pers"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1011_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_papmake_1012_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1012_UDataSet ds = null;
		
		PR_PAPMAKE_1012_UDM dm = new PR_PAPMAKE_1012_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1012_UDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1013_LDataSet ds = null;
		
		PR_PAPMAKE_1013_LDM dm = new PR_PAPMAKE_1013_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1013_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1014_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1014_UDataSet ds = null;
		
		PR_PAPMAKE_1014_UDM dm = new PR_PAPMAKE_1014_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1014_UDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1020_ADataSet ds = null;
		
		PR_PAPMAKE_1020_ADM dm = new PR_PAPMAKE_1020_ADM();
	    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
	    String[] converted      = convertMultiUpdateData(multiUpdateData);
	    //for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
	    
		String gubun 	        = converted[0];
		String sub_seq    	    = converted[3];
		String prt_clsf         = converted[4];		
		String mesr_plac_clsf   = converted[5];
		String tmpt         	= converted[6];
		String hmdt             = converted[7];
		String cnfm_tm          = converted[8];		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun.toUpperCase());
		dm.setDuty_dt(Util.checkString(req.getParameter("duty_dt")));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setSub_seq(sub_seq);
		dm.setPrt_clsf(prt_clsf);
		dm.setMesr_plac_clsf(mesr_plac_clsf);
		dm.setTmpt(tmpt);
		dm.setHmdt(hmdt);
		dm.setCnfm_tm(cnfm_tm);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_PAPMAKE_1020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1021_LDataSet ds = null;
		
		PR_PAPMAKE_1021_LDM dm = new PR_PAPMAKE_1021_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1021_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1030_ADataSet ds = null;
		
		PR_PAPMAKE_1030_ADM dm = new PR_PAPMAKE_1030_ADM();
		String multiUpdateData	= Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
	    //String[] converted      = convertMultiUpdateData(multiUpdateData);
	    //for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
	    
		
    	
		//String gubun 	        = converted[0];
		//String seq    	        = converted[2];
		//String ref_clsf         = converted[3];
		//String ref_clsf         = converted[4];
		//String ref_matt         = converted[5];		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		
		dm.gubun = (String)hash.get("gubun");
    	dm.seq   = (String)hash.get("seq");
    	dm.ref_clsf   = (String)hash.get("ref_clsf");
    	dm.ref_matt   = (String)hash.get("ref_matt");
    	
		//dm.setGubun(gubun.toUpperCase());
		
		//dm.setSeq(seq);
		//dm.setRef_clsf(ref_clsf);
		//dm.setRef_matt(ref_matt);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		ds = (PR_PAPMAKE_1030_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1031_LDataSet ds = null;
		
		PR_PAPMAKE_1031_LDM dm = new PR_PAPMAKE_1031_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1031_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void pr_papmake_1051_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1051_LDataSet ds = null;
		
		PR_PAPMAKE_1051_LDM dm = new PR_PAPMAKE_1051_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1051_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1052_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1052_LDataSet ds = null;
		
		PR_PAPMAKE_1052_LDM dm = new PR_PAPMAKE_1052_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();
		
		ds = (PR_PAPMAKE_1052_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void pr_papmake_1053_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1053_LDataSet ds = null;
		
		PR_PAPMAKE_1053_LDM dm = new PR_PAPMAKE_1053_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.duty_dt = Util.checkString(req.getParameter("duty_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (PR_PAPMAKE_1053_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}