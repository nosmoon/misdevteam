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


public class IS_DEP_4350_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

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

	public IS_DEP_4350_ADM(){}
	public IS_DEP_4350_ADM(String cmpy_cd, String occr_dt, String bank_cd, String note_clsf_cd, String occr_seq, String issu_cmpy_clsf_cd, String issu_pers_nm, String endorser_nm, String note_amt, String comp_dt, String mtry_dt, String rcpm_acct, String sale_aprv_no, String incmg_pers_ip, String incmg_pers, String mode){
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

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setEndorser_nm(String endorser_nm){
		this.endorser_nm = endorser_nm;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getEndorser_nm(){
		return this.endorser_nm;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4350_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4350_ADM dm = (IS_DEP_4350_ADM)bdm;
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
		return new chosun.ciis.is.dep.ds.IS_DEP_4350_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
		System.out.println("issu_cmpy_clsf_cd = [" + getIssu_cmpy_clsf_cd() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("endorser_nm = [" + getEndorser_nm() + "]");
		System.out.println("note_amt = [" + getNote_amt() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("rcpm_acct = [" + getRcpm_acct() + "]");
		System.out.println("sale_aprv_no = [" + getSale_aprv_no() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String issu_cmpy_clsf_cd = req.getParameter("issu_cmpy_clsf_cd");
if( issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is "+issu_cmpy_clsf_cd );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
}
String endorser_nm = req.getParameter("endorser_nm");
if( endorser_nm == null){
	System.out.println(this.toString+" : endorser_nm is null" );
}else{
	System.out.println(this.toString+" : endorser_nm is "+endorser_nm );
}
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
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
String rcpm_acct = req.getParameter("rcpm_acct");
if( rcpm_acct == null){
	System.out.println(this.toString+" : rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct is "+rcpm_acct );
}
String sale_aprv_no = req.getParameter("sale_aprv_no");
if( sale_aprv_no == null){
	System.out.println(this.toString+" : sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : sale_aprv_no is "+sale_aprv_no );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String endorser_nm = Util.checkString(req.getParameter("endorser_nm"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
String sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String endorser_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("endorser_nm")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct")));
String sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_aprv_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setBank_cd(bank_cd);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setOccr_seq(occr_seq);
dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setEndorser_nm(endorser_nm);
dm.setNote_amt(note_amt);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setRcpm_acct(rcpm_acct);
dm.setSale_aprv_no(sale_aprv_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 18:09:30 KST 2012 */