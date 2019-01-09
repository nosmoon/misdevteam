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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6171_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tax_clsf;
	public String make_dt;
	public String seq;
	public String issue_dt;
	public String trans_dt;
	public String ern;
	public String ern_nm;
	public String total_amt;
	public String suply_amt;
	public String vat_amt;
	public String incmg_pers;
	public String tax_number;
	public String tax_number_start;
	public String tax_number_end;
	public String cmpy_ern;

	public FC_ACCT_6171_ADM(){}
	public FC_ACCT_6171_ADM(String cmpy_cd, String tax_clsf, String make_dt, String seq, String issue_dt, String trans_dt, String ern, String ern_nm, String total_amt, String suply_amt, String vat_amt, String incmg_pers, String tax_number, String tax_number_start, String tax_number_end, String cmpy_ern){
		this.cmpy_cd = cmpy_cd;
		this.tax_clsf = tax_clsf;
		this.make_dt = make_dt;
		this.seq = seq;
		this.issue_dt = issue_dt;
		this.trans_dt = trans_dt;
		this.ern = ern;
		this.ern_nm = ern_nm;
		this.total_amt = total_amt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.incmg_pers = incmg_pers;
		this.tax_number = tax_number;
		this.tax_number_start = tax_number_start;
		this.tax_number_end = tax_number_end;
		this.cmpy_ern = cmpy_ern;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssue_dt(String issue_dt){
		this.issue_dt = issue_dt;
	}

	public void setTrans_dt(String trans_dt){
		this.trans_dt = trans_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErn_nm(String ern_nm){
		this.ern_nm = ern_nm;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setTax_number(String tax_number){
		this.tax_number = tax_number;
	}

	public void setTax_number_start(String tax_number_start){
		this.tax_number_start = tax_number_start;
	}

	public void setTax_number_end(String tax_number_end){
		this.tax_number_end = tax_number_end;
	}
	
	public void setCmpy_ern(String cmpy_ern){
		this.cmpy_ern = cmpy_ern;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIssue_dt(){
		return this.issue_dt;
	}

	public String getTrans_dt(){
		return this.trans_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErn_nm(){
		return this.ern_nm;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getTax_number(){
		return this.tax_number;
	}

	public String getTax_number_start(){
		return this.tax_number_start;
	}

	public String getTax_number_end(){
		return this.tax_number_end;
	}
	
	public String getCmpy_ern(){
		return this.cmpy_ern;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6171_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6171_ADM dm = (FC_ACCT_6171_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tax_clsf);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.issue_dt);
		cstmt.setString(8, dm.trans_dt);
		cstmt.setString(9, dm.ern);
		cstmt.setString(10, dm.ern_nm);
		cstmt.setString(11, dm.total_amt);
		cstmt.setString(12, dm.suply_amt);
		cstmt.setString(13, dm.vat_amt);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.tax_number);
		cstmt.setString(16, dm.tax_number_start);
		cstmt.setString(17, dm.tax_number_end);
		cstmt.setString(18, dm.cmpy_ern);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6171_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tax_clsf = [" + getTax_clsf() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issue_dt = [" + getIssue_dt() + "]");
		System.out.println("trans_dt = [" + getTrans_dt() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("ern_nm = [" + getErn_nm() + "]");
		System.out.println("total_amt = [" + getTotal_amt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("tax_number = [" + getTax_number() + "]");
		System.out.println("tax_number_start = [" + getTax_number_start() + "]");
		System.out.println("tax_number_end = [" + getTax_number_end() + "]");
		System.out.println("cmpy_ern = [" + getCmpy_ern() + "]");
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
String tax_clsf = req.getParameter("tax_clsf");
if( tax_clsf == null){
	System.out.println(this.toString+" : tax_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_clsf is "+tax_clsf );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String issue_dt = req.getParameter("issue_dt");
if( issue_dt == null){
	System.out.println(this.toString+" : issue_dt is null" );
}else{
	System.out.println(this.toString+" : issue_dt is "+issue_dt );
}
String trans_dt = req.getParameter("trans_dt");
if( trans_dt == null){
	System.out.println(this.toString+" : trans_dt is null" );
}else{
	System.out.println(this.toString+" : trans_dt is "+trans_dt );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String ern_nm = req.getParameter("ern_nm");
if( ern_nm == null){
	System.out.println(this.toString+" : ern_nm is null" );
}else{
	System.out.println(this.toString+" : ern_nm is "+ern_nm );
}
String total_amt = req.getParameter("total_amt");
if( total_amt == null){
	System.out.println(this.toString+" : total_amt is null" );
}else{
	System.out.println(this.toString+" : total_amt is "+total_amt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String tax_number = req.getParameter("tax_number");
if( tax_number == null){
	System.out.println(this.toString+" : tax_number is null" );
}else{
	System.out.println(this.toString+" : tax_number is "+tax_number );
}
String tax_number_start = req.getParameter("tax_number_start");
if( tax_number_start == null){
	System.out.println(this.toString+" : tax_number_start is null" );
}else{
	System.out.println(this.toString+" : tax_number_start is "+tax_number_start );
}
String tax_number_end = req.getParameter("tax_number_end");
if( tax_number_end == null){
	System.out.println(this.toString+" : tax_number_end is null" );
}else{
	System.out.println(this.toString+" : tax_number_end is "+tax_number_end );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String issue_dt = Util.checkString(req.getParameter("issue_dt"));
String trans_dt = Util.checkString(req.getParameter("trans_dt"));
String ern = Util.checkString(req.getParameter("ern"));
String ern_nm = Util.checkString(req.getParameter("ern_nm"));
String total_amt = Util.checkString(req.getParameter("total_amt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String tax_number = Util.checkString(req.getParameter("tax_number"));
String tax_number_start = Util.checkString(req.getParameter("tax_number_start"));
String tax_number_end = Util.checkString(req.getParameter("tax_number_end"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tax_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issue_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issue_dt")));
String trans_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_dt")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String ern_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("ern_nm")));
String total_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("total_amt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String tax_number = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_number")));
String tax_number_start = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_number_start")));
String tax_number_end = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_number_end")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTax_clsf(tax_clsf);
dm.setMake_dt(make_dt);
dm.setSeq(seq);
dm.setIssue_dt(issue_dt);
dm.setTrans_dt(trans_dt);
dm.setErn(ern);
dm.setErn_nm(ern_nm);
dm.setTotal_amt(total_amt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setIncmg_pers(incmg_pers);
dm.setTax_number(tax_number);
dm.setTax_number_start(tax_number_start);
dm.setTax_number_end(tax_number_end);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 29 14:54:43 KST 2012 */