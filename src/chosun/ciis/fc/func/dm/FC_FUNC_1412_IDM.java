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


public class FC_FUNC_1412_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_dt;
	public String rmks1;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String rcpm_acct;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String bank_cd;
	public String bank_cd_nm;
	public String note_no;
	public String note_seq;
	public String note_clsf_cd;
	public String note_amt;
	public String mtry_dt;
	public String comp_dt;
	public String coms;

	public FC_FUNC_1412_IDM(){}
	public FC_FUNC_1412_IDM(String cmpy_cd, String stat_dt, String rmks1, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd, String rcpm_acct, String dlco_clsf_cd, String dlco_cd, String compnm, String bank_cd, String bank_cd_nm, String note_no, String note_seq, String note_clsf_cd, String note_amt, String mtry_dt, String comp_dt, String coms){
		this.cmpy_cd = cmpy_cd;
		this.stat_dt = stat_dt;
		this.rmks1 = rmks1;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.rcpm_acct = rcpm_acct;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.compnm = compnm;
		this.bank_cd = bank_cd;
		this.bank_cd_nm = bank_cd_nm;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.note_clsf_cd = note_clsf_cd;
		this.note_amt = note_amt;
		this.mtry_dt = mtry_dt;
		this.comp_dt = comp_dt;
		this.coms = coms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1412_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1412_IDM dm = (FC_FUNC_1412_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_dt);
		cstmt.setString(5, dm.rmks1);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.use_dept_cd);
		cstmt.setString(9, dm.rcpm_acct);
		cstmt.setString(10, dm.dlco_clsf_cd);
		cstmt.setString(11, dm.dlco_cd);
		cstmt.setString(12, dm.compnm);
		cstmt.setString(13, dm.bank_cd);
		cstmt.setString(14, dm.bank_cd_nm);
		cstmt.setString(15, dm.note_no);
		cstmt.setString(16, dm.note_seq);
		cstmt.setString(17, dm.note_clsf_cd);
		cstmt.setString(18, dm.note_amt);
		cstmt.setString(19, dm.mtry_dt);
		cstmt.setString(20, dm.comp_dt);
		cstmt.setString(21, dm.coms);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1412_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("stat_dt = [" + getStat_dt() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("rcpm_acct = [" + getRcpm_acct() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("compnm = [" + getCompnm() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("bank_cd_nm = [" + getBank_cd_nm() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("note_amt = [" + getNote_amt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("coms = [" + getComs() + "]");
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
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String rcpm_acct = req.getParameter("rcpm_acct");
if( rcpm_acct == null){
	System.out.println(this.toString+" : rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct is "+rcpm_acct );
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
String compnm = req.getParameter("compnm");
if( compnm == null){
	System.out.println(this.toString+" : compnm is null" );
}else{
	System.out.println(this.toString+" : compnm is "+compnm );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String bank_cd_nm = req.getParameter("bank_cd_nm");
if( bank_cd_nm == null){
	System.out.println(this.toString+" : bank_cd_nm is null" );
}else{
	System.out.println(this.toString+" : bank_cd_nm is "+bank_cd_nm );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String compnm = Util.checkString(req.getParameter("compnm"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String bank_cd_nm = Util.checkString(req.getParameter("bank_cd_nm"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String coms = Util.checkString(req.getParameter("coms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("compnm")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String bank_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd_nm")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt(stat_dt);
dm.setRmks1(rmks1);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setRcpm_acct(rcpm_acct);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setCompnm(compnm);
dm.setBank_cd(bank_cd);
dm.setBank_cd_nm(bank_cd_nm);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setNote_amt(note_amt);
dm.setMtry_dt(mtry_dt);
dm.setComp_dt(comp_dt);
dm.setComs(coms);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 15:51:43 KST 2009 */