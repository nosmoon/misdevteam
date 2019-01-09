/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자관리 비독자관리 수정 
* 작성일자 : 2009/09/25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자관리 비독자관리 수정
 */

public class SS_U_RDR_MNGMEMBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String cmpycd;
	public String custclas;
	public String custclas2;
	public String area;
	public String custseq;
	public String clsf;
	public String regdt;
	public String custnm;
	public String sex;
	public String age;
	public String email;
	public String home_zip;
	public String home_addr;
	public String rdrptph_no1;
	public String medinm;
	public String subs_prd;
	public String evntdate_from;
	public String evntdate_to;
	public String chrn_pre;
	public String chrn_emy;
	public String chrn_mid;
	public String chrn_hig;

	public SS_U_RDR_MNGMEMBDM(){}
	public SS_U_RDR_MNGMEMBDM(String uid, String cmpycd, String custclas, String custclas2, String area, String custseq, String clsf, String regdt, String custnm, String sex, String age, String email, String home_zip, String home_addr, String rdrptph_no1, String medinm, String subs_prd, String evntdate_from, String evntdate_to, String chrn_pre, String chrn_emy, String chrn_mid, String chrn_hig){
		this.uid = uid;
		this.cmpycd = cmpycd;
		this.custclas = custclas;
		this.custclas2 = custclas2;
		this.area = area;
		this.custseq = custseq;
		this.clsf = clsf;
		this.regdt = regdt;
		this.custnm = custnm;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.home_zip = home_zip;
		this.home_addr = home_addr;
		this.rdrptph_no1 = rdrptph_no1;
		this.medinm = medinm;
		this.subs_prd = subs_prd;
		this.evntdate_from = evntdate_from;
		this.evntdate_to = evntdate_to;
		this.chrn_pre = chrn_pre;
		this.chrn_emy = chrn_emy;
		this.chrn_mid = chrn_mid;
		this.chrn_hig = chrn_hig;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCustclas(String custclas){
		this.custclas = custclas;
	}

	public void setCustclas2(String custclas2){
		this.custclas2 = custclas2;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setCustseq(String custseq){
		this.custseq = custseq;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setCustnm(String custnm){
		this.custnm = custnm;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setHome_zip(String home_zip){
		this.home_zip = home_zip;
	}

	public void setHome_addr(String home_addr){
		this.home_addr = home_addr;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubs_prd(String subs_prd){
		this.subs_prd = subs_prd;
	}

	public void setEvntdate_from(String evntdate_from){
		this.evntdate_from = evntdate_from;
	}

	public void setEvntdate_to(String evntdate_to){
		this.evntdate_to = evntdate_to;
	}

	public void setChrn_pre(String chrn_pre){
		this.chrn_pre = chrn_pre;
	}

	public void setChrn_emy(String chrn_emy){
		this.chrn_emy = chrn_emy;
	}

	public void setChrn_mid(String chrn_mid){
		this.chrn_mid = chrn_mid;
	}

	public void setChrn_hig(String chrn_hig){
		this.chrn_hig = chrn_hig;
	}

	public String getUid(){
		return this.uid;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCustclas(){
		return this.custclas;
	}

	public String getCustclas2(){
		return this.custclas2;
	}

	public String getArea(){
		return this.area;
	}

	public String getCustseq(){
		return this.custseq;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getCustnm(){
		return this.custnm;
	}

	public String getSex(){
		return this.sex;
	}

	public String getAge(){
		return this.age;
	}

	public String getEmail(){
		return this.email;
	}

	public String getHome_zip(){
		return this.home_zip;
	}

	public String getHome_addr(){
		return this.home_addr;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubs_prd(){
		return this.subs_prd;
	}

	public String getEvntdate_from(){
		return this.evntdate_from;
	}

	public String getEvntdate_to(){
		return this.evntdate_to;
	}

	public String getChrn_pre(){
		return this.chrn_pre;
	}

	public String getChrn_emy(){
		return this.chrn_emy;
	}

	public String getChrn_mid(){
		return this.chrn_mid;
	}

	public String getChrn_hig(){
		return this.chrn_hig;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_RDR_MNGMEMB( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_RDR_MNGMEMBDM dm = (SS_U_RDR_MNGMEMBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.custclas);
		cstmt.setString(6, dm.custclas2);
		cstmt.setString(7, dm.area);
		cstmt.setString(8, dm.custseq);
		cstmt.setString(9, dm.clsf);
		cstmt.setString(10, dm.regdt);
		cstmt.setString(11, dm.custnm);
		cstmt.setString(12, dm.sex);
		cstmt.setString(13, dm.age);
		cstmt.setString(14, dm.email);
		cstmt.setString(15, dm.home_zip);
		cstmt.setString(16, dm.home_addr);
		cstmt.setString(17, dm.rdrptph_no1);
		cstmt.setString(18, dm.medinm);
		cstmt.setString(19, dm.subs_prd);
		cstmt.setString(20, dm.evntdate_from);
		cstmt.setString(21, dm.evntdate_to);
		cstmt.setString(22, dm.chrn_pre);
		cstmt.setString(23, dm.chrn_emy);
		cstmt.setString(24, dm.chrn_mid);
		cstmt.setString(25, dm.chrn_hig);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_U_RDR_MNGMEMBDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String custclas = req.getParameter("custclas");
if( custclas == null){
	System.out.println(this.toString+" : custclas is null" );
}else{
	System.out.println(this.toString+" : custclas is "+custclas );
}
String custclas2 = req.getParameter("custclas2");
if( custclas2 == null){
	System.out.println(this.toString+" : custclas2 is null" );
}else{
	System.out.println(this.toString+" : custclas2 is "+custclas2 );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String custseq = req.getParameter("custseq");
if( custseq == null){
	System.out.println(this.toString+" : custseq is null" );
}else{
	System.out.println(this.toString+" : custseq is "+custseq );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String custnm = req.getParameter("custnm");
if( custnm == null){
	System.out.println(this.toString+" : custnm is null" );
}else{
	System.out.println(this.toString+" : custnm is "+custnm );
}
String sex = req.getParameter("sex");
if( sex == null){
	System.out.println(this.toString+" : sex is null" );
}else{
	System.out.println(this.toString+" : sex is "+sex );
}
String age = req.getParameter("age");
if( age == null){
	System.out.println(this.toString+" : age is null" );
}else{
	System.out.println(this.toString+" : age is "+age );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String home_zip = req.getParameter("home_zip");
if( home_zip == null){
	System.out.println(this.toString+" : home_zip is null" );
}else{
	System.out.println(this.toString+" : home_zip is "+home_zip );
}
String home_addr = req.getParameter("home_addr");
if( home_addr == null){
	System.out.println(this.toString+" : home_addr is null" );
}else{
	System.out.println(this.toString+" : home_addr is "+home_addr );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String medinm = req.getParameter("medinm");
if( medinm == null){
	System.out.println(this.toString+" : medinm is null" );
}else{
	System.out.println(this.toString+" : medinm is "+medinm );
}
String subs_prd = req.getParameter("subs_prd");
if( subs_prd == null){
	System.out.println(this.toString+" : subs_prd is null" );
}else{
	System.out.println(this.toString+" : subs_prd is "+subs_prd );
}
String evntdate_from = req.getParameter("evntdate_from");
if( evntdate_from == null){
	System.out.println(this.toString+" : evntdate_from is null" );
}else{
	System.out.println(this.toString+" : evntdate_from is "+evntdate_from );
}
String evntdate_to = req.getParameter("evntdate_to");
if( evntdate_to == null){
	System.out.println(this.toString+" : evntdate_to is null" );
}else{
	System.out.println(this.toString+" : evntdate_to is "+evntdate_to );
}
String chrn_pre = req.getParameter("chrn_pre");
if( chrn_pre == null){
	System.out.println(this.toString+" : chrn_pre is null" );
}else{
	System.out.println(this.toString+" : chrn_pre is "+chrn_pre );
}
String chrn_emy = req.getParameter("chrn_emy");
if( chrn_emy == null){
	System.out.println(this.toString+" : chrn_emy is null" );
}else{
	System.out.println(this.toString+" : chrn_emy is "+chrn_emy );
}
String chrn_mid = req.getParameter("chrn_mid");
if( chrn_mid == null){
	System.out.println(this.toString+" : chrn_mid is null" );
}else{
	System.out.println(this.toString+" : chrn_mid is "+chrn_mid );
}
String chrn_hig = req.getParameter("chrn_hig");
if( chrn_hig == null){
	System.out.println(this.toString+" : chrn_hig is null" );
}else{
	System.out.println(this.toString+" : chrn_hig is "+chrn_hig );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String custclas = Util.checkString(req.getParameter("custclas"));
String custclas2 = Util.checkString(req.getParameter("custclas2"));
String area = Util.checkString(req.getParameter("area"));
String custseq = Util.checkString(req.getParameter("custseq"));
String clsf = Util.checkString(req.getParameter("clsf"));
String regdt = Util.checkString(req.getParameter("regdt"));
String custnm = Util.checkString(req.getParameter("custnm"));
String sex = Util.checkString(req.getParameter("sex"));
String age = Util.checkString(req.getParameter("age"));
String email = Util.checkString(req.getParameter("email"));
String home_zip = Util.checkString(req.getParameter("home_zip"));
String home_addr = Util.checkString(req.getParameter("home_addr"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String medinm = Util.checkString(req.getParameter("medinm"));
String subs_prd = Util.checkString(req.getParameter("subs_prd"));
String evntdate_from = Util.checkString(req.getParameter("evntdate_from"));
String evntdate_to = Util.checkString(req.getParameter("evntdate_to"));
String chrn_pre = Util.checkString(req.getParameter("chrn_pre"));
String chrn_emy = Util.checkString(req.getParameter("chrn_emy"));
String chrn_mid = Util.checkString(req.getParameter("chrn_mid"));
String chrn_hig = Util.checkString(req.getParameter("chrn_hig"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
String custclas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas2")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String home_zip = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip")));
String home_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("home_addr")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String medinm = Util.Uni2Ksc(Util.checkString(req.getParameter("medinm")));
String subs_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_prd")));
String evntdate_from = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_from")));
String evntdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_to")));
String chrn_pre = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_pre")));
String chrn_emy = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_emy")));
String chrn_mid = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_mid")));
String chrn_hig = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_hig")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setCmpycd(cmpycd);
dm.setCustclas(custclas);
dm.setCustclas2(custclas2);
dm.setArea(area);
dm.setCustseq(custseq);
dm.setClsf(clsf);
dm.setRegdt(regdt);
dm.setCustnm(custnm);
dm.setSex(sex);
dm.setAge(age);
dm.setEmail(email);
dm.setHome_zip(home_zip);
dm.setHome_addr(home_addr);
dm.setRdrptph_no1(rdrptph_no1);
dm.setMedinm(medinm);
dm.setSubs_prd(subs_prd);
dm.setEvntdate_from(evntdate_from);
dm.setEvntdate_to(evntdate_to);
dm.setChrn_pre(chrn_pre);
dm.setChrn_emy(chrn_emy);
dm.setChrn_mid(chrn_mid);
dm.setChrn_hig(chrn_hig);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 15:54:43 KST 2009 */