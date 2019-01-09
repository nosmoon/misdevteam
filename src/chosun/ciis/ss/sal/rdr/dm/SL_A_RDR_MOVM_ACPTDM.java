/***************************************************************************************************
* 파일명 : SL_A_RDR_MOVM_ACPTDM.java
* 기능 : 관할지국조정관리-인수(처리)
* 작성일자 : 2004-02-07
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
 * 관할지국조정관리-인수(처리)
 *
 */


public class SL_A_RDR_MOVM_ACPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String regdt;
	public String regno;
	public String seq;
	public String dstccd;
	public String dstcnm;
	public String rdrcnt;
	public String bgndlvno;
	public String enddlvno;
	public String rdr_movmdstccd;
	public String rdr_movmdstcnm;
	public String rdr_movmdlvbgnno;

	public SL_A_RDR_MOVM_ACPTDM(){}
	public SL_A_RDR_MOVM_ACPTDM(String bocd, String incmgpers, String regdt, String regno, String seq, String dstccd, String dstcnm, String rdrcnt, String bgndlvno, String enddlvno, String rdr_movmdstccd, String rdr_movmdstcnm, String rdr_movmdlvbgnno){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.regno = regno;
		this.seq = seq;
		this.dstccd = dstccd;
		this.dstcnm = dstcnm;
		this.rdrcnt = rdrcnt;
		this.bgndlvno = bgndlvno;
		this.enddlvno = enddlvno;
		this.rdr_movmdstccd = rdr_movmdstccd;
		this.rdr_movmdstcnm = rdr_movmdstcnm;
		this.rdr_movmdlvbgnno = rdr_movmdlvbgnno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setRdrcnt(String rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public void setRdr_movmdstccd(String rdr_movmdstccd){
		this.rdr_movmdstccd = rdr_movmdstccd;
	}

	public void setRdr_movmdstcnm(String rdr_movmdstcnm){
		this.rdr_movmdstcnm = rdr_movmdstcnm;
	}

	public void setRdr_movmdlvbgnno(String rdr_movmdlvbgnno){
		this.rdr_movmdlvbgnno = rdr_movmdlvbgnno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public String getRdrcnt(){
		return this.rdrcnt;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}

	public String getRdr_movmdstccd(){
		return this.rdr_movmdstccd;
	}

	public String getRdr_movmdstcnm(){
		return this.rdr_movmdstcnm;
	}

	public String getRdr_movmdlvbgnno(){
		return this.rdr_movmdlvbgnno;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_RDR_MOVM_ACPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDR_MOVM_ACPTDM dm = (SL_A_RDR_MOVM_ACPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.regdt);
		cstmt.setString(6, dm.regno);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.dstccd);
		cstmt.setString(9, dm.dstcnm);
		cstmt.setString(10, dm.rdrcnt);
		cstmt.setString(11, dm.bgndlvno);
		cstmt.setString(12, dm.enddlvno);
		cstmt.setString(13, dm.rdr_movmdstccd);
		cstmt.setString(14, dm.rdr_movmdstcnm);
		cstmt.setString(15, dm.rdr_movmdlvbgnno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDR_MOVM_ACPTDataSet();
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String dstccd = req.getParameter("dstccd");
if( dstccd == null){
	System.out.println(this.toString+" : dstccd is null" );
}else{
	System.out.println(this.toString+" : dstccd is "+dstccd );
}
String dstcnm = req.getParameter("dstcnm");
if( dstcnm == null){
	System.out.println(this.toString+" : dstcnm is null" );
}else{
	System.out.println(this.toString+" : dstcnm is "+dstcnm );
}
String rdrcnt = req.getParameter("rdrcnt");
if( rdrcnt == null){
	System.out.println(this.toString+" : rdrcnt is null" );
}else{
	System.out.println(this.toString+" : rdrcnt is "+rdrcnt );
}
String bgndlvno = req.getParameter("bgndlvno");
if( bgndlvno == null){
	System.out.println(this.toString+" : bgndlvno is null" );
}else{
	System.out.println(this.toString+" : bgndlvno is "+bgndlvno );
}
String enddlvno = req.getParameter("enddlvno");
if( enddlvno == null){
	System.out.println(this.toString+" : enddlvno is null" );
}else{
	System.out.println(this.toString+" : enddlvno is "+enddlvno );
}
String rdr_movmdstccd = req.getParameter("rdr_movmdstccd");
if( rdr_movmdstccd == null){
	System.out.println(this.toString+" : rdr_movmdstccd is null" );
}else{
	System.out.println(this.toString+" : rdr_movmdstccd is "+rdr_movmdstccd );
}
String rdr_movmdstcnm = req.getParameter("rdr_movmdstcnm");
if( rdr_movmdstcnm == null){
	System.out.println(this.toString+" : rdr_movmdstcnm is null" );
}else{
	System.out.println(this.toString+" : rdr_movmdstcnm is "+rdr_movmdstcnm );
}
String rdr_movmdlvbgnno = req.getParameter("rdr_movmdlvbgnno");
if( rdr_movmdlvbgnno == null){
	System.out.println(this.toString+" : rdr_movmdlvbgnno is null" );
}else{
	System.out.println(this.toString+" : rdr_movmdlvbgnno is "+rdr_movmdlvbgnno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String seq = Util.checkString(req.getParameter("seq"));
String dstccd = Util.checkString(req.getParameter("dstccd"));
String dstcnm = Util.checkString(req.getParameter("dstcnm"));
String rdrcnt = Util.checkString(req.getParameter("rdrcnt"));
String bgndlvno = Util.checkString(req.getParameter("bgndlvno"));
String enddlvno = Util.checkString(req.getParameter("enddlvno"));
String rdr_movmdstccd = Util.checkString(req.getParameter("rdr_movmdstccd"));
String rdr_movmdstcnm = Util.checkString(req.getParameter("rdr_movmdstcnm"));
String rdr_movmdlvbgnno = Util.checkString(req.getParameter("rdr_movmdlvbgnno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstccd")));
String dstcnm = Util.Uni2Ksc(Util.checkString(req.getParameter("dstcnm")));
String rdrcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrcnt")));
String bgndlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("bgndlvno")));
String enddlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("enddlvno")));
String rdr_movmdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_movmdstccd")));
String rdr_movmdstcnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_movmdstcnm")));
String rdr_movmdlvbgnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_movmdlvbgnno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setSeq(seq);
dm.setDstccd(dstccd);
dm.setDstcnm(dstcnm);
dm.setRdrcnt(rdrcnt);
dm.setBgndlvno(bgndlvno);
dm.setEnddlvno(enddlvno);
dm.setRdr_movmdstccd(rdr_movmdstccd);
dm.setRdr_movmdstcnm(rdr_movmdstcnm);
dm.setRdr_movmdlvbgnno(rdr_movmdlvbgnno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 07 17:32:54 KST 2004 */