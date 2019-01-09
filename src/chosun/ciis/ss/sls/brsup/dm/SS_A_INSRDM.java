/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국지원-상해보험-등록-등록
* 작성일자 : 2010-01-26
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *  지국지원-상해보험-등록-등록
 */

public class SS_A_INSRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String cntryy;
	public String insrnm;
	public String insrcmpynm;
	public String insrcmpychrgnm;
	public String insrcmpychrgemail;
	public long insruprc;
	public long splyuprc;
	public long insruprcf;
	public long splyuprcf;
	public String aplcfrdt;
	public String aplctodt;
	public String compdt;
	public String exprdt;

	public SS_A_INSRDM(){}
	public SS_A_INSRDM(String incmgpers, String accflag, String cntryy, String insrnm, String insrcmpynm, String insrcmpychrgnm, String insrcmpychrgemail, long insruprc, long splyuprc, long insruprcf, long splyuprcf, String aplcfrdt, String aplctodt, String compdt, String exprdt){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.cntryy = cntryy;
		this.insrnm = insrnm;
		this.insrcmpynm = insrcmpynm;
		this.insrcmpychrgnm = insrcmpychrgnm;
		this.insrcmpychrgemail = insrcmpychrgemail;
		this.insruprc = insruprc;
		this.splyuprc = splyuprc;
		this.insruprcf = insruprcf;
		this.splyuprcf = splyuprcf;
		this.aplcfrdt = aplcfrdt;
		this.aplctodt = aplctodt;
		this.compdt = compdt;
		this.exprdt = exprdt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public void setInsrcmpynm(String insrcmpynm){
		this.insrcmpynm = insrcmpynm;
	}

	public void setInsrcmpychrgnm(String insrcmpychrgnm){
		this.insrcmpychrgnm = insrcmpychrgnm;
	}

	public void setInsrcmpychrgemail(String insrcmpychrgemail){
		this.insrcmpychrgemail = insrcmpychrgemail;
	}

	public void setInsruprc(long insruprc){
		this.insruprc = insruprc;
	}

	public void setSplyuprc(long splyuprc){
		this.splyuprc = splyuprc;
	}

	public void setInsruprcf(long insruprcf){
		this.insruprcf = insruprcf;
	}

	public void setSplyuprcf(long splyuprcf){
		this.splyuprcf = splyuprcf;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public void setCompdt(String compdt){
		this.compdt = compdt;
	}

	public void setExprdt(String exprdt){
		this.exprdt = exprdt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getInsrnm(){
		return this.insrnm;
	}

	public String getInsrcmpynm(){
		return this.insrcmpynm;
	}

	public String getInsrcmpychrgnm(){
		return this.insrcmpychrgnm;
	}

	public String getInsrcmpychrgemail(){
		return this.insrcmpychrgemail;
	}

	public long getInsruprc(){
		return this.insruprc;
	}

	public long getSplyuprc(){
		return this.splyuprc;
	}

	public long getInsruprcf(){
		return this.insruprcf;
	}

	public long getSplyuprcf(){
		return this.splyuprcf;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}

	public String getCompdt(){
		return this.compdt;
	}

	public String getExprdt(){
		return this.exprdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_INSR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_INSRDM dm = (SS_A_INSRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.cntryy);
		cstmt.setString(6, dm.insrnm);
		cstmt.setString(7, dm.insrcmpynm);
		cstmt.setString(8, dm.insrcmpychrgnm);
		cstmt.setString(9, dm.insrcmpychrgemail);
		cstmt.setLong(10, dm.insruprc);
		cstmt.setLong(11, dm.splyuprc);
		cstmt.setLong(12, dm.insruprcf);
		cstmt.setLong(13, dm.splyuprcf);
		cstmt.setString(14, dm.aplcfrdt);
		cstmt.setString(15, dm.aplctodt);
		cstmt.setString(16, dm.compdt);
		cstmt.setString(17, dm.exprdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_INSRDataSet();
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cntryy = req.getParameter("cntryy");
if( cntryy == null){
	System.out.println(this.toString+" : cntryy is null" );
}else{
	System.out.println(this.toString+" : cntryy is "+cntryy );
}
String insrnm = req.getParameter("insrnm");
if( insrnm == null){
	System.out.println(this.toString+" : insrnm is null" );
}else{
	System.out.println(this.toString+" : insrnm is "+insrnm );
}
String insrcmpynm = req.getParameter("insrcmpynm");
if( insrcmpynm == null){
	System.out.println(this.toString+" : insrcmpynm is null" );
}else{
	System.out.println(this.toString+" : insrcmpynm is "+insrcmpynm );
}
String insrcmpychrgnm = req.getParameter("insrcmpychrgnm");
if( insrcmpychrgnm == null){
	System.out.println(this.toString+" : insrcmpychrgnm is null" );
}else{
	System.out.println(this.toString+" : insrcmpychrgnm is "+insrcmpychrgnm );
}
String insrcmpychrgemail = req.getParameter("insrcmpychrgemail");
if( insrcmpychrgemail == null){
	System.out.println(this.toString+" : insrcmpychrgemail is null" );
}else{
	System.out.println(this.toString+" : insrcmpychrgemail is "+insrcmpychrgemail );
}
String insruprc = req.getParameter("insruprc");
if( insruprc == null){
	System.out.println(this.toString+" : insruprc is null" );
}else{
	System.out.println(this.toString+" : insruprc is "+insruprc );
}
String splyuprc = req.getParameter("splyuprc");
if( splyuprc == null){
	System.out.println(this.toString+" : splyuprc is null" );
}else{
	System.out.println(this.toString+" : splyuprc is "+splyuprc );
}
String insruprcf = req.getParameter("insruprcf");
if( insruprcf == null){
	System.out.println(this.toString+" : insruprcf is null" );
}else{
	System.out.println(this.toString+" : insruprcf is "+insruprcf );
}
String splyuprcf = req.getParameter("splyuprcf");
if( splyuprcf == null){
	System.out.println(this.toString+" : splyuprcf is null" );
}else{
	System.out.println(this.toString+" : splyuprcf is "+splyuprcf );
}
String aplcfrdt = req.getParameter("aplcfrdt");
if( aplcfrdt == null){
	System.out.println(this.toString+" : aplcfrdt is null" );
}else{
	System.out.println(this.toString+" : aplcfrdt is "+aplcfrdt );
}
String aplctodt = req.getParameter("aplctodt");
if( aplctodt == null){
	System.out.println(this.toString+" : aplctodt is null" );
}else{
	System.out.println(this.toString+" : aplctodt is "+aplctodt );
}
String compdt = req.getParameter("compdt");
if( compdt == null){
	System.out.println(this.toString+" : compdt is null" );
}else{
	System.out.println(this.toString+" : compdt is "+compdt );
}
String exprdt = req.getParameter("exprdt");
if( exprdt == null){
	System.out.println(this.toString+" : exprdt is null" );
}else{
	System.out.println(this.toString+" : exprdt is "+exprdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String cntryy = Util.checkString(req.getParameter("cntryy"));
String insrnm = Util.checkString(req.getParameter("insrnm"));
String insrcmpynm = Util.checkString(req.getParameter("insrcmpynm"));
String insrcmpychrgnm = Util.checkString(req.getParameter("insrcmpychrgnm"));
String insrcmpychrgemail = Util.checkString(req.getParameter("insrcmpychrgemail"));
String insruprc = Util.checkString(req.getParameter("insruprc"));
String splyuprc = Util.checkString(req.getParameter("splyuprc"));
String insruprcf = Util.checkString(req.getParameter("insruprcf"));
String splyuprcf = Util.checkString(req.getParameter("splyuprcf"));
String aplcfrdt = Util.checkString(req.getParameter("aplcfrdt"));
String aplctodt = Util.checkString(req.getParameter("aplctodt"));
String compdt = Util.checkString(req.getParameter("compdt"));
String exprdt = Util.checkString(req.getParameter("exprdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cntryy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryy")));
String insrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrnm")));
String insrcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpynm")));
String insrcmpychrgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgnm")));
String insrcmpychrgemail = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgemail")));
String insruprc = Util.Uni2Ksc(Util.checkString(req.getParameter("insruprc")));
String splyuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("splyuprc")));
String insruprcf = Util.Uni2Ksc(Util.checkString(req.getParameter("insruprcf")));
String splyuprcf = Util.Uni2Ksc(Util.checkString(req.getParameter("splyuprcf")));
String aplcfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcfrdt")));
String aplctodt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplctodt")));
String compdt = Util.Uni2Ksc(Util.checkString(req.getParameter("compdt")));
String exprdt = Util.Uni2Ksc(Util.checkString(req.getParameter("exprdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setCntryy(cntryy);
dm.setInsrnm(insrnm);
dm.setInsrcmpynm(insrcmpynm);
dm.setInsrcmpychrgnm(insrcmpychrgnm);
dm.setInsrcmpychrgemail(insrcmpychrgemail);
dm.setInsruprc(insruprc);
dm.setSplyuprc(splyuprc);
dm.setInsruprcf(insruprcf);
dm.setSplyuprcf(splyuprcf);
dm.setAplcfrdt(aplcfrdt);
dm.setAplctodt(aplctodt);
dm.setCompdt(compdt);
dm.setExprdt(exprdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 08 10:49:53 KST 2010 */