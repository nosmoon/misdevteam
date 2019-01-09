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


public class FC_FUNC_8023_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String pers;
	public String pers_ipadd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String leas_nm;
	public String cntr_no;
	public String frcr_amt;
	public String won_amt;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String re_leas_yn;
	public String frex_cd;
	public String exrate;
	public String rmks;
	public String pymt_cycl;
	public String pay_plan_tms;
	public String libo_yn;
	public String end_aftr;
	public String leas_stat_cd;
	public String end_dt;
	public String basi_int;
	public String leas_int_rate;
	public String prd_int_rate;
	public String tms_leas_amt;
	public String tot_leas_fee;
	public String decid_amt;
	public String prd_int;

	public FC_FUNC_8023_UDM(){}
	public FC_FUNC_8023_UDM(String cmpy_cd, String uid, String pers, String pers_ipadd, String cntr_clsf_cd, String leas_clsf_cd, String leas_no, String leas_sub_seq, String leas_nm, String cntr_no, String frcr_amt, String won_amt, String libo_int_rate, String dedu_int_rate, String comp_dt, String mtry_dt, String re_leas_yn, String frex_cd, String exrate, String rmks, String pymt_cycl, String pay_plan_tms, String libo_yn, String end_aftr, String leas_stat_cd, String end_dt, String basi_int, String leas_int_rate, String prd_int_rate, String tms_leas_amt, String tot_leas_fee, String decid_amt, String prd_int){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.pers = pers;
		this.pers_ipadd = pers_ipadd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.leas_sub_seq = leas_sub_seq;
		this.leas_nm = leas_nm;
		this.cntr_no = cntr_no;
		this.frcr_amt = frcr_amt;
		this.won_amt = won_amt;
		this.libo_int_rate = libo_int_rate;
		this.dedu_int_rate = dedu_int_rate;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.re_leas_yn = re_leas_yn;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.rmks = rmks;
		this.pymt_cycl = pymt_cycl;
		this.pay_plan_tms = pay_plan_tms;
		this.libo_yn = libo_yn;
		this.end_aftr = end_aftr;
		this.leas_stat_cd = leas_stat_cd;
		this.end_dt = end_dt;
		this.basi_int = basi_int;
		this.leas_int_rate = leas_int_rate;
		this.prd_int_rate = prd_int_rate;
		this.tms_leas_amt = tms_leas_amt;
		this.tot_leas_fee = tot_leas_fee;
		this.decid_amt = decid_amt;
		this.prd_int = prd_int;
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

	public void setEnd_aftr(String end_aftr){
		this.end_aftr = end_aftr;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
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

	public String getEnd_aftr(){
		return this.end_aftr;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getEnd_dt(){
		return this.end_dt;
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

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8023_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8023_UDM dm = (FC_FUNC_8023_UDM)bdm;
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
		cstmt.setString(11, dm.leas_nm);
		cstmt.setString(12, dm.cntr_no);
		cstmt.setString(13, dm.frcr_amt);
		cstmt.setString(14, dm.won_amt);
		cstmt.setString(15, dm.libo_int_rate);
		cstmt.setString(16, dm.dedu_int_rate);
		cstmt.setString(17, dm.comp_dt);
		cstmt.setString(18, dm.mtry_dt);
		cstmt.setString(19, dm.re_leas_yn);
		cstmt.setString(20, dm.frex_cd);
		cstmt.setString(21, dm.exrate);
		cstmt.setString(22, dm.rmks);
		cstmt.setString(23, dm.pymt_cycl);
		cstmt.setString(24, dm.pay_plan_tms);
		cstmt.setString(25, dm.libo_yn);
		cstmt.setString(26, dm.end_aftr);
		cstmt.setString(27, dm.leas_stat_cd);
		cstmt.setString(28, dm.end_dt);
		cstmt.setString(29, dm.basi_int);
		cstmt.setString(30, dm.leas_int_rate);
		cstmt.setString(31, dm.prd_int_rate);
		cstmt.setString(32, dm.tms_leas_amt);
		cstmt.setString(33, dm.tot_leas_fee);
		cstmt.setString(34, dm.decid_amt);
		cstmt.setString(35, dm.prd_int);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8023_UDataSet();
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
		System.out.println("leas_nm = [" + getLeas_nm() + "]");
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("won_amt = [" + getWon_amt() + "]");
		System.out.println("libo_int_rate = [" + getLibo_int_rate() + "]");
		System.out.println("dedu_int_rate = [" + getDedu_int_rate() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("re_leas_yn = [" + getRe_leas_yn() + "]");
		System.out.println("frex_cd = [" + getFrex_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("pymt_cycl = [" + getPymt_cycl() + "]");
		System.out.println("pay_plan_tms = [" + getPay_plan_tms() + "]");
		System.out.println("libo_yn = [" + getLibo_yn() + "]");
		System.out.println("end_aftr = [" + getEnd_aftr() + "]");
		System.out.println("leas_stat_cd = [" + getLeas_stat_cd() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("basi_int = [" + getBasi_int() + "]");
		System.out.println("leas_int_rate = [" + getLeas_int_rate() + "]");
		System.out.println("prd_int_rate = [" + getPrd_int_rate() + "]");
		System.out.println("tms_leas_amt = [" + getTms_leas_amt() + "]");
		System.out.println("tot_leas_fee = [" + getTot_leas_fee() + "]");
		System.out.println("decid_amt = [" + getDecid_amt() + "]");
		System.out.println("prd_int = [" + getPrd_int() + "]");
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
String leas_nm = Util.checkString(req.getParameter("leas_nm"));
String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String won_amt = Util.checkString(req.getParameter("won_amt"));
String libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
String dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String re_leas_yn = Util.checkString(req.getParameter("re_leas_yn"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String rmks = Util.checkString(req.getParameter("rmks"));
String pymt_cycl = Util.checkString(req.getParameter("pymt_cycl"));
String pay_plan_tms = Util.checkString(req.getParameter("pay_plan_tms"));
String libo_yn = Util.checkString(req.getParameter("libo_yn"));
String end_aftr = Util.checkString(req.getParameter("end_aftr"));
String leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String basi_int = Util.checkString(req.getParameter("basi_int"));
String leas_int_rate = Util.checkString(req.getParameter("leas_int_rate"));
String prd_int_rate = Util.checkString(req.getParameter("prd_int_rate"));
String tms_leas_amt = Util.checkString(req.getParameter("tms_leas_amt"));
String tot_leas_fee = Util.checkString(req.getParameter("tot_leas_fee"));
String decid_amt = Util.checkString(req.getParameter("decid_amt"));
String prd_int = Util.checkString(req.getParameter("prd_int"));
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
String leas_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_nm")));
String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String won_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt")));
String libo_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_int_rate")));
String dedu_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("dedu_int_rate")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String re_leas_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("re_leas_yn")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String pymt_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_cycl")));
String pay_plan_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plan_tms")));
String libo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_yn")));
String end_aftr = Util.Uni2Ksc(Util.checkString(req.getParameter("end_aftr")));
String leas_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_stat_cd")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String basi_int = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_int")));
String leas_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_int_rate")));
String prd_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_int_rate")));
String tms_leas_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_leas_amt")));
String tot_leas_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_leas_fee")));
String decid_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_amt")));
String prd_int = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_int")));
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
dm.setLeas_nm(leas_nm);
dm.setCntr_no(cntr_no);
dm.setFrcr_amt(frcr_amt);
dm.setWon_amt(won_amt);
dm.setLibo_int_rate(libo_int_rate);
dm.setDedu_int_rate(dedu_int_rate);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setRe_leas_yn(re_leas_yn);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setRmks(rmks);
dm.setPymt_cycl(pymt_cycl);
dm.setPay_plan_tms(pay_plan_tms);
dm.setLibo_yn(libo_yn);
dm.setEnd_aftr(end_aftr);
dm.setLeas_stat_cd(leas_stat_cd);
dm.setEnd_dt(end_dt);
dm.setBasi_int(basi_int);
dm.setLeas_int_rate(leas_int_rate);
dm.setPrd_int_rate(prd_int_rate);
dm.setTms_leas_amt(tms_leas_amt);
dm.setTot_leas_fee(tot_leas_fee);
dm.setDecid_amt(decid_amt);
dm.setPrd_int(prd_int);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 20:40:28 KST 2009 */