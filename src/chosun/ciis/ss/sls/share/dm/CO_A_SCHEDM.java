/***************************************************************************************************
* 파일명 : CO_A_SCHEDM.java
* 기능 : 정보공유-일정-등록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일정-등록을 위한 DM
 */

public class CO_A_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public long seq;
	public String schemangitemcd;
	public String schemangunitcd;
	public String frdt;
	public String todt;
	public String remk;
	public String deptcd;
	public String deptnm;
	public String use_pers;
	public String use_persclsf;
	public String empnm;

	public CO_A_SCHEDM(){}
	public CO_A_SCHEDM(String incmgpers, String accflag, long seq, String schemangitemcd, String schemangunitcd, String frdt, String todt, String remk, String deptcd, String deptnm, String use_pers, String use_persclsf, String empnm){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.seq = seq;
		this.schemangitemcd = schemangitemcd;
		this.schemangunitcd = schemangunitcd;
		this.frdt = frdt;
		this.todt = todt;
		this.remk = remk;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.use_pers = use_pers;
		this.use_persclsf = use_persclsf;
		this.empnm = empnm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setSchemangitemcd(String schemangitemcd){
		this.schemangitemcd = schemangitemcd;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_persclsf(String use_persclsf){
		this.use_persclsf = use_persclsf;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getSchemangitemcd(){
		return this.schemangitemcd;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_persclsf(){
		return this.use_persclsf;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_SCHE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_SCHEDM dm = (CO_A_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setLong(5, dm.seq);
		cstmt.setString(6, dm.schemangitemcd);
		cstmt.setString(7, dm.schemangunitcd);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.deptcd);
		cstmt.setString(12, dm.deptnm);
		cstmt.setString(13, dm.use_pers);
		cstmt.setString(14, dm.use_persclsf);
		cstmt.setString(15, dm.empnm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.CO_A_SCHEDataSet();
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String schemangitemcd = req.getParameter("schemangitemcd");
if( schemangitemcd == null){
	System.out.println(this.toString+" : schemangitemcd is null" );
}else{
	System.out.println(this.toString+" : schemangitemcd is "+schemangitemcd );
}
String schemangunitcd = req.getParameter("schemangunitcd");
if( schemangunitcd == null){
	System.out.println(this.toString+" : schemangunitcd is null" );
}else{
	System.out.println(this.toString+" : schemangunitcd is "+schemangunitcd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
	System.out.println(this.toString+" : deptnm is null" );
}else{
	System.out.println(this.toString+" : deptnm is "+deptnm );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String use_persclsf = req.getParameter("use_persclsf");
if( use_persclsf == null){
	System.out.println(this.toString+" : use_persclsf is null" );
}else{
	System.out.println(this.toString+" : use_persclsf is "+use_persclsf );
}
String empnm = req.getParameter("empnm");
if( empnm == null){
	System.out.println(this.toString+" : empnm is null" );
}else{
	System.out.println(this.toString+" : empnm is "+empnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String seq = Util.checkString(req.getParameter("seq"));
String schemangitemcd = Util.checkString(req.getParameter("schemangitemcd"));
String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String remk = Util.checkString(req.getParameter("remk"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String use_persclsf = Util.checkString(req.getParameter("use_persclsf"));
String empnm = Util.checkString(req.getParameter("empnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String schemangitemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("schemangitemcd")));
String schemangunitcd = Util.Uni2Ksc(Util.checkString(req.getParameter("schemangunitcd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String deptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String use_persclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("use_persclsf")));
String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setSeq(seq);
dm.setSchemangitemcd(schemangitemcd);
dm.setSchemangunitcd(schemangunitcd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRemk(remk);
dm.setDeptcd(deptcd);
dm.setDeptnm(deptnm);
dm.setUse_pers(use_pers);
dm.setUse_persclsf(use_persclsf);
dm.setEmpnm(empnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 05 16:43:09 KST 2004 */