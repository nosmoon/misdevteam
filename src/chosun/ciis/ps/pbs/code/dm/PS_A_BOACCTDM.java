/***************************************************************************************************
* 파일명 : PS_A_BOACCT.java
* 기능   : 출판국-지사계좌관리 입력/수정/삭제
* 작성일자 : 2006-11-09
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 출판지사-통합코드관리 입력/수정/삭제
 *
 */

public class PS_A_BOACCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String incmgpers;
	public String seq;
	public String acctitem;
	public String depskind;
	public String bankcd;
	public String deps_persnm;
	public String acctno;
	public String remk;

	public PS_A_BOACCTDM(){}
	public PS_A_BOACCTDM(String accflag, String bocd, String incmgpers, String seq, String acctitem, String depskind, String bankcd, String deps_persnm, String acctno, String remk){
		this.accflag = accflag;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.seq = seq;
		this.acctitem = acctitem;
		this.depskind = depskind;
		this.bankcd = bankcd;
		this.deps_persnm = deps_persnm;
		this.acctno = acctno;
		this.remk = remk;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setDepskind(String depskind){
		this.depskind = depskind;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getDepskind(){
		return this.depskind;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BOACCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BOACCTDM dm = (PS_A_BOACCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.acctitem);
		cstmt.setString(8, dm.depskind);
		cstmt.setString(9, dm.bankcd);
		cstmt.setString(10, dm.deps_persnm);
		cstmt.setString(11, dm.acctno);
		cstmt.setString(12, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_A_BOACCTDataSet();
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String acctitem = req.getParameter("acctitem");
if( acctitem == null){
	System.out.println(this.toString+" : acctitem is null" );
}else{
	System.out.println(this.toString+" : acctitem is "+acctitem );
}
String depskind = req.getParameter("depskind");
if( depskind == null){
	System.out.println(this.toString+" : depskind is null" );
}else{
	System.out.println(this.toString+" : depskind is "+depskind );
}
String bankcd = req.getParameter("bankcd");
if( bankcd == null){
	System.out.println(this.toString+" : bankcd is null" );
}else{
	System.out.println(this.toString+" : bankcd is "+bankcd );
}
String deps_persnm = req.getParameter("deps_persnm");
if( deps_persnm == null){
	System.out.println(this.toString+" : deps_persnm is null" );
}else{
	System.out.println(this.toString+" : deps_persnm is "+deps_persnm );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String seq = Util.checkString(req.getParameter("seq"));
String acctitem = Util.checkString(req.getParameter("acctitem"));
String depskind = Util.checkString(req.getParameter("depskind"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String deps_persnm = Util.checkString(req.getParameter("deps_persnm"));
String acctno = Util.checkString(req.getParameter("acctno"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String acctitem = Util.Uni2Ksc(Util.checkString(req.getParameter("acctitem")));
String depskind = Util.Uni2Ksc(Util.checkString(req.getParameter("depskind")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setSeq(seq);
dm.setAcctitem(acctitem);
dm.setDepskind(depskind);
dm.setBankcd(bankcd);
dm.setDeps_persnm(deps_persnm);
dm.setAcctno(acctno);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 10 14:38:06 KST 2006 */