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


public class FC_FUNC_1192_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpay_dt;
	public String extnc_ptcr;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpay_amt;
	public String dhon_occr_dt;
	public String note_clsf_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String mtry_dt;
	public String pch_amt1;
	public String pch_amt2;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;

	public FC_FUNC_1192_IDM(){}
	public FC_FUNC_1192_IDM(String cmpy_cd, String rcpay_dt, String extnc_ptcr, String bank_cd, String note_no, String note_seq, String rcpay_amt, String dhon_occr_dt, String note_clsf_cd, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String mtry_dt, String pch_amt1, String pch_amt2, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.rcpay_dt = rcpay_dt;
		this.extnc_ptcr = extnc_ptcr;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.rcpay_amt = rcpay_amt;
		this.dhon_occr_dt = dhon_occr_dt;
		this.note_clsf_cd = note_clsf_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.mtry_dt = mtry_dt;
		this.pch_amt1 = pch_amt1;
		this.pch_amt2 = pch_amt2;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setExtnc_ptcr(String extnc_ptcr){
		this.extnc_ptcr = extnc_ptcr;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getExtnc_ptcr(){
		return this.extnc_ptcr;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
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

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1192_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1192_IDM dm = (FC_FUNC_1192_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpay_dt);
		cstmt.setString(5, dm.extnc_ptcr);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.note_no);
		cstmt.setString(8, dm.note_seq);
		cstmt.setString(9, dm.rcpay_amt);
		cstmt.setString(10, dm.dhon_occr_dt);
		cstmt.setString(11, dm.note_clsf_cd);
		cstmt.setString(12, dm.dlco_clsf_cd);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.pch_compnm);
		cstmt.setString(15, dm.mtry_dt);
		cstmt.setString(16, dm.pch_amt1);
		cstmt.setString(17, dm.pch_amt2);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1192_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpay_dt = [" + getRcpay_dt() + "]");
		System.out.println("extnc_ptcr = [" + getExtnc_ptcr() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("rcpay_amt = [" + getRcpay_amt() + "]");
		System.out.println("dhon_occr_dt = [" + getDhon_occr_dt() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("pch_amt1 = [" + getPch_amt1() + "]");
		System.out.println("pch_amt2 = [" + getPch_amt2() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
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
String rcpay_dt = req.getParameter("rcpay_dt");
if( rcpay_dt == null){
	System.out.println(this.toString+" : rcpay_dt is null" );
}else{
	System.out.println(this.toString+" : rcpay_dt is "+rcpay_dt );
}
String extnc_ptcr = req.getParameter("extnc_ptcr");
if( extnc_ptcr == null){
	System.out.println(this.toString+" : extnc_ptcr is null" );
}else{
	System.out.println(this.toString+" : extnc_ptcr is "+extnc_ptcr );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
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
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String dhon_occr_dt = req.getParameter("dhon_occr_dt");
if( dhon_occr_dt == null){
	System.out.println(this.toString+" : dhon_occr_dt is null" );
}else{
	System.out.println(this.toString+" : dhon_occr_dt is "+dhon_occr_dt );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
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
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String pch_amt1 = req.getParameter("pch_amt1");
if( pch_amt1 == null){
	System.out.println(this.toString+" : pch_amt1 is null" );
}else{
	System.out.println(this.toString+" : pch_amt1 is "+pch_amt1 );
}
String pch_amt2 = req.getParameter("pch_amt2");
if( pch_amt2 == null){
	System.out.println(this.toString+" : pch_amt2 is null" );
}else{
	System.out.println(this.toString+" : pch_amt2 is "+pch_amt2 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
String extnc_ptcr = Util.checkString(req.getParameter("extnc_ptcr"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String pch_amt1 = Util.checkString(req.getParameter("pch_amt1"));
String pch_amt2 = Util.checkString(req.getParameter("pch_amt2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_dt")));
String extnc_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_ptcr")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String dhon_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_occr_dt")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String pch_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt1")));
String pch_amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpay_dt(rcpay_dt);
dm.setExtnc_ptcr(extnc_ptcr);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setRcpay_amt(rcpay_amt);
dm.setDhon_occr_dt(dhon_occr_dt);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setMtry_dt(mtry_dt);
dm.setPch_amt1(pch_amt1);
dm.setPch_amt2(pch_amt2);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 20:08:55 KST 2009 */