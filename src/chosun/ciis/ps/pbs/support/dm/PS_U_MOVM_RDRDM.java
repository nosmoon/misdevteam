/***************************************************************************************************
 * 파일명   : PS_U_MOVM_RDR.java
 * 기능     : 이사신청 지사배정
 * 작성일자 : 2005-02-15
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 이사신청 지사배정
 */

public class PS_U_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdrbocd;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String termsubsno;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String incmgpers;

	public PS_U_MOVM_RDRDM(){}
	public PS_U_MOVM_RDRDM(String regdt, String regno, String rdrbocd, String rdr_no, String rdrnm, String medicd, String termsubsno, String zip, String addr, String dtlsaddr, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String incmgpers){
		this.regdt = regdt;
		this.regno = regno;
		this.rdrbocd = rdrbocd;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdrbocd(String rdrbocd){
		this.rdrbocd = rdrbocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
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

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdrbocd(){
		return this.rdrbocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
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

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_MOVM_RDRDM dm = (PS_U_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.regdt);
		cstmt.setString(4, dm.regno);
		cstmt.setString(5, dm.rdrbocd);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.rdrnm);
		cstmt.setString(8, dm.medicd);
		cstmt.setString(9, dm.termsubsno);
		cstmt.setString(10, dm.zip);
		cstmt.setString(11, dm.addr);
		cstmt.setString(12, dm.dtlsaddr);
		cstmt.setString(13, dm.rdrtel_no1);
		cstmt.setString(14, dm.rdrtel_no2);
		cstmt.setString(15, dm.rdrtel_no3);
		cstmt.setString(16, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_U_MOVM_RDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rdrbocd = req.getParameter("rdrbocd");
if( rdrbocd == null){
	System.out.println(this.toString+" : rdrbocd is null" );
}else{
	System.out.println(this.toString+" : rdrbocd is "+rdrbocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrbocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdrbocd(rdrbocd);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 15 16:37:09 KST 2005 */