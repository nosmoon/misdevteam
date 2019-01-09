/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 독자 등록  
* 작성일자 : 2009-05-27
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
 * 에듀/제휴 확장 독자 등록  
 */

public class SS_I_EXTN_EDURDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String uid;
	public String instcd;
	public String medicd;
	public String subsqty;
	public String rdr_extndd;
	public String nm;
	public String protpersnm;
	public String tel_no;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String subsyn;
	public String dlvhopedd;
	public String bocd;
	public String bonm;
	public String rdrcnfm;
	public String procstat;
	public String resn;
	public String remk;

	public SS_I_EXTN_EDURDRDM(){}
	public SS_I_EXTN_EDURDRDM(String cmpycd, String uid, String instcd, String medicd, String subsqty, String rdr_extndd, String nm, String protpersnm, String tel_no, String zip, String addr, String dtlsaddr, String subsyn, String dlvhopedd, String bocd, String bonm, String rdrcnfm, String procstat, String resn, String remk){
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.instcd = instcd;
		this.medicd = medicd;
		this.subsqty = subsqty;
		this.rdr_extndd = rdr_extndd;
		this.nm = nm;
		this.protpersnm = protpersnm;
		this.tel_no = tel_no;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.subsyn = subsyn;
		this.dlvhopedd = dlvhopedd;
		this.bocd = bocd;
		this.bonm = bonm;
		this.rdrcnfm = rdrcnfm;
		this.procstat = procstat;
		this.resn = resn;
		this.remk = remk;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setInstcd(String instcd){
		this.instcd = instcd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setRdr_extndd(String rdr_extndd){
		this.rdr_extndd = rdr_extndd;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setProtpersnm(String protpersnm){
		this.protpersnm = protpersnm;
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

	public void setSubsyn(String subsyn){
		this.subsyn = subsyn;
	}

	public void setDlvhopedd(String dlvhopedd){
		this.dlvhopedd = dlvhopedd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrcnfm(String rdrcnfm){
		this.rdrcnfm = rdrcnfm;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setResn(String resn){
		this.resn = resn;
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

	public String getInstcd(){
		return this.instcd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getRdr_extndd(){
		return this.rdr_extndd;
	}

	public String getNm(){
		return this.nm;
	}

	public String getProtpersnm(){
		return this.protpersnm;
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

	public String getSubsyn(){
		return this.subsyn;
	}

	public String getDlvhopedd(){
		return this.dlvhopedd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrcnfm(){
		return this.rdrcnfm;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getResn(){
		return this.resn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_EDURDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_EDURDRDM dm = (SS_I_EXTN_EDURDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.instcd);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.subsqty);
		cstmt.setString(8, dm.rdr_extndd);
		cstmt.setString(9, dm.nm);
		cstmt.setString(10, dm.protpersnm);
		cstmt.setString(11, dm.tel_no);
		cstmt.setString(12, dm.zip);
		cstmt.setString(13, dm.addr);
		cstmt.setString(14, dm.dtlsaddr);
		cstmt.setString(15, dm.subsyn);
		cstmt.setString(16, dm.dlvhopedd);
		cstmt.setString(17, dm.bocd);
		cstmt.setString(18, dm.bonm);
		cstmt.setString(19, dm.rdrcnfm);
		cstmt.setString(20, dm.procstat);
		cstmt.setString(21, dm.resn);
		cstmt.setString(22, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_EDURDRDataSet();
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
String instcd = req.getParameter("instcd");
if( instcd == null){
	System.out.println(this.toString+" : instcd is null" );
}else{
	System.out.println(this.toString+" : instcd is "+instcd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String subsqty = req.getParameter("subsqty");
if( subsqty == null){
	System.out.println(this.toString+" : subsqty is null" );
}else{
	System.out.println(this.toString+" : subsqty is "+subsqty );
}
String rdr_extndd = req.getParameter("rdr_extndd");
if( rdr_extndd == null){
	System.out.println(this.toString+" : rdr_extndd is null" );
}else{
	System.out.println(this.toString+" : rdr_extndd is "+rdr_extndd );
}
String nm = req.getParameter("nm");
if( nm == null){
	System.out.println(this.toString+" : nm is null" );
}else{
	System.out.println(this.toString+" : nm is "+nm );
}
String protpersnm = req.getParameter("protpersnm");
if( protpersnm == null){
	System.out.println(this.toString+" : protpersnm is null" );
}else{
	System.out.println(this.toString+" : protpersnm is "+protpersnm );
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
String subsyn = req.getParameter("subsyn");
if( subsyn == null){
	System.out.println(this.toString+" : subsyn is null" );
}else{
	System.out.println(this.toString+" : subsyn is "+subsyn );
}
String dlvhopedd = req.getParameter("dlvhopedd");
if( dlvhopedd == null){
	System.out.println(this.toString+" : dlvhopedd is null" );
}else{
	System.out.println(this.toString+" : dlvhopedd is "+dlvhopedd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String bonm = req.getParameter("bonm");
if( bonm == null){
	System.out.println(this.toString+" : bonm is null" );
}else{
	System.out.println(this.toString+" : bonm is "+bonm );
}
String rdrcnfm = req.getParameter("rdrcnfm");
if( rdrcnfm == null){
	System.out.println(this.toString+" : rdrcnfm is null" );
}else{
	System.out.println(this.toString+" : rdrcnfm is "+rdrcnfm );
}
String procstat = req.getParameter("procstat");
if( procstat == null){
	System.out.println(this.toString+" : procstat is null" );
}else{
	System.out.println(this.toString+" : procstat is "+procstat );
}
String resn = req.getParameter("resn");
if( resn == null){
	System.out.println(this.toString+" : resn is null" );
}else{
	System.out.println(this.toString+" : resn is "+resn );
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
String instcd = Util.checkString(req.getParameter("instcd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String subsqty = Util.checkString(req.getParameter("subsqty"));
String rdr_extndd = Util.checkString(req.getParameter("rdr_extndd"));
String nm = Util.checkString(req.getParameter("nm"));
String protpersnm = Util.checkString(req.getParameter("protpersnm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String subsyn = Util.checkString(req.getParameter("subsyn"));
String dlvhopedd = Util.checkString(req.getParameter("dlvhopedd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bonm = Util.checkString(req.getParameter("bonm"));
String rdrcnfm = Util.checkString(req.getParameter("rdrcnfm"));
String procstat = Util.checkString(req.getParameter("procstat"));
String resn = Util.checkString(req.getParameter("resn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String instcd = Util.Uni2Ksc(Util.checkString(req.getParameter("instcd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));
String rdr_extndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndd")));
String nm = Util.Uni2Ksc(Util.checkString(req.getParameter("nm")));
String protpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("protpersnm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
String dlvhopedd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
String rdrcnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrcnfm")));
String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
String resn = Util.Uni2Ksc(Util.checkString(req.getParameter("resn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setInstcd(instcd);
dm.setMedicd(medicd);
dm.setSubsqty(subsqty);
dm.setRdr_extndd(rdr_extndd);
dm.setNm(nm);
dm.setProtpersnm(protpersnm);
dm.setTel_no(tel_no);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setSubsyn(subsyn);
dm.setDlvhopedd(dlvhopedd);
dm.setBocd(bocd);
dm.setBonm(bonm);
dm.setRdrcnfm(rdrcnfm);
dm.setProcstat(procstat);
dm.setResn(resn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 14:46:30 KST 2009 */