/***************************************************************************************************
* 파일명 : SP_PS_A_BILL_SEPR.java
* 수금-개별입금 처리화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :     
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/** 
 * 수금-개별입금 처리화면   
 * 
 */

  

public class PS_A_BILL_SEPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String bocd;
	public String procdt;
	public String recpmthd;
	public String rcpmclsfcd;
	public String clsfval;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rcpmseq;
	public String recpdt;
	public long rcpmamt;

	public PS_A_BILL_SEPRDM(){}
	public PS_A_BILL_SEPRDM(String incmgpers, String bocd, String procdt, String recpmthd, String rcpmclsfcd, String clsfval, String rdr_no, String medicd, String termsubsno, String rcpmseq, String recpdt, long rcpmamt){
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.procdt = procdt;
		this.recpmthd = recpmthd;
		this.rcpmclsfcd = rcpmclsfcd;
		this.clsfval = clsfval;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.rcpmseq = rcpmseq;
		this.recpdt = recpdt;
		this.rcpmamt = rcpmamt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setRecpmthd(String recpmthd){
		this.recpmthd = recpmthd;
	}

	public void setRcpmclsfcd(String rcpmclsfcd){
		this.rcpmclsfcd = rcpmclsfcd;
	}

	public void setClsfval(String clsfval){
		this.clsfval = clsfval;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRcpmseq(String rcpmseq){
		this.rcpmseq = rcpmseq;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setRcpmamt(long rcpmamt){
		this.rcpmamt = rcpmamt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getRecpmthd(){
		return this.recpmthd;
	}

	public String getRcpmclsfcd(){
		return this.rcpmclsfcd;
	}

	public String getClsfval(){
		return this.clsfval;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRcpmseq(){
		return this.rcpmseq;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public long getRcpmamt(){
		return this.rcpmamt;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BILL_SEPR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BILL_SEPRDM dm = (PS_A_BILL_SEPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.procdt);
		cstmt.setString(6, dm.recpmthd);
		cstmt.setString(7, dm.rcpmclsfcd);
		cstmt.setString(8, dm.clsfval);
		cstmt.setString(9, dm.rdr_no);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.termsubsno);
		cstmt.setString(12, dm.rcpmseq);
		cstmt.setString(13, dm.recpdt);
		cstmt.setLong(14, dm.rcpmamt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_A_BILL_SEPRDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String procdt = req.getParameter("procdt");
if( procdt == null){
	System.out.println(this.toString+" : procdt is null" );
}else{
	System.out.println(this.toString+" : procdt is "+procdt );
}
String recpmthd = req.getParameter("recpmthd");
if( recpmthd == null){
	System.out.println(this.toString+" : recpmthd is null" );
}else{
	System.out.println(this.toString+" : recpmthd is "+recpmthd );
}
String rcpmclsfcd = req.getParameter("rcpmclsfcd");
if( rcpmclsfcd == null){
	System.out.println(this.toString+" : rcpmclsfcd is null" );
}else{
	System.out.println(this.toString+" : rcpmclsfcd is "+rcpmclsfcd );
}
String clsfval = req.getParameter("clsfval");
if( clsfval == null){
	System.out.println(this.toString+" : clsfval is null" );
}else{
	System.out.println(this.toString+" : clsfval is "+clsfval );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
String rcpmseq = req.getParameter("rcpmseq");
if( rcpmseq == null){
	System.out.println(this.toString+" : rcpmseq is null" );
}else{
	System.out.println(this.toString+" : rcpmseq is "+rcpmseq );
}
String recpdt = req.getParameter("recpdt");
if( recpdt == null){
	System.out.println(this.toString+" : recpdt is null" );
}else{
	System.out.println(this.toString+" : recpdt is "+recpdt );
}
String rcpmamt = req.getParameter("rcpmamt");
if( rcpmamt == null){
	System.out.println(this.toString+" : rcpmamt is null" );
}else{
	System.out.println(this.toString+" : rcpmamt is "+rcpmamt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String procdt = Util.checkString(req.getParameter("procdt"));
String recpmthd = Util.checkString(req.getParameter("recpmthd"));
String rcpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd"));
String clsfval = Util.checkString(req.getParameter("clsfval"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String rcpmseq = Util.checkString(req.getParameter("rcpmseq"));
String recpdt = Util.checkString(req.getParameter("recpdt"));
String rcpmamt = Util.checkString(req.getParameter("rcpmamt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
String recpmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpmthd")));
String rcpmclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmclsfcd")));
String clsfval = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfval")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String rcpmseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmseq")));
String recpdt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpdt")));
String rcpmamt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmamt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setProcdt(procdt);
dm.setRecpmthd(recpmthd);
dm.setRcpmclsfcd(rcpmclsfcd);
dm.setClsfval(clsfval);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setRcpmseq(rcpmseq);
dm.setRecpdt(recpdt);
dm.setRcpmamt(rcpmamt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 31 13:28:32 KST 2004 */