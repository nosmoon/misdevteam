/***************************************************************************************************
* 파일명 :PS_A_PAYADV.java
* 기능 : 가지급금 상세 입력/수정
* 작성일자 : 2004-04-10
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 출판국 - 가지급금 상세 입력/수정
 *
 */

public class PS_A_PAYADVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String supp_yymm;
	public String boemp_no;
	public long tel_charge;
	public long resp_subs;
	public long subs_susp;
	public long pay_adv;
	public long mutu_aid;
	public long loan;
	public long loan_interest;
	public long subs_sum;
	public String remk;
	public String incmgpers;
	public long etc1;
	public long etc2;
	public long etc3;
	public long etc4;

	public PS_A_PAYADVDM(){}
	public PS_A_PAYADVDM(String cmpycd, String bocd, String supp_yymm, String boemp_no, long tel_charge, long resp_subs, long subs_susp, long pay_adv, long mutu_aid, long loan, long loan_interest, long subs_sum, String remk, String incmgpers, long etc1, long etc2, long etc3, long etc4){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.supp_yymm = supp_yymm;
		this.boemp_no = boemp_no;
		this.tel_charge = tel_charge;
		this.resp_subs = resp_subs;
		this.subs_susp = subs_susp;
		this.pay_adv = pay_adv;
		this.mutu_aid = mutu_aid;
		this.loan = loan;
		this.loan_interest = loan_interest;
		this.subs_sum = subs_sum;
		this.remk = remk;
		this.incmgpers = incmgpers;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
		this.etc4 = etc4;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSupp_yymm(String supp_yymm){
		this.supp_yymm = supp_yymm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setTel_charge(long tel_charge){
		this.tel_charge = tel_charge;
	}

	public void setResp_subs(long resp_subs){
		this.resp_subs = resp_subs;
	}

	public void setSubs_susp(long subs_susp){
		this.subs_susp = subs_susp;
	}

	public void setPay_adv(long pay_adv){
		this.pay_adv = pay_adv;
	}

	public void setMutu_aid(long mutu_aid){
		this.mutu_aid = mutu_aid;
	}

	public void setLoan(long loan){
		this.loan = loan;
	}

	public void setLoan_interest(long loan_interest){
		this.loan_interest = loan_interest;
	}

	public void setSubs_sum(long subs_sum){
		this.subs_sum = subs_sum;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setEtc1(long etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(long etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(long etc3){
		this.etc3 = etc3;
	}

	public void setEtc4(long etc4){
		this.etc4 = etc4;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSupp_yymm(){
		return this.supp_yymm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public long getTel_charge(){
		return this.tel_charge;
	}

	public long getResp_subs(){
		return this.resp_subs;
	}

	public long getSubs_susp(){
		return this.subs_susp;
	}

	public long getPay_adv(){
		return this.pay_adv;
	}

	public long getMutu_aid(){
		return this.mutu_aid;
	}

	public long getLoan(){
		return this.loan;
	}

	public long getLoan_interest(){
		return this.loan_interest;
	}

	public long getSubs_sum(){
		return this.subs_sum;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public long getEtc1(){
		return this.etc1;
	}

	public long getEtc2(){
		return this.etc2;
	}

	public long getEtc3(){
		return this.etc3;
	}

	public long getEtc4(){
		return this.etc4;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_PAYADV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_PAYADVDM dm = (PS_A_PAYADVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.supp_yymm);
		cstmt.setString(6, dm.boemp_no);
		cstmt.setLong(7, dm.tel_charge);
		cstmt.setLong(8, dm.resp_subs);
		cstmt.setLong(9, dm.subs_susp);
		cstmt.setLong(10, dm.pay_adv);
		cstmt.setLong(11, dm.mutu_aid);
		cstmt.setLong(12, dm.loan);
		cstmt.setLong(13, dm.loan_interest);
		cstmt.setLong(14, dm.subs_sum);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.incmgpers);
		cstmt.setLong(17, dm.etc1);
		cstmt.setLong(18, dm.etc2);
		cstmt.setLong(19, dm.etc3);
		cstmt.setLong(20, dm.etc4);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_PAYADVDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String supp_yymm = req.getParameter("supp_yymm");
if( supp_yymm == null){
	System.out.println(this.toString+" : supp_yymm is null" );
}else{
	System.out.println(this.toString+" : supp_yymm is "+supp_yymm );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String tel_charge = req.getParameter("tel_charge");
if( tel_charge == null){
	System.out.println(this.toString+" : tel_charge is null" );
}else{
	System.out.println(this.toString+" : tel_charge is "+tel_charge );
}
String resp_subs = req.getParameter("resp_subs");
if( resp_subs == null){
	System.out.println(this.toString+" : resp_subs is null" );
}else{
	System.out.println(this.toString+" : resp_subs is "+resp_subs );
}
String subs_susp = req.getParameter("subs_susp");
if( subs_susp == null){
	System.out.println(this.toString+" : subs_susp is null" );
}else{
	System.out.println(this.toString+" : subs_susp is "+subs_susp );
}
String pay_adv = req.getParameter("pay_adv");
if( pay_adv == null){
	System.out.println(this.toString+" : pay_adv is null" );
}else{
	System.out.println(this.toString+" : pay_adv is "+pay_adv );
}
String mutu_aid = req.getParameter("mutu_aid");
if( mutu_aid == null){
	System.out.println(this.toString+" : mutu_aid is null" );
}else{
	System.out.println(this.toString+" : mutu_aid is "+mutu_aid );
}
String loan = req.getParameter("loan");
if( loan == null){
	System.out.println(this.toString+" : loan is null" );
}else{
	System.out.println(this.toString+" : loan is "+loan );
}
String loan_interest = req.getParameter("loan_interest");
if( loan_interest == null){
	System.out.println(this.toString+" : loan_interest is null" );
}else{
	System.out.println(this.toString+" : loan_interest is "+loan_interest );
}
String subs_sum = req.getParameter("subs_sum");
if( subs_sum == null){
	System.out.println(this.toString+" : subs_sum is null" );
}else{
	System.out.println(this.toString+" : subs_sum is "+subs_sum );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
}
String etc4 = req.getParameter("etc4");
if( etc4 == null){
	System.out.println(this.toString+" : etc4 is null" );
}else{
	System.out.println(this.toString+" : etc4 is "+etc4 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String tel_charge = Util.checkString(req.getParameter("tel_charge"));
String resp_subs = Util.checkString(req.getParameter("resp_subs"));
String subs_susp = Util.checkString(req.getParameter("subs_susp"));
String pay_adv = Util.checkString(req.getParameter("pay_adv"));
String mutu_aid = Util.checkString(req.getParameter("mutu_aid"));
String loan = Util.checkString(req.getParameter("loan"));
String loan_interest = Util.checkString(req.getParameter("loan_interest"));
String subs_sum = Util.checkString(req.getParameter("subs_sum"));
String remk = Util.checkString(req.getParameter("remk"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
String etc4 = Util.checkString(req.getParameter("etc4"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String supp_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("supp_yymm")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String tel_charge = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_charge")));
String resp_subs = Util.Uni2Ksc(Util.checkString(req.getParameter("resp_subs")));
String subs_susp = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_susp")));
String pay_adv = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_adv")));
String mutu_aid = Util.Uni2Ksc(Util.checkString(req.getParameter("mutu_aid")));
String loan = Util.Uni2Ksc(Util.checkString(req.getParameter("loan")));
String loan_interest = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_interest")));
String subs_sum = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_sum")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
String etc4 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc4")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setSupp_yymm(supp_yymm);
dm.setBoemp_no(boemp_no);
dm.setTel_charge(tel_charge);
dm.setResp_subs(resp_subs);
dm.setSubs_susp(subs_susp);
dm.setPay_adv(pay_adv);
dm.setMutu_aid(mutu_aid);
dm.setLoan(loan);
dm.setLoan_interest(loan_interest);
dm.setSubs_sum(subs_sum);
dm.setRemk(remk);
dm.setIncmgpers(incmgpers);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
dm.setEtc4(etc4);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 13 12:04:39 KST 2007 */