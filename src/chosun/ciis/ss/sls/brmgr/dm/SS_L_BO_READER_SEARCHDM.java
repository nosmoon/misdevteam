/***************************************************************************************************
 * 파일명   : SP_SS_L_BO_READER_SEARCH
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_L_BO_READER_SEARCH
**/

public class SS_L_BO_READER_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String gubun1;
	public String nmtext;
	public String rdr_no;
	public String gubun2;
	public String phone1;
	public String phone2;
	public String phone3;
	public String gubun3;
	public String dlvdtlsaddr;
	public String sendmthd;
	public String deptcd;
	public String areacd;
	public String bocd;
	public long pageno;
	public long pagesize;

	public SS_L_BO_READER_SEARCHDM(){}
	public SS_L_BO_READER_SEARCHDM(String cmpycd, String medicd, String gubun1, String nmtext, String rdr_no, String gubun2, String phone1, String phone2, String phone3, String gubun3, String dlvdtlsaddr, String sendmthd, String deptcd, String areacd, String bocd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.gubun1 = gubun1;
		this.nmtext = nmtext;
		this.rdr_no = rdr_no;
		this.gubun2 = gubun2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.gubun3 = gubun3;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.sendmthd = sendmthd;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setGubun1(String gubun1){
		this.gubun1 = gubun1;
	}

	public void setNmtext(String nmtext){
		this.nmtext = nmtext;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setGubun2(String gubun2){
		this.gubun2 = gubun2;
	}

	public void setPhone1(String phone1){
		this.phone1 = phone1;
	}

	public void setPhone2(String phone2){
		this.phone2 = phone2;
	}

	public void setPhone3(String phone3){
		this.phone3 = phone3;
	}

	public void setGubun3(String gubun3){
		this.gubun3 = gubun3;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getGubun1(){
		return this.gubun1;
	}

	public String getNmtext(){
		return this.nmtext;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getGubun2(){
		return this.gubun2;
	}

	public String getPhone1(){
		return this.phone1;
	}

	public String getPhone2(){
		return this.phone2;
	}

	public String getPhone3(){
		return this.phone3;
	}

	public String getGubun3(){
		return this.gubun3;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BO_READER_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BO_READER_SEARCHDM dm = (SS_L_BO_READER_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.gubun1);
		cstmt.setString(6, dm.nmtext);
		cstmt.setString(7, dm.rdr_no);
		cstmt.setString(8, dm.gubun2);
		cstmt.setString(9, dm.phone1);
		cstmt.setString(10, dm.phone2);
		cstmt.setString(11, dm.phone3);
		cstmt.setString(12, dm.gubun3);
		cstmt.setString(13, dm.dlvdtlsaddr);
		cstmt.setString(14, dm.sendmthd);
		cstmt.setString(15, dm.deptcd);
		cstmt.setString(16, dm.areacd);
		cstmt.setString(17, dm.bocd);
		cstmt.setLong(18, dm.pageno);
		cstmt.setLong(19, dm.pagesize);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_BO_READER_SEARCHDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String gubun1 = req.getParameter("gubun1");
if( gubun1 == null){
	System.out.println(this.toString+" : gubun1 is null" );
}else{
	System.out.println(this.toString+" : gubun1 is "+gubun1 );
}
String nmtext = req.getParameter("nmtext");
if( nmtext == null){
	System.out.println(this.toString+" : nmtext is null" );
}else{
	System.out.println(this.toString+" : nmtext is "+nmtext );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String gubun2 = req.getParameter("gubun2");
if( gubun2 == null){
	System.out.println(this.toString+" : gubun2 is null" );
}else{
	System.out.println(this.toString+" : gubun2 is "+gubun2 );
}
String phone1 = req.getParameter("phone1");
if( phone1 == null){
	System.out.println(this.toString+" : phone1 is null" );
}else{
	System.out.println(this.toString+" : phone1 is "+phone1 );
}
String phone2 = req.getParameter("phone2");
if( phone2 == null){
	System.out.println(this.toString+" : phone2 is null" );
}else{
	System.out.println(this.toString+" : phone2 is "+phone2 );
}
String phone3 = req.getParameter("phone3");
if( phone3 == null){
	System.out.println(this.toString+" : phone3 is null" );
}else{
	System.out.println(this.toString+" : phone3 is "+phone3 );
}
String gubun3 = req.getParameter("gubun3");
if( gubun3 == null){
	System.out.println(this.toString+" : gubun3 is null" );
}else{
	System.out.println(this.toString+" : gubun3 is "+gubun3 );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String sendmthd = req.getParameter("sendmthd");
if( sendmthd == null){
	System.out.println(this.toString+" : sendmthd is null" );
}else{
	System.out.println(this.toString+" : sendmthd is "+sendmthd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String gubun1 = Util.checkString(req.getParameter("gubun1"));
String nmtext = Util.checkString(req.getParameter("nmtext"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String gubun2 = Util.checkString(req.getParameter("gubun2"));
String phone1 = Util.checkString(req.getParameter("phone1"));
String phone2 = Util.checkString(req.getParameter("phone2"));
String phone3 = Util.checkString(req.getParameter("phone3"));
String gubun3 = Util.checkString(req.getParameter("gubun3"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String sendmthd = Util.checkString(req.getParameter("sendmthd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String gubun1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun1")));
String nmtext = Util.Uni2Ksc(Util.checkString(req.getParameter("nmtext")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String gubun2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun2")));
String phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone1")));
String phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone2")));
String phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone3")));
String gubun3 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun3")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setGubun1(gubun1);
dm.setNmtext(nmtext);
dm.setRdr_no(rdr_no);
dm.setGubun2(gubun2);
dm.setPhone1(phone1);
dm.setPhone2(phone2);
dm.setPhone3(phone3);
dm.setGubun3(gubun3);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setSendmthd(sendmthd);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 15 14:48:02 KST 2007 */