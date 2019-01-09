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


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_L_PROMSTAF_IS_EXCELDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String stafclsfcd;
	public String cntrstatcd;
	public String stafno;
	public String stafnm;
	public String prn;
	public String ernno;

	public SS_L_PROMSTAF_IS_EXCELDM(){}
	public SS_L_PROMSTAF_IS_EXCELDM(String stafclsfcd, String cntrstatcd, String stafno, String stafnm, String prn, String ernno){
		this.stafclsfcd = stafclsfcd;
		this.cntrstatcd = cntrstatcd;
		this.stafno = stafno;
		this.stafnm = stafnm;
		this.prn = prn;
		this.ernno = ernno;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_PROMSTAF_IS_EXCEL(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_IS_EXCELDM dm = (SS_L_PROMSTAF_IS_EXCELDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.stafclsfcd);
		cstmt.setString(4, dm.cntrstatcd);
		cstmt.setString(5, dm.stafno);
		cstmt.setString(6, dm.stafnm);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ernno);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PROMSTAF_IS_EXCELDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("stafclsfcd = [" + getStafclsfcd() + "]");
		System.out.println("cntrstatcd = [" + getCntrstatcd() + "]");
		System.out.println("stafno = [" + getStafno() + "]");
		System.out.println("stafnm = [" + getStafnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("ernno = [" + getErnno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String cntrstatcd = req.getParameter("cntrstatcd");
if( cntrstatcd == null){
	System.out.println(this.toString+" : cntrstatcd is null" );
}else{
	System.out.println(this.toString+" : cntrstatcd is "+cntrstatcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ernno = req.getParameter("ernno");
if( ernno == null){
	System.out.println(this.toString+" : ernno is null" );
}else{
	System.out.println(this.toString+" : ernno is "+ernno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String cntrstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrstatcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setStafclsfcd(stafclsfcd);
dm.setCntrstatcd(cntrstatcd);
dm.setStafno(stafno);
dm.setStafnm(stafnm);
dm.setPrn(prn);
dm.setErnno(ernno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 19 15:59:47 KST 2016 */