/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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


public class SS_SLS_EXTN_4610_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String dncomp;
	public String empseq;
	public String rdrnm;
	public String bocd;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String refaddr;
	public String telno1;
	public String telno2;
	public String telno3;
	public String ptphno1;
	public String ptphno2;
	public String ptphno3;
	public String qty;
	public String fr_yymm;
	public String to_yymm;
	public String subsuprc;
	public String remk;
	public String bldmngnn;
	public String extngb;

	public SS_SLS_EXTN_4610_IDM(){}
	public SS_SLS_EXTN_4610_IDM(String incmgpers, String dncomp, String empseq, String rdrnm, String bocd, String zip, String addr, String dtlsaddr, String refaddr, String telno1, String telno2, String telno3, String ptphno1, String ptphno2, String ptphno3, String qty, String fr_yymm, String to_yymm, String subsuprc, String remk, String bldmngnn, String extngb){
		this.incmgpers = incmgpers;
		this.dncomp = dncomp;
		this.empseq = empseq;
		this.rdrnm = rdrnm;
		this.bocd = bocd;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.refaddr = refaddr;
		this.telno1 = telno1;
		this.telno2 = telno2;
		this.telno3 = telno3;
		this.ptphno1 = ptphno1;
		this.ptphno2 = ptphno2;
		this.ptphno3 = ptphno3;
		this.qty = qty;
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.subsuprc = subsuprc;
		this.remk = remk;
		this.bldmngnn = bldmngnn;
		this.extngb = extngb;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setRefaddr(String refaddr){
		this.refaddr = refaddr;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setTelno3(String telno3){
		this.telno3 = telno3;
	}

	public void setPtphno1(String ptphno1){
		this.ptphno1 = ptphno1;
	}

	public void setPtphno2(String ptphno2){
		this.ptphno2 = ptphno2;
	}

	public void setPtphno3(String ptphno3){
		this.ptphno3 = ptphno3;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setExtngb(String extngb){
		this.extngb = extngb;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBocd(){
		return this.bocd;
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

	public String getRefaddr(){
		return this.refaddr;
	}

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public String getTelno3(){
		return this.telno3;
	}

	public String getPtphno1(){
		return this.ptphno1;
	}

	public String getPtphno2(){
		return this.ptphno2;
	}

	public String getPtphno3(){
		return this.ptphno3;
	}

	public String getQty(){
		return this.qty;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getExtngb(){
		return this.extngb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4610_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4610_IDM dm = (SS_SLS_EXTN_4610_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.dncomp);
		cstmt.setString(5, dm.empseq);
		cstmt.setString(6, dm.rdrnm);
		cstmt.setString(7, dm.bocd);
		cstmt.setString(8, dm.zip);
		cstmt.setString(9, dm.addr);
		cstmt.setString(10, dm.dtlsaddr);
		cstmt.setString(11, dm.refaddr);
		cstmt.setString(12, dm.telno1);
		cstmt.setString(13, dm.telno2);
		cstmt.setString(14, dm.telno3);
		cstmt.setString(15, dm.ptphno1);
		cstmt.setString(16, dm.ptphno2);
		cstmt.setString(17, dm.ptphno3);
		cstmt.setString(18, dm.qty);
		cstmt.setString(19, dm.fr_yymm);
		cstmt.setString(20, dm.to_yymm);
		cstmt.setString(21, dm.subsuprc);
		cstmt.setString(22, dm.remk);
		cstmt.setString(23, dm.bldmngnn);
		cstmt.setString(24, dm.extngb);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4610_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("dncomp = [" + getDncomp() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("zip = [" + getZip() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtlsaddr = [" + getDtlsaddr() + "]");
		System.out.println("refaddr = [" + getRefaddr() + "]");
		System.out.println("telno1 = [" + getTelno1() + "]");
		System.out.println("telno2 = [" + getTelno2() + "]");
		System.out.println("telno3 = [" + getTelno3() + "]");
		System.out.println("ptphno1 = [" + getPtphno1() + "]");
		System.out.println("ptphno2 = [" + getPtphno2() + "]");
		System.out.println("ptphno3 = [" + getPtphno3() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("subsuprc = [" + getSubsuprc() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("bldmngnn = [" + getBldmngnn() + "]");
		System.out.println("extngb = [" + getExtngb() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String dncomp = req.getParameter("dncomp");
if( dncomp == null){
	System.out.println(this.toString+" : dncomp is null" );
}else{
	System.out.println(this.toString+" : dncomp is "+dncomp );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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
String refaddr = req.getParameter("refaddr");
if( refaddr == null){
	System.out.println(this.toString+" : refaddr is null" );
}else{
	System.out.println(this.toString+" : refaddr is "+refaddr );
}
String telno1 = req.getParameter("telno1");
if( telno1 == null){
	System.out.println(this.toString+" : telno1 is null" );
}else{
	System.out.println(this.toString+" : telno1 is "+telno1 );
}
String telno2 = req.getParameter("telno2");
if( telno2 == null){
	System.out.println(this.toString+" : telno2 is null" );
}else{
	System.out.println(this.toString+" : telno2 is "+telno2 );
}
String telno3 = req.getParameter("telno3");
if( telno3 == null){
	System.out.println(this.toString+" : telno3 is null" );
}else{
	System.out.println(this.toString+" : telno3 is "+telno3 );
}
String ptphno1 = req.getParameter("ptphno1");
if( ptphno1 == null){
	System.out.println(this.toString+" : ptphno1 is null" );
}else{
	System.out.println(this.toString+" : ptphno1 is "+ptphno1 );
}
String ptphno2 = req.getParameter("ptphno2");
if( ptphno2 == null){
	System.out.println(this.toString+" : ptphno2 is null" );
}else{
	System.out.println(this.toString+" : ptphno2 is "+ptphno2 );
}
String ptphno3 = req.getParameter("ptphno3");
if( ptphno3 == null){
	System.out.println(this.toString+" : ptphno3 is null" );
}else{
	System.out.println(this.toString+" : ptphno3 is "+ptphno3 );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String subsuprc = req.getParameter("subsuprc");
if( subsuprc == null){
	System.out.println(this.toString+" : subsuprc is null" );
}else{
	System.out.println(this.toString+" : subsuprc is "+subsuprc );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
String extngb = req.getParameter("extngb");
if( extngb == null){
	System.out.println(this.toString+" : extngb is null" );
}else{
	System.out.println(this.toString+" : extngb is "+extngb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String dncomp = Util.checkString(req.getParameter("dncomp"));
String empseq = Util.checkString(req.getParameter("empseq"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String refaddr = Util.checkString(req.getParameter("refaddr"));
String telno1 = Util.checkString(req.getParameter("telno1"));
String telno2 = Util.checkString(req.getParameter("telno2"));
String telno3 = Util.checkString(req.getParameter("telno3"));
String ptphno1 = Util.checkString(req.getParameter("ptphno1"));
String ptphno2 = Util.checkString(req.getParameter("ptphno2"));
String ptphno3 = Util.checkString(req.getParameter("ptphno3"));
String qty = Util.checkString(req.getParameter("qty"));
String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String remk = Util.checkString(req.getParameter("remk"));
String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
String extngb = Util.checkString(req.getParameter("extngb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String refaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("refaddr")));
String telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno1")));
String telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno2")));
String telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno3")));
String ptphno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno1")));
String ptphno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno2")));
String ptphno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno3")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
String extngb = Util.Uni2Ksc(Util.checkString(req.getParameter("extngb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setDncomp(dncomp);
dm.setEmpseq(empseq);
dm.setRdrnm(rdrnm);
dm.setBocd(bocd);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setRefaddr(refaddr);
dm.setTelno1(telno1);
dm.setTelno2(telno2);
dm.setTelno3(telno3);
dm.setPtphno1(ptphno1);
dm.setPtphno2(ptphno2);
dm.setPtphno3(ptphno3);
dm.setQty(qty);
dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setSubsuprc(subsuprc);
dm.setRemk(remk);
dm.setBldmngnn(bldmngnn);
dm.setExtngb(extngb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 17 16:47:10 KST 2016 */