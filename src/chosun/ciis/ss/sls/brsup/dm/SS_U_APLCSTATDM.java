/***************************************************************************************************
* 파일명 : SS_U_APLCSTATDM.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-신청확인
* 작성일자 : 2004-03-26
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-신청확인
 *
 */


public class SS_U_APLCSTATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String aplcyn;
	public String aplcno;
	public String shftclsf;
	public String aplcdt;

	public SS_U_APLCSTATDM(){}
	public SS_U_APLCSTATDM(String bocd, String incmgpers, String aplcyn, String aplcno, String shftclsf, String aplcdt){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.aplcyn = aplcyn;
		this.aplcno = aplcno;
		this.shftclsf = shftclsf;
		this.aplcdt = aplcdt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcyn(String aplcyn){
		this.aplcyn = aplcyn;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcyn(){
		return this.aplcyn;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_APLCSTAT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_APLCSTATDM dm = (SS_U_APLCSTATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.aplcyn);
		cstmt.setString(6, dm.aplcno);
		cstmt.setString(7, dm.shftclsf);
		cstmt.setString(8, dm.aplcdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_APLCSTATDataSet();
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
String aplcyn = req.getParameter("aplcyn");
if( aplcyn == null){
	System.out.println(this.toString+" : aplcyn is null" );
}else{
	System.out.println(this.toString+" : aplcyn is "+aplcyn );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcyn = Util.checkString(req.getParameter("aplcyn"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcyn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcyn")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAplcyn(aplcyn);
dm.setAplcno(aplcno);
dm.setShftclsf(shftclsf);
dm.setAplcdt(aplcdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 30 15:55:20 KST 2004 */