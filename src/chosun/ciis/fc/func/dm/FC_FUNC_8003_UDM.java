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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8003_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String pers;
	public String pers_ipadd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String leas_hire_clsf_cd;
	public String leas_nm;
	public String cntr_no;
	public String frcr_amt;
	public String won_amt;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String use_dept_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String re_leas_yn;
	public String frex_cd;
	public String exrate;
	public String rmks;
	public String pymt_cycl;
	public String pay_plan_tms;
	public String libo_yn;
	public String usag;
	public String loca;
	public String fst_leas_clsf_cd;
	public String fst_leas_no;
	public String int_calc_cd;
	public String good_curc;
	public String good_amt;
	public String end_aftr;
	public String leas_stat_cd;
	public String end_dt;
	public String prelae_pay_clsf_cd;
	public String basi_int;
	public String leas_int_rate;
	public String prd_int_rate;
	public String tms_leas_amt;
	public String tot_leas_fee;
	public String decid_amt;
	public String prd_int;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_note_no;
	public String grid1_amt;
	public String grid1_expt_widr_dt;
	public String grid2_mode;
	public String grid2_rownum;
	public String grid2_loss_dt;
	public String grid2_expt_loss_amt;
	public String grid2_fix_loss_amt;

	public FC_FUNC_8003_UDM(){}
	public FC_FUNC_8003_UDM(String cmpy_cd, String uid, String pers, String pers_ipadd, String cntr_clsf_cd, String leas_clsf_cd, String leas_no, String leas_sub_seq, String leas_hire_clsf_cd, String leas_nm, String cntr_no, String frcr_amt, String won_amt, String libo_int_rate, String dedu_int_rate, String comp_dt, String mtry_dt, String dlco_clsf_cd, String dlco_cd, String use_dept_cd, String medi_cd, String dtls_medi_cd, String re_leas_yn, String frex_cd, String exrate, String rmks, String pymt_cycl, String pay_plan_tms, String libo_yn, String usag, String loca, String fst_leas_clsf_cd, String fst_leas_no, String int_calc_cd, String good_curc, String good_amt, String end_aftr, String leas_stat_cd, String end_dt, String prelae_pay_clsf_cd, String basi_int, String leas_int_rate, String prd_int_rate, String tms_leas_amt, String tot_leas_fee, String decid_amt, String prd_int, String grid1_mode, String grid1_rownum, String grid1_note_no, String grid1_amt, String grid1_expt_widr_dt, String grid2_mode, String grid2_rownum, String grid2_loss_dt, String grid2_expt_loss_amt, String grid2_fix_loss_amt){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.pers = pers;
		this.pers_ipadd = pers_ipadd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.leas_sub_seq = leas_sub_seq;
		this.leas_hire_clsf_cd = leas_hire_clsf_cd;
		this.leas_nm = leas_nm;
		this.cntr_no = cntr_no;
		this.frcr_amt = frcr_amt;
		this.won_amt = won_amt;
		this.libo_int_rate = libo_int_rate;
		this.dedu_int_rate = dedu_int_rate;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.use_dept_cd = use_dept_cd;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.re_leas_yn = re_leas_yn;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.rmks = rmks;
		this.pymt_cycl = pymt_cycl;
		this.pay_plan_tms = pay_plan_tms;
		this.libo_yn = libo_yn;
		this.usag = usag;
		this.loca = loca;
		this.fst_leas_clsf_cd = fst_leas_clsf_cd;
		this.fst_leas_no = fst_leas_no;
		this.int_calc_cd = int_calc_cd;
		this.good_curc = good_curc;
		this.good_amt = good_amt;
		this.end_aftr = end_aftr;
		this.leas_stat_cd = leas_stat_cd;
		this.end_dt = end_dt;
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
		this.basi_int = basi_int;
		this.leas_int_rate = leas_int_rate;
		this.prd_int_rate = prd_int_rate;
		this.tms_leas_amt = tms_leas_amt;
		this.tot_leas_fee = tot_leas_fee;
		this.decid_amt = decid_amt;
		this.prd_int = prd_int;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_note_no = grid1_note_no;
		this.grid1_amt = grid1_amt;
		this.grid1_expt_widr_dt = grid1_expt_widr_dt;
		this.grid2_mode = grid2_mode;
		this.grid2_rownum = grid2_rownum;
		this.grid2_loss_dt = grid2_loss_dt;
		this.grid2_expt_loss_amt = grid2_expt_loss_amt;
		this.grid2_fix_loss_amt = grid2_fix_loss_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setPers(String pers){
		this.pers = pers;
	}

	public void setPers_ipadd(String pers_ipadd){
		this.pers_ipadd = pers_ipadd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_sub_seq(String leas_sub_seq){
		this.leas_sub_seq = leas_sub_seq;
	}

	public void setLeas_hire_clsf_cd(String leas_hire_clsf_cd){
		this.leas_hire_clsf_cd = leas_hire_clsf_cd;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setRe_leas_yn(String re_leas_yn){
		this.re_leas_yn = re_leas_yn;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPymt_cycl(String pymt_cycl){
		this.pymt_cycl = pymt_cycl;
	}

	public void setPay_plan_tms(String pay_plan_tms){
		this.pay_plan_tms = pay_plan_tms;
	}

	public void setLibo_yn(String libo_yn){
		this.libo_yn = libo_yn;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setFst_leas_clsf_cd(String fst_leas_clsf_cd){
		this.fst_leas_clsf_cd = fst_leas_clsf_cd;
	}

	public void setFst_leas_no(String fst_leas_no){
		this.fst_leas_no = fst_leas_no;
	}

	public void setInt_calc_cd(String int_calc_cd){
		this.int_calc_cd = int_calc_cd;
	}

	public void setGood_curc(String good_curc){
		this.good_curc = good_curc;
	}

	public void setGood_amt(String good_amt){
		this.good_amt = good_amt;
	}

	public void setEnd_aftr(String end_aftr){
		this.end_aftr = end_aftr;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setBasi_int(String basi_int){
		this.basi_int = basi_int;
	}

	public void setLeas_int_rate(String leas_int_rate){
		this.leas_int_rate = leas_int_rate;
	}

	public void setPrd_int_rate(String prd_int_rate){
		this.prd_int_rate = prd_int_rate;
	}

	public void setTms_leas_amt(String tms_leas_amt){
		this.tms_leas_amt = tms_leas_amt;
	}

	public void setTot_leas_fee(String tot_leas_fee){
		this.tot_leas_fee = tot_leas_fee;
	}

	public void setDecid_amt(String decid_amt){
		this.decid_amt = decid_amt;
	}

	public void setPrd_int(String prd_int){
		this.prd_int = prd_int;
	}

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_note_no(String grid1_note_no){
		this.grid1_note_no = grid1_note_no;
	}

	public void setGrid1_amt(String grid1_amt){
		this.grid1_amt = grid1_amt;
	}

	public void setGrid1_expt_widr_dt(String grid1_expt_widr_dt){
		this.grid1_expt_widr_dt = grid1_expt_widr_dt;
	}

	public void setGrid2_mode(String grid2_mode){
		this.grid2_mode = grid2_mode;
	}

	public void setGrid2_rownum(String grid2_rownum){
		this.grid2_rownum = grid2_rownum;
	}

	public void setGrid2_loss_dt(String grid2_loss_dt){
		this.grid2_loss_dt = grid2_loss_dt;
	}

	public void setGrid2_expt_loss_amt(String grid2_expt_loss_amt){
		this.grid2_expt_loss_amt = grid2_expt_loss_amt;
	}

	public void setGrid2_fix_loss_amt(String grid2_fix_loss_amt){
		this.grid2_fix_loss_amt = grid2_fix_loss_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getPers(){
		return this.pers;
	}

	public String getPers_ipadd(){
		return this.pers_ipadd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_sub_seq(){
		return this.leas_sub_seq;
	}

	public String getLeas_hire_clsf_cd(){
		return this.leas_hire_clsf_cd;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getRe_leas_yn(){
		return this.re_leas_yn;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPymt_cycl(){
		return this.pymt_cycl;
	}

	public String getPay_plan_tms(){
		return this.pay_plan_tms;
	}

	public String getLibo_yn(){
		return this.libo_yn;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getFst_leas_clsf_cd(){
		return this.fst_leas_clsf_cd;
	}

	public String getFst_leas_no(){
		return this.fst_leas_no;
	}

	public String getInt_calc_cd(){
		return this.int_calc_cd;
	}

	public String getGood_curc(){
		return this.good_curc;
	}

	public String getGood_amt(){
		return this.good_amt;
	}

	public String getEnd_aftr(){
		return this.end_aftr;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getBasi_int(){
		return this.basi_int;
	}

	public String getLeas_int_rate(){
		return this.leas_int_rate;
	}

	public String getPrd_int_rate(){
		return this.prd_int_rate;
	}

	public String getTms_leas_amt(){
		return this.tms_leas_amt;
	}

	public String getTot_leas_fee(){
		return this.tot_leas_fee;
	}

	public String getDecid_amt(){
		return this.decid_amt;
	}

	public String getPrd_int(){
		return this.prd_int;
	}

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_note_no(){
		return this.grid1_note_no;
	}

	public String getGrid1_amt(){
		return this.grid1_amt;
	}

	public String getGrid1_expt_widr_dt(){
		return this.grid1_expt_widr_dt;
	}

	public String getGrid2_mode(){
		return this.grid2_mode;
	}

	public String getGrid2_rownum(){
		return this.grid2_rownum;
	}

	public String getGrid2_loss_dt(){
		return this.grid2_loss_dt;
	}

	public String getGrid2_expt_loss_amt(){
		return this.grid2_expt_loss_amt;
	}

	public String getGrid2_fix_loss_amt(){
		return this.grid2_fix_loss_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8003_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8003_UDM dm = (FC_FUNC_8003_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.pers);
		cstmt.setString(6, dm.pers_ipadd);
		cstmt.setString(7, dm.cntr_clsf_cd);
		cstmt.setString(8, dm.leas_clsf_cd);
		cstmt.setString(9, dm.leas_no);
		cstmt.setString(10, dm.leas_sub_seq);
		cstmt.setString(11, dm.leas_hire_clsf_cd);
		cstmt.setString(12, dm.leas_nm);
		cstmt.setString(13, dm.cntr_no);
		cstmt.setString(14, dm.frcr_amt);
		cstmt.setString(15, dm.won_amt);
		cstmt.setString(16, dm.libo_int_rate);
		cstmt.setString(17, dm.dedu_int_rate);
		cstmt.setString(18, dm.comp_dt);
		cstmt.setString(19, dm.mtry_dt);
		cstmt.setString(20, dm.dlco_clsf_cd);
		cstmt.setString(21, dm.dlco_cd);
		cstmt.setString(22, dm.use_dept_cd);
		cstmt.setString(23, dm.medi_cd);
		cstmt.setString(24, dm.dtls_medi_cd);
		cstmt.setString(25, dm.re_leas_yn);
		cstmt.setString(26, dm.frex_cd);
		cstmt.setString(27, dm.exrate);
		cstmt.setString(28, dm.rmks);
		cstmt.setString(29, dm.pymt_cycl);
		cstmt.setString(30, dm.pay_plan_tms);
		cstmt.setString(31, dm.libo_yn);
		cstmt.setString(32, dm.usag);
		cstmt.setString(33, dm.loca);
		cstmt.setString(34, dm.fst_leas_clsf_cd);
		cstmt.setString(35, dm.fst_leas_no);
		cstmt.setString(36, dm.int_calc_cd);
		cstmt.setString(37, dm.good_curc);
		cstmt.setString(38, dm.good_amt);
		cstmt.setString(39, dm.end_aftr);
		cstmt.setString(40, dm.leas_stat_cd);
		cstmt.setString(41, dm.end_dt);
		cstmt.setString(42, dm.prelae_pay_clsf_cd);
		cstmt.setString(43, dm.basi_int);
		cstmt.setString(44, dm.leas_int_rate);
		cstmt.setString(45, dm.prd_int_rate);
		cstmt.setString(46, dm.tms_leas_amt);
		cstmt.setString(47, dm.tot_leas_fee);
		cstmt.setString(48, dm.decid_amt);
		cstmt.setString(49, dm.prd_int);
		cstmt.setString(50, dm.grid1_mode);
		cstmt.setString(51, dm.grid1_rownum);
		cstmt.setString(52, dm.grid1_note_no);
		cstmt.setString(53, dm.grid1_amt);
		cstmt.setString(54, dm.grid1_expt_widr_dt);
		cstmt.setString(55, dm.grid2_mode);
		cstmt.setString(56, dm.grid2_rownum);
		cstmt.setString(57, dm.grid2_loss_dt);
		cstmt.setString(58, dm.grid2_expt_loss_amt);
		cstmt.setString(59, dm.grid2_fix_loss_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8003_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("pers = [" + getPers() + "]");
		System.out.println("pers_ipadd = [" + getPers_ipadd() + "]");
		System.out.println("cntr_clsf_cd = [" + getCntr_clsf_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("leas_sub_seq = [" + getLeas_sub_seq() + "]");
		System.out.println("leas_hire_clsf_cd = [" + getLeas_hire_clsf_cd() + "]");
		System.out.println("leas_nm = [" + getLeas_nm() + "]");
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("won_amt = [" + getWon_amt() + "]");
		System.out.println("libo_int_rate = [" + getLibo_int_rate() + "]");
		System.out.println("dedu_int_rate = [" + getDedu_int_rate() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("re_leas_yn = [" + getRe_leas_yn() + "]");
		System.out.println("frex_cd = [" + getFrex_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("pymt_cycl = [" + getPymt_cycl() + "]");
		System.out.println("pay_plan_tms = [" + getPay_plan_tms() + "]");
		System.out.println("libo_yn = [" + getLibo_yn() + "]");
		System.out.println("usag = [" + getUsag() + "]");
		System.out.println("loca = [" + getLoca() + "]");
		System.out.println("fst_leas_clsf_cd = [" + getFst_leas_clsf_cd() + "]");
		System.out.println("fst_leas_no = [" + getFst_leas_no() + "]");
		System.out.println("int_calc_cd = [" + getInt_calc_cd() + "]");
		System.out.println("good_curc = [" + getGood_curc() + "]");
		System.out.println("good_amt = [" + getGood_amt() + "]");
		System.out.println("end_aftr = [" + getEnd_aftr() + "]");
		System.out.println("leas_stat_cd = [" + getLeas_stat_cd() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("prelae_pay_clsf_cd = [" + getPrelae_pay_clsf_cd() + "]");
		System.out.println("basi_int = [" + getBasi_int() + "]");
		System.out.println("leas_int_rate = [" + getLeas_int_rate() + "]");
		System.out.println("prd_int_rate = [" + getPrd_int_rate() + "]");
		System.out.println("tms_leas_amt = [" + getTms_leas_amt() + "]");
		System.out.println("tot_leas_fee = [" + getTot_leas_fee() + "]");
		System.out.println("decid_amt = [" + getDecid_amt() + "]");
		System.out.println("prd_int = [" + getPrd_int() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_note_no = [" + getGrid1_note_no() + "]");
		System.out.println("grid1_amt = [" + getGrid1_amt() + "]");
		System.out.println("grid1_expt_widr_dt = [" + getGrid1_expt_widr_dt() + "]");
		System.out.println("grid2_mode = [" + getGrid2_mode() + "]");
		System.out.println("grid2_rownum = [" + getGrid2_rownum() + "]");
		System.out.println("grid2_loss_dt = [" + getGrid2_loss_dt() + "]");
		System.out.println("grid2_expt_loss_amt = [" + getGrid2_expt_loss_amt() + "]");
		System.out.println("grid2_fix_loss_amt = [" + getGrid2_fix_loss_amt() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String pers = req.getParameter("pers");
if( pers == null){
	System.out.println(this.toString+" : pers is null" );
}else{
	System.out.println(this.toString+" : pers is "+pers );
}
String pers_ipadd = req.getParameter("pers_ipadd");
if( pers_ipadd == null){
	System.out.println(this.toString+" : pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : pers_ipadd is "+pers_ipadd );
}
String cntr_clsf_cd = req.getParameter("cntr_clsf_cd");
if( cntr_clsf_cd == null){
	System.out.println(this.toString+" : cntr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : cntr_clsf_cd is "+cntr_clsf_cd );
}
String leas_clsf_cd = req.getParameter("leas_clsf_cd");
if( leas_clsf_cd == null){
	System.out.println(this.toString+" : leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_clsf_cd is "+leas_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String leas_sub_seq = req.getParameter("leas_sub_seq");
if( leas_sub_seq == null){
	System.out.println(this.toString+" : leas_sub_seq is null" );
}else{
	System.out.println(this.toString+" : leas_sub_seq is "+leas_sub_seq );
}
String leas_hire_clsf_cd = req.getParameter("leas_hire_clsf_cd");
if( leas_hire_clsf_cd == null){
	System.out.println(this.toString+" : leas_hire_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_hire_clsf_cd is "+leas_hire_clsf_cd );
}
String leas_nm = req.getParameter("leas_nm");
if( leas_nm == null){
	System.out.println(this.toString+" : leas_nm is null" );
}else{
	System.out.println(this.toString+" : leas_nm is "+leas_nm );
}
String cntr_no = req.getParameter("cntr_no");
if( cntr_no == null){
	System.out.println(this.toString+" : cntr_no is null" );
}else{
	System.out.println(this.toString+" : cntr_no is "+cntr_no );
}
String frcr_amt = req.getParameter("frcr_amt");
if( frcr_amt == null){
	System.out.println(this.toString+" : frcr_amt is null" );
}else{
	System.out.println(this.toString+" : frcr_amt is "+frcr_amt );
}
String won_amt = req.getParameter("won_amt");
if( won_amt == null){
	System.out.println(this.toString+" : won_amt is null" );
}else{
	System.out.println(this.toString+" : won_amt is "+won_amt );
}
String libo_int_rate = req.getParameter("libo_int_rate");
if( libo_int_rate == null){
	System.out.println(this.toString+" : libo_int_rate is null" );
}else{
	System.out.println(this.toString+" : libo_int_rate is "+libo_int_rate );
}
String dedu_int_rate = req.getParameter("dedu_int_rate");
if( dedu_int_rate == null){
	System.out.println(this.toString+" : dedu_int_rate is null" );
}else{
	System.out.println(this.toString+" : dedu_int_rate is "+dedu_int_rate );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String re_leas_yn = req.getParameter("re_leas_yn");
if( re_leas_yn == null){
	System.out.println(this.toString+" : re_leas_yn is null" );
}else{
	System.out.println(this.toString+" : re_leas_yn is "+re_leas_yn );
}
String frex_cd = req.getParameter("frex_cd");
if( frex_cd == null){
	System.out.println(this.toString+" : frex_cd is null" );
}else{
	System.out.println(this.toString+" : frex_cd is "+frex_cd );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String pymt_cycl = req.getParameter("pymt_cycl");
if( pymt_cycl == null){
	System.out.println(this.toString+" : pymt_cycl is null" );
}else{
	System.out.println(this.toString+" : pymt_cycl is "+pymt_cycl );
}
String pay_plan_tms = req.getParameter("pay_plan_tms");
if( pay_plan_tms == null){
	System.out.println(this.toString+" : pay_plan_tms is null" );
}else{
	System.out.println(this.toString+" : pay_plan_tms is "+pay_plan_tms );
}
String libo_yn = req.getParameter("libo_yn");
if( libo_yn == null){
	System.out.println(this.toString+" : libo_yn is null" );
}else{
	System.out.println(this.toString+" : libo_yn is "+libo_yn );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String loca = req.getParameter("loca");
if( loca == null){
	System.out.println(this.toString+" : loca is null" );
}else{
	System.out.println(this.toString+" : loca is "+loca );
}
String fst_leas_clsf_cd = req.getParameter("fst_leas_clsf_cd");
if( fst_leas_clsf_cd == null){
	System.out.println(this.toString+" : fst_leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : fst_leas_clsf_cd is "+fst_leas_clsf_cd );
}
String fst_leas_no = req.getParameter("fst_leas_no");
if( fst_leas_no == null){
	System.out.println(this.toString+" : fst_leas_no is null" );
}else{
	System.out.println(this.toString+" : fst_leas_no is "+fst_leas_no );
}
String int_calc_cd = req.getParameter("int_calc_cd");
if( int_calc_cd == null){
	System.out.println(this.toString+" : int_calc_cd is null" );
}else{
	System.out.println(this.toString+" : int_calc_cd is "+int_calc_cd );
}
String good_curc = req.getParameter("good_curc");
if( good_curc == null){
	System.out.println(this.toString+" : good_curc is null" );
}else{
	System.out.println(this.toString+" : good_curc is "+good_curc );
}
String good_amt = req.getParameter("good_amt");
if( good_amt == null){
	System.out.println(this.toString+" : good_amt is null" );
}else{
	System.out.println(this.toString+" : good_amt is "+good_amt );
}
String end_aftr = req.getParameter("end_aftr");
if( end_aftr == null){
	System.out.println(this.toString+" : end_aftr is null" );
}else{
	System.out.println(this.toString+" : end_aftr is "+end_aftr );
}
String leas_stat_cd = req.getParameter("leas_stat_cd");
if( leas_stat_cd == null){
	System.out.println(this.toString+" : leas_stat_cd is null" );
}else{
	System.out.println(this.toString+" : leas_stat_cd is "+leas_stat_cd );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String prelae_pay_clsf_cd = req.getParameter("prelae_pay_clsf_cd");
if( prelae_pay_clsf_cd == null){
	System.out.println(this.toString+" : prelae_pay_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : prelae_pay_clsf_cd is "+prelae_pay_clsf_cd );
}
String basi_int = req.getParameter("basi_int");
if( basi_int == null){
	System.out.println(this.toString+" : basi_int is null" );
}else{
	System.out.println(this.toString+" : basi_int is "+basi_int );
}
String leas_int_rate = req.getParameter("leas_int_rate");
if( leas_int_rate == null){
	System.out.println(this.toString+" : leas_int_rate is null" );
}else{
	System.out.println(this.toString+" : leas_int_rate is "+leas_int_rate );
}
String prd_int_rate = req.getParameter("prd_int_rate");
if( prd_int_rate == null){
	System.out.println(this.toString+" : prd_int_rate is null" );
}else{
	System.out.println(this.toString+" : prd_int_rate is "+prd_int_rate );
}
String tms_leas_amt = req.getParameter("tms_leas_amt");
if( tms_leas_amt == null){
	System.out.println(this.toString+" : tms_leas_amt is null" );
}else{
	System.out.println(this.toString+" : tms_leas_amt is "+tms_leas_amt );
}
String tot_leas_fee = req.getParameter("tot_leas_fee");
if( tot_leas_fee == null){
	System.out.println(this.toString+" : tot_leas_fee is null" );
}else{
	System.out.println(this.toString+" : tot_leas_fee is "+tot_leas_fee );
}
String decid_amt = req.getParameter("decid_amt");
if( decid_amt == null){
	System.out.println(this.toString+" : decid_amt is null" );
}else{
	System.out.println(this.toString+" : decid_amt is "+decid_amt );
}
String prd_int = req.getParameter("prd_int");
if( prd_int == null){
	System.out.println(this.toString+" : prd_int is null" );
}else{
	System.out.println(this.toString+" : prd_int is "+prd_int );
}
String grid1_mode = req.getParameter("grid1_mode");
if( grid1_mode == null){
	System.out.println(this.toString+" : grid1_mode is null" );
}else{
	System.out.println(this.toString+" : grid1_mode is "+grid1_mode );
}
String grid1_rownum = req.getParameter("grid1_rownum");
if( grid1_rownum == null){
	System.out.println(this.toString+" : grid1_rownum is null" );
}else{
	System.out.println(this.toString+" : grid1_rownum is "+grid1_rownum );
}
String grid1_note_no = req.getParameter("grid1_note_no");
if( grid1_note_no == null){
	System.out.println(this.toString+" : grid1_note_no is null" );
}else{
	System.out.println(this.toString+" : grid1_note_no is "+grid1_note_no );
}
String grid1_amt = req.getParameter("grid1_amt");
if( grid1_amt == null){
	System.out.println(this.toString+" : grid1_amt is null" );
}else{
	System.out.println(this.toString+" : grid1_amt is "+grid1_amt );
}
String grid1_expt_widr_dt = req.getParameter("grid1_expt_widr_dt");
if( grid1_expt_widr_dt == null){
	System.out.println(this.toString+" : grid1_expt_widr_dt is null" );
}else{
	System.out.println(this.toString+" : grid1_expt_widr_dt is "+grid1_expt_widr_dt );
}
String grid2_mode = req.getParameter("grid2_mode");
if( grid2_mode == null){
	System.out.println(this.toString+" : grid2_mode is null" );
}else{
	System.out.println(this.toString+" : grid2_mode is "+grid2_mode );
}
String grid2_rownum = req.getParameter("grid2_rownum");
if( grid2_rownum == null){
	System.out.println(this.toString+" : grid2_rownum is null" );
}else{
	System.out.println(this.toString+" : grid2_rownum is "+grid2_rownum );
}
String grid2_loss_dt = req.getParameter("grid2_loss_dt");
if( grid2_loss_dt == null){
	System.out.println(this.toString+" : grid2_loss_dt is null" );
}else{
	System.out.println(this.toString+" : grid2_loss_dt is "+grid2_loss_dt );
}
String grid2_expt_loss_amt = req.getParameter("grid2_expt_loss_amt");
if( grid2_expt_loss_amt == null){
	System.out.println(this.toString+" : grid2_expt_loss_amt is null" );
}else{
	System.out.println(this.toString+" : grid2_expt_loss_amt is "+grid2_expt_loss_amt );
}
String grid2_fix_loss_amt = req.getParameter("grid2_fix_loss_amt");
if( grid2_fix_loss_amt == null){
	System.out.println(this.toString+" : grid2_fix_loss_amt is null" );
}else{
	System.out.println(this.toString+" : grid2_fix_loss_amt is "+grid2_fix_loss_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String pers = Util.checkString(req.getParameter("pers"));
String pers_ipadd = Util.checkString(req.getParameter("pers_ipadd"));
String cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
String leas_hire_clsf_cd = Util.checkString(req.getParameter("leas_hire_clsf_cd"));
String leas_nm = Util.checkString(req.getParameter("leas_nm"));
String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String won_amt = Util.checkString(req.getParameter("won_amt"));
String libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
String dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String rmks = Util.checkString(req.getParameter("rmks"));
String pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
String pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
String libo_yn = Util.checkString(req.getParameter("libo_yn"));
String usag = Util.checkString(req.getParameter("usag"));
String loca = Util.checkString(req.getParameter("loca"));
String fst_leas_clsf_cd = Util.checkString(req.getParameter("fst_leas_clsf_cd"));
String fst_leas_no = Util.checkString(req.getParameter("fst_leas_no"));
String int_calc_cd = Util.checkString(req.getParameter("int_calc_cd"));
String good_curc = Util.checkString(req.getParameter("good_curc"));
String good_amt = Util.checkString(req.getParameter("good_amt"));
String end_aftr = Util.checkString(req.getParameter("end_aftr"));
String leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
String basi_int = Util.checkString(req.getParameter("basi_int"));
String leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
String prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
String tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
String tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
String decid_amt = Util.checkString(req.getParameter("decid_amt"));
String prd_int = Util.checkString(req.getParameter("prd_int"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_note_no = Util.checkString(req.getParameter("grid1_note_no"));
String grid1_amt = Util.checkString(req.getParameter("grid1_amt"));
String grid1_expt_widr_dt = Util.checkString(req.getParameter("grid1_expt_widr_dt"));
String grid2_mode = Util.checkString(req.getParameter("grid2_mode"));
String grid2_rownum = Util.checkString(req.getParameter("grid2_rownum"));
String grid2_loss_dt = Util.checkString(req.getParameter("grid2_loss_dt"));
String grid2_expt_loss_amt = Util.checkString(req.getParameter("grid2_expt_loss_amt"));
String grid2_fix_loss_amt = Util.checkString(req.getParameter("grid2_fix_loss_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String pers = Util.Uni2Ksc(Util.checkString(req.getParameter("pers")));
String pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipadd")));
String cntr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_clsf_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String leas_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_sub_seq")));
String leas_hire_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_hire_clsf_cd")));
String leas_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_nm")));
String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String won_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt")));
String libo_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_int_rate")));
String dedu_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("dedu_int_rate")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String re_leas_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("re_leas_yn")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String pymt_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_cycl")));
String pay_plan_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plan_tms")));
String libo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_yn")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String loca = Util.Uni2Ksc(Util.checkString(req.getParameter("loca")));
String fst_leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_leas_clsf_cd")));
String fst_leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_leas_no")));
String int_calc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("int_calc_cd")));
String good_curc = Util.Uni2Ksc(Util.checkString(req.getParameter("good_curc")));
String good_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("good_amt")));
String end_aftr = Util.Uni2Ksc(Util.checkString(req.getParameter("end_aftr")));
String leas_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_stat_cd")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String prelae_pay_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prelae_pay_clsf_cd")));
String basi_int = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_int")));
String leas_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_int_rate")));
String prd_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_int_rate")));
String tms_leas_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_leas_amt")));
String tot_leas_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_leas_fee")));
String decid_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_amt")));
String prd_int = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_int")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_note_no")));
String grid1_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_amt")));
String grid1_expt_widr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_expt_widr_dt")));
String grid2_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid2_mode")));
String grid2_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid2_rownum")));
String grid2_loss_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid2_loss_dt")));
String grid2_expt_loss_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid2_expt_loss_amt")));
String grid2_fix_loss_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid2_fix_loss_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setPers(pers);
dm.setPers_ipadd(pers_ipadd);
dm.setCntr_clsf_cd(cntr_clsf_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setLeas_sub_seq(leas_sub_seq);
dm.setLeas_hire_clsf_cd(leas_hire_clsf_cd);
dm.setLeas_nm(leas_nm);
dm.setCntr_no(cntr_no);
dm.setFrcr_amt(frcr_amt);
dm.setWon_amt(won_amt);
dm.setLibo_int_rate(libo_int_rate);
dm.setDedu_int_rate(dedu_int_rate);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setRe_leas_yn(re_leas_yn);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setRmks(rmks);
dm.setPymt_cycl(pymt_cycl);
dm.setPay_plan_tms(pay_plan_tms);
dm.setLibo_yn(libo_yn);
dm.setUsag(usag);
dm.setLoca(loca);
dm.setFst_leas_clsf_cd(fst_leas_clsf_cd);
dm.setFst_leas_no(fst_leas_no);
dm.setInt_calc_cd(int_calc_cd);
dm.setGood_curc(good_curc);
dm.setGood_amt(good_amt);
dm.setEnd_aftr(end_aftr);
dm.setLeas_stat_cd(leas_stat_cd);
dm.setEnd_dt(end_dt);
dm.setPrelae_pay_clsf_cd(prelae_pay_clsf_cd);
dm.setBasi_int(basi_int);
dm.setLeas_int_rate(leas_int_rate);
dm.setPrd_int_rate(prd_int_rate);
dm.setTms_leas_amt(tms_leas_amt);
dm.setTot_leas_fee(tot_leas_fee);
dm.setDecid_amt(decid_amt);
dm.setPrd_int(prd_int);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_note_no(grid1_note_no);
dm.setGrid1_amt(grid1_amt);
dm.setGrid1_expt_widr_dt(grid1_expt_widr_dt);
dm.setGrid2_mode(grid2_mode);
dm.setGrid2_rownum(grid2_rownum);
dm.setGrid2_loss_dt(grid2_loss_dt);
dm.setGrid2_expt_loss_amt(grid2_expt_loss_amt);
dm.setGrid2_fix_loss_amt(grid2_fix_loss_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 17:59:09 KST 2009 */