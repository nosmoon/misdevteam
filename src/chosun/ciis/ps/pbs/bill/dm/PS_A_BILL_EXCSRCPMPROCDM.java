/***************************************************************************************************
 * 파일명   : PS_A_BILL_EXCSRCPMPROCDM.java
 * 기능     : 수금-초과입금처리 등록/삭제
 * 작성일자 : 2004-04-06
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-초과입금처리 등록/삭제
 */

public class PS_A_BILL_EXCSRCPMPROCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String procdt;
	public String bocd;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String procclsf;
	public String seq;
	public String memo;
	public String procamt;
	public String aftsubsendser_no;
	public String pers;

	public PS_A_BILL_EXCSRCPMPROCDM(){}
	public PS_A_BILL_EXCSRCPMPROCDM(String accflag, String procdt, String bocd, String rdr_no, String medicd, String termsubsno, String procclsf, String seq, String memo, String procamt, String aftsubsendser_no, String pers){
		this.accflag = accflag;
		this.procdt = procdt;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.procclsf = procclsf;
		this.seq = seq;
		this.memo = memo;
		this.procamt = procamt;
		this.aftsubsendser_no = aftsubsendser_no;
		this.pers = pers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setProcclsf(String procclsf){
		this.procclsf = procclsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setProcamt(String procamt){
		this.procamt = procamt;
	}

	public void setAftsubsendser_no(String aftsubsendser_no){
		this.aftsubsendser_no = aftsubsendser_no;
	}

	public void setPers(String pers){
		this.pers = pers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getBocd(){
		return this.bocd;
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

	public String getProcclsf(){
		return this.procclsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getProcamt(){
		return this.procamt;
	}

	public String getAftsubsendser_no(){
		return this.aftsubsendser_no;
	}

	public String getPers(){
		return this.pers;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BILL_EXCSRCPMPROC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BILL_EXCSRCPMPROCDM dm = (PS_A_BILL_EXCSRCPMPROCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.procdt);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.termsubsno);
		cstmt.setString(9, dm.procclsf);
		cstmt.setString(10, dm.seq);
		cstmt.setString(11, dm.memo);
		cstmt.setString(12, dm.procamt);
		cstmt.setString(13, dm.aftsubsendser_no);
		cstmt.setString(14, dm.pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_A_BILL_EXCSRCPMPROCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String procdt = req.getParameter("procdt");
if( procdt == null){
	System.out.println(this.toString+" : procdt is null" );
}else{
	System.out.println(this.toString+" : procdt is "+procdt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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
String procclsf = req.getParameter("procclsf");
if( procclsf == null){
	System.out.println(this.toString+" : procclsf is null" );
}else{
	System.out.println(this.toString+" : procclsf is "+procclsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String procamt = req.getParameter("procamt");
if( procamt == null){
	System.out.println(this.toString+" : procamt is null" );
}else{
	System.out.println(this.toString+" : procamt is "+procamt );
}
String aftsubsendser_no = req.getParameter("aftsubsendser_no");
if( aftsubsendser_no == null){
	System.out.println(this.toString+" : aftsubsendser_no is null" );
}else{
	System.out.println(this.toString+" : aftsubsendser_no is "+aftsubsendser_no );
}
String pers = req.getParameter("pers");
if( pers == null){
	System.out.println(this.toString+" : pers is null" );
}else{
	System.out.println(this.toString+" : pers is "+pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String procdt = Util.checkString(req.getParameter("procdt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String procclsf = Util.checkString(req.getParameter("procclsf"));
String seq = Util.checkString(req.getParameter("seq"));
String memo = Util.checkString(req.getParameter("memo"));
String procamt = Util.checkString(req.getParameter("procamt"));
String aftsubsendser_no = Util.checkString(req.getParameter("aftsubsendser_no"));
String pers = Util.checkString(req.getParameter("pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String procclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("procclsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String procamt = Util.Uni2Ksc(Util.checkString(req.getParameter("procamt")));
String aftsubsendser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aftsubsendser_no")));
String pers = Util.Uni2Ksc(Util.checkString(req.getParameter("pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setProcdt(procdt);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setProcclsf(procclsf);
dm.setSeq(seq);
dm.setMemo(memo);
dm.setProcamt(procamt);
dm.setAftsubsendser_no(aftsubsendser_no);
dm.setPers(pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 15:56:43 KST 2004 */