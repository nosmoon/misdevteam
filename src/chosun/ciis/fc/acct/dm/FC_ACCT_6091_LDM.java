/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계 - 부가세관리 - 세금계산서 조회
* 작성일자 : 2010-08-13
* 작성자 : 노상현
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
 * 재무회계 - 부가세관리 - 세금계산서 조회
 */


public class FC_ACCT_6091_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_dt_fr;
	public String fisc_dt_to;
	public String make_dt_fr;
	public String make_dt_to;
	public String prof_type_cd;
	public String slip_clsf_cd_fr;
	public String slip_clsf_cd_to;
	public String ern;
	public String erplace_cd;
	public String suply_amt_fr;
	public String suply_amt_to;
	public String vat_amt_fr;
	public String vat_amt_to;
	public String elec_tax_bill_yn;
	public String acct_cd;

	public FC_ACCT_6091_LDM(){}
	public FC_ACCT_6091_LDM(String cmpy_cd, String fisc_dt_fr, String fisc_dt_to, String make_dt_fr, String make_dt_to, String prof_type_cd, String slip_clsf_cd_fr, String slip_clsf_cd_to, String ern, String erplace_cd, String suply_amt_fr, String suply_amt_to, String vat_amt_fr, String vat_amt_to, String elec_tax_bill_yn, String acct_cd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_dt_fr = fisc_dt_fr;
		this.fisc_dt_to = fisc_dt_to;
		this.make_dt_fr = make_dt_fr;
		this.make_dt_to = make_dt_to;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd_fr = slip_clsf_cd_fr;
		this.slip_clsf_cd_to = slip_clsf_cd_to;
		this.ern = ern;
		this.erplace_cd = erplace_cd;
		this.suply_amt_fr = suply_amt_fr;
		this.suply_amt_to = suply_amt_to;
		this.vat_amt_fr = vat_amt_fr;
		this.vat_amt_to = vat_amt_to;
		this.elec_tax_bill_yn = elec_tax_bill_yn;
		this.acct_cd = acct_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_dt_fr(String fisc_dt_fr){
		this.fisc_dt_fr = fisc_dt_fr;
	}

	public void setFisc_dt_to(String fisc_dt_to){
		this.fisc_dt_to = fisc_dt_to;
	}

	public void setMake_dt_fr(String make_dt_fr){
		this.make_dt_fr = make_dt_fr;
	}

	public void setMake_dt_to(String make_dt_to){
		this.make_dt_to = make_dt_to;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd_fr(String slip_clsf_cd_fr){
		this.slip_clsf_cd_fr = slip_clsf_cd_fr;
	}

	public void setSlip_clsf_cd_to(String slip_clsf_cd_to){
		this.slip_clsf_cd_to = slip_clsf_cd_to;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setSuply_amt_fr(String suply_amt_fr){
		this.suply_amt_fr = suply_amt_fr;
	}

	public void setSuply_amt_to(String suply_amt_to){
		this.suply_amt_to = suply_amt_to;
	}

	public void setVat_amt_fr(String vat_amt_fr){
		this.vat_amt_fr = vat_amt_fr;
	}

	public void setVat_amt_to(String vat_amt_to){
		this.vat_amt_to = vat_amt_to;
	}

	public void setElec_tax_bill_yn(String elec_tax_bill_yn){
		this.elec_tax_bill_yn = elec_tax_bill_yn;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_dt_fr(){
		return this.fisc_dt_fr;
	}

	public String getFisc_dt_to(){
		return this.fisc_dt_to;
	}

	public String getMake_dt_fr(){
		return this.make_dt_fr;
	}

	public String getMake_dt_to(){
		return this.make_dt_to;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd_fr(){
		return this.slip_clsf_cd_fr;
	}

	public String getSlip_clsf_cd_to(){
		return this.slip_clsf_cd_to;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSuply_amt_fr(){
		return this.suply_amt_fr;
	}

	public String getSuply_amt_to(){
		return this.suply_amt_to;
	}

	public String getVat_amt_fr(){
		return this.vat_amt_fr;
	}

	public String getVat_amt_to(){
		return this.vat_amt_to;
	}

	public String getElec_tax_bill_yn(){
		return this.elec_tax_bill_yn;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6091_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6091_LDM dm = (FC_ACCT_6091_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_dt_fr);
		cstmt.setString(5, dm.fisc_dt_to);
		cstmt.setString(6, dm.make_dt_fr);
		cstmt.setString(7, dm.make_dt_to);
		cstmt.setString(8, dm.prof_type_cd);
		cstmt.setString(9, dm.slip_clsf_cd_fr);
		cstmt.setString(10, dm.slip_clsf_cd_to);
		cstmt.setString(11, dm.ern);
		cstmt.setString(12, dm.erplace_cd);
		cstmt.setString(13, dm.suply_amt_fr);
		cstmt.setString(14, dm.suply_amt_to);
		cstmt.setString(15, dm.vat_amt_fr);
		cstmt.setString(16, dm.vat_amt_to);
		cstmt.setString(17, dm.elec_tax_bill_yn);
		cstmt.setString(18, dm.acct_cd);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6091_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_dt_fr = [" + getFisc_dt_fr() + "]");
		System.out.println("fisc_dt_to = [" + getFisc_dt_to() + "]");
		System.out.println("make_dt_fr = [" + getMake_dt_fr() + "]");
		System.out.println("make_dt_to = [" + getMake_dt_to() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd_fr = [" + getSlip_clsf_cd_fr() + "]");
		System.out.println("slip_clsf_cd_to = [" + getSlip_clsf_cd_to() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("suply_amt_fr = [" + getSuply_amt_fr() + "]");
		System.out.println("suply_amt_to = [" + getSuply_amt_to() + "]");
		System.out.println("vat_amt_fr = [" + getVat_amt_fr() + "]");
		System.out.println("vat_amt_to = [" + getVat_amt_to() + "]");
		System.out.println("elec_tax_bill_yn = [" + getElec_tax_bill_yn() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
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
String fisc_dt_fr = req.getParameter("fisc_dt_fr");
if( fisc_dt_fr == null){
	System.out.println(this.toString+" : fisc_dt_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_fr is "+fisc_dt_fr );
}
String fisc_dt_to = req.getParameter("fisc_dt_to");
if( fisc_dt_to == null){
	System.out.println(this.toString+" : fisc_dt_to is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_to is "+fisc_dt_to );
}
String make_dt_fr = req.getParameter("make_dt_fr");
if( make_dt_fr == null){
	System.out.println(this.toString+" : make_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_dt_fr is "+make_dt_fr );
}
String make_dt_to = req.getParameter("make_dt_to");
if( make_dt_to == null){
	System.out.println(this.toString+" : make_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_dt_to is "+make_dt_to );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd_fr = req.getParameter("slip_clsf_cd_fr");
if( slip_clsf_cd_fr == null){
	System.out.println(this.toString+" : slip_clsf_cd_fr is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd_fr is "+slip_clsf_cd_fr );
}
String slip_clsf_cd_to = req.getParameter("slip_clsf_cd_to");
if( slip_clsf_cd_to == null){
	System.out.println(this.toString+" : slip_clsf_cd_to is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd_to is "+slip_clsf_cd_to );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String suply_amt_fr = req.getParameter("suply_amt_fr");
if( suply_amt_fr == null){
	System.out.println(this.toString+" : suply_amt_fr is null" );
}else{
	System.out.println(this.toString+" : suply_amt_fr is "+suply_amt_fr );
}
String suply_amt_to = req.getParameter("suply_amt_to");
if( suply_amt_to == null){
	System.out.println(this.toString+" : suply_amt_to is null" );
}else{
	System.out.println(this.toString+" : suply_amt_to is "+suply_amt_to );
}
String vat_amt_fr = req.getParameter("vat_amt_fr");
if( vat_amt_fr == null){
	System.out.println(this.toString+" : vat_amt_fr is null" );
}else{
	System.out.println(this.toString+" : vat_amt_fr is "+vat_amt_fr );
}
String vat_amt_to = req.getParameter("vat_amt_to");
if( vat_amt_to == null){
	System.out.println(this.toString+" : vat_amt_to is null" );
}else{
	System.out.println(this.toString+" : vat_amt_to is "+vat_amt_to );
}
String elec_tax_bill_yn = req.getParameter("elec_tax_bill_yn");
if( elec_tax_bill_yn == null){
	System.out.println(this.toString+" : elec_tax_bill_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_bill_yn is "+elec_tax_bill_yn );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
String fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
String make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
String make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd_fr = Util.checkString(req.getParameter("slip_clsf_cd_fr"));
String slip_clsf_cd_to = Util.checkString(req.getParameter("slip_clsf_cd_to"));
String ern = Util.checkString(req.getParameter("ern"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String suply_amt_fr = Util.checkString(req.getParameter("suply_amt_fr"));
String suply_amt_to = Util.checkString(req.getParameter("suply_amt_to"));
String vat_amt_fr = Util.checkString(req.getParameter("vat_amt_fr"));
String vat_amt_to = Util.checkString(req.getParameter("vat_amt_to"));
String elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_fr")));
String fisc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_to")));
String make_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_fr")));
String make_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_to")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd_fr")));
String slip_clsf_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd_to")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String suply_amt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt_fr")));
String suply_amt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt_to")));
String vat_amt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt_fr")));
String vat_amt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt_to")));
String elec_tax_bill_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_bill_yn")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_dt_fr(fisc_dt_fr);
dm.setFisc_dt_to(fisc_dt_to);
dm.setMake_dt_fr(make_dt_fr);
dm.setMake_dt_to(make_dt_to);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd_fr(slip_clsf_cd_fr);
dm.setSlip_clsf_cd_to(slip_clsf_cd_to);
dm.setErn(ern);
dm.setErplace_cd(erplace_cd);
dm.setSuply_amt_fr(suply_amt_fr);
dm.setSuply_amt_to(suply_amt_to);
dm.setVat_amt_fr(vat_amt_fr);
dm.setVat_amt_to(vat_amt_to);
dm.setElec_tax_bill_yn(elec_tax_bill_yn);
dm.setAcct_cd(acct_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 10 11:57:00 KST 2011 */