/***************************************************************************************************
* 파일명 : .java
* 기능 : 전자어음 업로드
* 작성일자 : 2011.07.05
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_4350_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	
	public String occr_dt;
	public String bank_cd;
	public String note_clsf_cd;
	public String occr_seq;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String endorser_nm;
	public String note_amt;
	public String comp_dt;
	public String mtry_dt;
	public String rcpm_acct;
	public String sale_aprv_no;
	
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;

	public AD_DEP_4350_ADM(){}
	

	public AD_DEP_4350_ADM(String cmpy_cd, String occr_dt, String bank_cd, String note_clsf_cd, String occr_seq, String issu_cmpy_clsf_cd, String issu_pers_nm, String endorser_nm, String note_amt, String comp_dt, String mtry_dt, String rcpm_acct, String sale_aprv_no, String incmg_pers_ip, String incmg_pers, String mode) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.bank_cd = bank_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.occr_seq = occr_seq;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.endorser_nm = endorser_nm;
		this.note_amt = note_amt;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.rcpm_acct = rcpm_acct;
		this.sale_aprv_no = sale_aprv_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
	}


	public String getBank_cd() {
		return bank_cd;
	}


	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}


	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getComp_dt() {
		return comp_dt;
	}


	public void setComp_dt(String comp_dt) {
		this.comp_dt = comp_dt;
	}


	public String getIncmg_pers() {
		return incmg_pers;
	}


	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}


	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}


	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}


	public String getIssu_cmpy_clsf_cd() {
		return issu_cmpy_clsf_cd;
	}


	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd) {
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}


	public String getIssu_pers_nm() {
		return issu_pers_nm;
	}


	public void setIssu_pers_nm(String issu_pers_nm) {
		this.issu_pers_nm = issu_pers_nm;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getMtry_dt() {
		return mtry_dt;
	}


	public void setMtry_dt(String mtry_dt) {
		this.mtry_dt = mtry_dt;
	}


	public String getNote_amt() {
		return note_amt;
	}


	public void setNote_amt(String note_amt) {
		this.note_amt = note_amt;
	}


	public String getNote_clsf_cd() {
		return note_clsf_cd;
	}


	public void setNote_clsf_cd(String note_clsf_cd) {
		this.note_clsf_cd = note_clsf_cd;
	}


	public String getOccr_dt() {
		return occr_dt;
	}


	public void setOccr_dt(String occr_dt) {
		this.occr_dt = occr_dt;
	}


	public String getOccr_seq() {
		return occr_seq;
	}


	public void setOccr_seq(String occr_seq) {
		this.occr_seq = occr_seq;
	}


	public String getRcpm_acct() {
		return rcpm_acct;
	}


	public void setRcpm_acct(String rcpm_acct) {
		this.rcpm_acct = rcpm_acct;
	}


	public String getSale_aprv_no() {
		return sale_aprv_no;
	}


	public void setSale_aprv_no(String sale_aprv_no) {
		this.sale_aprv_no = sale_aprv_no;
	}


	public String getEndorser_nm() {
		return endorser_nm;
	}


	public void setEndorser_nm(String endorser_nm) {
		this.endorser_nm = endorser_nm;
	}


	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4350_A(?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4350_ADM dm = (AD_DEP_4350_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.bank_cd);
		cstmt.setString(6, dm.note_clsf_cd);
		cstmt.setString(7, dm.occr_seq);
		cstmt.setString(8, dm.issu_cmpy_clsf_cd);
		cstmt.setString(9, dm.issu_pers_nm);
		cstmt.setString(10, dm.endorser_nm);
		cstmt.setString(11, dm.note_amt);
		cstmt.setString(12, dm.comp_dt);
		cstmt.setString(13, dm.mtry_dt);
		cstmt.setString(14, dm.rcpm_acct);
		cstmt.setString(15, dm.sale_aprv_no);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4350_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String notaxrate_clsf = req.getParameter("notaxrate_clsf");
if( notaxrate_clsf == null){
	System.out.println(this.toString+" : notaxrate_clsf is null" );
}else{
	System.out.println(this.toString+" : notaxrate_clsf is "+notaxrate_clsf );
}
String notaxrate_dt = req.getParameter("notaxrate_dt");
if( notaxrate_dt == null){
	System.out.println(this.toString+" : notaxrate_dt is null" );
}else{
	System.out.println(this.toString+" : notaxrate_dt is "+notaxrate_dt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String notaxrate_clsf = Util.checkString(req.getParameter("notaxrate_clsf"));
String notaxrate_dt = Util.checkString(req.getParameter("notaxrate_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String notaxrate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_clsf")));
String notaxrate_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
dm.setNotaxrate_clsf(notaxrate_clsf);
dm.setNotaxrate_dt(notaxrate_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 14:53:38 KST 2009 */