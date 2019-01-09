/***************************************************************************************************
* 파일명 : SS_A_PROMSTAF_CYEXTNDM.java
* 기능 : 확장현황-사이버확장-요원관리-등록, 수정, 삭제
* 작성일자 : 2004-03-29
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-요원관리-등록, 수정, 삭제
 *
 */

public class SS_A_PROMSTAF_CYEXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String stafno;
	public String prn;
	public String stafnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String remk;
	public String onlmembid;
	public String onlmembseq;
	public String in_cmpydt;

	public SS_A_PROMSTAF_CYEXTNDM(){}
	public SS_A_PROMSTAF_CYEXTNDM(String accflag, String incmgpers, String stafno, String prn, String stafnm, String zip, String addr, String dtlsaddr, String tel_no1, String tel_no2, String tel_no3, String ptph_no1, String ptph_no2, String ptph_no3, String email, String acctno, String acctbank, String acctdeps_pers, String remk, String onlmembid, String onlmembseq, String in_cmpydt){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.stafno = stafno;
		this.prn = prn;
		this.stafnm = stafnm;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.email = email;
		this.acctno = acctno;
		this.acctbank = acctbank;
		this.acctdeps_pers = acctdeps_pers;
		this.remk = remk;
		this.onlmembid = onlmembid;
		this.onlmembseq = onlmembseq;
		this.in_cmpydt = in_cmpydt;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setOnlmembseq(String onlmembseq){
		this.onlmembseq = onlmembseq;
	}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getOnlmembseq(){
		return this.onlmembseq;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_PROMSTAF_CYEXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_PROMSTAF_CYEXTNDM dm = (SS_A_PROMSTAF_CYEXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.stafno);
		cstmt.setString(6, dm.prn);
		cstmt.setString(7, dm.stafnm);
		cstmt.setString(8, dm.zip);
		cstmt.setString(9, dm.addr);
		cstmt.setString(10, dm.dtlsaddr);
		cstmt.setString(11, dm.tel_no1);
		cstmt.setString(12, dm.tel_no2);
		cstmt.setString(13, dm.tel_no3);
		cstmt.setString(14, dm.ptph_no1);
		cstmt.setString(15, dm.ptph_no2);
		cstmt.setString(16, dm.ptph_no3);
		cstmt.setString(17, dm.email);
		cstmt.setString(18, dm.acctno);
		cstmt.setString(19, dm.acctbank);
		cstmt.setString(20, dm.acctdeps_pers);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.onlmembid);
		cstmt.setString(23, dm.onlmembseq);
		cstmt.setString(24, dm.in_cmpydt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_PROMSTAF_CYEXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtlsaddr = req.getParameter("dtlsaddr");
if( dtlsaddr == null){
	System.out.println(this.toString+" : dtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dtlsaddr is "+dtlsaddr );
}
String tel_no1 = req.getParameter("tel_no1");
if( tel_no1 == null){
	System.out.println(this.toString+" : tel_no1 is null" );
}else{
	System.out.println(this.toString+" : tel_no1 is "+tel_no1 );
}
String tel_no2 = req.getParameter("tel_no2");
if( tel_no2 == null){
	System.out.println(this.toString+" : tel_no2 is null" );
}else{
	System.out.println(this.toString+" : tel_no2 is "+tel_no2 );
}
String tel_no3 = req.getParameter("tel_no3");
if( tel_no3 == null){
	System.out.println(this.toString+" : tel_no3 is null" );
}else{
	System.out.println(this.toString+" : tel_no3 is "+tel_no3 );
}
String ptph_no1 = req.getParameter("ptph_no1");
if( ptph_no1 == null){
	System.out.println(this.toString+" : ptph_no1 is null" );
}else{
	System.out.println(this.toString+" : ptph_no1 is "+ptph_no1 );
}
String ptph_no2 = req.getParameter("ptph_no2");
if( ptph_no2 == null){
	System.out.println(this.toString+" : ptph_no2 is null" );
}else{
	System.out.println(this.toString+" : ptph_no2 is "+ptph_no2 );
}
String ptph_no3 = req.getParameter("ptph_no3");
if( ptph_no3 == null){
	System.out.println(this.toString+" : ptph_no3 is null" );
}else{
	System.out.println(this.toString+" : ptph_no3 is "+ptph_no3 );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String acctbank = req.getParameter("acctbank");
if( acctbank == null){
	System.out.println(this.toString+" : acctbank is null" );
}else{
	System.out.println(this.toString+" : acctbank is "+acctbank );
}
String acctdeps_pers = req.getParameter("acctdeps_pers");
if( acctdeps_pers == null){
	System.out.println(this.toString+" : acctdeps_pers is null" );
}else{
	System.out.println(this.toString+" : acctdeps_pers is "+acctdeps_pers );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String onlmembid = req.getParameter("onlmembid");
if( onlmembid == null){
	System.out.println(this.toString+" : onlmembid is null" );
}else{
	System.out.println(this.toString+" : onlmembid is "+onlmembid );
}
String onlmembseq = req.getParameter("onlmembseq");
if( onlmembseq == null){
	System.out.println(this.toString+" : onlmembseq is null" );
}else{
	System.out.println(this.toString+" : onlmembseq is "+onlmembseq );
}
String in_cmpydt = req.getParameter("in_cmpydt");
if( in_cmpydt == null){
	System.out.println(this.toString+" : in_cmpydt is null" );
}else{
	System.out.println(this.toString+" : in_cmpydt is "+in_cmpydt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String stafno = Util.checkString(req.getParameter("stafno"));
String prn = Util.checkString(req.getParameter("prn"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String tel_no1 = Util.checkString(req.getParameter("tel_no1"));
String tel_no2 = Util.checkString(req.getParameter("tel_no2"));
String tel_no3 = Util.checkString(req.getParameter("tel_no3"));
String ptph_no1 = Util.checkString(req.getParameter("ptph_no1"));
String ptph_no2 = Util.checkString(req.getParameter("ptph_no2"));
String ptph_no3 = Util.checkString(req.getParameter("ptph_no3"));
String email = Util.checkString(req.getParameter("email"));
String acctno = Util.checkString(req.getParameter("acctno"));
String acctbank = Util.checkString(req.getParameter("acctbank"));
String acctdeps_pers = Util.checkString(req.getParameter("acctdeps_pers"));
String remk = Util.checkString(req.getParameter("remk"));
String onlmembid = Util.checkString(req.getParameter("onlmembid"));
String onlmembseq = Util.checkString(req.getParameter("onlmembseq"));
String in_cmpydt = Util.checkString(req.getParameter("in_cmpydt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String tel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no1")));
String tel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no2")));
String tel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no3")));
String ptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no1")));
String ptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no2")));
String ptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no3")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String acctbank = Util.Uni2Ksc(Util.checkString(req.getParameter("acctbank")));
String acctdeps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acctdeps_pers")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String onlmembid = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembid")));
String onlmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembseq")));
String in_cmpydt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpydt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setStafno(stafno);
dm.setPrn(prn);
dm.setStafnm(stafnm);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setTel_no1(tel_no1);
dm.setTel_no2(tel_no2);
dm.setTel_no3(tel_no3);
dm.setPtph_no1(ptph_no1);
dm.setPtph_no2(ptph_no2);
dm.setPtph_no3(ptph_no3);
dm.setEmail(email);
dm.setAcctno(acctno);
dm.setAcctbank(acctbank);
dm.setAcctdeps_pers(acctdeps_pers);
dm.setRemk(remk);
dm.setOnlmembid(onlmembid);
dm.setOnlmembseq(onlmembseq);
dm.setIn_cmpydt(in_cmpydt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 13 21:42:41 KST 2004 */