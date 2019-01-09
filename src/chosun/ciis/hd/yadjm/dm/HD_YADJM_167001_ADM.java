/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_167001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String add_file_nm1;
	public byte[] add_file1;
	public String doc_type;
	public String seq;
	public String att_year;
	public String form_cd;
	public String resid;
	public String name;
	public String dat_cd;
	public String busnid;
	public String trade_nm;
	public String acc_no;
	public String use_place_cd;
	public String donation_cd;
	public String course_cd;
	public String subject_nm;
	public String start_dt;
	public String end_dt;
	public String com_cd;
	public String pension_cd;
	public String goods_nm;
	public String lend_dt;
	public String lend_kd;
	public String house_take_dt;
	public String mort_setup_dt;
	public String repay_years;
	public String lend_goods_nm;
	public String debt;
	public String fixed_rate_debt;
	public String not_defer_debt;
	public String this_year_rede_amt;
	public String saving_gubn;
	public String reg_dt;
	public String pay_method;
	public String insu1_resid;
	public String insu1_nm;
	public String insu2_resid1;
	public String insu2_nm1;
	public String insu2_resid2;
	public String insu2_nm2;
	public String insu2_resid3;
	public String insu2_nm3;
	public String amt;
	public String sum;
	public String mm;
	public String dd;
	public String fix_cd;
	public String date;
	public String annual;
	public String sum_y1;
	public String sum_y2;
	public String sum_y3;
	public String ddct;
	public String ann_tot_amt;
	public String tax_year_amt;
	public String ddct_bs_ass_amt;
	public String flag;
	public String pre_tot_amt;
	public String pre_market_tot_amt;
	public String pre_tmoney_tot_amt;
	public String edu_tp;
	public String first_tot_amt;
	public String second_tot_amt;
	public String secu_no;
	public String fund_nm;
	public String att_frmmm;
	public String att_tomm;
	public String att_inqrmm;
	public String ftyr_tot_amt;
	public String ftyr_market_tot_amt;
	public String ftyr_tmoney_tot_amt;
	public String first_year_tot_amt;
	public String second_year_tot_amt;
	public String inqr_strt_mm;
	public String inqr_end_mm;
	public String lend_loan_amt;
	// 2016년 추가 start 
	//public String hi_yrs;  
	//public String ltrm_yrs;
	public String hi_ntf;
	public String ltrm_ntf;
	public String hi_pmt ;
	public String ltrm_pmt;
	//public String spym;
	//public String jlc;
	//public String ntf;
	//public String pmt;
	//public String wrkp_ntf;
	//public String rgn_pmt;
	//public String apln;
	public String sbdy_apln_sum;
	public String conb_sum;
//	 2016년 추가 end 
	public byte[] add_file;

	public HD_YADJM_167001_ADM(){}
	public HD_YADJM_167001_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String incmg_pers, String incmg_pers_ip, String add_file_nm1, byte[] add_file1, String doc_type, String seq, String att_year, String form_cd, String resid, String name, String dat_cd, String busnid, String trade_nm, String acc_no, String use_place_cd, String donation_cd, String course_cd, String subject_nm, String start_dt, String end_dt, String com_cd, String pension_cd, String goods_nm, String lend_dt, String lend_kd, String house_take_dt, String mort_setup_dt, String repay_years, String lend_goods_nm, String debt, String fixed_rate_debt, String not_defer_debt, String this_year_rede_amt, String saving_gubn, String reg_dt, String pay_method, String insu1_resid, String insu1_nm, String insu2_resid1, String insu2_nm1, String insu2_resid2, String insu2_nm2, String insu2_resid3, String insu2_nm3, String amt, String sum, String mm, String dd, String fix_cd, String date, String annual, String sum_y1, String sum_y2, String sum_y3, String ddct, String ann_tot_amt, String tax_year_amt, String ddct_bs_ass_amt, String flag, String pre_tot_amt, String pre_market_tot_amt, String pre_tmoney_tot_amt, String edu_tp, String first_tot_amt, String second_tot_amt, String secu_no, String fund_nm, String att_frmmm, String att_tomm, String att_inqrmm, String ftyr_tot_amt, String ftyr_market_tot_amt, String ftyr_tmoney_tot_amt, String first_year_tot_amt, String second_year_tot_amt, String inqr_strt_mm, String inqr_end_mm, String lend_loan_amt, String sbdy_apln_sum, String conb_sum, byte[] add_file){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.add_file_nm1 = add_file_nm1;
		this.add_file1 = add_file1;
		this.doc_type = doc_type;
		this.seq = seq;
		this.att_year = att_year;
		this.form_cd = form_cd;
		this.resid = resid;
		this.name = name;
		this.dat_cd = dat_cd;
		this.busnid = busnid;
		this.trade_nm = trade_nm;
		this.acc_no = acc_no;
		this.use_place_cd = use_place_cd;
		this.donation_cd = donation_cd;
		this.course_cd = course_cd;
		this.subject_nm = subject_nm;
		this.start_dt = start_dt;
		this.end_dt = end_dt;
		this.com_cd = com_cd;
		this.pension_cd = pension_cd;
		this.goods_nm = goods_nm;
		this.lend_dt = lend_dt;
		this.lend_kd = lend_kd;
		this.house_take_dt = house_take_dt;
		this.mort_setup_dt = mort_setup_dt;
		this.repay_years = repay_years;
		this.lend_goods_nm = lend_goods_nm;
		this.debt = debt;
		this.fixed_rate_debt = fixed_rate_debt;
		this.not_defer_debt = not_defer_debt;
		this.this_year_rede_amt = this_year_rede_amt;
		this.saving_gubn = saving_gubn;
		this.reg_dt = reg_dt;
		this.pay_method = pay_method;
		this.insu1_resid = insu1_resid;
		this.insu1_nm = insu1_nm;
		this.insu2_resid1 = insu2_resid1;
		this.insu2_nm1 = insu2_nm1;
		this.insu2_resid2 = insu2_resid2;
		this.insu2_nm2 = insu2_nm2;
		this.insu2_resid3 = insu2_resid3;
		this.insu2_nm3 = insu2_nm3;
		this.amt = amt;
		this.sum = sum;
		this.mm = mm;
		this.dd = dd;
		this.fix_cd = fix_cd;
		this.date = date;
		this.annual = annual;
		this.sum_y1 = sum_y1;
		this.sum_y2 = sum_y2;
		this.sum_y3 = sum_y3;
		this.ddct = ddct;
		this.ann_tot_amt = ann_tot_amt;
		this.tax_year_amt = tax_year_amt;
		this.ddct_bs_ass_amt = ddct_bs_ass_amt;
		this.flag = flag;
		this.pre_tot_amt = pre_tot_amt;
		this.pre_market_tot_amt = pre_market_tot_amt;
		this.pre_tmoney_tot_amt = pre_tmoney_tot_amt;
		this.edu_tp = edu_tp;
		this.first_tot_amt = first_tot_amt;
		this.second_tot_amt = second_tot_amt;
		this.secu_no = secu_no;
		this.fund_nm = fund_nm;
		this.att_frmmm = att_frmmm;
		this.att_tomm = att_tomm;
		this.att_inqrmm = att_inqrmm;
		this.ftyr_tot_amt = ftyr_tot_amt;
		this.ftyr_market_tot_amt = ftyr_market_tot_amt;
		this.ftyr_tmoney_tot_amt = ftyr_tmoney_tot_amt;
		this.first_year_tot_amt = first_year_tot_amt;
		this.second_year_tot_amt = second_year_tot_amt;
		this.inqr_strt_mm = inqr_strt_mm;
		this.inqr_end_mm = inqr_end_mm;
		this.lend_loan_amt = lend_loan_amt;
		// 2016 연말정산 start
		//this.hi_yrs = hi_yrs;
		//this.ltrm_yrs = ltrm_yrs;
		//this.hi_ntf  = hi_ntf;
		//this.ltrm_ntf = ltrm_ntf;
		//this.hi_pmt = hi_pmt;
		//this.ltrm_pmt = ltrm_pmt;
		//this.spym = spym;
		//this.jlc = jlc;
		//this.ntf = ntf;
		//this.pmt = pmt;
		//this.wrkp_ntf = wrkp_ntf;
		//this.rgn_pmt = rgn_pmt;
		//this.apln = apln;
		this.sbdy_apln_sum = sbdy_apln_sum;
		this.conb_sum = conb_sum;
		// 2016 연말정산 end
		this.add_file = add_file;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAdd_file_nm1(String add_file_nm1){
		this.add_file_nm1 = add_file_nm1;
	}

	public void setAdd_file1(byte[] add_file1){
		this.add_file1 = add_file1;
	}

	public void setDoc_type(String doc_type){
		this.doc_type = doc_type;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAtt_year(String att_year){
		this.att_year = att_year;
	}

	public void setForm_cd(String form_cd){
		this.form_cd = form_cd;
	}

	public void setResid(String resid){
		this.resid = resid;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setDat_cd(String dat_cd){
		this.dat_cd = dat_cd;
	}

	public void setBusnid(String busnid){
		this.busnid = busnid;
	}

	public void setTrade_nm(String trade_nm){
		this.trade_nm = trade_nm;
	}

	public void setAcc_no(String acc_no){
		this.acc_no = acc_no;
	}

	public void setUse_place_cd(String use_place_cd){
		this.use_place_cd = use_place_cd;
	}

	public void setDonation_cd(String donation_cd){
		this.donation_cd = donation_cd;
	}

	public void setCourse_cd(String course_cd){
		this.course_cd = course_cd;
	}

	public void setSubject_nm(String subject_nm){
		this.subject_nm = subject_nm;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setCom_cd(String com_cd){
		this.com_cd = com_cd;
	}

	public void setPension_cd(String pension_cd){
		this.pension_cd = pension_cd;
	}

	public void setGoods_nm(String goods_nm){
		this.goods_nm = goods_nm;
	}

	public void setLend_dt(String lend_dt){
		this.lend_dt = lend_dt;
	}

	public void setLend_kd(String lend_kd){
		this.lend_kd = lend_kd;
	}

	public void setHouse_take_dt(String house_take_dt){
		this.house_take_dt = house_take_dt;
	}

	public void setMort_setup_dt(String mort_setup_dt){
		this.mort_setup_dt = mort_setup_dt;
	}

	public void setRepay_years(String repay_years){
		this.repay_years = repay_years;
	}

	public void setLend_goods_nm(String lend_goods_nm){
		this.lend_goods_nm = lend_goods_nm;
	}

	public void setDebt(String debt){
		this.debt = debt;
	}

	public void setFixed_rate_debt(String fixed_rate_debt){
		this.fixed_rate_debt = fixed_rate_debt;
	}

	public void setNot_defer_debt(String not_defer_debt){
		this.not_defer_debt = not_defer_debt;
	}

	public void setThis_year_rede_amt(String this_year_rede_amt){
		this.this_year_rede_amt = this_year_rede_amt;
	}

	public void setSaving_gubn(String saving_gubn){
		this.saving_gubn = saving_gubn;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setPay_method(String pay_method){
		this.pay_method = pay_method;
	}

	public void setInsu1_resid(String insu1_resid){
		this.insu1_resid = insu1_resid;
	}

	public void setInsu1_nm(String insu1_nm){
		this.insu1_nm = insu1_nm;
	}

	public void setInsu2_resid1(String insu2_resid1){
		this.insu2_resid1 = insu2_resid1;
	}

	public void setInsu2_nm1(String insu2_nm1){
		this.insu2_nm1 = insu2_nm1;
	}

	public void setInsu2_resid2(String insu2_resid2){
		this.insu2_resid2 = insu2_resid2;
	}

	public void setInsu2_nm2(String insu2_nm2){
		this.insu2_nm2 = insu2_nm2;
	}

	public void setInsu2_resid3(String insu2_resid3){
		this.insu2_resid3 = insu2_resid3;
	}

	public void setInsu2_nm3(String insu2_nm3){
		this.insu2_nm3 = insu2_nm3;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public void setMm(String mm){
		this.mm = mm;
	}

	public void setDd(String dd){
		this.dd = dd;
	}

	public void setFix_cd(String fix_cd){
		this.fix_cd = fix_cd;
	}

	public void setDate(String date){
		this.date = date;
	}

	public void setAnnual(String annual){
		this.annual = annual;
	}

	public void setSum_y1(String sum_y1){
		this.sum_y1 = sum_y1;
	}

	public void setSum_y2(String sum_y2){
		this.sum_y2 = sum_y2;
	}

	public void setSum_y3(String sum_y3){
		this.sum_y3 = sum_y3;
	}

	public void setDdct(String ddct){
		this.ddct = ddct;
	}

	public void setAnn_tot_amt(String ann_tot_amt){
		this.ann_tot_amt = ann_tot_amt;
	}

	public void setTax_year_amt(String tax_year_amt){
		this.tax_year_amt = tax_year_amt;
	}

	public void setDdct_bs_ass_amt(String ddct_bs_ass_amt){
		this.ddct_bs_ass_amt = ddct_bs_ass_amt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setPre_tot_amt(String pre_tot_amt){
		this.pre_tot_amt = pre_tot_amt;
	}

	public void setPre_market_tot_amt(String pre_market_tot_amt){
		this.pre_market_tot_amt = pre_market_tot_amt;
	}

	public void setPre_tmoney_tot_amt(String pre_tmoney_tot_amt){
		this.pre_tmoney_tot_amt = pre_tmoney_tot_amt;
	}

	public void setEdu_tp(String edu_tp){
		this.edu_tp = edu_tp;
	}

	public void setFirst_tot_amt(String first_tot_amt){
		this.first_tot_amt = first_tot_amt;
	}

	public void setSecond_tot_amt(String second_tot_amt){
		this.second_tot_amt = second_tot_amt;
	}

	public void setSecu_no(String secu_no){
		this.secu_no = secu_no;
	}

	public void setFund_nm(String fund_nm){
		this.fund_nm = fund_nm;
	}

	public void setAtt_frmmm(String att_frmmm){
		this.att_frmmm = att_frmmm;
	}

	public void setAtt_tomm(String att_tomm){
		this.att_tomm = att_tomm;
	}

	public void setAtt_inqrmm(String att_inqrmm){
		this.att_inqrmm = att_inqrmm;
	}

	public void setFtyr_tot_amt(String ftyr_tot_amt){
		this.ftyr_tot_amt = ftyr_tot_amt;
	}

	public void setFtyr_market_tot_amt(String ftyr_market_tot_amt){
		this.ftyr_market_tot_amt = ftyr_market_tot_amt;
	}

	public void setFtyr_tmoney_tot_amt(String ftyr_tmoney_tot_amt){
		this.ftyr_tmoney_tot_amt = ftyr_tmoney_tot_amt;
	}

	public void setFirst_year_tot_amt(String first_year_tot_amt){
		this.first_year_tot_amt = first_year_tot_amt;
	}

	public void setSecond_year_tot_amt(String second_year_tot_amt){
		this.second_year_tot_amt = second_year_tot_amt;
	}

	public void setInqr_strt_mm(String inqr_strt_mm){
		this.inqr_strt_mm = inqr_strt_mm;
	}

	public void setInqr_end_mm(String inqr_end_mm){
		this.inqr_end_mm = inqr_end_mm;
	}

	public void setLend_loan_amt(String lend_loan_amt){
		this.lend_loan_amt = lend_loan_amt;
	}
	
	//public void setHi_yrs(String hi_yrs){
	//	this.hi_yrs = hi_yrs;
	//}
	
	//public void setLtrm_yrs(String ltrm_yrs){
	//	this.ltrm_yrs = ltrm_yrs;
	//}
	//public void setHi_ntf(String hi_ntf){
	//	this.hi_ntf = hi_ntf;
	//}
	
	//public void setLtrm_ntf(String ltrm_ntf){
	//	this.ltrm_ntf = ltrm_ntf;
	//}
	
	//public void setHi_pmt(String hi_pmt){
	//	this.hi_pmt = hi_pmt;
	//}
	
	//public void setLtrm_pmt(String ltrm_pmt){
	//	this.ltrm_pmt = ltrm_pmt;
	//}
	
	//public void setSpym(String spym){
	//	this.spym = spym;
	//}
	
	//public void setJlc(String jlc){
	//	this.jlc = jlc;
	//}
	
	//public void setNtf(String ntf){
	//	this.ntf = ntf;
	//}
	
	//public void setPmt(String pmt){
	//	this.pmt = pmt;
	//}
	
	//public void setWrkp_ntf(String wrkp_ntf){
	//	this.wrkp_ntf = wrkp_ntf;
	//}
	
	//public void setRgn_pmt(String rgn_pmt){
	//	this.rgn_pmt = rgn_pmt;
	//}
	
	//public void setApln(String apln){
	//	this.apln = apln;
	//}
	
	public void setSbdy_apln_sum(String sbdy_apln_sum){
		this.sbdy_apln_sum = sbdy_apln_sum;
	}
	
	public void setConb_sum(String conb_sum){
		this.conb_sum = conb_sum;
	}
	
	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getAdd_file_nm1(){
		return this.add_file_nm1;
	}

	public byte[] getAdd_file1(){
		return this.add_file1;
	}

	public String getDoc_type(){
		return this.doc_type;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAtt_year(){
		return this.att_year;
	}

	public String getForm_cd(){
		return this.form_cd;
	}

	public String getResid(){
		return this.resid;
	}

	public String getName(){
		return this.name;
	}

	public String getDat_cd(){
		return this.dat_cd;
	}

	public String getBusnid(){
		return this.busnid;
	}

	public String getTrade_nm(){
		return this.trade_nm;
	}

	public String getAcc_no(){
		return this.acc_no;
	}

	public String getUse_place_cd(){
		return this.use_place_cd;
	}

	public String getDonation_cd(){
		return this.donation_cd;
	}

	public String getCourse_cd(){
		return this.course_cd;
	}

	public String getSubject_nm(){
		return this.subject_nm;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getCom_cd(){
		return this.com_cd;
	}

	public String getPension_cd(){
		return this.pension_cd;
	}

	public String getGoods_nm(){
		return this.goods_nm;
	}

	public String getLend_dt(){
		return this.lend_dt;
	}

	public String getLend_kd(){
		return this.lend_kd;
	}

	public String getHouse_take_dt(){
		return this.house_take_dt;
	}

	public String getMort_setup_dt(){
		return this.mort_setup_dt;
	}

	public String getRepay_years(){
		return this.repay_years;
	}

	public String getLend_goods_nm(){
		return this.lend_goods_nm;
	}

	public String getDebt(){
		return this.debt;
	}

	public String getFixed_rate_debt(){
		return this.fixed_rate_debt;
	}

	public String getNot_defer_debt(){
		return this.not_defer_debt;
	}

	public String getThis_year_rede_amt(){
		return this.this_year_rede_amt;
	}

	public String getSaving_gubn(){
		return this.saving_gubn;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getPay_method(){
		return this.pay_method;
	}

	public String getInsu1_resid(){
		return this.insu1_resid;
	}

	public String getInsu1_nm(){
		return this.insu1_nm;
	}

	public String getInsu2_resid1(){
		return this.insu2_resid1;
	}

	public String getInsu2_nm1(){
		return this.insu2_nm1;
	}

	public String getInsu2_resid2(){
		return this.insu2_resid2;
	}

	public String getInsu2_nm2(){
		return this.insu2_nm2;
	}

	public String getInsu2_resid3(){
		return this.insu2_resid3;
	}

	public String getInsu2_nm3(){
		return this.insu2_nm3;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSum(){
		return this.sum;
	}

	public String getMm(){
		return this.mm;
	}

	public String getDd(){
		return this.dd;
	}

	public String getFix_cd(){
		return this.fix_cd;
	}

	public String getDate(){
		return this.date;
	}

	public String getAnnual(){
		return this.annual;
	}

	public String getSum_y1(){
		return this.sum_y1;
	}

	public String getSum_y2(){
		return this.sum_y2;
	}

	public String getSum_y3(){
		return this.sum_y3;
	}

	public String getDdct(){
		return this.ddct;
	}

	public String getAnn_tot_amt(){
		return this.ann_tot_amt;
	}

	public String getTax_year_amt(){
		return this.tax_year_amt;
	}

	public String getDdct_bs_ass_amt(){
		return this.ddct_bs_ass_amt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getPre_tot_amt(){
		return this.pre_tot_amt;
	}

	public String getPre_market_tot_amt(){
		return this.pre_market_tot_amt;
	}

	public String getPre_tmoney_tot_amt(){
		return this.pre_tmoney_tot_amt;
	}

	public String getEdu_tp(){
		return this.edu_tp;
	}

	public String getFirst_tot_amt(){
		return this.first_tot_amt;
	}

	public String getSecond_tot_amt(){
		return this.second_tot_amt;
	}

	public String getSecu_no(){
		return this.secu_no;
	}

	public String getFund_nm(){
		return this.fund_nm;
	}
	
	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getAtt_frmmm(){
		return this.att_frmmm;
	}

	public String getAtt_tomm(){
		return this.att_tomm;
	}

	public String getAtt_inqrmm(){
		return this.att_inqrmm;
	}

	public String getFtyr_tot_amt(){
		return this.ftyr_tot_amt;
	}

	public String getFtyr_market_tot_amt(){
		return this.ftyr_market_tot_amt;
	}

	public String getFtyr_tmoney_tot_amt(){
		return this.ftyr_tmoney_tot_amt;
	}

	public String getFirst_year_tot_amt(){
		return this.first_year_tot_amt;
	}

	public String getSecond_year_tot_amt(){
		return this.second_year_tot_amt;
	}

	public String getInqr_strt_mm(){
		return this.inqr_strt_mm;
	}

	public String getInqr_end_mm(){
		return this.inqr_end_mm;
	}

	public String getLend_loan_amt(){
		return this.lend_loan_amt;
	}
	
	//public String getHi_yrs(){
	//	return this.hi_yrs;
	//}
	
	//public String getLtrm_yrs(){
	//	return this.ltrm_yrs;
	//}
	
	//public String getHi_ntf(){
	//	return this.hi_ntf ;
	//}
	
	//public String getLtrm_ntf(){
	//	return this.ltrm_ntf;
	//}
	
	//public String getHi_pmt(){
	//	return this.hi_pmt;
	//}
	
	//public String getLtrm_pmt(){
	//	return this.ltrm_pmt;
	//}
	
	//public String getSpym(){
	//	return this.spym;
	//}
	
	//public String getJlc(){
	//	return this.jlc;
	//}
	
	//public String getNtf(){
	//	return this.ntf;
	//}
	
	//public String getPmt(){
	//	return this.pmt;
	//}
	
	//public String getWrkp_ntf(){
	//	return this.wrkp_ntf;
	//}
	
	//public String getRgn_pmt(){
	//	return this.rgn_pmt;
	//}
	
	//public String getApln(){
	//	return this.apln;
	//}
	
	public String getSbdy_apln_sum(){
		return this.sbdy_apln_sum;
	}
	
	public String getConb_sum(){
		return this.conb_sum;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_167001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_167001_ADM dm = (HD_YADJM_167001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.add_file_nm1);
		cstmt.setString(10, dm.doc_type);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.att_year);
		cstmt.setString(13, dm.form_cd);
		cstmt.setString(14, dm.resid);
		cstmt.setString(15, dm.name);
		cstmt.setString(16, dm.dat_cd);
		cstmt.setString(17, dm.busnid);
		cstmt.setString(18, dm.trade_nm);
		cstmt.setString(19, dm.acc_no);
		cstmt.setString(20, dm.use_place_cd);
		cstmt.setString(21, dm.donation_cd);
		cstmt.setString(22, dm.course_cd);
		cstmt.setString(23, dm.subject_nm);
		cstmt.setString(24, dm.start_dt);
		cstmt.setString(25, dm.end_dt);
		cstmt.setString(26, dm.com_cd);
		cstmt.setString(27, dm.pension_cd);
		cstmt.setString(28, dm.goods_nm);
		cstmt.setString(29, dm.lend_dt);
		cstmt.setString(30, dm.lend_kd);
		cstmt.setString(31, dm.house_take_dt);
		cstmt.setString(32, dm.mort_setup_dt);
		cstmt.setString(33, dm.repay_years);
		cstmt.setString(34, dm.lend_goods_nm);
		cstmt.setString(35, dm.debt);
		cstmt.setString(36, dm.fixed_rate_debt);
		cstmt.setString(37, dm.not_defer_debt);
		cstmt.setString(38, dm.this_year_rede_amt);
		cstmt.setString(39, dm.saving_gubn);
		cstmt.setString(40, dm.reg_dt);
		cstmt.setString(41, dm.pay_method);
		cstmt.setString(42, dm.insu1_resid);
		cstmt.setString(43, dm.insu1_nm);
		cstmt.setString(44, dm.insu2_resid1);
		cstmt.setString(45, dm.insu2_nm1);
		cstmt.setString(46, dm.insu2_resid2);
		cstmt.setString(47, dm.insu2_nm2);
		cstmt.setString(48, dm.insu2_resid3);
		cstmt.setString(49, dm.insu2_nm3);
		cstmt.setString(50, dm.amt);
		cstmt.setString(51, dm.sum);
		cstmt.setString(52, dm.mm);
		cstmt.setString(53, dm.dd);
		cstmt.setString(54, dm.fix_cd);
		cstmt.setString(55, dm.date);
		cstmt.setString(56, dm.annual);
		cstmt.setString(57, dm.sum_y1);
		cstmt.setString(58, dm.sum_y2);
		cstmt.setString(59, dm.sum_y3);
		cstmt.setString(60, dm.ddct);
		cstmt.setString(61, dm.ann_tot_amt);
		cstmt.setString(62, dm.tax_year_amt);
		cstmt.setString(63, dm.ddct_bs_ass_amt);
		cstmt.setString(64, dm.flag);
		cstmt.setString(65, dm.pre_tot_amt);
		cstmt.setString(66, dm.pre_market_tot_amt);
		cstmt.setString(67, dm.pre_tmoney_tot_amt);
		cstmt.setString(68, dm.edu_tp);
		cstmt.setString(69, dm.first_tot_amt);
		cstmt.setString(70, dm.second_tot_amt);
		cstmt.setString(71, dm.secu_no);
		cstmt.setString(72, dm.fund_nm);
		cstmt.setString(73, dm.att_frmmm);
		cstmt.setString(74, dm.att_tomm);
		cstmt.setString(75, dm.att_inqrmm);
		cstmt.setString(76, dm.ftyr_tot_amt);
		cstmt.setString(77, dm.ftyr_market_tot_amt);
		cstmt.setString(78, dm.ftyr_tmoney_tot_amt);
		cstmt.setString(79, dm.first_year_tot_amt);
		cstmt.setString(80, dm.second_year_tot_amt);
		cstmt.setString(81, dm.inqr_strt_mm);
		cstmt.setString(82, dm.inqr_end_mm);
		cstmt.setString(83, dm.lend_loan_amt);
		//cstmt.setString(84, dm.hi_yrs);
		//cstmt.setString(85, dm.ltrm_yrs);
		//cstmt.setString(84, dm.hi_ntf );
		//cstmt.setString(85, dm.ltrm_ntf);
		//cstmt.setString(86, dm.hi_pmt);
		//cstmt.setString(87, dm.ltrm_pmt);
		//cstmt.setString(90, dm.spym);
		//cstmt.setString(91, dm.jlc);
		//cstmt.setString(92, dm.ntf);
		//cstmt.setString(93, dm.pmt);
		//cstmt.setString(84, dm.wrkp_ntf);
		//cstmt.setString(85, dm.rgn_pmt);
		//cstmt.setString(90, dm.apln);
		cstmt.setString(84, dm.sbdy_apln_sum);
		cstmt.setString(85, dm.conb_sum);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_167001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("add_file_nm1 = [" + getAdd_file_nm1() + "]");
		System.out.println("add_file1 = [" + getAdd_file1() + "]");
		System.out.println("doc_type = [" + getDoc_type() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("att_year = [" + getAtt_year() + "]");
		System.out.println("form_cd = [" + getForm_cd() + "]");
		System.out.println("resid = [" + getResid() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("dat_cd = [" + getDat_cd() + "]");
		System.out.println("busnid = [" + getBusnid() + "]");
		System.out.println("trade_nm = [" + getTrade_nm() + "]");
		System.out.println("acc_no = [" + getAcc_no() + "]");
		System.out.println("use_place_cd = [" + getUse_place_cd() + "]");
		System.out.println("donation_cd = [" + getDonation_cd() + "]");
		System.out.println("course_cd = [" + getCourse_cd() + "]");
		System.out.println("subject_nm = [" + getSubject_nm() + "]");
		System.out.println("start_dt = [" + getStart_dt() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("com_cd = [" + getCom_cd() + "]");
		System.out.println("pension_cd = [" + getPension_cd() + "]");
		System.out.println("goods_nm = [" + getGoods_nm() + "]");
		System.out.println("lend_dt = [" + getLend_dt() + "]");
		System.out.println("lend_kd = [" + getLend_kd() + "]");
		System.out.println("house_take_dt = [" + getHouse_take_dt() + "]");
		System.out.println("mort_setup_dt = [" + getMort_setup_dt() + "]");
		System.out.println("repay_years = [" + getRepay_years() + "]");
		System.out.println("lend_goods_nm = [" + getLend_goods_nm() + "]");
		System.out.println("debt = [" + getDebt() + "]");
		System.out.println("fixed_rate_debt = [" + getFixed_rate_debt() + "]");
		System.out.println("not_defer_debt = [" + getNot_defer_debt() + "]");
		System.out.println("this_year_rede_amt = [" + getThis_year_rede_amt() + "]");
		System.out.println("saving_gubn = [" + getSaving_gubn() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("pay_method = [" + getPay_method() + "]");
		System.out.println("insu1_resid = [" + getInsu1_resid() + "]");
		System.out.println("insu1_nm = [" + getInsu1_nm() + "]");
		System.out.println("insu2_resid1 = [" + getInsu2_resid1() + "]");
		System.out.println("insu2_nm1 = [" + getInsu2_nm1() + "]");
		System.out.println("insu2_resid2 = [" + getInsu2_resid2() + "]");
		System.out.println("insu2_nm2 = [" + getInsu2_nm2() + "]");
		System.out.println("insu2_resid3 = [" + getInsu2_resid3() + "]");
		System.out.println("insu2_nm3 = [" + getInsu2_nm3() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("sum = [" + getSum() + "]");
		System.out.println("mm = [" + getMm() + "]");
		System.out.println("dd = [" + getDd() + "]");
		System.out.println("fix_cd = [" + getFix_cd() + "]");
		System.out.println("date = [" + getDate() + "]");
		System.out.println("annual = [" + getAnnual() + "]");
		System.out.println("sum_y1 = [" + getSum_y1() + "]");
		System.out.println("sum_y2 = [" + getSum_y2() + "]");
		System.out.println("sum_y3 = [" + getSum_y3() + "]");
		System.out.println("ddct = [" + getDdct() + "]");
		System.out.println("ann_tot_amt = [" + getAnn_tot_amt() + "]");
		System.out.println("tax_year_amt = [" + getTax_year_amt() + "]");
		System.out.println("ddct_bs_ass_amt = [" + getDdct_bs_ass_amt() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("pre_tot_amt = [" + getPre_tot_amt() + "]");
		System.out.println("pre_market_tot_amt = [" + getPre_market_tot_amt() + "]");
		System.out.println("pre_tmoney_tot_amt = [" + getPre_tmoney_tot_amt() + "]");
		System.out.println("edu_tp = [" + getEdu_tp() + "]");
		System.out.println("first_tot_amt = [" + getFirst_tot_amt() + "]");
		System.out.println("second_tot_amt = [" + getSecond_tot_amt() + "]");
		System.out.println("secu_no = [" + getSecu_no() + "]");
		System.out.println("fund_nm = [" + getFund_nm() + "]");
		System.out.println("att_frmmm = [" + getAtt_frmmm() + "]");
		System.out.println("att_tomm = [" + getAtt_tomm() + "]");
		System.out.println("att_inqrmm = [" + getAtt_inqrmm() + "]");
		System.out.println("ftyr_tot_amt = [" + getFtyr_tot_amt() + "]");
		System.out.println("ftyr_market_tot_amt = [" + getFtyr_market_tot_amt() + "]");
		System.out.println("ftyr_tmoney_tot_amt = [" + getFtyr_tmoney_tot_amt() + "]");
		System.out.println("first_year_tot_amt = [" + getFirst_year_tot_amt() + "]");
		System.out.println("second_year_tot_amt = [" + getSecond_year_tot_amt() + "]");
		System.out.println("inqr_strt_mm = [" + getInqr_strt_mm() + "]");
		System.out.println("inqr_end_mm = [" + getInqr_end_mm() + "]");
		System.out.println("lend_loan_amt = [" + getLend_loan_amt() + "]");
		//System.out.println("hi_yrs = [" + getHi_yrs() + "]");
		//System.out.println("ltrm_yrs = [" + getLtrm_yrs() + "]");
		//System.out.println("hi_ntf = [" + getHi_ntf() + "]");
		//System.out.println("ltrm_ntf = [" + getLtrm_ntf() + "]");
		//System.out.println("hi_pmt = [" + getHi_pmt() + "]");
		//System.out.println("ltrm_pmt = [" + getLtrm_pmt() + "]");
		//System.out.println("spym = [" + getSpym() + "]");
		//System.out.println("jlc = [" + getJlc() + "]");
		//System.out.println("ntf = [" + getNtf() + "]");
		//System.out.println("pmt = [" + getPmt() + "]");
		//System.out.println("wrkp_ntf = [" + getWrkp_ntf() + "]");
		//System.out.println("rgn_pmt = [" + getRgn_pmt() + "]");
		//System.out.println("apln = [" + getApln() + "]");
		System.out.println("sbdy_apln_sum = [" + getSbdy_apln_sum() + "]");
		System.out.println("conb_sum = [" + getConb_sum() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String add_file_nm1 = req.getParameter("add_file_nm1");
if( add_file_nm1 == null){
	System.out.println(this.toString+" : add_file_nm1 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm1 is "+add_file_nm1 );
}
String add_file1 = req.getParameter("add_file1");
if( add_file1 == null){
	System.out.println(this.toString+" : add_file1 is null" );
}else{
	System.out.println(this.toString+" : add_file1 is "+add_file1 );
}
String doc_type = req.getParameter("doc_type");
if( doc_type == null){
	System.out.println(this.toString+" : doc_type is null" );
}else{
	System.out.println(this.toString+" : doc_type is "+doc_type );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String att_year = req.getParameter("att_year");
if( att_year == null){
	System.out.println(this.toString+" : att_year is null" );
}else{
	System.out.println(this.toString+" : att_year is "+att_year );
}
String form_cd = req.getParameter("form_cd");
if( form_cd == null){
	System.out.println(this.toString+" : form_cd is null" );
}else{
	System.out.println(this.toString+" : form_cd is "+form_cd );
}
String resid = req.getParameter("resid");
if( resid == null){
	System.out.println(this.toString+" : resid is null" );
}else{
	System.out.println(this.toString+" : resid is "+resid );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String dat_cd = req.getParameter("dat_cd");
if( dat_cd == null){
	System.out.println(this.toString+" : dat_cd is null" );
}else{
	System.out.println(this.toString+" : dat_cd is "+dat_cd );
}
String busnid = req.getParameter("busnid");
if( busnid == null){
	System.out.println(this.toString+" : busnid is null" );
}else{
	System.out.println(this.toString+" : busnid is "+busnid );
}
String trade_nm = req.getParameter("trade_nm");
if( trade_nm == null){
	System.out.println(this.toString+" : trade_nm is null" );
}else{
	System.out.println(this.toString+" : trade_nm is "+trade_nm );
}
String acc_no = req.getParameter("acc_no");
if( acc_no == null){
	System.out.println(this.toString+" : acc_no is null" );
}else{
	System.out.println(this.toString+" : acc_no is "+acc_no );
}
String use_place_cd = req.getParameter("use_place_cd");
if( use_place_cd == null){
	System.out.println(this.toString+" : use_place_cd is null" );
}else{
	System.out.println(this.toString+" : use_place_cd is "+use_place_cd );
}
String donation_cd = req.getParameter("donation_cd");
if( donation_cd == null){
	System.out.println(this.toString+" : donation_cd is null" );
}else{
	System.out.println(this.toString+" : donation_cd is "+donation_cd );
}
String course_cd = req.getParameter("course_cd");
if( course_cd == null){
	System.out.println(this.toString+" : course_cd is null" );
}else{
	System.out.println(this.toString+" : course_cd is "+course_cd );
}
String subject_nm = req.getParameter("subject_nm");
if( subject_nm == null){
	System.out.println(this.toString+" : subject_nm is null" );
}else{
	System.out.println(this.toString+" : subject_nm is "+subject_nm );
}
String start_dt = req.getParameter("start_dt");
if( start_dt == null){
	System.out.println(this.toString+" : start_dt is null" );
}else{
	System.out.println(this.toString+" : start_dt is "+start_dt );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String com_cd = req.getParameter("com_cd");
if( com_cd == null){
	System.out.println(this.toString+" : com_cd is null" );
}else{
	System.out.println(this.toString+" : com_cd is "+com_cd );
}
String pension_cd = req.getParameter("pension_cd");
if( pension_cd == null){
	System.out.println(this.toString+" : pension_cd is null" );
}else{
	System.out.println(this.toString+" : pension_cd is "+pension_cd );
}
String goods_nm = req.getParameter("goods_nm");
if( goods_nm == null){
	System.out.println(this.toString+" : goods_nm is null" );
}else{
	System.out.println(this.toString+" : goods_nm is "+goods_nm );
}
String lend_dt = req.getParameter("lend_dt");
if( lend_dt == null){
	System.out.println(this.toString+" : lend_dt is null" );
}else{
	System.out.println(this.toString+" : lend_dt is "+lend_dt );
}
String lend_kd = req.getParameter("lend_kd");
if( lend_kd == null){
	System.out.println(this.toString+" : lend_kd is null" );
}else{
	System.out.println(this.toString+" : lend_kd is "+lend_kd );
}
String house_take_dt = req.getParameter("house_take_dt");
if( house_take_dt == null){
	System.out.println(this.toString+" : house_take_dt is null" );
}else{
	System.out.println(this.toString+" : house_take_dt is "+house_take_dt );
}
String mort_setup_dt = req.getParameter("mort_setup_dt");
if( mort_setup_dt == null){
	System.out.println(this.toString+" : mort_setup_dt is null" );
}else{
	System.out.println(this.toString+" : mort_setup_dt is "+mort_setup_dt );
}
String repay_years = req.getParameter("repay_years");
if( repay_years == null){
	System.out.println(this.toString+" : repay_years is null" );
}else{
	System.out.println(this.toString+" : repay_years is "+repay_years );
}
String lend_goods_nm = req.getParameter("lend_goods_nm");
if( lend_goods_nm == null){
	System.out.println(this.toString+" : lend_goods_nm is null" );
}else{
	System.out.println(this.toString+" : lend_goods_nm is "+lend_goods_nm );
}
String debt = req.getParameter("debt");
if( debt == null){
	System.out.println(this.toString+" : debt is null" );
}else{
	System.out.println(this.toString+" : debt is "+debt );
}
String fixed_rate_debt = req.getParameter("fixed_rate_debt");
if( fixed_rate_debt == null){
	System.out.println(this.toString+" : fixed_rate_debt is null" );
}else{
	System.out.println(this.toString+" : fixed_rate_debt is "+fixed_rate_debt );
}
String not_defer_debt = req.getParameter("not_defer_debt");
if( not_defer_debt == null){
	System.out.println(this.toString+" : not_defer_debt is null" );
}else{
	System.out.println(this.toString+" : not_defer_debt is "+not_defer_debt );
}
String this_year_rede_amt = req.getParameter("this_year_rede_amt");
if( this_year_rede_amt == null){
	System.out.println(this.toString+" : this_year_rede_amt is null" );
}else{
	System.out.println(this.toString+" : this_year_rede_amt is "+this_year_rede_amt );
}
String saving_gubn = req.getParameter("saving_gubn");
if( saving_gubn == null){
	System.out.println(this.toString+" : saving_gubn is null" );
}else{
	System.out.println(this.toString+" : saving_gubn is "+saving_gubn );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String pay_method = req.getParameter("pay_method");
if( pay_method == null){
	System.out.println(this.toString+" : pay_method is null" );
}else{
	System.out.println(this.toString+" : pay_method is "+pay_method );
}
String insu1_resid = req.getParameter("insu1_resid");
if( insu1_resid == null){
	System.out.println(this.toString+" : insu1_resid is null" );
}else{
	System.out.println(this.toString+" : insu1_resid is "+insu1_resid );
}
String insu1_nm = req.getParameter("insu1_nm");
if( insu1_nm == null){
	System.out.println(this.toString+" : insu1_nm is null" );
}else{
	System.out.println(this.toString+" : insu1_nm is "+insu1_nm );
}
String insu2_resid1 = req.getParameter("insu2_resid1");
if( insu2_resid1 == null){
	System.out.println(this.toString+" : insu2_resid1 is null" );
}else{
	System.out.println(this.toString+" : insu2_resid1 is "+insu2_resid1 );
}
String insu2_nm1 = req.getParameter("insu2_nm1");
if( insu2_nm1 == null){
	System.out.println(this.toString+" : insu2_nm1 is null" );
}else{
	System.out.println(this.toString+" : insu2_nm1 is "+insu2_nm1 );
}
String insu2_resid2 = req.getParameter("insu2_resid2");
if( insu2_resid2 == null){
	System.out.println(this.toString+" : insu2_resid2 is null" );
}else{
	System.out.println(this.toString+" : insu2_resid2 is "+insu2_resid2 );
}
String insu2_nm2 = req.getParameter("insu2_nm2");
if( insu2_nm2 == null){
	System.out.println(this.toString+" : insu2_nm2 is null" );
}else{
	System.out.println(this.toString+" : insu2_nm2 is "+insu2_nm2 );
}
String insu2_resid3 = req.getParameter("insu2_resid3");
if( insu2_resid3 == null){
	System.out.println(this.toString+" : insu2_resid3 is null" );
}else{
	System.out.println(this.toString+" : insu2_resid3 is "+insu2_resid3 );
}
String insu2_nm3 = req.getParameter("insu2_nm3");
if( insu2_nm3 == null){
	System.out.println(this.toString+" : insu2_nm3 is null" );
}else{
	System.out.println(this.toString+" : insu2_nm3 is "+insu2_nm3 );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String sum = req.getParameter("sum");
if( sum == null){
	System.out.println(this.toString+" : sum is null" );
}else{
	System.out.println(this.toString+" : sum is "+sum );
}
String mm = req.getParameter("mm");
if( mm == null){
	System.out.println(this.toString+" : mm is null" );
}else{
	System.out.println(this.toString+" : mm is "+mm );
}
String dd = req.getParameter("dd");
if( dd == null){
	System.out.println(this.toString+" : dd is null" );
}else{
	System.out.println(this.toString+" : dd is "+dd );
}
String fix_cd = req.getParameter("fix_cd");
if( fix_cd == null){
	System.out.println(this.toString+" : fix_cd is null" );
}else{
	System.out.println(this.toString+" : fix_cd is "+fix_cd );
}
String date = req.getParameter("date");
if( date == null){
	System.out.println(this.toString+" : date is null" );
}else{
	System.out.println(this.toString+" : date is "+date );
}
String annual = req.getParameter("annual");
if( annual == null){
	System.out.println(this.toString+" : annual is null" );
}else{
	System.out.println(this.toString+" : annual is "+annual );
}
String sum_y1 = req.getParameter("sum_y1");
if( sum_y1 == null){
	System.out.println(this.toString+" : sum_y1 is null" );
}else{
	System.out.println(this.toString+" : sum_y1 is "+sum_y1 );
}
String sum_y2 = req.getParameter("sum_y2");
if( sum_y2 == null){
	System.out.println(this.toString+" : sum_y2 is null" );
}else{
	System.out.println(this.toString+" : sum_y2 is "+sum_y2 );
}
String sum_y3 = req.getParameter("sum_y3");
if( sum_y3 == null){
	System.out.println(this.toString+" : sum_y3 is null" );
}else{
	System.out.println(this.toString+" : sum_y3 is "+sum_y3 );
}
String ddct = req.getParameter("ddct");
if( ddct == null){
	System.out.println(this.toString+" : ddct is null" );
}else{
	System.out.println(this.toString+" : ddct is "+ddct );
}
String ann_tot_amt = req.getParameter("ann_tot_amt");
if( ann_tot_amt == null){
	System.out.println(this.toString+" : ann_tot_amt is null" );
}else{
	System.out.println(this.toString+" : ann_tot_amt is "+ann_tot_amt );
}
String tax_year_amt = req.getParameter("tax_year_amt");
if( tax_year_amt == null){
	System.out.println(this.toString+" : tax_year_amt is null" );
}else{
	System.out.println(this.toString+" : tax_year_amt is "+tax_year_amt );
}
String ddct_bs_ass_amt = req.getParameter("ddct_bs_ass_amt");
if( ddct_bs_ass_amt == null){
	System.out.println(this.toString+" : ddct_bs_ass_amt is null" );
}else{
	System.out.println(this.toString+" : ddct_bs_ass_amt is "+ddct_bs_ass_amt );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String pre_tot_amt = req.getParameter("pre_tot_amt");
if( pre_tot_amt == null){
	System.out.println(this.toString+" : pre_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pre_tot_amt is "+pre_tot_amt );
}
String pre_market_tot_amt = req.getParameter("pre_market_tot_amt");
if( pre_market_tot_amt == null){
	System.out.println(this.toString+" : pre_market_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pre_market_tot_amt is "+pre_market_tot_amt );
}
String pre_tmoney_tot_amt = req.getParameter("pre_tmoney_tot_amt");
if( pre_tmoney_tot_amt == null){
	System.out.println(this.toString+" : pre_tmoney_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pre_tmoney_tot_amt is "+pre_tmoney_tot_amt );
}
String edu_tp = req.getParameter("edu_tp");
if( edu_tp == null){
	System.out.println(this.toString+" : edu_tp is null" );
}else{
	System.out.println(this.toString+" : edu_tp is "+edu_tp );
}
String first_tot_amt = req.getParameter("first_tot_amt");
if( first_tot_amt == null){
	System.out.println(this.toString+" : first_tot_amt is null" );
}else{
	System.out.println(this.toString+" : first_tot_amt is "+first_tot_amt );
}
String second_tot_amt = req.getParameter("second_tot_amt");
if( second_tot_amt == null){
	System.out.println(this.toString+" : second_tot_amt is null" );
}else{
	System.out.println(this.toString+" : second_tot_amt is "+second_tot_amt );
}
String secu_no = req.getParameter("secu_no");
if( secu_no == null){
	System.out.println(this.toString+" : secu_no is null" );
}else{
	System.out.println(this.toString+" : secu_no is "+secu_no );
}
String fund_nm = req.getParameter("fund_nm");
if( fund_nm == null){
	System.out.println(this.toString+" : fund_nm is null" );
}else{
	System.out.println(this.toString+" : fund_nm is "+fund_nm );
}
String att_frmmm = req.getParameter("att_frmmm");
if( att_frmmm == null){
	System.out.println(this.toString+" : att_frmmm is null" );
}else{
	System.out.println(this.toString+" : att_frmmm is "+att_frmmm );
}
String att_tomm = req.getParameter("att_tomm");
if( att_tomm == null){
	System.out.println(this.toString+" : att_tomm is null" );
}else{
	System.out.println(this.toString+" : att_tomm is "+att_tomm );
}
String att_inqrmm = req.getParameter("att_inqrmm");
if( att_inqrmm == null){
	System.out.println(this.toString+" : att_inqrmm is null" );
}else{
	System.out.println(this.toString+" : att_inqrmm is "+att_inqrmm );
}
String ftyr_tot_amt = req.getParameter("ftyr_tot_amt");
if( ftyr_tot_amt == null){
	System.out.println(this.toString+" : ftyr_tot_amt is null" );
}else{
	System.out.println(this.toString+" : ftyr_tot_amt is "+ftyr_tot_amt );
}
String ftyr_market_tot_amt = req.getParameter("ftyr_market_tot_amt");
if( ftyr_market_tot_amt == null){
	System.out.println(this.toString+" : ftyr_market_tot_amt is null" );
}else{
	System.out.println(this.toString+" : ftyr_market_tot_amt is "+ftyr_market_tot_amt );
}
String ftyr_tmoney_tot_amt = req.getParameter("ftyr_tmoney_tot_amt");
if( ftyr_tmoney_tot_amt == null){
	System.out.println(this.toString+" : ftyr_tmoney_tot_amt is null" );
}else{
	System.out.println(this.toString+" : ftyr_tmoney_tot_amt is "+ftyr_tmoney_tot_amt );
}
String first_year_tot_amt = req.getParameter("first_year_tot_amt");
if( first_year_tot_amt == null){
	System.out.println(this.toString+" : first_year_tot_amt is null" );
}else{
	System.out.println(this.toString+" : first_year_tot_amt is "+first_year_tot_amt );
}
String second_year_tot_amt = req.getParameter("second_year_tot_amt");
if( second_year_tot_amt == null){
	System.out.println(this.toString+" : second_year_tot_amt is null" );
}else{
	System.out.println(this.toString+" : second_year_tot_amt is "+second_year_tot_amt );
}
String inqr_strt_mm = req.getParameter("inqr_strt_mm");
if( inqr_strt_mm == null){
	System.out.println(this.toString+" : inqr_strt_mm is null" );
}else{
	System.out.println(this.toString+" : inqr_strt_mm is "+inqr_strt_mm );
}
String inqr_end_mm = req.getParameter("inqr_end_mm");
if( inqr_end_mm == null){
	System.out.println(this.toString+" : inqr_end_mm is null" );
}else{
	System.out.println(this.toString+" : inqr_end_mm is "+inqr_end_mm );
}
String lend_loan_amt = req.getParameter("lend_loan_amt");
if( lend_loan_amt == null){
	System.out.println(this.toString+" : lend_loan_amt is null" );
}else{
	System.out.println(this.toString+" : lend_loan_amt is "+lend_loan_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String add_file_nm1 = Util.checkString(req.getParameter("add_file_nm1"));
String add_file1 = Util.checkString(req.getParameter("add_file1"));
String doc_type = Util.checkString(req.getParameter("doc_type"));
String seq = Util.checkString(req.getParameter("seq"));
String att_year = Util.checkString(req.getParameter("att_year"));
String form_cd = Util.checkString(req.getParameter("form_cd"));
String resid = Util.checkString(req.getParameter("resid"));
String name = Util.checkString(req.getParameter("name"));
String dat_cd = Util.checkString(req.getParameter("dat_cd"));
String busnid = Util.checkString(req.getParameter("busnid"));
String trade_nm = Util.checkString(req.getParameter("trade_nm"));
String acc_no = Util.checkString(req.getParameter("acc_no"));
String use_place_cd = Util.checkString(req.getParameter("use_place_cd"));
String donation_cd = Util.checkString(req.getParameter("donation_cd"));
String course_cd = Util.checkString(req.getParameter("course_cd"));
String subject_nm = Util.checkString(req.getParameter("subject_nm"));
String start_dt = Util.checkString(req.getParameter("start_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String com_cd = Util.checkString(req.getParameter("com_cd"));
String pension_cd = Util.checkString(req.getParameter("pension_cd"));
String goods_nm = Util.checkString(req.getParameter("goods_nm"));
String lend_dt = Util.checkString(req.getParameter("lend_dt"));
String lend_kd = Util.checkString(req.getParameter("lend_kd"));
String house_take_dt = Util.checkString(req.getParameter("house_take_dt"));
String mort_setup_dt = Util.checkString(req.getParameter("mort_setup_dt"));
String repay_years = Util.checkString(req.getParameter("repay_years"));
String lend_goods_nm = Util.checkString(req.getParameter("lend_goods_nm"));
String debt = Util.checkString(req.getParameter("debt"));
String fixed_rate_debt = Util.checkString(req.getParameter("fixed_rate_debt"));
String not_defer_debt = Util.checkString(req.getParameter("not_defer_debt"));
String this_year_rede_amt = Util.checkString(req.getParameter("this_year_rede_amt"));
String saving_gubn = Util.checkString(req.getParameter("saving_gubn"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String pay_method = Util.checkString(req.getParameter("pay_method"));
String insu1_resid = Util.checkString(req.getParameter("insu1_resid"));
String insu1_nm = Util.checkString(req.getParameter("insu1_nm"));
String insu2_resid1 = Util.checkString(req.getParameter("insu2_resid1"));
String insu2_nm1 = Util.checkString(req.getParameter("insu2_nm1"));
String insu2_resid2 = Util.checkString(req.getParameter("insu2_resid2"));
String insu2_nm2 = Util.checkString(req.getParameter("insu2_nm2"));
String insu2_resid3 = Util.checkString(req.getParameter("insu2_resid3"));
String insu2_nm3 = Util.checkString(req.getParameter("insu2_nm3"));
String amt = Util.checkString(req.getParameter("amt"));
String sum = Util.checkString(req.getParameter("sum"));
String mm = Util.checkString(req.getParameter("mm"));
String dd = Util.checkString(req.getParameter("dd"));
String fix_cd = Util.checkString(req.getParameter("fix_cd"));
String date = Util.checkString(req.getParameter("date"));
String annual = Util.checkString(req.getParameter("annual"));
String sum_y1 = Util.checkString(req.getParameter("sum_y1"));
String sum_y2 = Util.checkString(req.getParameter("sum_y2"));
String sum_y3 = Util.checkString(req.getParameter("sum_y3"));
String ddct = Util.checkString(req.getParameter("ddct"));
String ann_tot_amt = Util.checkString(req.getParameter("ann_tot_amt"));
String tax_year_amt = Util.checkString(req.getParameter("tax_year_amt"));
String ddct_bs_ass_amt = Util.checkString(req.getParameter("ddct_bs_ass_amt"));
String flag = Util.checkString(req.getParameter("flag"));
String pre_tot_amt = Util.checkString(req.getParameter("pre_tot_amt"));
String pre_market_tot_amt = Util.checkString(req.getParameter("pre_market_tot_amt"));
String pre_tmoney_tot_amt = Util.checkString(req.getParameter("pre_tmoney_tot_amt"));
String edu_tp = Util.checkString(req.getParameter("edu_tp"));
String first_tot_amt = Util.checkString(req.getParameter("first_tot_amt"));
String second_tot_amt = Util.checkString(req.getParameter("second_tot_amt"));
String secu_no = Util.checkString(req.getParameter("secu_no"));
String fund_nm = Util.checkString(req.getParameter("fund_nm"));
String att_frmmm = Util.checkString(req.getParameter("att_frmmm"));
String att_tomm = Util.checkString(req.getParameter("att_tomm"));
String att_inqrmm = Util.checkString(req.getParameter("att_inqrmm"));
String ftyr_tot_amt = Util.checkString(req.getParameter("ftyr_tot_amt"));
String ftyr_market_tot_amt = Util.checkString(req.getParameter("ftyr_market_tot_amt"));
String ftyr_tmoney_tot_amt = Util.checkString(req.getParameter("ftyr_tmoney_tot_amt"));
String first_year_tot_amt = Util.checkString(req.getParameter("first_year_tot_amt"));
String second_year_tot_amt = Util.checkString(req.getParameter("second_year_tot_amt"));
String inqr_strt_mm = Util.checkString(req.getParameter("inqr_strt_mm"));
String inqr_end_mm = Util.checkString(req.getParameter("inqr_end_mm"));
String lend_loan_amt = Util.checkString(req.getParameter("lend_loan_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String add_file_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm1")));
String add_file1 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file1")));
String doc_type = Util.Uni2Ksc(Util.checkString(req.getParameter("doc_type")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String att_year = Util.Uni2Ksc(Util.checkString(req.getParameter("att_year")));
String form_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("form_cd")));
String resid = Util.Uni2Ksc(Util.checkString(req.getParameter("resid")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String dat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dat_cd")));
String busnid = Util.Uni2Ksc(Util.checkString(req.getParameter("busnid")));
String trade_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("trade_nm")));
String acc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_no")));
String use_place_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_place_cd")));
String donation_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("donation_cd")));
String course_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("course_cd")));
String subject_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("subject_nm")));
String start_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("start_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String com_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("com_cd")));
String pension_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pension_cd")));
String goods_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("goods_nm")));
String lend_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_dt")));
String lend_kd = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_kd")));
String house_take_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("house_take_dt")));
String mort_setup_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mort_setup_dt")));
String repay_years = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_years")));
String lend_goods_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_goods_nm")));
String debt = Util.Uni2Ksc(Util.checkString(req.getParameter("debt")));
String fixed_rate_debt = Util.Uni2Ksc(Util.checkString(req.getParameter("fixed_rate_debt")));
String not_defer_debt = Util.Uni2Ksc(Util.checkString(req.getParameter("not_defer_debt")));
String this_year_rede_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("this_year_rede_amt")));
String saving_gubn = Util.Uni2Ksc(Util.checkString(req.getParameter("saving_gubn")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String pay_method = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_method")));
String insu1_resid = Util.Uni2Ksc(Util.checkString(req.getParameter("insu1_resid")));
String insu1_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("insu1_nm")));
String insu2_resid1 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_resid1")));
String insu2_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_nm1")));
String insu2_resid2 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_resid2")));
String insu2_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_nm2")));
String insu2_resid3 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_resid3")));
String insu2_nm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("insu2_nm3")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String sum = Util.Uni2Ksc(Util.checkString(req.getParameter("sum")));
String mm = Util.Uni2Ksc(Util.checkString(req.getParameter("mm")));
String dd = Util.Uni2Ksc(Util.checkString(req.getParameter("dd")));
String fix_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_cd")));
String date = Util.Uni2Ksc(Util.checkString(req.getParameter("date")));
String annual = Util.Uni2Ksc(Util.checkString(req.getParameter("annual")));
String sum_y1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_y1")));
String sum_y2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_y2")));
String sum_y3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_y3")));
String ddct = Util.Uni2Ksc(Util.checkString(req.getParameter("ddct")));
String ann_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ann_tot_amt")));
String tax_year_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_year_amt")));
String ddct_bs_ass_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ddct_bs_ass_amt")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String pre_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_tot_amt")));
String pre_market_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_market_tot_amt")));
String pre_tmoney_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_tmoney_tot_amt")));
String edu_tp = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_tp")));
String first_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("first_tot_amt")));
String second_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("second_tot_amt")));
String secu_no = Util.Uni2Ksc(Util.checkString(req.getParameter("secu_no")));
String fund_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_nm")));
String att_frmmm = Util.Uni2Ksc(Util.checkString(req.getParameter("att_frmmm")));
String att_tomm = Util.Uni2Ksc(Util.checkString(req.getParameter("att_tomm")));
String att_inqrmm = Util.Uni2Ksc(Util.checkString(req.getParameter("att_inqrmm")));
String ftyr_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_tot_amt")));
String ftyr_market_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_market_tot_amt")));
String ftyr_tmoney_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_tmoney_tot_amt")));
String first_year_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("first_year_tot_amt")));
String second_year_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("second_year_tot_amt")));
String inqr_strt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("inqr_strt_mm")));
String inqr_end_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("inqr_end_mm")));
String lend_loan_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_loan_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setAdd_file_nm1(add_file_nm1);
dm.setAdd_file1(add_file1);
dm.setDoc_type(doc_type);
dm.setSeq(seq);
dm.setAtt_year(att_year);
dm.setForm_cd(form_cd);
dm.setResid(resid);
dm.setName(name);
dm.setDat_cd(dat_cd);
dm.setBusnid(busnid);
dm.setTrade_nm(trade_nm);
dm.setAcc_no(acc_no);
dm.setUse_place_cd(use_place_cd);
dm.setDonation_cd(donation_cd);
dm.setCourse_cd(course_cd);
dm.setSubject_nm(subject_nm);
dm.setStart_dt(start_dt);
dm.setEnd_dt(end_dt);
dm.setCom_cd(com_cd);
dm.setPension_cd(pension_cd);
dm.setGoods_nm(goods_nm);
dm.setLend_dt(lend_dt);
dm.setLend_kd(lend_kd);
dm.setHouse_take_dt(house_take_dt);
dm.setMort_setup_dt(mort_setup_dt);
dm.setRepay_years(repay_years);
dm.setLend_goods_nm(lend_goods_nm);
dm.setDebt(debt);
dm.setFixed_rate_debt(fixed_rate_debt);
dm.setNot_defer_debt(not_defer_debt);
dm.setThis_year_rede_amt(this_year_rede_amt);
dm.setSaving_gubn(saving_gubn);
dm.setReg_dt(reg_dt);
dm.setPay_method(pay_method);
dm.setInsu1_resid(insu1_resid);
dm.setInsu1_nm(insu1_nm);
dm.setInsu2_resid1(insu2_resid1);
dm.setInsu2_nm1(insu2_nm1);
dm.setInsu2_resid2(insu2_resid2);
dm.setInsu2_nm2(insu2_nm2);
dm.setInsu2_resid3(insu2_resid3);
dm.setInsu2_nm3(insu2_nm3);
dm.setAmt(amt);
dm.setSum(sum);
dm.setMm(mm);
dm.setDd(dd);
dm.setFix_cd(fix_cd);
dm.setDate(date);
dm.setAnnual(annual);
dm.setSum_y1(sum_y1);
dm.setSum_y2(sum_y2);
dm.setSum_y3(sum_y3);
dm.setDdct(ddct);
dm.setAnn_tot_amt(ann_tot_amt);
dm.setTax_year_amt(tax_year_amt);
dm.setDdct_bs_ass_amt(ddct_bs_ass_amt);
dm.setFlag(flag);
dm.setPre_tot_amt(pre_tot_amt);
dm.setPre_market_tot_amt(pre_market_tot_amt);
dm.setPre_tmoney_tot_amt(pre_tmoney_tot_amt);
dm.setEdu_tp(edu_tp);
dm.setFirst_tot_amt(first_tot_amt);
dm.setSecond_tot_amt(second_tot_amt);
dm.setSecu_no(secu_no);
dm.setFund_nm(fund_nm);
dm.setAtt_frmmm(att_frmmm);
dm.setAtt_tomm(att_tomm);
dm.setAtt_inqrmm(att_inqrmm);
dm.setFtyr_tot_amt(ftyr_tot_amt);
dm.setFtyr_market_tot_amt(ftyr_market_tot_amt);
dm.setFtyr_tmoney_tot_amt(ftyr_tmoney_tot_amt);
dm.setFirst_year_tot_amt(first_year_tot_amt);
dm.setSecond_year_tot_amt(second_year_tot_amt);
dm.setInqr_strt_mm(inqr_strt_mm);
dm.setInqr_end_mm(inqr_end_mm);
dm.setLend_loan_amt(lend_loan_amt);

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 21 14:17:54 KST 2015 */