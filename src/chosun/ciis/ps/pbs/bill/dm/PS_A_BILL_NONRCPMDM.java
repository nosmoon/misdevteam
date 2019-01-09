/***************************************************************************************************
* 파일명 : SP_PS_A_BILL_NONRCPM.java
* 수금-비정상입금 저장화면
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
 * 수금-비정상입금 저장화면
 *
 */



public class PS_A_BILL_NONRCPMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String procdt;
	public String recpdt;
	public String rcpmamt;
	public String recpbrchcd;
	public String normerrclsf;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String custbrwsno;
	public String seq;
	public String acqdt;
	public String acqno;
	public String bocd;

	public PS_A_BILL_NONRCPMDM(){}
	public PS_A_BILL_NONRCPMDM(String incmgpers, String procdt, String recpdt, String rcpmamt, String recpbrchcd, String normerrclsf, String rdr_no, String medicd, String termsubsno, String custbrwsno, String seq, String acqdt, String acqno, String bocd){
		this.incmgpers = incmgpers;
		this.procdt = procdt;
		this.recpdt = recpdt;
		this.rcpmamt = rcpmamt;
		this.recpbrchcd = recpbrchcd;
		this.normerrclsf = normerrclsf;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.custbrwsno = custbrwsno;
		this.seq = seq;
		this.acqdt = acqdt;
		this.acqno = acqno;
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setRcpmamt(String rcpmamt){
		this.rcpmamt = rcpmamt;
	}

	public void setRecpbrchcd(String recpbrchcd){
		this.recpbrchcd = recpbrchcd;
	}

	public void setNormerrclsf(String normerrclsf){
		this.normerrclsf = normerrclsf;
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

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public String getRcpmamt(){
		return this.rcpmamt;
	}

	public String getRecpbrchcd(){
		return this.recpbrchcd;
	}

	public String getNormerrclsf(){
		return this.normerrclsf;
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

	public String getCustbrwsno(){
		return this.custbrwsno;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BILL_NONRCPM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BILL_NONRCPMDM dm = (PS_A_BILL_NONRCPMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);

		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.procdt);
		cstmt.setString(5, dm.recpdt);
		cstmt.setString(6, dm.rcpmamt);
		cstmt.setString(7, dm.recpbrchcd);
		cstmt.setString(8, dm.normerrclsf);
		cstmt.setString(9, dm.rdr_no);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.termsubsno);
		cstmt.setString(12, dm.custbrwsno);
		cstmt.setString(13, dm.seq);
		cstmt.setString(14, dm.acqdt);
		cstmt.setString(15, dm.acqno);
		cstmt.setString(16, dm.bocd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_A_BILL_NONRCPMDataSet();
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
String procdt = req.getParameter("procdt");
if( procdt == null){
	System.out.println(this.toString+" : procdt is null" );
}else{
	System.out.println(this.toString+" : procdt is "+procdt );
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
String recpbrchcd = req.getParameter("recpbrchcd");
if( recpbrchcd == null){
	System.out.println(this.toString+" : recpbrchcd is null" );
}else{
	System.out.println(this.toString+" : recpbrchcd is "+recpbrchcd );
}
String normerrclsf = req.getParameter("normerrclsf");
if( normerrclsf == null){
	System.out.println(this.toString+" : normerrclsf is null" );
}else{
	System.out.println(this.toString+" : normerrclsf is "+normerrclsf );
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
String custbrwsno = req.getParameter("custbrwsno");
if( custbrwsno == null){
	System.out.println(this.toString+" : custbrwsno is null" );
}else{
	System.out.println(this.toString+" : custbrwsno is "+custbrwsno );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
}
String acqno = req.getParameter("acqno");
if( acqno == null){
	System.out.println(this.toString+" : acqno is null" );
}else{
	System.out.println(this.toString+" : acqno is "+acqno );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String procdt = Util.checkString(req.getParameter("procdt"));
String recpdt = Util.checkString(req.getParameter("recpdt"));
String rcpmamt = Util.checkString(req.getParameter("rcpmamt"));
String recpbrchcd = Util.checkString(req.getParameter("recpbrchcd"));
String normerrclsf = Util.checkString(req.getParameter("normerrclsf"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String custbrwsno = Util.checkString(req.getParameter("custbrwsno"));
String seq = Util.checkString(req.getParameter("seq"));
String acqdt = Util.checkString(req.getParameter("acqdt"));
String acqno = Util.checkString(req.getParameter("acqno"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
String recpdt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpdt")));
String rcpmamt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmamt")));
String recpbrchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpbrchcd")));
String normerrclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("normerrclsf")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String custbrwsno = Util.Uni2Ksc(Util.checkString(req.getParameter("custbrwsno")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String acqno = Util.Uni2Ksc(Util.checkString(req.getParameter("acqno")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setProcdt(procdt);
dm.setRecpdt(recpdt);
dm.setRcpmamt(rcpmamt);
dm.setRecpbrchcd(recpbrchcd);
dm.setNormerrclsf(normerrclsf);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setCustbrwsno(custbrwsno);
dm.setSeq(seq);
dm.setAcqdt(acqdt);
dm.setAcqno(acqno);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 30 10:53:52 KST 2004 */