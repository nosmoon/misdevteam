/***************************************************************************************************
* 파일명 : SP_PS_A_RETN_PTCR.java
* 발송-반송관리 선택된 내역 저장
* 작성일자 : 2004-03-19
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 반송내역 저장처리
 *
 */

  

public class PS_A_RETN_PTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String gbnflag;
	public String rdr_no;
	public String retnseq;
	public String medicd;
	public String termsubsno;
	public String retndt;
	public String retnclsf;
	public String retn_nmno;
	public String bns_bookcd;
	public String agrmntdt;
	public String agrmntamt;
	public String retnresncd;
	public String memo;
	public String boprocyn;
	public String boprocdt;
	public String boprocmemo;

	public PS_A_RETN_PTCRDM(){}
	public PS_A_RETN_PTCRDM(String bocd, String incmgpers, String gbnflag, String rdr_no, String retnseq, String medicd, String termsubsno, String retndt, String retnclsf, String retn_nmno, String bns_bookcd, String agrmntdt, String agrmntamt, String retnresncd, String memo, String boprocyn, String boprocdt, String boprocmemo){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.gbnflag = gbnflag;
		this.rdr_no = rdr_no;
		this.retnseq = retnseq;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.retndt = retndt;
		this.retnclsf = retnclsf;
		this.retn_nmno = retn_nmno;
		this.bns_bookcd = bns_bookcd;
		this.agrmntdt = agrmntdt;
		this.agrmntamt = agrmntamt;
		this.retnresncd = retnresncd;
		this.memo = memo;
		this.boprocyn = boprocyn;
		this.boprocdt = boprocdt;
		this.boprocmemo = boprocmemo;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setGbnflag(String gbnflag){
		this.gbnflag = gbnflag;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRetnseq(String retnseq){
		this.retnseq = retnseq;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRetndt(String retndt){
		this.retndt = retndt;
	}

	public void setRetnclsf(String retnclsf){
		this.retnclsf = retnclsf;
	}

	public void setRetn_nmno(String retn_nmno){
		this.retn_nmno = retn_nmno;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setAgrmntdt(String agrmntdt){
		this.agrmntdt = agrmntdt;
	}

	public void setAgrmntamt(String agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setRetnresncd(String retnresncd){
		this.retnresncd = retnresncd;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoprocmemo(String boprocmemo){
		this.boprocmemo = boprocmemo;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getGbnflag(){
		return this.gbnflag;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRetnseq(){
		return this.retnseq;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRetndt(){
		return this.retndt;
	}

	public String getRetnclsf(){
		return this.retnclsf;
	}

	public String getRetn_nmno(){
		return this.retn_nmno;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getAgrmntdt(){
		return this.agrmntdt;
	}

	public String getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getRetnresncd(){
		return this.retnresncd;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoprocmemo(){
		return this.boprocmemo;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_RETN_PTCR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_RETN_PTCRDM dm = (PS_A_RETN_PTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.gbnflag);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.retnseq);
		cstmt.setString(8, dm.medicd);
		cstmt.setString(9, dm.termsubsno);
		cstmt.setString(10, dm.retndt);
		cstmt.setString(11, dm.retnclsf);
		cstmt.setString(12, dm.retn_nmno);
		cstmt.setString(13, dm.bns_bookcd);
		cstmt.setString(14, dm.agrmntdt);
		cstmt.setString(15, dm.agrmntamt);
		cstmt.setString(16, dm.retnresncd);
		cstmt.setString(17, dm.memo);
		cstmt.setString(18, dm.boprocyn);
		cstmt.setString(19, dm.boprocdt);
		cstmt.setString(20, dm.boprocmemo);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_A_RETN_PTCRDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String gbnflag = req.getParameter("gbnflag");
if( gbnflag == null){
	System.out.println(this.toString+" : gbnflag is null" );
}else{
	System.out.println(this.toString+" : gbnflag is "+gbnflag );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String retnseq = req.getParameter("retnseq");
if( retnseq == null){
	System.out.println(this.toString+" : retnseq is null" );
}else{
	System.out.println(this.toString+" : retnseq is "+retnseq );
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
String retndt = req.getParameter("retndt");
if( retndt == null){
	System.out.println(this.toString+" : retndt is null" );
}else{
	System.out.println(this.toString+" : retndt is "+retndt );
}
String retnclsf = req.getParameter("retnclsf");
if( retnclsf == null){
	System.out.println(this.toString+" : retnclsf is null" );
}else{
	System.out.println(this.toString+" : retnclsf is "+retnclsf );
}
String retn_nmno = req.getParameter("retn_nmno");
if( retn_nmno == null){
	System.out.println(this.toString+" : retn_nmno is null" );
}else{
	System.out.println(this.toString+" : retn_nmno is "+retn_nmno );
}
String bns_bookcd = req.getParameter("bns_bookcd");
if( bns_bookcd == null){
	System.out.println(this.toString+" : bns_bookcd is null" );
}else{
	System.out.println(this.toString+" : bns_bookcd is "+bns_bookcd );
}
String agrmntdt = req.getParameter("agrmntdt");
if( agrmntdt == null){
	System.out.println(this.toString+" : agrmntdt is null" );
}else{
	System.out.println(this.toString+" : agrmntdt is "+agrmntdt );
}
String agrmntamt = req.getParameter("agrmntamt");
if( agrmntamt == null){
	System.out.println(this.toString+" : agrmntamt is null" );
}else{
	System.out.println(this.toString+" : agrmntamt is "+agrmntamt );
}
String retnresncd = req.getParameter("retnresncd");
if( retnresncd == null){
	System.out.println(this.toString+" : retnresncd is null" );
}else{
	System.out.println(this.toString+" : retnresncd is "+retnresncd );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String boprocdt = req.getParameter("boprocdt");
if( boprocdt == null){
	System.out.println(this.toString+" : boprocdt is null" );
}else{
	System.out.println(this.toString+" : boprocdt is "+boprocdt );
}
String boprocmemo = req.getParameter("boprocmemo");
if( boprocmemo == null){
	System.out.println(this.toString+" : boprocmemo is null" );
}else{
	System.out.println(this.toString+" : boprocmemo is "+boprocmemo );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String gbnflag = Util.checkString(req.getParameter("gbnflag"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String retnseq = Util.checkString(req.getParameter("retnseq"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String retndt = Util.checkString(req.getParameter("retndt"));
String retnclsf = Util.checkString(req.getParameter("retnclsf"));
String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));
String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));
String agrmntdt = Util.checkString(req.getParameter("agrmntdt"));
String agrmntamt = Util.checkString(req.getParameter("agrmntamt"));
String retnresncd = Util.checkString(req.getParameter("retnresncd"));
String memo = Util.checkString(req.getParameter("memo"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String boprocdt = Util.checkString(req.getParameter("boprocdt"));
String boprocmemo = Util.checkString(req.getParameter("boprocmemo"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String gbnflag = Util.Uni2Ksc(Util.checkString(req.getParameter("gbnflag")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String retnseq = Util.Uni2Ksc(Util.checkString(req.getParameter("retnseq")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String retndt = Util.Uni2Ksc(Util.checkString(req.getParameter("retndt")));
String retnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("retnclsf")));
String retn_nmno = Util.Uni2Ksc(Util.checkString(req.getParameter("retn_nmno")));
String bns_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_bookcd")));
String agrmntdt = Util.Uni2Ksc(Util.checkString(req.getParameter("agrmntdt")));
String agrmntamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agrmntamt")));
String retnresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("retnresncd")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String boprocdt = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocdt")));
String boprocmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocmemo")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setGbnflag(gbnflag);
dm.setRdr_no(rdr_no);
dm.setRetnseq(retnseq);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setRetndt(retndt);
dm.setRetnclsf(retnclsf);
dm.setRetn_nmno(retn_nmno);
dm.setBns_bookcd(bns_bookcd);
dm.setAgrmntdt(agrmntdt);
dm.setAgrmntamt(agrmntamt);
dm.setRetnresncd(retnresncd);
dm.setMemo(memo);
dm.setBoprocyn(boprocyn);
dm.setBoprocdt(boprocdt);
dm.setBoprocmemo(boprocmemo);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 19 19:30:42 KST 2004 */