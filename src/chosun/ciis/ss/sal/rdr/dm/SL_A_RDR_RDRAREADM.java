/***************************************************************************************************
* 파일명 : SL_A_RDR_RDRAREADM.java
* 기능 : 독자-지역독자관리(등록,수정,삭제)
* 작성일자 : 2004-05-20
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자-지역독자관리(상세조회)
 *
 */

public class SL_A_RDR_RDRAREADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String accflag;
	public String areardr_no;
	public String areardrnm;
	public String prn;
	public String ernno;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String subsmedicd;
	public String rdr_extnposbcd;
	public String area_rdrregdt;
	public String subsfrdt;
	public String substodt;
	public String remk;
	public String incmgpers;

	public SL_A_RDR_RDRAREADM(){}
	public SL_A_RDR_RDRAREADM(String bocd, String accflag, String areardr_no, String areardrnm, String prn, String ernno, String zip, String addr, String dtlsaddr, String tel_no1, String tel_no2, String tel_no3, String ptph_no1, String ptph_no2, String ptph_no3, String subsmedicd, String rdr_extnposbcd, String area_rdrregdt, String subsfrdt, String substodt, String remk, String incmgpers){
		this.bocd = bocd;
		this.accflag = accflag;
		this.areardr_no = areardr_no;
		this.areardrnm = areardrnm;
		this.prn = prn;
		this.ernno = ernno;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.subsmedicd = subsmedicd;
		this.rdr_extnposbcd = rdr_extnposbcd;
		this.area_rdrregdt = area_rdrregdt;
		this.subsfrdt = subsfrdt;
		this.substodt = substodt;
		this.remk = remk;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setAreardr_no(String areardr_no){
		this.areardr_no = areardr_no;
	}

	public void setAreardrnm(String areardrnm){
		this.areardrnm = areardrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
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

	public void setSubsmedicd(String subsmedicd){
		this.subsmedicd = subsmedicd;
	}

	public void setRdr_extnposbcd(String rdr_extnposbcd){
		this.rdr_extnposbcd = rdr_extnposbcd;
	}

	public void setArea_rdrregdt(String area_rdrregdt){
		this.area_rdrregdt = area_rdrregdt;
	}

	public void setSubsfrdt(String subsfrdt){
		this.subsfrdt = subsfrdt;
	}

	public void setSubstodt(String substodt){
		this.substodt = substodt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getAreardr_no(){
		return this.areardr_no;
	}

	public String getAreardrnm(){
		return this.areardrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
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

	public String getSubsmedicd(){
		return this.subsmedicd;
	}

	public String getRdr_extnposbcd(){
		return this.rdr_extnposbcd;
	}

	public String getArea_rdrregdt(){
		return this.area_rdrregdt;
	}

	public String getSubsfrdt(){
		return this.subsfrdt;
	}

	public String getSubstodt(){
		return this.substodt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_RDR_RDRAREA( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDR_RDRAREADM dm = (SL_A_RDR_RDRAREADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.areardr_no);
		cstmt.setString(6, dm.areardrnm);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ernno);
		cstmt.setString(9, dm.zip);
		cstmt.setString(10, dm.addr);
		cstmt.setString(11, dm.dtlsaddr);
		cstmt.setString(12, dm.tel_no1);
		cstmt.setString(13, dm.tel_no2);
		cstmt.setString(14, dm.tel_no3);
		cstmt.setString(15, dm.ptph_no1);
		cstmt.setString(16, dm.ptph_no2);
		cstmt.setString(17, dm.ptph_no3);
		cstmt.setString(18, dm.subsmedicd);
		cstmt.setString(19, dm.rdr_extnposbcd);
		cstmt.setString(20, dm.area_rdrregdt);
		cstmt.setString(21, dm.subsfrdt);
		cstmt.setString(22, dm.substodt);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDR_RDRAREADataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String areardr_no = req.getParameter("areardr_no");
if( areardr_no == null){
	System.out.println(this.toString+" : areardr_no is null" );
}else{
	System.out.println(this.toString+" : areardr_no is "+areardr_no );
}
String areardrnm = req.getParameter("areardrnm");
if( areardrnm == null){
	System.out.println(this.toString+" : areardrnm is null" );
}else{
	System.out.println(this.toString+" : areardrnm is "+areardrnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ernno = req.getParameter("ernno");
if( ernno == null){
	System.out.println(this.toString+" : ernno is null" );
}else{
	System.out.println(this.toString+" : ernno is "+ernno );
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
String subsmedicd = req.getParameter("subsmedicd");
if( subsmedicd == null){
	System.out.println(this.toString+" : subsmedicd is null" );
}else{
	System.out.println(this.toString+" : subsmedicd is "+subsmedicd );
}
String rdr_extnposbcd = req.getParameter("rdr_extnposbcd");
if( rdr_extnposbcd == null){
	System.out.println(this.toString+" : rdr_extnposbcd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnposbcd is "+rdr_extnposbcd );
}
String area_rdrregdt = req.getParameter("area_rdrregdt");
if( area_rdrregdt == null){
	System.out.println(this.toString+" : area_rdrregdt is null" );
}else{
	System.out.println(this.toString+" : area_rdrregdt is "+area_rdrregdt );
}
String subsfrdt = req.getParameter("subsfrdt");
if( subsfrdt == null){
	System.out.println(this.toString+" : subsfrdt is null" );
}else{
	System.out.println(this.toString+" : subsfrdt is "+subsfrdt );
}
String substodt = req.getParameter("substodt");
if( substodt == null){
	System.out.println(this.toString+" : substodt is null" );
}else{
	System.out.println(this.toString+" : substodt is "+substodt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String areardr_no = Util.checkString(req.getParameter("areardr_no"));
String areardrnm = Util.checkString(req.getParameter("areardrnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String tel_no1 = Util.checkString(req.getParameter("tel_no1"));
String tel_no2 = Util.checkString(req.getParameter("tel_no2"));
String tel_no3 = Util.checkString(req.getParameter("tel_no3"));
String ptph_no1 = Util.checkString(req.getParameter("ptph_no1"));
String ptph_no2 = Util.checkString(req.getParameter("ptph_no2"));
String ptph_no3 = Util.checkString(req.getParameter("ptph_no3"));
String subsmedicd = Util.checkString(req.getParameter("subsmedicd"));
String rdr_extnposbcd = Util.checkString(req.getParameter("rdr_extnposbcd"));
String area_rdrregdt = Util.checkString(req.getParameter("area_rdrregdt"));
String subsfrdt = Util.checkString(req.getParameter("subsfrdt"));
String substodt = Util.checkString(req.getParameter("substodt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String areardr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("areardr_no")));
String areardrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("areardrnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String tel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no1")));
String tel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no2")));
String tel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no3")));
String ptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no1")));
String ptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no2")));
String ptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no3")));
String subsmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("subsmedicd")));
String rdr_extnposbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnposbcd")));
String area_rdrregdt = Util.Uni2Ksc(Util.checkString(req.getParameter("area_rdrregdt")));
String subsfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfrdt")));
String substodt = Util.Uni2Ksc(Util.checkString(req.getParameter("substodt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAccflag(accflag);
dm.setAreardr_no(areardr_no);
dm.setAreardrnm(areardrnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setTel_no1(tel_no1);
dm.setTel_no2(tel_no2);
dm.setTel_no3(tel_no3);
dm.setPtph_no1(ptph_no1);
dm.setPtph_no2(ptph_no2);
dm.setPtph_no3(ptph_no3);
dm.setSubsmedicd(subsmedicd);
dm.setRdr_extnposbcd(rdr_extnposbcd);
dm.setArea_rdrregdt(area_rdrregdt);
dm.setSubsfrdt(subsfrdt);
dm.setSubstodt(substodt);
dm.setRemk(remk);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 24 15:32:09 KST 2004 */