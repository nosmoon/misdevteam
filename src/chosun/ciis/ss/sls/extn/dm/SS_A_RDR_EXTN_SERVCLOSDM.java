/***************************************************************************************************
* 파일명 : SS_A_RDR_EXTN_SERVCLOSDM.java
* 기능 : 확장현황-조선IS확장-마감(조선IS)-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-조선IS확장-마감(조선IS)-등록,수정,삭제를 위한 DM
 */


public class SS_A_RDR_EXTN_SERVCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;
	public String clamdt;
	public String remk;
	public String medicdary;
	public String deptcdary;
	public String basiamt1ary;
	public String basiamt2ary;
	public String basiamt3ary;

	public SS_A_RDR_EXTN_SERVCLOSDM(){}
	public SS_A_RDR_EXTN_SERVCLOSDM(String incmgpers, String accflag, String basidt, String frdt, String todt, String closdt, String clamdt, String remk, String medicdary, String deptcdary, String basiamt1ary, String basiamt2ary, String basiamt3ary){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closdt = closdt;
		this.clamdt = clamdt;
		this.remk = remk;
		this.medicdary = medicdary;
		this.deptcdary = deptcdary;
		this.basiamt1ary = basiamt1ary;
		this.basiamt2ary = basiamt2ary;
		this.basiamt3ary = basiamt3ary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setClamdt(String clamdt){
		this.clamdt = clamdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMedicdary(String medicdary){
		this.medicdary = medicdary;
	}

	public void setDeptcdary(String deptcdary){
		this.deptcdary = deptcdary;
	}

	public void setBasiamt1ary(String basiamt1ary){
		this.basiamt1ary = basiamt1ary;
	}

	public void setBasiamt2ary(String basiamt2ary){
		this.basiamt2ary = basiamt2ary;
	}

	public void setBasiamt3ary(String basiamt3ary){
		this.basiamt3ary = basiamt3ary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getClamdt(){
		return this.clamdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMedicdary(){
		return this.medicdary;
	}

	public String getDeptcdary(){
		return this.deptcdary;
	}

	public String getBasiamt1ary(){
		return this.basiamt1ary;
	}

	public String getBasiamt2ary(){
		return this.basiamt2ary;
	}

	public String getBasiamt3ary(){
		return this.basiamt3ary;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_RDR_EXTN_SERVCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_RDR_EXTN_SERVCLOSDM dm = (SS_A_RDR_EXTN_SERVCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.basidt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.closdt);
		cstmt.setString(9, dm.clamdt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.medicdary);
		cstmt.setString(12, dm.deptcdary);
		cstmt.setString(13, dm.basiamt1ary);
		cstmt.setString(14, dm.basiamt2ary);
		cstmt.setString(15, dm.basiamt3ary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_RDR_EXTN_SERVCLOSDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
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
String closdt = req.getParameter("closdt");
if( closdt == null){
	System.out.println(this.toString+" : closdt is null" );
}else{
	System.out.println(this.toString+" : closdt is "+closdt );
}
String clamdt = req.getParameter("clamdt");
if( clamdt == null){
	System.out.println(this.toString+" : clamdt is null" );
}else{
	System.out.println(this.toString+" : clamdt is "+clamdt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String medicdary = req.getParameter("medicdary");
if( medicdary == null){
	System.out.println(this.toString+" : medicdary is null" );
}else{
	System.out.println(this.toString+" : medicdary is "+medicdary );
}
String deptcdary = req.getParameter("deptcdary");
if( deptcdary == null){
	System.out.println(this.toString+" : deptcdary is null" );
}else{
	System.out.println(this.toString+" : deptcdary is "+deptcdary );
}
String basiamt1ary = req.getParameter("basiamt1ary");
if( basiamt1ary == null){
	System.out.println(this.toString+" : basiamt1ary is null" );
}else{
	System.out.println(this.toString+" : basiamt1ary is "+basiamt1ary );
}
String basiamt2ary = req.getParameter("basiamt2ary");
if( basiamt2ary == null){
	System.out.println(this.toString+" : basiamt2ary is null" );
}else{
	System.out.println(this.toString+" : basiamt2ary is "+basiamt2ary );
}
String basiamt3ary = req.getParameter("basiamt3ary");
if( basiamt3ary == null){
	System.out.println(this.toString+" : basiamt3ary is null" );
}else{
	System.out.println(this.toString+" : basiamt3ary is "+basiamt3ary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String basidt = Util.checkString(req.getParameter("basidt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String closdt = Util.checkString(req.getParameter("closdt"));
String clamdt = Util.checkString(req.getParameter("clamdt"));
String remk = Util.checkString(req.getParameter("remk"));
String medicdary = Util.checkString(req.getParameter("medicdary"));
String deptcdary = Util.checkString(req.getParameter("deptcdary"));
String basiamt1ary = Util.checkString(req.getParameter("basiamt1ary"));
String basiamt2ary = Util.checkString(req.getParameter("basiamt2ary"));
String basiamt3ary = Util.checkString(req.getParameter("basiamt3ary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String closdt = Util.Uni2Ksc(Util.checkString(req.getParameter("closdt")));
String clamdt = Util.Uni2Ksc(Util.checkString(req.getParameter("clamdt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String medicdary = Util.Uni2Ksc(Util.checkString(req.getParameter("medicdary")));
String deptcdary = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcdary")));
String basiamt1ary = Util.Uni2Ksc(Util.checkString(req.getParameter("basiamt1ary")));
String basiamt2ary = Util.Uni2Ksc(Util.checkString(req.getParameter("basiamt2ary")));
String basiamt3ary = Util.Uni2Ksc(Util.checkString(req.getParameter("basiamt3ary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setBasidt(basidt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setClosdt(closdt);
dm.setClamdt(clamdt);
dm.setRemk(remk);
dm.setMedicdary(medicdary);
dm.setDeptcdary(deptcdary);
dm.setBasiamt1ary(basiamt1ary);
dm.setBasiamt2ary(basiamt2ary);
dm.setBasiamt3ary(basiamt3ary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 03 10:16:35 KST 2004 */