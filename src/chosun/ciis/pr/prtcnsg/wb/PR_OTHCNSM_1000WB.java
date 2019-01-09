package chosun.ciis.pr.prtcnsg.wb;                                                                                       
                                                                                             
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
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;
                                                                                             
public class PR_OTHCNSM_1000WB extends BaseWB {                                                                          
 	// 위탁인쇄소모입력 콤보 조회                                                                                         
 	public void pr_othcnsm_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {                  
 		DBManager manager = new DBManager("MISMAT");
 		PR_OTHCNSM_2000_MDataSet ds = null;
 		
 		PR_OTHCNSM_2000_MDM dm = new PR_OTHCNSM_2000_MDM();
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);                                                     
 		dm.print();
 		
 		ds = (PR_OTHCNSM_2000_MDataSet)manager.executeCall(dm);
 		
 		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
 		
 		req.setAttribute("ds", ds);
 	}
 	
 	// 외간인쇄소모입력 조회                                                                                              
 	public void pr_othcnsm_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {                  
 		DBManager manager = new DBManager("MISMAT");
 		PR_OTHCNSM_2100_LDataSet ds = null;                                                                               
 		PR_OTHCNSM_2100_LDM dm = new PR_OTHCNSM_2100_LDM();                                                               
                                                                                             
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);                                                    
 		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));                                                     
 		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));                                                       
 		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));                                                         
 		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
 		dm.prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
 		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
 		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
 		dm.print();
 		
 		ds = (PR_OTHCNSM_2100_LDataSet)manager.executeCall(dm);
 		
 		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
 		
 		req.setAttribute("ds", ds);
 	}                                                                                                                     

	// 위탁인쇄소모입력 등록/수정                                                                                         
 	public void pr_othcnsm_2101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
 		PR_OTHCNSM_2101_ADataSet ds = null;
 		PR_OTHCNSM_2101_ADM dm = new PR_OTHCNSM_2101_ADM();                                                
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
 		dm.mode = Util.checkString(req.getParameter("mode"));
 		dm.film_use_qunt = Util.checkString(req.getParameter("film_use_qunt"));
 		dm.ink_use_qunt = Util.checkString(req.getParameter("ink_use_qunt"));
 		dm.dest_qunt = Util.checkString(req.getParameter("dest_qunt"));
 		dm.prd_cnt = Util.checkString(req.getParameter("prd_cnt"));
 		
 		dm.paper_wgt = Util.checkString(req.getParameter("paper_wgt"));
 		dm.seq = Util.checkString(req.getParameter("seq"));
 		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
 		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
 		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
 		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
 		dm.prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
 		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
 		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
 		
 		dm.leas_use_fee = Util.checkString(req.getParameter("leas_use_fee"));
 		dm.base_leas_fee = Util.checkString(req.getParameter("base_leas_fee"));
 		dm.real_leas_fee = Util.checkString(req.getParameter("real_leas_fee"));
 		dm.etc_matr_fee		= Util.checkString(req.getParameter("etc_matr_fee"));
 		dm.film_make_fee = Util.checkString(req.getParameter("film_make_fee"));
 		dm.ink_use_amt = Util.checkString(req.getParameter("ink_use_amt"));
 		dm.psplat_use_amt = Util.checkString(req.getParameter("psplat_use_amt"));
 		dm.gnaw_fee = Util.checkString(req.getParameter("gnaw_fee"));
 		dm.prt_fee = Util.checkString(req.getParameter("prt_fee"));
 		dm.pack_fee = Util.checkString(req.getParameter("pack_fee"));
 		dm.dest_fee = Util.checkString(req.getParameter("dest_fee"));
 		
 		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
 		dm.paper_amt = Util.checkString(req.getParameter("paper_amt"));
 		
 		dm.issu_qty = Util.checkString(req.getParameter("issu_qty"));
 		dm.issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
 		dm.bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
 		dm.clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
 		dm.clr_prt_fee = Util.checkString(req.getParameter("clr_prt_fee"));
 		dm.bw_prt_fee = Util.checkString(req.getParameter("bw_prt_fee"));
 		dm.prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
 		dm.prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
 		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);                                             
 		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());	
 		                                                                                                                  
 		String gubun             = ""; // 구분                                                                            
 		String psplat_clsf       = ""; // PS판구분                                                                        
 		String use_qunt          = ""; // 사용량                                                                          
 		String nul_plat_cnt      = ""; // 공판수                                                                          
 		String seq               = ""; // 일련번호                                                                        
 		String occr_dt           = ""; // 발생일자                                                                        
 		String sub_seq           = ""; // 서브일련번호  
 		String paper_amt		 = ""; // 용지대
 		String gubun_3           = ""; // 구분
 		String ink_matr_3   	 = ""; // 잉크자재
 		String use_qunt_3   	 = ""; // 잉크사용량
 		String seq_3			 = ""; // 일련번호
 		String occr_dt_3		 = ""; // 발생일자
 		String sub_seq_3         = ""; // 서브일련번호  
 		String occr_dt_curlist4	 = ""; // curlist4 발생일자
 		String seq_curlist4		 = ""; // curlist4 일련번호 
                                                      
 		String multiUpData1 = Util.checkString(req.getParameter("multiUpData1"));                              
 		String multiUpData2 = Util.checkString(req.getParameter("multiUpData2"));
 		String[] converted1 = convertMultiUpdateData(multiUpData1);
 		String[] converted2 = convertMultiUpdateData(multiUpData2);
 		
 		for (int i=0; i<converted1.length; i++){
			System.out.println("converted1[" + i + "]=" + converted1[i] );
		}
 		for (int i=0; i<converted2.length; i++){
			System.out.println("converted2[" + i + "]=" + converted2[i] );
		}
 		gubun             = converted1[0]; // 구분                                                                    
 		psplat_clsf       = converted1[2]; // PS판구분                                                                
 		use_qunt          = converted1[3]; // 사용량                                                                  
 		nul_plat_cnt      = converted1[4]; // 공판수                                                                  
 		seq               = converted1[9]; // 일련번호                                                                
 		occr_dt           = converted1[10]; // 발생일자                                                               
 		sub_seq           = converted1[11]; // 서브일련번호                                          
 		
 		gubun_3           = converted2[0]; // 구분                                                                    
 		ink_matr_3        = converted2[9]; // 잉크자재                                                                
 		use_qunt_3        = converted2[3]; // 사용량                                                                                                                                    
 		seq_3             = converted2[6]; // 일련번호                                                                
 		occr_dt_3         = converted2[7]; // 발생일자                                                               
 		sub_seq_3         = converted2[8]; // 서브일련번호
 		
 		dm.gubun = gubun.toUpperCase();                                                                                             
 		dm.psplat_clsf = psplat_clsf;
 		dm.use_qunt = use_qunt;                                                                              
 		dm.nul_plat_cnt = nul_plat_cnt;
 		dm.use_qunt = use_qunt;                                                                                           
 		dm.nul_plat_cnt = nul_plat_cnt;                                                                                   
 		dm.sub_seq_2 = sub_seq;
 		
 		dm.gubun_3 		= gubun_3.toUpperCase();                                                                                             
 		dm.ink_matr_3 	= ink_matr_3;
 		dm.qunt_3 		= use_qunt_3;                                                                                                       
 		dm.sub_seq_3 	= sub_seq_3;
 		dm.print();
 		
 		ds = (PR_OTHCNSM_2101_ADataSet)manager.executeCall(dm);
 		
 		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
 		
 		req.setAttribute("ds", ds);
 	}

 	// 위탁인쇄소모입력 조회                                                                                              
 	public void pr_othcnsm_2102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
 		PR_OTHCNSM_1102_LDataSet ds = null;                                                                               
 		PR_OTHCNSM_1102_LDM dm = new PR_OTHCNSM_1102_LDM();                                                               
                                                                                             
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);                                                    
 		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));                                                     
 		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));                                                       
 		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));                                                         
 		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));                                                       
 		
 		String sect_cd = ""; 
 		if("".equalsIgnoreCase(Util.checkString(req.getParameter("sect_cd")))){                                           
 			sect_cd = "ALL";                                                                                              
 		}else{                                                                                                            
 			sect_cd = Util.checkString(req.getParameter("sect_cd"));                                                      
 		}                                                                                                                 
 		dm.sect_cd = sect_cd;
 		dm.print();
 		
 		ds = (PR_OTHCNSM_1102_LDataSet)manager.executeCall(dm);
 		
 		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
 		
 		req.setAttribute("ds", ds);                                                                                                              
 	}
 	
	// 위탁인쇄소모 삭제
 	public void pr_othcnsm_2105_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
 		PR_OTHCNSM_2105_DDataSet ds = null;
 		PR_OTHCNSM_2105_DDM dm = new PR_OTHCNSM_2105_DDM();

 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);                                              
 		dm.seq = Util.checkString(req.getParameter("seq"));                                         
 		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));                                                             		                                  
 		dm.print();
 		
 		ds = (PR_OTHCNSM_2105_DDataSet)manager.executeCall(dm);
 		
 		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
 		
 		req.setAttribute("ds", ds);                                                                                   
 	}
 	
 	// 위탁인쇄소모검색 
 	public void pr_othcnsm_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2200_LDataSet ds = null;
		PR_OTHCNSM_2200_LDM dm = new PR_OTHCNSM_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();

		ds = (PR_OTHCNSM_2200_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 	
 	// 위탁인쇄단가관리 조회
 	public void pr_othcnsm_2310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2310_LDataSet ds = null;
		PR_OTHCNSM_2310_LDM dm = new PR_OTHCNSM_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.print();

		ds = (PR_OTHCNSM_2310_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 	
 	// 위탁인쇄단가관리  입력/수정/삭제
 	public void pr_othcnsm_2311_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2311_ADataSet ds = null;
		PR_OTHCNSM_2311_ADM dm = new PR_OTHCNSM_2311_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.prt_basi_qty = Util.checkString(req.getParameter("prt_basi_qty"));
		dm.pj_basi_qty = Util.checkString(req.getParameter("pj_basi_qty"));
		dm.prt_uprc_bw = Util.checkString(req.getParameter("prt_uprc_bw"));
		dm.prt_uprc_clr = Util.checkString(req.getParameter("prt_uprc_clr"));
		dm.prt_pj_rate_bw = Util.checkString(req.getParameter("prt_pj_rate_bw"));
		dm.prt_pj_rate_clr = Util.checkString(req.getParameter("prt_pj_rate_clr"));
		dm.film_make_fee = Util.checkString(req.getParameter("film_make_fee"));
		dm.pack_fee = Util.checkString(req.getParameter("pack_fee"));
		dm.base_leas_fee = Util.checkString(req.getParameter("base_leas_fee"));
		dm.real_leas_fee = Util.checkString(req.getParameter("real_leas_fee"));
		dm.dest_fee = Util.checkString(req.getParameter("dest_fee"));
		dm.etc_matr_fee_bw = Util.checkString(req.getParameter("etc_matr_fee_bw"));
		dm.etc_matr_fee_clr = Util.checkString(req.getParameter("etc_matr_fee_clr"));
		dm.leas_use_fee_bw = Util.checkString(req.getParameter("leas_use_fee_bw"));
		dm.leas_use_fee_clr = Util.checkString(req.getParameter("leas_use_fee_clr"));
		dm.paper_wgt = Util.checkString(req.getParameter("paper_wgt"));
		dm.prt_pj_rate = Util.checkString(req.getParameter("prt_pj_rate"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (PR_OTHCNSM_2311_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 	
 	// 위탁용지단가 조회
 	public void pr_othcnsm_2320_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2320_LDataSet ds = null;
		PR_OTHCNSM_2320_LDM dm = new PR_OTHCNSM_2320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (PR_OTHCNSM_2320_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 	// 위탁용지단가 입력/수정/삭제
 	public void pr_othcnsm_2321_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2321_ADataSet ds = null;
		
		PR_OTHCNSM_2321_ADM dm = new PR_OTHCNSM_2321_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = "610";
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.paper_uprc = Util.checkString(req.getParameter("paper_uprc"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun")).toUpperCase();
		dm.print();
		
		ds = (PR_OTHCNSM_2321_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 	// PS판단가관리 조회
 	public void pr_othcnsm_2330_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2330_LDataSet ds = null;
		
		PR_OTHCNSM_2330_LDM dm = new PR_OTHCNSM_2330_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.print();
		
		ds = (PR_OTHCNSM_2330_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 	// PS판단가관리  입력/수정/삭제
 	public void pr_othcnsm_2331_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2331_ADataSet ds = null;
		
		PR_OTHCNSM_2331_ADM dm = new PR_OTHCNSM_2331_ADM();
		String multiUpData1 = Util.checkString(req.getParameter("multiUpData1"));                                     
        
		String[] converted1 = convertMultiUpdateData(multiUpData1);                                                   
		for (int i=0; i<converted1.length; i++){
			System.out.println("converted1[" + i + "]=" + converted1[i] );
		}
		String psplat_clsf      = converted1[2]; // PS판구분
		String psplat_fee       = converted1[3]; // PS판비
		String gnaw_fee         = converted1[4]; // 소부비                                                               
		String fac_clsf      	= converted1[5]; // 공장구분                                                                 
		String aply_dt          = converted1[6]; // 적용일자
		String sect_cd          = converted1[7]; // 외간매체
		String gubun            = converted1[0]; // 구분              
 		
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.medi_cd = "610";
		dm.sect_cd = sect_cd;
		dm.aply_dt = aply_dt;
		dm.psplat_clsf = psplat_clsf;
		dm.psplat_fee = psplat_fee;
		dm.gnaw_fee = gnaw_fee;
		dm.fac_clsf = fac_clsf;
		dm.gubun = gubun.toUpperCase();
		dm.print();
		
		ds = (PR_OTHCNSM_2331_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 // PS판단가관리 조회
 	public void pr_othcnsm_2332_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2332_LDataSet ds = null;
		
		PR_OTHCNSM_2332_LDM dm = new PR_OTHCNSM_2332_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.print();
		
		ds = (PR_OTHCNSM_2332_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	// 잉크단가관리 조회
 	public void pr_othcnsm_2340_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2340_LDataSet ds = null;
		
		PR_OTHCNSM_2340_LDM dm = new PR_OTHCNSM_2340_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.print();
		
		ds = (PR_OTHCNSM_2340_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 	// 잉크단가관리  입력/수정/삭제
 	public void pr_othcnsm_2341_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2341_ADataSet ds = null;
		
		PR_OTHCNSM_2341_ADM dm = new PR_OTHCNSM_2341_ADM();
		String multiUpData1 = Util.checkString(req.getParameter("multiUpData1"));                                     
        
		String[] converted1 = convertMultiUpdateData(multiUpData1);                                                   
		for (int i=0; i<converted1.length; i++){
			System.out.println("converted1[" + i + "]=" + converted1[i] );
		}
		String ink_clsf      = converted1[2]; // PS판구분
		String ink_matr      = converted1[4]; // PS판구분
		String ink_uprc       = converted1[6]; // PS판비                                                     
		String fac_clsf      	= converted1[7]; // 공장구분                                                                 
		String aply_dt          = converted1[8]; // 적용일자                                                                
		String sect_cd          = converted1[9]; // 외간매체
		String gubun            = converted1[0]; // 구분              
 		
 		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm.aply_dt = aply_dt;
		dm.ink_matr = ink_matr;
		dm.ink_clsf = ink_clsf;
		dm.ink_uprc = ink_uprc;
		dm.fac_clsf = fac_clsf;
		dm.medi_cd = "610";
		dm.sect_cd = sect_cd;
		dm.gubun = gubun.toUpperCase();
		dm.print();
		
		ds = (PR_OTHCNSM_2341_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 // 잉크단가관리 조회
 	public void pr_othcnsm_2342_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2342_LDataSet ds = null;
		
		PR_OTHCNSM_2342_LDM dm = new PR_OTHCNSM_2342_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();
		
		ds = (PR_OTHCNSM_2342_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	// 위탁인쇄월마감 컬럼조회, 
 	public void pr_othcnsm_2400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1400_LDataSet ds = null;
		
		PR_OTHCNSM_1400_LDM dm = new PR_OTHCNSM_1400_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_OTHCNSM_1400_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 	
 	// 위탁인쇄월마감 조회 
 	public void pr_othcnsm_2401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_2401_LDataSet ds = null;
		PR_OTHCNSM_2401_LDM dm = new PR_OTHCNSM_2401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_yymm = Util.checkString(req.getParameter("issu_yymm"));
		dm.print();
		
		ds = (PR_OTHCNSM_2401_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 	
 	
 	// 마감
 	public void pr_othcnsm_2402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1402_ADataSet ds = null;
		
		PR_OTHCNSM_1402_ADM dm = new PR_OTHCNSM_1402_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.issu_dt_yyyy = Util.checkString(req.getParameter("issu_dt_yyyy"));
		dm.issu_dt_mm = Util.checkString(req.getParameter("issu_dt_mm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.vat = Util.checkString(req.getParameter("vat"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.print();
		
		ds = (PR_OTHCNSM_1402_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

 	//마감취소
 	public void pr_othcnsm_2403_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
 		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1403_ADataSet ds = null;
		
		PR_OTHCNSM_1403_ADM dm = new PR_OTHCNSM_1403_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		       
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.issu_dt_yyyy = Util.checkString(req.getParameter("issu_dt_yyyy"));
		dm.issu_dt_mm = Util.checkString(req.getParameter("issu_dt_mm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.print();
		
		ds = (PR_OTHCNSM_1403_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
 }