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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String medi_clsf;
	public String cmpy_cd;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String rcpm_shet_no;
	public String self_cmpy_yn;
	public String rcpm_acct;
	public String rcpm_plac_clsf;
	public String dlco_no;
	public String medi_cd;
	public String sale_aprv_no;
	public String dept_cd;
	public String sub_dept_cd;
	public String mchrg_pers;
	public String advt_tot_amt;
	public String rcpm_tot_amt;
	public String fee_amt;
	public String mode0;
	public String cash_amt0;
	public String cash_rcpt_use_yn0;
	public String cash_rcpt_acq_yn0;
	public String deal_cd0;
	public String tmnl_no0;
	public String aprv_no0;
	public String card_aprv_dd0;
	public String decid_no0;
	public String note_no1;
	public String bank_cd1;
	public String note_clsf_cd1;
	public String comp_dt1;
	public String mtry_dt1;
	public String note_amt1;
	public String sale_dscn_amt1;
	public String issu_cmpy_clsf_cd1;
	public String issu_pers_nm1;
	public String mode2;
	public String acct_mang_no2;
	public String rmtt_dt2;
	public String amt2;
	public String rmtt_coms2;
	public String rmtt_plac2;
	public String biz_reg_no2;
	public String bank_id2;
	public String acct_num2;
	public String tran_date_seq2;
	public String current_clsf2;
	public String curc_clsf2;
	public String frex_amt2;
	public String card_rcpm_yn2;
	public String card_mang_no2;
	public String cash_rcpt_use_yn2;
	public String cash_rcpt_acq_yn2;
	public String deal_cd2;
	public String tmnl_no2;
	public String aprv_no2;
	public String card_aprv_dd2;
	public String decid_no2;
	public String mode3;
	public String checked3;
	public String medi_cd3;
	public String amt3;
	public String rcpm_slip_no3;
	public String occr_dt3;
	public String slip_clsf3;
	public String seq3;
	public String subseq3;
	public String mode4;
	public String checked4;
	public String swit_dlco4;
	public String amt4;
	public String rcpm_slip_no4;
	public String budg_cd4;
	public String occr_dt4;
	public String slip_clsf4;
	public String seq4;
	public String subseq4;
	public String mode5;
	public String checked5;
	public String budg_cd5;
	public String amt5;
	public String rcpm_slip_no5;
	public String occr_dt5;
	public String slip_clsf5;
	public String seq5;
	public String subseq5;
	public String medi_cd6;
	public String amt6;
	public String depo_job_clsf7;
	public String amt7;
	public String swit_dlco7;
	public String amt8;
	public String budg_cd8;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String elec_note_key;

	public IS_DEP_1030_ADM(){}
	public IS_DEP_1030_ADM(String medi_clsf, String cmpy_cd, String occr_dt, String slip_clsf, String seq, String rcpm_shet_no, String self_cmpy_yn, String rcpm_acct, String rcpm_plac_clsf, String dlco_no, String medi_cd, String sale_aprv_no, String dept_cd, String sub_dept_cd, String mchrg_pers, String advt_tot_amt, String rcpm_tot_amt, String fee_amt, String mode0, String cash_amt0, String cash_rcpt_use_yn0, String cash_rcpt_acq_yn0, String deal_cd0, String tmnl_no0, String aprv_no0, String card_aprv_dd0, String decid_no0, String note_no1, String bank_cd1, String note_clsf_cd1, String comp_dt1, String mtry_dt1, String note_amt1, String sale_dscn_amt1, String issu_cmpy_clsf_cd1, String issu_pers_nm1, String mode2, String acct_mang_no2, String rmtt_dt2, String amt2, String rmtt_coms2, String rmtt_plac2, String biz_reg_no2, String bank_id2, String acct_num2, String tran_date_seq2, String current_clsf2, String curc_clsf2, String frex_amt2, String card_rcpm_yn2, String card_mang_no2, String cash_rcpt_use_yn2, String cash_rcpt_acq_yn2, String deal_cd2, String tmnl_no2, String aprv_no2, String card_aprv_dd2, String decid_no2, String mode3, String checked3, String medi_cd3, String amt3, String rcpm_slip_no3, String occr_dt3, String slip_clsf3, String seq3, String subseq3, String mode4, String checked4, String swit_dlco4, String amt4, String rcpm_slip_no4, String budg_cd4, String occr_dt4, String slip_clsf4, String seq4, String subseq4, String mode5, String checked5, String budg_cd5, String amt5, String rcpm_slip_no5, String occr_dt5, String slip_clsf5, String seq5, String subseq5, String medi_cd6, String amt6, String depo_job_clsf7, String amt7, String swit_dlco7, String amt8, String budg_cd8, String incmg_pers_ip, String incmg_pers, String elec_note_key){
		this.medi_clsf = medi_clsf;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.rcpm_shet_no = rcpm_shet_no;
		this.self_cmpy_yn = self_cmpy_yn;
		this.rcpm_acct = rcpm_acct;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_no = dlco_no;
		this.medi_cd = medi_cd;
		this.sale_aprv_no = sale_aprv_no;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.advt_tot_amt = advt_tot_amt;
		this.rcpm_tot_amt = rcpm_tot_amt;
		this.fee_amt = fee_amt;
		this.mode0 = mode0;
		this.cash_amt0 = cash_amt0;
		this.cash_rcpt_use_yn0 = cash_rcpt_use_yn0;
		this.cash_rcpt_acq_yn0 = cash_rcpt_acq_yn0;
		this.deal_cd0 = deal_cd0;
		this.tmnl_no0 = tmnl_no0;
		this.aprv_no0 = aprv_no0;
		this.card_aprv_dd0 = card_aprv_dd0;
		this.decid_no0 = decid_no0;
		this.note_no1 = note_no1;
		this.bank_cd1 = bank_cd1;
		this.note_clsf_cd1 = note_clsf_cd1;
		this.comp_dt1 = comp_dt1;
		this.mtry_dt1 = mtry_dt1;
		this.note_amt1 = note_amt1;
		this.sale_dscn_amt1 = sale_dscn_amt1;
		this.issu_cmpy_clsf_cd1 = issu_cmpy_clsf_cd1;
		this.issu_pers_nm1 = issu_pers_nm1;
		this.mode2 = mode2;
		this.acct_mang_no2 = acct_mang_no2;
		this.rmtt_dt2 = rmtt_dt2;
		this.amt2 = amt2;
		this.rmtt_coms2 = rmtt_coms2;
		this.rmtt_plac2 = rmtt_plac2;
		this.biz_reg_no2 = biz_reg_no2;
		this.bank_id2 = bank_id2;
		this.acct_num2 = acct_num2;
		this.tran_date_seq2 = tran_date_seq2;
		this.current_clsf2 = current_clsf2;
		this.curc_clsf2 = curc_clsf2;
		this.frex_amt2 = frex_amt2;
		this.card_rcpm_yn2 = card_rcpm_yn2;
		this.card_mang_no2 = card_mang_no2;
		this.cash_rcpt_use_yn2 = cash_rcpt_use_yn2;
		this.cash_rcpt_acq_yn2 = cash_rcpt_acq_yn2;
		this.deal_cd2 = deal_cd2;
		this.tmnl_no2 = tmnl_no2;
		this.aprv_no2 = aprv_no2;
		this.card_aprv_dd2 = card_aprv_dd2;
		this.decid_no2 = decid_no2;
		this.mode3 = mode3;
		this.checked3 = checked3;
		this.medi_cd3 = medi_cd3;
		this.amt3 = amt3;
		this.rcpm_slip_no3 = rcpm_slip_no3;
		this.occr_dt3 = occr_dt3;
		this.slip_clsf3 = slip_clsf3;
		this.seq3 = seq3;
		this.subseq3 = subseq3;
		this.mode4 = mode4;
		this.checked4 = checked4;
		this.swit_dlco4 = swit_dlco4;
		this.amt4 = amt4;
		this.rcpm_slip_no4 = rcpm_slip_no4;
		this.budg_cd4 = budg_cd4;
		this.occr_dt4 = occr_dt4;
		this.slip_clsf4 = slip_clsf4;
		this.seq4 = seq4;
		this.subseq4 = subseq4;
		this.mode5 = mode5;
		this.checked5 = checked5;
		this.budg_cd5 = budg_cd5;
		this.amt5 = amt5;
		this.rcpm_slip_no5 = rcpm_slip_no5;
		this.occr_dt5 = occr_dt5;
		this.slip_clsf5 = slip_clsf5;
		this.seq5 = seq5;
		this.subseq5 = subseq5;
		this.medi_cd6 = medi_cd6;
		this.amt6 = amt6;
		this.depo_job_clsf7 = depo_job_clsf7;
		this.amt7 = amt7;
		this.swit_dlco7 = swit_dlco7;
		this.amt8 = amt8;
		this.budg_cd8 = budg_cd8;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.elec_note_key = elec_note_key;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setSelf_cmpy_yn(String self_cmpy_yn){
		this.self_cmpy_yn = self_cmpy_yn;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setAdvt_tot_amt(String advt_tot_amt){
		this.advt_tot_amt = advt_tot_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setFee_amt(String fee_amt){
		this.fee_amt = fee_amt;
	}

	public void setMode0(String mode0){
		this.mode0 = mode0;
	}

	public void setCash_amt0(String cash_amt0){
		this.cash_amt0 = cash_amt0;
	}

	public void setCash_rcpt_use_yn0(String cash_rcpt_use_yn0){
		this.cash_rcpt_use_yn0 = cash_rcpt_use_yn0;
	}

	public void setCash_rcpt_acq_yn0(String cash_rcpt_acq_yn0){
		this.cash_rcpt_acq_yn0 = cash_rcpt_acq_yn0;
	}

	public void setDeal_cd0(String deal_cd0){
		this.deal_cd0 = deal_cd0;
	}

	public void setTmnl_no0(String tmnl_no0){
		this.tmnl_no0 = tmnl_no0;
	}

	public void setAprv_no0(String aprv_no0){
		this.aprv_no0 = aprv_no0;
	}

	public void setCard_aprv_dd0(String card_aprv_dd0){
		this.card_aprv_dd0 = card_aprv_dd0;
	}

	public void setDecid_no0(String decid_no0){
		this.decid_no0 = decid_no0;
	}

	public void setNote_no1(String note_no1){
		this.note_no1 = note_no1;
	}

	public void setBank_cd1(String bank_cd1){
		this.bank_cd1 = bank_cd1;
	}

	public void setNote_clsf_cd1(String note_clsf_cd1){
		this.note_clsf_cd1 = note_clsf_cd1;
	}

	public void setComp_dt1(String comp_dt1){
		this.comp_dt1 = comp_dt1;
	}

	public void setMtry_dt1(String mtry_dt1){
		this.mtry_dt1 = mtry_dt1;
	}

	public void setNote_amt1(String note_amt1){
		this.note_amt1 = note_amt1;
	}

	public void setSale_dscn_amt1(String sale_dscn_amt1){
		this.sale_dscn_amt1 = sale_dscn_amt1;
	}

	public void setIssu_cmpy_clsf_cd1(String issu_cmpy_clsf_cd1){
		this.issu_cmpy_clsf_cd1 = issu_cmpy_clsf_cd1;
	}

	public void setIssu_pers_nm1(String issu_pers_nm1){
		this.issu_pers_nm1 = issu_pers_nm1;
	}

	public void setMode2(String mode2){
		this.mode2 = mode2;
	}

	public void setAcct_mang_no2(String acct_mang_no2){
		this.acct_mang_no2 = acct_mang_no2;
	}

	public void setRmtt_dt2(String rmtt_dt2){
		this.rmtt_dt2 = rmtt_dt2;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setRmtt_coms2(String rmtt_coms2){
		this.rmtt_coms2 = rmtt_coms2;
	}

	public void setRmtt_plac2(String rmtt_plac2){
		this.rmtt_plac2 = rmtt_plac2;
	}

	public void setBiz_reg_no2(String biz_reg_no2){
		this.biz_reg_no2 = biz_reg_no2;
	}

	public void setBank_id2(String bank_id2){
		this.bank_id2 = bank_id2;
	}

	public void setAcct_num2(String acct_num2){
		this.acct_num2 = acct_num2;
	}

	public void setTran_date_seq2(String tran_date_seq2){
		this.tran_date_seq2 = tran_date_seq2;
	}

	public void setCurrent_clsf2(String current_clsf2){
		this.current_clsf2 = current_clsf2;
	}

	public void setCurc_clsf2(String curc_clsf2){
		this.curc_clsf2 = curc_clsf2;
	}

	public void setFrex_amt2(String frex_amt2){
		this.frex_amt2 = frex_amt2;
	}

	public void setCard_rcpm_yn2(String card_rcpm_yn2){
		this.card_rcpm_yn2 = card_rcpm_yn2;
	}

	public void setCard_mang_no2(String card_mang_no2){
		this.card_mang_no2 = card_mang_no2;
	}

	public void setCash_rcpt_use_yn2(String cash_rcpt_use_yn2){
		this.cash_rcpt_use_yn2 = cash_rcpt_use_yn2;
	}

	public void setCash_rcpt_acq_yn2(String cash_rcpt_acq_yn2){
		this.cash_rcpt_acq_yn2 = cash_rcpt_acq_yn2;
	}

	public void setDeal_cd2(String deal_cd2){
		this.deal_cd2 = deal_cd2;
	}

	public void setTmnl_no2(String tmnl_no2){
		this.tmnl_no2 = tmnl_no2;
	}

	public void setAprv_no2(String aprv_no2){
		this.aprv_no2 = aprv_no2;
	}

	public void setCard_aprv_dd2(String card_aprv_dd2){
		this.card_aprv_dd2 = card_aprv_dd2;
	}

	public void setDecid_no2(String decid_no2){
		this.decid_no2 = decid_no2;
	}

	public void setMode3(String mode3){
		this.mode3 = mode3;
	}

	public void setChecked3(String checked3){
		this.checked3 = checked3;
	}

	public void setMedi_cd3(String medi_cd3){
		this.medi_cd3 = medi_cd3;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setRcpm_slip_no3(String rcpm_slip_no3){
		this.rcpm_slip_no3 = rcpm_slip_no3;
	}

	public void setOccr_dt3(String occr_dt3){
		this.occr_dt3 = occr_dt3;
	}

	public void setSlip_clsf3(String slip_clsf3){
		this.slip_clsf3 = slip_clsf3;
	}

	public void setSeq3(String seq3){
		this.seq3 = seq3;
	}

	public void setSubseq3(String subseq3){
		this.subseq3 = subseq3;
	}

	public void setMode4(String mode4){
		this.mode4 = mode4;
	}

	public void setChecked4(String checked4){
		this.checked4 = checked4;
	}

	public void setSwit_dlco4(String swit_dlco4){
		this.swit_dlco4 = swit_dlco4;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setRcpm_slip_no4(String rcpm_slip_no4){
		this.rcpm_slip_no4 = rcpm_slip_no4;
	}

	public void setBudg_cd4(String budg_cd4){
		this.budg_cd4 = budg_cd4;
	}

	public void setOccr_dt4(String occr_dt4){
		this.occr_dt4 = occr_dt4;
	}

	public void setSlip_clsf4(String slip_clsf4){
		this.slip_clsf4 = slip_clsf4;
	}

	public void setSeq4(String seq4){
		this.seq4 = seq4;
	}

	public void setSubseq4(String subseq4){
		this.subseq4 = subseq4;
	}

	public void setMode5(String mode5){
		this.mode5 = mode5;
	}

	public void setChecked5(String checked5){
		this.checked5 = checked5;
	}

	public void setBudg_cd5(String budg_cd5){
		this.budg_cd5 = budg_cd5;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setRcpm_slip_no5(String rcpm_slip_no5){
		this.rcpm_slip_no5 = rcpm_slip_no5;
	}

	public void setOccr_dt5(String occr_dt5){
		this.occr_dt5 = occr_dt5;
	}

	public void setSlip_clsf5(String slip_clsf5){
		this.slip_clsf5 = slip_clsf5;
	}

	public void setSeq5(String seq5){
		this.seq5 = seq5;
	}

	public void setSubseq5(String subseq5){
		this.subseq5 = subseq5;
	}

	public void setMedi_cd6(String medi_cd6){
		this.medi_cd6 = medi_cd6;
	}

	public void setAmt6(String amt6){
		this.amt6 = amt6;
	}

	public void setDepo_job_clsf7(String depo_job_clsf7){
		this.depo_job_clsf7 = depo_job_clsf7;
	}

	public void setAmt7(String amt7){
		this.amt7 = amt7;
	}

	public void setSwit_dlco7(String swit_dlco7){
		this.swit_dlco7 = swit_dlco7;
	}

	public void setAmt8(String amt8){
		this.amt8 = amt8;
	}

	public void setBudg_cd8(String budg_cd8){
		this.budg_cd8 = budg_cd8;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setElec_note_key(String elec_note_key){
		this.elec_note_key = elec_note_key;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getSelf_cmpy_yn(){
		return this.self_cmpy_yn;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getAdvt_tot_amt(){
		return this.advt_tot_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getFee_amt(){
		return this.fee_amt;
	}

	public String getMode0(){
		return this.mode0;
	}

	public String getCash_amt0(){
		return this.cash_amt0;
	}

	public String getCash_rcpt_use_yn0(){
		return this.cash_rcpt_use_yn0;
	}

	public String getCash_rcpt_acq_yn0(){
		return this.cash_rcpt_acq_yn0;
	}

	public String getDeal_cd0(){
		return this.deal_cd0;
	}

	public String getTmnl_no0(){
		return this.tmnl_no0;
	}

	public String getAprv_no0(){
		return this.aprv_no0;
	}

	public String getCard_aprv_dd0(){
		return this.card_aprv_dd0;
	}

	public String getDecid_no0(){
		return this.decid_no0;
	}

	public String getNote_no1(){
		return this.note_no1;
	}

	public String getBank_cd1(){
		return this.bank_cd1;
	}

	public String getNote_clsf_cd1(){
		return this.note_clsf_cd1;
	}

	public String getComp_dt1(){
		return this.comp_dt1;
	}

	public String getMtry_dt1(){
		return this.mtry_dt1;
	}

	public String getNote_amt1(){
		return this.note_amt1;
	}

	public String getSale_dscn_amt1(){
		return this.sale_dscn_amt1;
	}

	public String getIssu_cmpy_clsf_cd1(){
		return this.issu_cmpy_clsf_cd1;
	}

	public String getIssu_pers_nm1(){
		return this.issu_pers_nm1;
	}

	public String getMode2(){
		return this.mode2;
	}

	public String getAcct_mang_no2(){
		return this.acct_mang_no2;
	}

	public String getRmtt_dt2(){
		return this.rmtt_dt2;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getRmtt_coms2(){
		return this.rmtt_coms2;
	}

	public String getRmtt_plac2(){
		return this.rmtt_plac2;
	}

	public String getBiz_reg_no2(){
		return this.biz_reg_no2;
	}

	public String getBank_id2(){
		return this.bank_id2;
	}

	public String getAcct_num2(){
		return this.acct_num2;
	}

	public String getTran_date_seq2(){
		return this.tran_date_seq2;
	}

	public String getCurrent_clsf2(){
		return this.current_clsf2;
	}

	public String getCurc_clsf2(){
		return this.curc_clsf2;
	}

	public String getFrex_amt2(){
		return this.frex_amt2;
	}

	public String getCard_rcpm_yn2(){
		return this.card_rcpm_yn2;
	}

	public String getCard_mang_no2(){
		return this.card_mang_no2;
	}

	public String getCash_rcpt_use_yn2(){
		return this.cash_rcpt_use_yn2;
	}

	public String getCash_rcpt_acq_yn2(){
		return this.cash_rcpt_acq_yn2;
	}

	public String getDeal_cd2(){
		return this.deal_cd2;
	}

	public String getTmnl_no2(){
		return this.tmnl_no2;
	}

	public String getAprv_no2(){
		return this.aprv_no2;
	}

	public String getCard_aprv_dd2(){
		return this.card_aprv_dd2;
	}

	public String getDecid_no2(){
		return this.decid_no2;
	}

	public String getMode3(){
		return this.mode3;
	}

	public String getChecked3(){
		return this.checked3;
	}

	public String getMedi_cd3(){
		return this.medi_cd3;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getRcpm_slip_no3(){
		return this.rcpm_slip_no3;
	}

	public String getOccr_dt3(){
		return this.occr_dt3;
	}

	public String getSlip_clsf3(){
		return this.slip_clsf3;
	}

	public String getSeq3(){
		return this.seq3;
	}

	public String getSubseq3(){
		return this.subseq3;
	}

	public String getMode4(){
		return this.mode4;
	}

	public String getChecked4(){
		return this.checked4;
	}

	public String getSwit_dlco4(){
		return this.swit_dlco4;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getRcpm_slip_no4(){
		return this.rcpm_slip_no4;
	}

	public String getBudg_cd4(){
		return this.budg_cd4;
	}

	public String getOccr_dt4(){
		return this.occr_dt4;
	}

	public String getSlip_clsf4(){
		return this.slip_clsf4;
	}

	public String getSeq4(){
		return this.seq4;
	}

	public String getSubseq4(){
		return this.subseq4;
	}

	public String getMode5(){
		return this.mode5;
	}

	public String getChecked5(){
		return this.checked5;
	}

	public String getBudg_cd5(){
		return this.budg_cd5;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getRcpm_slip_no5(){
		return this.rcpm_slip_no5;
	}

	public String getOccr_dt5(){
		return this.occr_dt5;
	}

	public String getSlip_clsf5(){
		return this.slip_clsf5;
	}

	public String getSeq5(){
		return this.seq5;
	}

	public String getSubseq5(){
		return this.subseq5;
	}

	public String getMedi_cd6(){
		return this.medi_cd6;
	}

	public String getAmt6(){
		return this.amt6;
	}

	public String getDepo_job_clsf7(){
		return this.depo_job_clsf7;
	}

	public String getAmt7(){
		return this.amt7;
	}

	public String getSwit_dlco7(){
		return this.swit_dlco7;
	}

	public String getAmt8(){
		return this.amt8;
	}

	public String getBudg_cd8(){
		return this.budg_cd8;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getElec_note_key(){
		return this.elec_note_key;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1030_ADM dm = (IS_DEP_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.medi_clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.rcpm_shet_no);
		cstmt.setString(9, dm.self_cmpy_yn);
		cstmt.setString(10, dm.rcpm_acct);
		cstmt.setString(11, dm.rcpm_plac_clsf);
		cstmt.setString(12, dm.dlco_no);
		cstmt.setString(13, dm.medi_cd);
		cstmt.setString(14, dm.sale_aprv_no);
		cstmt.setString(15, dm.dept_cd);
		cstmt.setString(16, dm.sub_dept_cd);
		cstmt.setString(17, dm.mchrg_pers);
		cstmt.setString(18, dm.advt_tot_amt);
		cstmt.setString(19, dm.rcpm_tot_amt);
		cstmt.setString(20, dm.fee_amt);
		cstmt.setString(21, dm.mode0);
		cstmt.setString(22, dm.cash_amt0);
		cstmt.setString(23, dm.cash_rcpt_use_yn0);
		cstmt.setString(24, dm.cash_rcpt_acq_yn0);
		cstmt.setString(25, dm.deal_cd0);
		cstmt.setString(26, dm.tmnl_no0);
		cstmt.setString(27, dm.aprv_no0);
		cstmt.setString(28, dm.card_aprv_dd0);
		cstmt.setString(29, dm.decid_no0);
		cstmt.setString(30, dm.note_no1);
		cstmt.setString(31, dm.bank_cd1);
		cstmt.setString(32, dm.note_clsf_cd1);
		cstmt.setString(33, dm.comp_dt1);
		cstmt.setString(34, dm.mtry_dt1);
		cstmt.setString(35, dm.note_amt1);
		cstmt.setString(36, dm.sale_dscn_amt1);
		cstmt.setString(37, dm.issu_cmpy_clsf_cd1);
		cstmt.setString(38, dm.issu_pers_nm1);
		cstmt.setString(39, dm.mode2);
		cstmt.setString(40, dm.acct_mang_no2);
		cstmt.setString(41, dm.rmtt_dt2);
		cstmt.setString(42, dm.amt2);
		cstmt.setString(43, dm.rmtt_coms2);
		cstmt.setString(44, dm.rmtt_plac2);
		cstmt.setString(45, dm.biz_reg_no2);
		cstmt.setString(46, dm.bank_id2);
		cstmt.setString(47, dm.acct_num2);
		cstmt.setString(48, dm.tran_date_seq2);
		cstmt.setString(49, dm.current_clsf2);
		cstmt.setString(50, dm.curc_clsf2);
		cstmt.setString(51, dm.frex_amt2);
		cstmt.setString(52, dm.card_rcpm_yn2);
		cstmt.setString(53, dm.card_mang_no2);
		cstmt.setString(54, dm.cash_rcpt_use_yn2);
		cstmt.setString(55, dm.cash_rcpt_acq_yn2);
		cstmt.setString(56, dm.deal_cd2);
		cstmt.setString(57, dm.tmnl_no2);
		cstmt.setString(58, dm.aprv_no2);
		cstmt.setString(59, dm.card_aprv_dd2);
		cstmt.setString(60, dm.decid_no2);
		cstmt.setString(61, dm.mode3);
		cstmt.setString(62, dm.checked3);
		cstmt.setString(63, dm.medi_cd3);
		cstmt.setString(64, dm.amt3);
		cstmt.setString(65, dm.rcpm_slip_no3);
		cstmt.setString(66, dm.occr_dt3);
		cstmt.setString(67, dm.slip_clsf3);
		cstmt.setString(68, dm.seq3);
		cstmt.setString(69, dm.subseq3);
		cstmt.setString(70, dm.mode4);
		cstmt.setString(71, dm.checked4);
		cstmt.setString(72, dm.swit_dlco4);
		cstmt.setString(73, dm.amt4);
		cstmt.setString(74, dm.rcpm_slip_no4);
		cstmt.setString(75, dm.budg_cd4);
		cstmt.setString(76, dm.occr_dt4);
		cstmt.setString(77, dm.slip_clsf4);
		cstmt.setString(78, dm.seq4);
		cstmt.setString(79, dm.subseq4);
		cstmt.setString(80, dm.mode5);
		cstmt.setString(81, dm.checked5);
		cstmt.setString(82, dm.budg_cd5);
		cstmt.setString(83, dm.amt5);
		cstmt.setString(84, dm.rcpm_slip_no5);
		cstmt.setString(85, dm.occr_dt5);
		cstmt.setString(86, dm.slip_clsf5);
		cstmt.setString(87, dm.seq5);
		cstmt.setString(88, dm.subseq5);
		cstmt.setString(89, dm.medi_cd6);
		cstmt.setString(90, dm.amt6);
		cstmt.setString(91, dm.depo_job_clsf7);
		cstmt.setString(92, dm.amt7);
		cstmt.setString(93, dm.swit_dlco7);
		cstmt.setString(94, dm.amt8);
		cstmt.setString(95, dm.budg_cd8);
		cstmt.setString(96, dm.incmg_pers_ip);
		cstmt.setString(97, dm.incmg_pers);
		cstmt.setString(98, dm.elec_note_key);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("slip_clsf = [" + getSlip_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("self_cmpy_yn = [" + getSelf_cmpy_yn() + "]");
		System.out.println("rcpm_acct = [" + getRcpm_acct() + "]");
		System.out.println("rcpm_plac_clsf = [" + getRcpm_plac_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sale_aprv_no = [" + getSale_aprv_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("advt_tot_amt = [" + getAdvt_tot_amt() + "]");
		System.out.println("rcpm_tot_amt = [" + getRcpm_tot_amt() + "]");
		System.out.println("fee_amt = [" + getFee_amt() + "]");
		System.out.println("mode0 = [" + getMode0() + "]");
		System.out.println("cash_amt0 = [" + getCash_amt0() + "]");
		System.out.println("cash_rcpt_use_yn0 = [" + getCash_rcpt_use_yn0() + "]");
		System.out.println("cash_rcpt_acq_yn0 = [" + getCash_rcpt_acq_yn0() + "]");
		System.out.println("deal_cd0 = [" + getDeal_cd0() + "]");
		System.out.println("tmnl_no0 = [" + getTmnl_no0() + "]");
		System.out.println("aprv_no0 = [" + getAprv_no0() + "]");
		System.out.println("card_aprv_dd0 = [" + getCard_aprv_dd0() + "]");
		System.out.println("decid_no0 = [" + getDecid_no0() + "]");
		System.out.println("note_no1 = [" + getNote_no1() + "]");
		System.out.println("bank_cd1 = [" + getBank_cd1() + "]");
		System.out.println("note_clsf_cd1 = [" + getNote_clsf_cd1() + "]");
		System.out.println("comp_dt1 = [" + getComp_dt1() + "]");
		System.out.println("mtry_dt1 = [" + getMtry_dt1() + "]");
		System.out.println("note_amt1 = [" + getNote_amt1() + "]");
		System.out.println("sale_dscn_amt1 = [" + getSale_dscn_amt1() + "]");
		System.out.println("issu_cmpy_clsf_cd1 = [" + getIssu_cmpy_clsf_cd1() + "]");
		System.out.println("issu_pers_nm1 = [" + getIssu_pers_nm1() + "]");
		System.out.println("mode2 = [" + getMode2() + "]");
		System.out.println("acct_mang_no2 = [" + getAcct_mang_no2() + "]");
		System.out.println("rmtt_dt2 = [" + getRmtt_dt2() + "]");
		System.out.println("amt2 = [" + getAmt2() + "]");
		System.out.println("rmtt_coms2 = [" + getRmtt_coms2() + "]");
		System.out.println("rmtt_plac2 = [" + getRmtt_plac2() + "]");
		System.out.println("biz_reg_no2 = [" + getBiz_reg_no2() + "]");
		System.out.println("bank_id2 = [" + getBank_id2() + "]");
		System.out.println("acct_num2 = [" + getAcct_num2() + "]");
		System.out.println("tran_date_seq2 = [" + getTran_date_seq2() + "]");
		System.out.println("current_clsf2 = [" + getCurrent_clsf2() + "]");
		System.out.println("curc_clsf2 = [" + getCurc_clsf2() + "]");
		System.out.println("frex_amt2 = [" + getFrex_amt2() + "]");
		System.out.println("card_rcpm_yn2 = [" + getCard_rcpm_yn2() + "]");
		System.out.println("card_mang_no2 = [" + getCard_mang_no2() + "]");
		System.out.println("cash_rcpt_use_yn2 = [" + getCash_rcpt_use_yn2() + "]");
		System.out.println("cash_rcpt_acq_yn2 = [" + getCash_rcpt_acq_yn2() + "]");
		System.out.println("deal_cd2 = [" + getDeal_cd2() + "]");
		System.out.println("tmnl_no2 = [" + getTmnl_no2() + "]");
		System.out.println("aprv_no2 = [" + getAprv_no2() + "]");
		System.out.println("card_aprv_dd2 = [" + getCard_aprv_dd2() + "]");
		System.out.println("decid_no2 = [" + getDecid_no2() + "]");
		System.out.println("mode3 = [" + getMode3() + "]");
		System.out.println("checked3 = [" + getChecked3() + "]");
		System.out.println("medi_cd3 = [" + getMedi_cd3() + "]");
		System.out.println("amt3 = [" + getAmt3() + "]");
		System.out.println("rcpm_slip_no3 = [" + getRcpm_slip_no3() + "]");
		System.out.println("occr_dt3 = [" + getOccr_dt3() + "]");
		System.out.println("slip_clsf3 = [" + getSlip_clsf3() + "]");
		System.out.println("seq3 = [" + getSeq3() + "]");
		System.out.println("subseq3 = [" + getSubseq3() + "]");
		System.out.println("mode4 = [" + getMode4() + "]");
		System.out.println("checked4 = [" + getChecked4() + "]");
		System.out.println("swit_dlco4 = [" + getSwit_dlco4() + "]");
		System.out.println("amt4 = [" + getAmt4() + "]");
		System.out.println("rcpm_slip_no4 = [" + getRcpm_slip_no4() + "]");
		System.out.println("budg_cd4 = [" + getBudg_cd4() + "]");
		System.out.println("occr_dt4 = [" + getOccr_dt4() + "]");
		System.out.println("slip_clsf4 = [" + getSlip_clsf4() + "]");
		System.out.println("seq4 = [" + getSeq4() + "]");
		System.out.println("subseq4 = [" + getSubseq4() + "]");
		System.out.println("mode5 = [" + getMode5() + "]");
		System.out.println("checked5 = [" + getChecked5() + "]");
		System.out.println("budg_cd5 = [" + getBudg_cd5() + "]");
		System.out.println("amt5 = [" + getAmt5() + "]");
		System.out.println("rcpm_slip_no5 = [" + getRcpm_slip_no5() + "]");
		System.out.println("occr_dt5 = [" + getOccr_dt5() + "]");
		System.out.println("slip_clsf5 = [" + getSlip_clsf5() + "]");
		System.out.println("seq5 = [" + getSeq5() + "]");
		System.out.println("subseq5 = [" + getSubseq5() + "]");
		System.out.println("medi_cd6 = [" + getMedi_cd6() + "]");
		System.out.println("amt6 = [" + getAmt6() + "]");
		System.out.println("depo_job_clsf7 = [" + getDepo_job_clsf7() + "]");
		System.out.println("amt7 = [" + getAmt7() + "]");
		System.out.println("swit_dlco7 = [" + getSwit_dlco7() + "]");
		System.out.println("amt8 = [" + getAmt8() + "]");
		System.out.println("budg_cd8 = [" + getBudg_cd8() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("elec_note_key = [" + getElec_note_key() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String self_cmpy_yn = req.getParameter("self_cmpy_yn");
if( self_cmpy_yn == null){
	System.out.println(this.toString+" : self_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : self_cmpy_yn is "+self_cmpy_yn );
}
String rcpm_acct = req.getParameter("rcpm_acct");
if( rcpm_acct == null){
	System.out.println(this.toString+" : rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct is "+rcpm_acct );
}
String rcpm_plac_clsf = req.getParameter("rcpm_plac_clsf");
if( rcpm_plac_clsf == null){
	System.out.println(this.toString+" : rcpm_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_plac_clsf is "+rcpm_plac_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sale_aprv_no = req.getParameter("sale_aprv_no");
if( sale_aprv_no == null){
	System.out.println(this.toString+" : sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : sale_aprv_no is "+sale_aprv_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String advt_tot_amt = req.getParameter("advt_tot_amt");
if( advt_tot_amt == null){
	System.out.println(this.toString+" : advt_tot_amt is null" );
}else{
	System.out.println(this.toString+" : advt_tot_amt is "+advt_tot_amt );
}
String rcpm_tot_amt = req.getParameter("rcpm_tot_amt");
if( rcpm_tot_amt == null){
	System.out.println(this.toString+" : rcpm_tot_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_tot_amt is "+rcpm_tot_amt );
}
String fee_amt = req.getParameter("fee_amt");
if( fee_amt == null){
	System.out.println(this.toString+" : fee_amt is null" );
}else{
	System.out.println(this.toString+" : fee_amt is "+fee_amt );
}
String mode0 = req.getParameter("mode0");
if( mode0 == null){
	System.out.println(this.toString+" : mode0 is null" );
}else{
	System.out.println(this.toString+" : mode0 is "+mode0 );
}
String cash_amt0 = req.getParameter("cash_amt0");
if( cash_amt0 == null){
	System.out.println(this.toString+" : cash_amt0 is null" );
}else{
	System.out.println(this.toString+" : cash_amt0 is "+cash_amt0 );
}
String cash_rcpt_use_yn0 = req.getParameter("cash_rcpt_use_yn0");
if( cash_rcpt_use_yn0 == null){
	System.out.println(this.toString+" : cash_rcpt_use_yn0 is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_use_yn0 is "+cash_rcpt_use_yn0 );
}
String cash_rcpt_acq_yn0 = req.getParameter("cash_rcpt_acq_yn0");
if( cash_rcpt_acq_yn0 == null){
	System.out.println(this.toString+" : cash_rcpt_acq_yn0 is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_acq_yn0 is "+cash_rcpt_acq_yn0 );
}
String deal_cd0 = req.getParameter("deal_cd0");
if( deal_cd0 == null){
	System.out.println(this.toString+" : deal_cd0 is null" );
}else{
	System.out.println(this.toString+" : deal_cd0 is "+deal_cd0 );
}
String tmnl_no0 = req.getParameter("tmnl_no0");
if( tmnl_no0 == null){
	System.out.println(this.toString+" : tmnl_no0 is null" );
}else{
	System.out.println(this.toString+" : tmnl_no0 is "+tmnl_no0 );
}
String aprv_no0 = req.getParameter("aprv_no0");
if( aprv_no0 == null){
	System.out.println(this.toString+" : aprv_no0 is null" );
}else{
	System.out.println(this.toString+" : aprv_no0 is "+aprv_no0 );
}
String card_aprv_dd0 = req.getParameter("card_aprv_dd0");
if( card_aprv_dd0 == null){
	System.out.println(this.toString+" : card_aprv_dd0 is null" );
}else{
	System.out.println(this.toString+" : card_aprv_dd0 is "+card_aprv_dd0 );
}
String decid_no0 = req.getParameter("decid_no0");
if( decid_no0 == null){
	System.out.println(this.toString+" : decid_no0 is null" );
}else{
	System.out.println(this.toString+" : decid_no0 is "+decid_no0 );
}
String note_no1 = req.getParameter("note_no1");
if( note_no1 == null){
	System.out.println(this.toString+" : note_no1 is null" );
}else{
	System.out.println(this.toString+" : note_no1 is "+note_no1 );
}
String bank_cd1 = req.getParameter("bank_cd1");
if( bank_cd1 == null){
	System.out.println(this.toString+" : bank_cd1 is null" );
}else{
	System.out.println(this.toString+" : bank_cd1 is "+bank_cd1 );
}
String note_clsf_cd1 = req.getParameter("note_clsf_cd1");
if( note_clsf_cd1 == null){
	System.out.println(this.toString+" : note_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd1 is "+note_clsf_cd1 );
}
String comp_dt1 = req.getParameter("comp_dt1");
if( comp_dt1 == null){
	System.out.println(this.toString+" : comp_dt1 is null" );
}else{
	System.out.println(this.toString+" : comp_dt1 is "+comp_dt1 );
}
String mtry_dt1 = req.getParameter("mtry_dt1");
if( mtry_dt1 == null){
	System.out.println(this.toString+" : mtry_dt1 is null" );
}else{
	System.out.println(this.toString+" : mtry_dt1 is "+mtry_dt1 );
}
String note_amt1 = req.getParameter("note_amt1");
if( note_amt1 == null){
	System.out.println(this.toString+" : note_amt1 is null" );
}else{
	System.out.println(this.toString+" : note_amt1 is "+note_amt1 );
}
String sale_dscn_amt1 = req.getParameter("sale_dscn_amt1");
if( sale_dscn_amt1 == null){
	System.out.println(this.toString+" : sale_dscn_amt1 is null" );
}else{
	System.out.println(this.toString+" : sale_dscn_amt1 is "+sale_dscn_amt1 );
}
String issu_cmpy_clsf_cd1 = req.getParameter("issu_cmpy_clsf_cd1");
if( issu_cmpy_clsf_cd1 == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd1 is "+issu_cmpy_clsf_cd1 );
}
String issu_pers_nm1 = req.getParameter("issu_pers_nm1");
if( issu_pers_nm1 == null){
	System.out.println(this.toString+" : issu_pers_nm1 is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm1 is "+issu_pers_nm1 );
}
String mode2 = req.getParameter("mode2");
if( mode2 == null){
	System.out.println(this.toString+" : mode2 is null" );
}else{
	System.out.println(this.toString+" : mode2 is "+mode2 );
}
String acct_mang_no2 = req.getParameter("acct_mang_no2");
if( acct_mang_no2 == null){
	System.out.println(this.toString+" : acct_mang_no2 is null" );
}else{
	System.out.println(this.toString+" : acct_mang_no2 is "+acct_mang_no2 );
}
String rmtt_dt2 = req.getParameter("rmtt_dt2");
if( rmtt_dt2 == null){
	System.out.println(this.toString+" : rmtt_dt2 is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt2 is "+rmtt_dt2 );
}
String amt2 = req.getParameter("amt2");
if( amt2 == null){
	System.out.println(this.toString+" : amt2 is null" );
}else{
	System.out.println(this.toString+" : amt2 is "+amt2 );
}
String rmtt_coms2 = req.getParameter("rmtt_coms2");
if( rmtt_coms2 == null){
	System.out.println(this.toString+" : rmtt_coms2 is null" );
}else{
	System.out.println(this.toString+" : rmtt_coms2 is "+rmtt_coms2 );
}
String rmtt_plac2 = req.getParameter("rmtt_plac2");
if( rmtt_plac2 == null){
	System.out.println(this.toString+" : rmtt_plac2 is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac2 is "+rmtt_plac2 );
}
String biz_reg_no2 = req.getParameter("biz_reg_no2");
if( biz_reg_no2 == null){
	System.out.println(this.toString+" : biz_reg_no2 is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no2 is "+biz_reg_no2 );
}
String bank_id2 = req.getParameter("bank_id2");
if( bank_id2 == null){
	System.out.println(this.toString+" : bank_id2 is null" );
}else{
	System.out.println(this.toString+" : bank_id2 is "+bank_id2 );
}
String acct_num2 = req.getParameter("acct_num2");
if( acct_num2 == null){
	System.out.println(this.toString+" : acct_num2 is null" );
}else{
	System.out.println(this.toString+" : acct_num2 is "+acct_num2 );
}
String tran_date_seq2 = req.getParameter("tran_date_seq2");
if( tran_date_seq2 == null){
	System.out.println(this.toString+" : tran_date_seq2 is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq2 is "+tran_date_seq2 );
}
String current_clsf2 = req.getParameter("current_clsf2");
if( current_clsf2 == null){
	System.out.println(this.toString+" : current_clsf2 is null" );
}else{
	System.out.println(this.toString+" : current_clsf2 is "+current_clsf2 );
}
String curc_clsf2 = req.getParameter("curc_clsf2");
if( curc_clsf2 == null){
	System.out.println(this.toString+" : curc_clsf2 is null" );
}else{
	System.out.println(this.toString+" : curc_clsf2 is "+curc_clsf2 );
}
String frex_amt2 = req.getParameter("frex_amt2");
if( frex_amt2 == null){
	System.out.println(this.toString+" : frex_amt2 is null" );
}else{
	System.out.println(this.toString+" : frex_amt2 is "+frex_amt2 );
}
String card_rcpm_yn2 = req.getParameter("card_rcpm_yn2");
if( card_rcpm_yn2 == null){
	System.out.println(this.toString+" : card_rcpm_yn2 is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_yn2 is "+card_rcpm_yn2 );
}
String card_mang_no2 = req.getParameter("card_mang_no2");
if( card_mang_no2 == null){
	System.out.println(this.toString+" : card_mang_no2 is null" );
}else{
	System.out.println(this.toString+" : card_mang_no2 is "+card_mang_no2 );
}
String cash_rcpt_use_yn2 = req.getParameter("cash_rcpt_use_yn2");
if( cash_rcpt_use_yn2 == null){
	System.out.println(this.toString+" : cash_rcpt_use_yn2 is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_use_yn2 is "+cash_rcpt_use_yn2 );
}
String cash_rcpt_acq_yn2 = req.getParameter("cash_rcpt_acq_yn2");
if( cash_rcpt_acq_yn2 == null){
	System.out.println(this.toString+" : cash_rcpt_acq_yn2 is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_acq_yn2 is "+cash_rcpt_acq_yn2 );
}
String deal_cd2 = req.getParameter("deal_cd2");
if( deal_cd2 == null){
	System.out.println(this.toString+" : deal_cd2 is null" );
}else{
	System.out.println(this.toString+" : deal_cd2 is "+deal_cd2 );
}
String tmnl_no2 = req.getParameter("tmnl_no2");
if( tmnl_no2 == null){
	System.out.println(this.toString+" : tmnl_no2 is null" );
}else{
	System.out.println(this.toString+" : tmnl_no2 is "+tmnl_no2 );
}
String aprv_no2 = req.getParameter("aprv_no2");
if( aprv_no2 == null){
	System.out.println(this.toString+" : aprv_no2 is null" );
}else{
	System.out.println(this.toString+" : aprv_no2 is "+aprv_no2 );
}
String card_aprv_dd2 = req.getParameter("card_aprv_dd2");
if( card_aprv_dd2 == null){
	System.out.println(this.toString+" : card_aprv_dd2 is null" );
}else{
	System.out.println(this.toString+" : card_aprv_dd2 is "+card_aprv_dd2 );
}
String decid_no2 = req.getParameter("decid_no2");
if( decid_no2 == null){
	System.out.println(this.toString+" : decid_no2 is null" );
}else{
	System.out.println(this.toString+" : decid_no2 is "+decid_no2 );
}
String mode3 = req.getParameter("mode3");
if( mode3 == null){
	System.out.println(this.toString+" : mode3 is null" );
}else{
	System.out.println(this.toString+" : mode3 is "+mode3 );
}
String checked3 = req.getParameter("checked3");
if( checked3 == null){
	System.out.println(this.toString+" : checked3 is null" );
}else{
	System.out.println(this.toString+" : checked3 is "+checked3 );
}
String medi_cd3 = req.getParameter("medi_cd3");
if( medi_cd3 == null){
	System.out.println(this.toString+" : medi_cd3 is null" );
}else{
	System.out.println(this.toString+" : medi_cd3 is "+medi_cd3 );
}
String amt3 = req.getParameter("amt3");
if( amt3 == null){
	System.out.println(this.toString+" : amt3 is null" );
}else{
	System.out.println(this.toString+" : amt3 is "+amt3 );
}
String rcpm_slip_no3 = req.getParameter("rcpm_slip_no3");
if( rcpm_slip_no3 == null){
	System.out.println(this.toString+" : rcpm_slip_no3 is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no3 is "+rcpm_slip_no3 );
}
String occr_dt3 = req.getParameter("occr_dt3");
if( occr_dt3 == null){
	System.out.println(this.toString+" : occr_dt3 is null" );
}else{
	System.out.println(this.toString+" : occr_dt3 is "+occr_dt3 );
}
String slip_clsf3 = req.getParameter("slip_clsf3");
if( slip_clsf3 == null){
	System.out.println(this.toString+" : slip_clsf3 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf3 is "+slip_clsf3 );
}
String seq3 = req.getParameter("seq3");
if( seq3 == null){
	System.out.println(this.toString+" : seq3 is null" );
}else{
	System.out.println(this.toString+" : seq3 is "+seq3 );
}
String subseq3 = req.getParameter("subseq3");
if( subseq3 == null){
	System.out.println(this.toString+" : subseq3 is null" );
}else{
	System.out.println(this.toString+" : subseq3 is "+subseq3 );
}
String mode4 = req.getParameter("mode4");
if( mode4 == null){
	System.out.println(this.toString+" : mode4 is null" );
}else{
	System.out.println(this.toString+" : mode4 is "+mode4 );
}
String checked4 = req.getParameter("checked4");
if( checked4 == null){
	System.out.println(this.toString+" : checked4 is null" );
}else{
	System.out.println(this.toString+" : checked4 is "+checked4 );
}
String swit_dlco4 = req.getParameter("swit_dlco4");
if( swit_dlco4 == null){
	System.out.println(this.toString+" : swit_dlco4 is null" );
}else{
	System.out.println(this.toString+" : swit_dlco4 is "+swit_dlco4 );
}
String amt4 = req.getParameter("amt4");
if( amt4 == null){
	System.out.println(this.toString+" : amt4 is null" );
}else{
	System.out.println(this.toString+" : amt4 is "+amt4 );
}
String rcpm_slip_no4 = req.getParameter("rcpm_slip_no4");
if( rcpm_slip_no4 == null){
	System.out.println(this.toString+" : rcpm_slip_no4 is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no4 is "+rcpm_slip_no4 );
}
String budg_cd4 = req.getParameter("budg_cd4");
if( budg_cd4 == null){
	System.out.println(this.toString+" : budg_cd4 is null" );
}else{
	System.out.println(this.toString+" : budg_cd4 is "+budg_cd4 );
}
String occr_dt4 = req.getParameter("occr_dt4");
if( occr_dt4 == null){
	System.out.println(this.toString+" : occr_dt4 is null" );
}else{
	System.out.println(this.toString+" : occr_dt4 is "+occr_dt4 );
}
String slip_clsf4 = req.getParameter("slip_clsf4");
if( slip_clsf4 == null){
	System.out.println(this.toString+" : slip_clsf4 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf4 is "+slip_clsf4 );
}
String seq4 = req.getParameter("seq4");
if( seq4 == null){
	System.out.println(this.toString+" : seq4 is null" );
}else{
	System.out.println(this.toString+" : seq4 is "+seq4 );
}
String subseq4 = req.getParameter("subseq4");
if( subseq4 == null){
	System.out.println(this.toString+" : subseq4 is null" );
}else{
	System.out.println(this.toString+" : subseq4 is "+subseq4 );
}
String mode5 = req.getParameter("mode5");
if( mode5 == null){
	System.out.println(this.toString+" : mode5 is null" );
}else{
	System.out.println(this.toString+" : mode5 is "+mode5 );
}
String checked5 = req.getParameter("checked5");
if( checked5 == null){
	System.out.println(this.toString+" : checked5 is null" );
}else{
	System.out.println(this.toString+" : checked5 is "+checked5 );
}
String budg_cd5 = req.getParameter("budg_cd5");
if( budg_cd5 == null){
	System.out.println(this.toString+" : budg_cd5 is null" );
}else{
	System.out.println(this.toString+" : budg_cd5 is "+budg_cd5 );
}
String amt5 = req.getParameter("amt5");
if( amt5 == null){
	System.out.println(this.toString+" : amt5 is null" );
}else{
	System.out.println(this.toString+" : amt5 is "+amt5 );
}
String rcpm_slip_no5 = req.getParameter("rcpm_slip_no5");
if( rcpm_slip_no5 == null){
	System.out.println(this.toString+" : rcpm_slip_no5 is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no5 is "+rcpm_slip_no5 );
}
String occr_dt5 = req.getParameter("occr_dt5");
if( occr_dt5 == null){
	System.out.println(this.toString+" : occr_dt5 is null" );
}else{
	System.out.println(this.toString+" : occr_dt5 is "+occr_dt5 );
}
String slip_clsf5 = req.getParameter("slip_clsf5");
if( slip_clsf5 == null){
	System.out.println(this.toString+" : slip_clsf5 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf5 is "+slip_clsf5 );
}
String seq5 = req.getParameter("seq5");
if( seq5 == null){
	System.out.println(this.toString+" : seq5 is null" );
}else{
	System.out.println(this.toString+" : seq5 is "+seq5 );
}
String subseq5 = req.getParameter("subseq5");
if( subseq5 == null){
	System.out.println(this.toString+" : subseq5 is null" );
}else{
	System.out.println(this.toString+" : subseq5 is "+subseq5 );
}
String medi_cd6 = req.getParameter("medi_cd6");
if( medi_cd6 == null){
	System.out.println(this.toString+" : medi_cd6 is null" );
}else{
	System.out.println(this.toString+" : medi_cd6 is "+medi_cd6 );
}
String amt6 = req.getParameter("amt6");
if( amt6 == null){
	System.out.println(this.toString+" : amt6 is null" );
}else{
	System.out.println(this.toString+" : amt6 is "+amt6 );
}
String depo_job_clsf7 = req.getParameter("depo_job_clsf7");
if( depo_job_clsf7 == null){
	System.out.println(this.toString+" : depo_job_clsf7 is null" );
}else{
	System.out.println(this.toString+" : depo_job_clsf7 is "+depo_job_clsf7 );
}
String amt7 = req.getParameter("amt7");
if( amt7 == null){
	System.out.println(this.toString+" : amt7 is null" );
}else{
	System.out.println(this.toString+" : amt7 is "+amt7 );
}
String swit_dlco7 = req.getParameter("swit_dlco7");
if( swit_dlco7 == null){
	System.out.println(this.toString+" : swit_dlco7 is null" );
}else{
	System.out.println(this.toString+" : swit_dlco7 is "+swit_dlco7 );
}
String amt8 = req.getParameter("amt8");
if( amt8 == null){
	System.out.println(this.toString+" : amt8 is null" );
}else{
	System.out.println(this.toString+" : amt8 is "+amt8 );
}
String budg_cd8 = req.getParameter("budg_cd8");
if( budg_cd8 == null){
	System.out.println(this.toString+" : budg_cd8 is null" );
}else{
	System.out.println(this.toString+" : budg_cd8 is "+budg_cd8 );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String elec_note_key = req.getParameter("elec_note_key");
if( elec_note_key == null){
	System.out.println(this.toString+" : elec_note_key is null" );
}else{
	System.out.println(this.toString+" : elec_note_key is "+elec_note_key );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String self_cmpy_yn = Util.checkString(req.getParameter("self_cmpy_yn"));
String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String advt_tot_amt = Util.checkString(req.getParameter("advt_tot_amt"));
String rcpm_tot_amt = Util.checkString(req.getParameter("rcpm_tot_amt"));
String fee_amt = Util.checkString(req.getParameter("fee_amt"));
String mode0 = Util.checkString(req.getParameter("mode0"));
String cash_amt0 = Util.checkString(req.getParameter("cash_amt0"));
String cash_rcpt_use_yn0 = Util.checkString(req.getParameter("cash_rcpt_use_yn0"));
String cash_rcpt_acq_yn0 = Util.checkString(req.getParameter("cash_rcpt_acq_yn0"));
String deal_cd0 = Util.checkString(req.getParameter("deal_cd0"));
String tmnl_no0 = Util.checkString(req.getParameter("tmnl_no0"));
String aprv_no0 = Util.checkString(req.getParameter("aprv_no0"));
String card_aprv_dd0 = Util.checkString(req.getParameter("card_aprv_dd0"));
String decid_no0 = Util.checkString(req.getParameter("decid_no0"));
String note_no1 = Util.checkString(req.getParameter("note_no1"));
String bank_cd1 = Util.checkString(req.getParameter("bank_cd1"));
String note_clsf_cd1 = Util.checkString(req.getParameter("note_clsf_cd1"));
String comp_dt1 = Util.checkString(req.getParameter("comp_dt1"));
String mtry_dt1 = Util.checkString(req.getParameter("mtry_dt1"));
String note_amt1 = Util.checkString(req.getParameter("note_amt1"));
String sale_dscn_amt1 = Util.checkString(req.getParameter("sale_dscn_amt1"));
String issu_cmpy_clsf_cd1 = Util.checkString(req.getParameter("issu_cmpy_clsf_cd1"));
String issu_pers_nm1 = Util.checkString(req.getParameter("issu_pers_nm1"));
String mode2 = Util.checkString(req.getParameter("mode2"));
String acct_mang_no2 = Util.checkString(req.getParameter("acct_mang_no2"));
String rmtt_dt2 = Util.checkString(req.getParameter("rmtt_dt2"));
String amt2 = Util.checkString(req.getParameter("amt2"));
String rmtt_coms2 = Util.checkString(req.getParameter("rmtt_coms2"));
String rmtt_plac2 = Util.checkString(req.getParameter("rmtt_plac2"));
String biz_reg_no2 = Util.checkString(req.getParameter("biz_reg_no2"));
String bank_id2 = Util.checkString(req.getParameter("bank_id2"));
String acct_num2 = Util.checkString(req.getParameter("acct_num2"));
String tran_date_seq2 = Util.checkString(req.getParameter("tran_date_seq2"));
String current_clsf2 = Util.checkString(req.getParameter("current_clsf2"));
String curc_clsf2 = Util.checkString(req.getParameter("curc_clsf2"));
String frex_amt2 = Util.checkString(req.getParameter("frex_amt2"));
String card_rcpm_yn2 = Util.checkString(req.getParameter("card_rcpm_yn2"));
String card_mang_no2 = Util.checkString(req.getParameter("card_mang_no2"));
String cash_rcpt_use_yn2 = Util.checkString(req.getParameter("cash_rcpt_use_yn2"));
String cash_rcpt_acq_yn2 = Util.checkString(req.getParameter("cash_rcpt_acq_yn2"));
String deal_cd2 = Util.checkString(req.getParameter("deal_cd2"));
String tmnl_no2 = Util.checkString(req.getParameter("tmnl_no2"));
String aprv_no2 = Util.checkString(req.getParameter("aprv_no2"));
String card_aprv_dd2 = Util.checkString(req.getParameter("card_aprv_dd2"));
String decid_no2 = Util.checkString(req.getParameter("decid_no2"));
String mode3 = Util.checkString(req.getParameter("mode3"));
String checked3 = Util.checkString(req.getParameter("checked3"));
String medi_cd3 = Util.checkString(req.getParameter("medi_cd3"));
String amt3 = Util.checkString(req.getParameter("amt3"));
String rcpm_slip_no3 = Util.checkString(req.getParameter("rcpm_slip_no3"));
String occr_dt3 = Util.checkString(req.getParameter("occr_dt3"));
String slip_clsf3 = Util.checkString(req.getParameter("slip_clsf3"));
String seq3 = Util.checkString(req.getParameter("seq3"));
String subseq3 = Util.checkString(req.getParameter("subseq3"));
String mode4 = Util.checkString(req.getParameter("mode4"));
String checked4 = Util.checkString(req.getParameter("checked4"));
String swit_dlco4 = Util.checkString(req.getParameter("swit_dlco4"));
String amt4 = Util.checkString(req.getParameter("amt4"));
String rcpm_slip_no4 = Util.checkString(req.getParameter("rcpm_slip_no4"));
String budg_cd4 = Util.checkString(req.getParameter("budg_cd4"));
String occr_dt4 = Util.checkString(req.getParameter("occr_dt4"));
String slip_clsf4 = Util.checkString(req.getParameter("slip_clsf4"));
String seq4 = Util.checkString(req.getParameter("seq4"));
String subseq4 = Util.checkString(req.getParameter("subseq4"));
String mode5 = Util.checkString(req.getParameter("mode5"));
String checked5 = Util.checkString(req.getParameter("checked5"));
String budg_cd5 = Util.checkString(req.getParameter("budg_cd5"));
String amt5 = Util.checkString(req.getParameter("amt5"));
String rcpm_slip_no5 = Util.checkString(req.getParameter("rcpm_slip_no5"));
String occr_dt5 = Util.checkString(req.getParameter("occr_dt5"));
String slip_clsf5 = Util.checkString(req.getParameter("slip_clsf5"));
String seq5 = Util.checkString(req.getParameter("seq5"));
String subseq5 = Util.checkString(req.getParameter("subseq5"));
String medi_cd6 = Util.checkString(req.getParameter("medi_cd6"));
String amt6 = Util.checkString(req.getParameter("amt6"));
String depo_job_clsf7 = Util.checkString(req.getParameter("depo_job_clsf7"));
String amt7 = Util.checkString(req.getParameter("amt7"));
String swit_dlco7 = Util.checkString(req.getParameter("swit_dlco7"));
String amt8 = Util.checkString(req.getParameter("amt8"));
String budg_cd8 = Util.checkString(req.getParameter("budg_cd8"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String elec_note_key = Util.checkString(req.getParameter("elec_note_key"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String self_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("self_cmpy_yn")));
String rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct")));
String rcpm_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plac_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_aprv_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String advt_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_tot_amt")));
String rcpm_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_tot_amt")));
String fee_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_amt")));
String mode0 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode0")));
String cash_amt0 = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_amt0")));
String cash_rcpt_use_yn0 = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_use_yn0")));
String cash_rcpt_acq_yn0 = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_acq_yn0")));
String deal_cd0 = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_cd0")));
String tmnl_no0 = Util.Uni2Ksc(Util.checkString(req.getParameter("tmnl_no0")));
String aprv_no0 = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_no0")));
String card_aprv_dd0 = Util.Uni2Ksc(Util.checkString(req.getParameter("card_aprv_dd0")));
String decid_no0 = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_no0")));
String note_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no1")));
String bank_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd1")));
String note_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd1")));
String comp_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt1")));
String mtry_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt1")));
String note_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt1")));
String sale_dscn_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dscn_amt1")));
String issu_cmpy_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd1")));
String issu_pers_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm1")));
String mode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2")));
String acct_mang_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_no2")));
String rmtt_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt2")));
String amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2")));
String rmtt_coms2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_coms2")));
String rmtt_plac2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac2")));
String biz_reg_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no2")));
String bank_id2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id2")));
String acct_num2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num2")));
String tran_date_seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq2")));
String current_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("current_clsf2")));
String curc_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("curc_clsf2")));
String frex_amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_amt2")));
String card_rcpm_yn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_yn2")));
String card_mang_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("card_mang_no2")));
String cash_rcpt_use_yn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_use_yn2")));
String cash_rcpt_acq_yn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_acq_yn2")));
String deal_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_cd2")));
String tmnl_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tmnl_no2")));
String aprv_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_no2")));
String card_aprv_dd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("card_aprv_dd2")));
String decid_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_no2")));
String mode3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode3")));
String checked3 = Util.Uni2Ksc(Util.checkString(req.getParameter("checked3")));
String medi_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd3")));
String amt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt3")));
String rcpm_slip_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no3")));
String occr_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt3")));
String slip_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf3")));
String seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq3")));
String subseq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("subseq3")));
String mode4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode4")));
String checked4 = Util.Uni2Ksc(Util.checkString(req.getParameter("checked4")));
String swit_dlco4 = Util.Uni2Ksc(Util.checkString(req.getParameter("swit_dlco4")));
String amt4 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt4")));
String rcpm_slip_no4 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no4")));
String budg_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd4")));
String occr_dt4 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt4")));
String slip_clsf4 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf4")));
String seq4 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq4")));
String subseq4 = Util.Uni2Ksc(Util.checkString(req.getParameter("subseq4")));
String mode5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode5")));
String checked5 = Util.Uni2Ksc(Util.checkString(req.getParameter("checked5")));
String budg_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd5")));
String amt5 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt5")));
String rcpm_slip_no5 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no5")));
String occr_dt5 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt5")));
String slip_clsf5 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf5")));
String seq5 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq5")));
String subseq5 = Util.Uni2Ksc(Util.checkString(req.getParameter("subseq5")));
String medi_cd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd6")));
String amt6 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt6")));
String depo_job_clsf7 = Util.Uni2Ksc(Util.checkString(req.getParameter("depo_job_clsf7")));
String amt7 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt7")));
String swit_dlco7 = Util.Uni2Ksc(Util.checkString(req.getParameter("swit_dlco7")));
String amt8 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt8")));
String budg_cd8 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd8")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String elec_note_key = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_note_key")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMedi_clsf(medi_clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setSelf_cmpy_yn(self_cmpy_yn);
dm.setRcpm_acct(rcpm_acct);
dm.setRcpm_plac_clsf(rcpm_plac_clsf);
dm.setDlco_no(dlco_no);
dm.setMedi_cd(medi_cd);
dm.setSale_aprv_no(sale_aprv_no);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setAdvt_tot_amt(advt_tot_amt);
dm.setRcpm_tot_amt(rcpm_tot_amt);
dm.setFee_amt(fee_amt);
dm.setMode0(mode0);
dm.setCash_amt0(cash_amt0);
dm.setCash_rcpt_use_yn0(cash_rcpt_use_yn0);
dm.setCash_rcpt_acq_yn0(cash_rcpt_acq_yn0);
dm.setDeal_cd0(deal_cd0);
dm.setTmnl_no0(tmnl_no0);
dm.setAprv_no0(aprv_no0);
dm.setCard_aprv_dd0(card_aprv_dd0);
dm.setDecid_no0(decid_no0);
dm.setNote_no1(note_no1);
dm.setBank_cd1(bank_cd1);
dm.setNote_clsf_cd1(note_clsf_cd1);
dm.setComp_dt1(comp_dt1);
dm.setMtry_dt1(mtry_dt1);
dm.setNote_amt1(note_amt1);
dm.setSale_dscn_amt1(sale_dscn_amt1);
dm.setIssu_cmpy_clsf_cd1(issu_cmpy_clsf_cd1);
dm.setIssu_pers_nm1(issu_pers_nm1);
dm.setMode2(mode2);
dm.setAcct_mang_no2(acct_mang_no2);
dm.setRmtt_dt2(rmtt_dt2);
dm.setAmt2(amt2);
dm.setRmtt_coms2(rmtt_coms2);
dm.setRmtt_plac2(rmtt_plac2);
dm.setBiz_reg_no2(biz_reg_no2);
dm.setBank_id2(bank_id2);
dm.setAcct_num2(acct_num2);
dm.setTran_date_seq2(tran_date_seq2);
dm.setCurrent_clsf2(current_clsf2);
dm.setCurc_clsf2(curc_clsf2);
dm.setFrex_amt2(frex_amt2);
dm.setCard_rcpm_yn2(card_rcpm_yn2);
dm.setCard_mang_no2(card_mang_no2);
dm.setCash_rcpt_use_yn2(cash_rcpt_use_yn2);
dm.setCash_rcpt_acq_yn2(cash_rcpt_acq_yn2);
dm.setDeal_cd2(deal_cd2);
dm.setTmnl_no2(tmnl_no2);
dm.setAprv_no2(aprv_no2);
dm.setCard_aprv_dd2(card_aprv_dd2);
dm.setDecid_no2(decid_no2);
dm.setMode3(mode3);
dm.setChecked3(checked3);
dm.setMedi_cd3(medi_cd3);
dm.setAmt3(amt3);
dm.setRcpm_slip_no3(rcpm_slip_no3);
dm.setOccr_dt3(occr_dt3);
dm.setSlip_clsf3(slip_clsf3);
dm.setSeq3(seq3);
dm.setSubseq3(subseq3);
dm.setMode4(mode4);
dm.setChecked4(checked4);
dm.setSwit_dlco4(swit_dlco4);
dm.setAmt4(amt4);
dm.setRcpm_slip_no4(rcpm_slip_no4);
dm.setBudg_cd4(budg_cd4);
dm.setOccr_dt4(occr_dt4);
dm.setSlip_clsf4(slip_clsf4);
dm.setSeq4(seq4);
dm.setSubseq4(subseq4);
dm.setMode5(mode5);
dm.setChecked5(checked5);
dm.setBudg_cd5(budg_cd5);
dm.setAmt5(amt5);
dm.setRcpm_slip_no5(rcpm_slip_no5);
dm.setOccr_dt5(occr_dt5);
dm.setSlip_clsf5(slip_clsf5);
dm.setSeq5(seq5);
dm.setSubseq5(subseq5);
dm.setMedi_cd6(medi_cd6);
dm.setAmt6(amt6);
dm.setDepo_job_clsf7(depo_job_clsf7);
dm.setAmt7(amt7);
dm.setSwit_dlco7(swit_dlco7);
dm.setAmt8(amt8);
dm.setBudg_cd8(budg_cd8);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setElec_note_key(elec_note_key);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 27 10:07:05 KST 2012 */