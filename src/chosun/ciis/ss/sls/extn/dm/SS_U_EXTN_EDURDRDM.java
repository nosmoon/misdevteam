/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 저장  
* 작성일자 : 2009-05-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 에듀/제휴 확장 저장  
 */

public class SS_U_EXTN_EDURDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String cmpycd;
	public String insttcd;
	public String seq;
	public String rdr_extndt;
	public String rdr_extnno;
	public String bocd;
	public String protpersnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String procstat;
	public String remk;

	public SS_U_EXTN_EDURDRDM(){}
	public SS_U_EXTN_EDURDRDM(String uid, String cmpycd, String insttcd, String seq, String rdr_extndt, String rdr_extnno, String bocd, String protpersnm, String zip, String addr, String dtlsaddr, String procstat, String remk){
		this.uid = uid;
		this.cmpycd = cmpycd;
		this.insttcd = insttcd;
		this.seq = seq;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.bocd = bocd;
		this.protpersnm = protpersnm;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.procstat = procstat;
		this.remk = remk;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setProtpersnm(String protpersnm){
		this.protpersnm = protpersnm;
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

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getUid(){
		return this.uid;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getProtpersnm(){
		return this.protpersnm;
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

	public String getProcstat(){
		return this.procstat;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EXTN_EDURDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EXTN_EDURDRDM dm = (SS_U_EXTN_EDURDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.insttcd);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.rdr_extndt);
		cstmt.setString(8, dm.rdr_extnno);
		cstmt.setString(9, dm.bocd);
		cstmt.setString(10, dm.protpersnm);
		cstmt.setString(11, dm.zip);
		cstmt.setString(12, dm.addr);
		cstmt.setString(13, dm.dtlsaddr);
		cstmt.setString(14, dm.procstat);
		cstmt.setString(15, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_EXTN_EDURDRDataSet();
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
String insttcd = req.getParameter("insttcd");
if( insttcd == null){
	System.out.println(this.toString+" : insttcd is null" );
}else{
	System.out.println(this.toString+" : insttcd is "+insttcd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String protpersnm = req.getParameter("protpersnm");
if( protpersnm == null){
	System.out.println(this.toString+" : protpersnm is null" );
}else{
	System.out.println(this.toString+" : protpersnm is "+protpersnm );
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
String procstat = req.getParameter("procstat");
if( procstat == null){
	System.out.println(this.toString+" : procstat is null" );
}else{
	System.out.println(this.toString+" : procstat is "+procstat );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String insttcd = Util.checkString(req.getParameter("insttcd"));
String seq = Util.checkString(req.getParameter("seq"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String bocd = Util.checkString(req.getParameter("bocd"));
String protpersnm = Util.checkString(req.getParameter("protpersnm"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String procstat = Util.checkString(req.getParameter("procstat"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String protpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("protpersnm")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setCmpycd(cmpycd);
dm.setInsttcd(insttcd);
dm.setSeq(seq);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setBocd(bocd);
dm.setProtpersnm(protpersnm);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setProcstat(procstat);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 14:07:39 KST 2009 */