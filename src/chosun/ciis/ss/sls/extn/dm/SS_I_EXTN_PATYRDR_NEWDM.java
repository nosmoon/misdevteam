/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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
 * 
 */


public class SS_I_EXTN_PATYRDR_NEWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String uid;
	public String extndt;
	public String extnempseq;
	public String extnflnm;
	public String dept_nm;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String corrbocd;
	public String svccd;
	public String remk;
	public String qty;
	public String aplcpersnm;
	public String dlvhopedt;
	public String delyn;
	public String prn;

	public SS_I_EXTN_PATYRDR_NEWDM(){}
	public SS_I_EXTN_PATYRDR_NEWDM(String cmpycd, String uid, String extndt, String extnempseq, String extnflnm, String dept_nm, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String corrbocd, String svccd, String remk, String qty, String aplcpersnm, String dlvhopedt, String delyn, String prn){
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.extndt = extndt;
		this.extnempseq = extnempseq;
		this.extnflnm = extnflnm;
		this.dept_nm = dept_nm;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.corrbocd = corrbocd;
		this.svccd = svccd;
		this.remk = remk;
		this.qty = qty;
		this.aplcpersnm = aplcpersnm;
		this.dlvhopedt = dlvhopedt;
		this.delyn = delyn;
		this.prn = prn;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setExtnempseq(String extnempseq){
		this.extnempseq = extnempseq;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setSvccd(String svccd){
		this.svccd = svccd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setDelyn(String delyn){
		this.delyn = delyn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getExtnempseq(){
		return this.extnempseq;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getSvccd(){
		return this.svccd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getDelyn(){
		return this.delyn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_I_EXTN_PATYRDR_NEW(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_PATYRDR_NEWDM dm = (SS_I_EXTN_PATYRDR_NEWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.extndt);
		cstmt.setString(6, dm.extnempseq);
		cstmt.setString(7, dm.extnflnm);
		cstmt.setString(8, dm.dept_nm);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.rdrtel_no1);
		cstmt.setString(11, dm.rdrtel_no2);
		cstmt.setString(12, dm.rdrtel_no3);
		cstmt.setString(13, dm.rdrptph_no1);
		cstmt.setString(14, dm.rdrptph_no2);
		cstmt.setString(15, dm.rdrptph_no3);
		cstmt.setString(16, dm.dlvzip);
		cstmt.setString(17, dm.dlvaddr);
		cstmt.setString(18, dm.dlvdtlsaddr);
		cstmt.setString(19, dm.corrbocd);
		cstmt.setString(20, dm.svccd);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.qty);
		cstmt.setString(23, dm.aplcpersnm);
		cstmt.setString(24, dm.dlvhopedt);
		cstmt.setString(25, dm.delyn);
		cstmt.setString(26, dm.prn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_PATYRDR_NEWDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("extndt = [" + getExtndt() + "]");
		System.out.println("extnempseq = [" + getExtnempseq() + "]");
		System.out.println("extnflnm = [" + getExtnflnm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("rdrtel_no1 = [" + getRdrtel_no1() + "]");
		System.out.println("rdrtel_no2 = [" + getRdrtel_no2() + "]");
		System.out.println("rdrtel_no3 = [" + getRdrtel_no3() + "]");
		System.out.println("rdrptph_no1 = [" + getRdrptph_no1() + "]");
		System.out.println("rdrptph_no2 = [" + getRdrptph_no2() + "]");
		System.out.println("rdrptph_no3 = [" + getRdrptph_no3() + "]");
		System.out.println("dlvzip = [" + getDlvzip() + "]");
		System.out.println("dlvaddr = [" + getDlvaddr() + "]");
		System.out.println("dlvdtlsaddr = [" + getDlvdtlsaddr() + "]");
		System.out.println("corrbocd = [" + getCorrbocd() + "]");
		System.out.println("svccd = [" + getSvccd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("aplcpersnm = [" + getAplcpersnm() + "]");
		System.out.println("dlvhopedt = [" + getDlvhopedt() + "]");
		System.out.println("delyn = [" + getDelyn() + "]");
		System.out.println("prn = [" + getPrn() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String extndt = req.getParameter("extndt");
if( extndt == null){
	System.out.println(this.toString+" : extndt is null" );
}else{
	System.out.println(this.toString+" : extndt is "+extndt );
}
String extnempseq = req.getParameter("extnempseq");
if( extnempseq == null){
	System.out.println(this.toString+" : extnempseq is null" );
}else{
	System.out.println(this.toString+" : extnempseq is "+extnempseq );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel_no1 = req.getParameter("rdrtel_no1");
if( rdrtel_no1 == null){
	System.out.println(this.toString+" : rdrtel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no1 is "+rdrtel_no1 );
}
String rdrtel_no2 = req.getParameter("rdrtel_no2");
if( rdrtel_no2 == null){
	System.out.println(this.toString+" : rdrtel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no2 is "+rdrtel_no2 );
}
String rdrtel_no3 = req.getParameter("rdrtel_no3");
if( rdrtel_no3 == null){
	System.out.println(this.toString+" : rdrtel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no3 is "+rdrtel_no3 );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String rdrptph_no2 = req.getParameter("rdrptph_no2");
if( rdrptph_no2 == null){
	System.out.println(this.toString+" : rdrptph_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no2 is "+rdrptph_no2 );
}
String rdrptph_no3 = req.getParameter("rdrptph_no3");
if( rdrptph_no3 == null){
	System.out.println(this.toString+" : rdrptph_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no3 is "+rdrptph_no3 );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String corrbocd = req.getParameter("corrbocd");
if( corrbocd == null){
	System.out.println(this.toString+" : corrbocd is null" );
}else{
	System.out.println(this.toString+" : corrbocd is "+corrbocd );
}
String svccd = req.getParameter("svccd");
if( svccd == null){
	System.out.println(this.toString+" : svccd is null" );
}else{
	System.out.println(this.toString+" : svccd is "+svccd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String aplcpersnm = req.getParameter("aplcpersnm");
if( aplcpersnm == null){
	System.out.println(this.toString+" : aplcpersnm is null" );
}else{
	System.out.println(this.toString+" : aplcpersnm is "+aplcpersnm );
}
String dlvhopedt = req.getParameter("dlvhopedt");
if( dlvhopedt == null){
	System.out.println(this.toString+" : dlvhopedt is null" );
}else{
	System.out.println(this.toString+" : dlvhopedt is "+dlvhopedt );
}
String delyn = req.getParameter("delyn");
if( delyn == null){
	System.out.println(this.toString+" : delyn is null" );
}else{
	System.out.println(this.toString+" : delyn is "+delyn );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String uid = Util.checkString(req.getParameter("uid"));
String extndt = Util.checkString(req.getParameter("extndt"));
String extnempseq = Util.checkString(req.getParameter("extnempseq"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String corrbocd = Util.checkString(req.getParameter("corrbocd"));
String svccd = Util.checkString(req.getParameter("svccd"));
String remk = Util.checkString(req.getParameter("remk"));
String qty = Util.checkString(req.getParameter("qty"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String dlvhopedt = Util.checkString(req.getParameter("dlvhopedt"));
String delyn = Util.checkString(req.getParameter("delyn"));
String prn = Util.checkString(req.getParameter("prn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
String extnempseq = Util.Uni2Ksc(Util.checkString(req.getParameter("extnempseq")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
String svccd = Util.Uni2Ksc(Util.checkString(req.getParameter("svccd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
String delyn = Util.Uni2Ksc(Util.checkString(req.getParameter("delyn")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setExtndt(extndt);
dm.setExtnempseq(extnempseq);
dm.setExtnflnm(extnflnm);
dm.setDept_nm(dept_nm);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setCorrbocd(corrbocd);
dm.setSvccd(svccd);
dm.setRemk(remk);
dm.setQty(qty);
dm.setAplcpersnm(aplcpersnm);
dm.setDlvhopedt(dlvhopedt);
dm.setDelyn(delyn);
dm.setPrn(prn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 17:34:49 KST 2012 */