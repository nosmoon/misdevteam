/***************************************************************************************************
 * 파일명   : SP_SS_D_BOACCT.sql
 * 기능     : 지국Info-지국계좌관리(실시간계좌이체) 삭제
 * 작성일자 : 2006/11/28
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
**  SP_SS_D_BOACCT
**/

public class SS_D_BOACCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;
	public String bocd;
	public String acctitem;
	public String bankcd;
	public String acctno;
	public String deps_persnm;
	public String incmgpers;

	public SS_D_BOACCTDM(){}
	public SS_D_BOACCTDM(String seq, String bocd, String acctitem, String bankcd, String acctno, String deps_persnm, String incmgpers){
		this.seq = seq;
		this.bocd = bocd;
		this.acctitem = acctitem;
		this.bankcd = bankcd;
		this.acctno = acctno;
		this.deps_persnm = deps_persnm;
		this.incmgpers = incmgpers;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_BOACCT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_BOACCTDM dm = (SS_D_BOACCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.acctitem);
		cstmt.setString(6, dm.bankcd);
		cstmt.setString(7, dm.acctno);
		cstmt.setString(8, dm.deps_persnm);
		cstmt.setString(9, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_D_BOACCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String acctitem = req.getParameter("acctitem");
if( acctitem == null){
	System.out.println(this.toString+" : acctitem is null" );
}else{
	System.out.println(this.toString+" : acctitem is "+acctitem );
}
String bankcd = req.getParameter("bankcd");
if( bankcd == null){
	System.out.println(this.toString+" : bankcd is null" );
}else{
	System.out.println(this.toString+" : bankcd is "+bankcd );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String deps_persnm = req.getParameter("deps_persnm");
if( deps_persnm == null){
	System.out.println(this.toString+" : deps_persnm is null" );
}else{
	System.out.println(this.toString+" : deps_persnm is "+deps_persnm );
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

String seq = Util.checkString(req.getParameter("seq"));
String bocd = Util.checkString(req.getParameter("bocd"));
String acctitem = Util.checkString(req.getParameter("acctitem"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String acctno = Util.checkString(req.getParameter("acctno"));
String deps_persnm = Util.checkString(req.getParameter("deps_persnm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String acctitem = Util.Uni2Ksc(Util.checkString(req.getParameter("acctitem")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setBocd(bocd);
dm.setAcctitem(acctitem);
dm.setBankcd(bankcd);
dm.setAcctno(acctno);
dm.setDeps_persnm(deps_persnm);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 28 11:49:46 KST 2006 */