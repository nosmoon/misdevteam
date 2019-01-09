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


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_U_MOVM_RDR_COST_BOACCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;
	public String bocd;
	public String bankcd;
	public String deps_persnm;
	public String acctno;

	public SS_U_MOVM_RDR_COST_BOACCTDM(){}
	public SS_U_MOVM_RDR_COST_BOACCTDM(String closmm, String bocd, String bankcd, String deps_persnm, String acctno){
		this.closmm = closmm;
		this.bocd = bocd;
		this.bankcd = bankcd;
		this.deps_persnm = deps_persnm;
		this.acctno = acctno;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public String getClosmm(){
		return this.closmm;
	}

	public String getBocd(){
		return this.bocd;
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

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_MOVM_RDR_COST_BOACCT(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_MOVM_RDR_COST_BOACCTDM dm = (SS_U_MOVM_RDR_COST_BOACCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.bankcd);
		cstmt.setString(6, dm.deps_persnm);
		cstmt.setString(7, dm.acctno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_U_MOVM_RDR_COST_BOACCTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("bankcd = [" + getBankcd() + "]");
		System.out.println("deps_persnm = [" + getDeps_persnm() + "]");
		System.out.println("acctno = [" + getAcctno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closmm = Util.checkString(req.getParameter("closmm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String deps_persnm = Util.checkString(req.getParameter("deps_persnm"));
String acctno = Util.checkString(req.getParameter("acctno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosmm(closmm);
dm.setBocd(bocd);
dm.setBankcd(bankcd);
dm.setDeps_persnm(deps_persnm);
dm.setAcctno(acctno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 24 09:59:31 GMT 2014 */