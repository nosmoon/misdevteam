/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-에듀/제휴확장 기관 등록 
* 작성일자 : 2009-05-26
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
 * 확장현황-에듀/제휴확장 기관 등록 
 */

public class SS_I_EXTN_EDUINSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String uid;
	public String edutype;
	public String insttnm;
	public String ldgrnm;
	public String tel_no;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String cntrbgndd;
	public String cntrto_dd;
	public String rdr_extndd;
	public String bocd;
	public String subsuprc;
	public String bns_itemuprc;
	public String comsuprc;
	public String remk;

	public SS_I_EXTN_EDUINSTDM(){}
	public SS_I_EXTN_EDUINSTDM(String cmpycd, String uid, String edutype, String insttnm, String ldgrnm, String tel_no, String zip, String addr, String dtlsaddr, String cntrbgndd, String cntrto_dd, String rdr_extndd, String bocd, String subsuprc, String bns_itemuprc, String comsuprc, String remk){
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.edutype = edutype;
		this.insttnm = insttnm;
		this.ldgrnm = ldgrnm;
		this.tel_no = tel_no;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.cntrbgndd = cntrbgndd;
		this.cntrto_dd = cntrto_dd;
		this.rdr_extndd = rdr_extndd;
		this.bocd = bocd;
		this.subsuprc = subsuprc;
		this.bns_itemuprc = bns_itemuprc;
		this.comsuprc = comsuprc;
		this.remk = remk;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setEdutype(String edutype){
		this.edutype = edutype;
	}

	public void setInsttnm(String insttnm){
		this.insttnm = insttnm;
	}

	public void setLdgrnm(String ldgrnm){
		this.ldgrnm = ldgrnm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
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

	public void setCntrbgndd(String cntrbgndd){
		this.cntrbgndd = cntrbgndd;
	}

	public void setCntrto_dd(String cntrto_dd){
		this.cntrto_dd = cntrto_dd;
	}

	public void setRdr_extndd(String rdr_extndd){
		this.rdr_extndd = rdr_extndd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setBns_itemuprc(String bns_itemuprc){
		this.bns_itemuprc = bns_itemuprc;
	}

	public void setComsuprc(String comsuprc){
		this.comsuprc = comsuprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getEdutype(){
		return this.edutype;
	}

	public String getInsttnm(){
		return this.insttnm;
	}

	public String getLdgrnm(){
		return this.ldgrnm;
	}

	public String getTel_no(){
		return this.tel_no;
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

	public String getCntrbgndd(){
		return this.cntrbgndd;
	}

	public String getCntrto_dd(){
		return this.cntrto_dd;
	}

	public String getRdr_extndd(){
		return this.rdr_extndd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getBns_itemuprc(){
		return this.bns_itemuprc;
	}

	public String getComsuprc(){
		return this.comsuprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_EDUINST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_EDUINSTDM dm = (SS_I_EXTN_EDUINSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.edutype);
		cstmt.setString(6, dm.insttnm);
		cstmt.setString(7, dm.ldgrnm);
		cstmt.setString(8, dm.tel_no);
		cstmt.setString(9, dm.zip);
		cstmt.setString(10, dm.addr);
		cstmt.setString(11, dm.dtlsaddr);
		cstmt.setString(12, dm.cntrbgndd);
		cstmt.setString(13, dm.cntrto_dd);
		cstmt.setString(14, dm.rdr_extndd);
		cstmt.setString(15, dm.bocd);
		cstmt.setString(16, dm.subsuprc);
		cstmt.setString(17, dm.bns_itemuprc);
		cstmt.setString(18, dm.comsuprc);
		cstmt.setString(19, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_EDUINSTDataSet();
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
String edutype = req.getParameter("edutype");
if( edutype == null){
	System.out.println(this.toString+" : edutype is null" );
}else{
	System.out.println(this.toString+" : edutype is "+edutype );
}
String insttnm = req.getParameter("insttnm");
if( insttnm == null){
	System.out.println(this.toString+" : insttnm is null" );
}else{
	System.out.println(this.toString+" : insttnm is "+insttnm );
}
String ldgrnm = req.getParameter("ldgrnm");
if( ldgrnm == null){
	System.out.println(this.toString+" : ldgrnm is null" );
}else{
	System.out.println(this.toString+" : ldgrnm is "+ldgrnm );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
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
String cntrbgndd = req.getParameter("cntrbgndd");
if( cntrbgndd == null){
	System.out.println(this.toString+" : cntrbgndd is null" );
}else{
	System.out.println(this.toString+" : cntrbgndd is "+cntrbgndd );
}
String cntrto_dd = req.getParameter("cntrto_dd");
if( cntrto_dd == null){
	System.out.println(this.toString+" : cntrto_dd is null" );
}else{
	System.out.println(this.toString+" : cntrto_dd is "+cntrto_dd );
}
String rdr_extndd = req.getParameter("rdr_extndd");
if( rdr_extndd == null){
	System.out.println(this.toString+" : rdr_extndd is null" );
}else{
	System.out.println(this.toString+" : rdr_extndd is "+rdr_extndd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String subsuprc = req.getParameter("subsuprc");
if( subsuprc == null){
	System.out.println(this.toString+" : subsuprc is null" );
}else{
	System.out.println(this.toString+" : subsuprc is "+subsuprc );
}
String bns_itemuprc = req.getParameter("bns_itemuprc");
if( bns_itemuprc == null){
	System.out.println(this.toString+" : bns_itemuprc is null" );
}else{
	System.out.println(this.toString+" : bns_itemuprc is "+bns_itemuprc );
}
String comsuprc = req.getParameter("comsuprc");
if( comsuprc == null){
	System.out.println(this.toString+" : comsuprc is null" );
}else{
	System.out.println(this.toString+" : comsuprc is "+comsuprc );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String uid = Util.checkString(req.getParameter("uid"));
String edutype = Util.checkString(req.getParameter("edutype"));
String insttnm = Util.checkString(req.getParameter("insttnm"));
String ldgrnm = Util.checkString(req.getParameter("ldgrnm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String cntrbgndd = Util.checkString(req.getParameter("cntrbgndd"));
String cntrto_dd = Util.checkString(req.getParameter("cntrto_dd"));
String rdr_extndd = Util.checkString(req.getParameter("rdr_extndd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String bns_itemuprc = Util.checkString(req.getParameter("bns_itemuprc"));
String comsuprc = Util.checkString(req.getParameter("comsuprc"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String edutype = Util.Uni2Ksc(Util.checkString(req.getParameter("edutype")));
String insttnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insttnm")));
String ldgrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("ldgrnm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String cntrbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrbgndd")));
String cntrto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrto_dd")));
String rdr_extndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String bns_itemuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemuprc")));
String comsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("comsuprc")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setEdutype(edutype);
dm.setInsttnm(insttnm);
dm.setLdgrnm(ldgrnm);
dm.setTel_no(tel_no);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setCntrbgndd(cntrbgndd);
dm.setCntrto_dd(cntrto_dd);
dm.setRdr_extndd(rdr_extndd);
dm.setBocd(bocd);
dm.setSubsuprc(subsuprc);
dm.setBns_itemuprc(bns_itemuprc);
dm.setComsuprc(comsuprc);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 11:15:30 KST 2009 */