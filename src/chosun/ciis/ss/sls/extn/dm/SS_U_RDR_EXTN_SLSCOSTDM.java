/***************************************************************************************************
* 파일명 : SS_U_RDR_EXTN_SLSCOSTDM.java
* 기능 : 확장지원비용 등록/조회를 위한 DM
* 작성일자 : 2003-12-18
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
 * class definition
 *
 */


public class SS_U_RDR_EXTN_SLSCOSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basidtary;
	public String bocdary;
	public String payqtyary;
	public String uprcary;
	public String splyamtary;

	public SS_U_RDR_EXTN_SLSCOSTDM(){}
	public SS_U_RDR_EXTN_SLSCOSTDM(String incmgpers, String basidtary, String bocdary, String payqtyary, String uprcary, String splyamtary){
		this.incmgpers = incmgpers;
		this.basidtary = basidtary;
		this.bocdary = bocdary;
		this.payqtyary = payqtyary;
		this.uprcary = uprcary;
		this.splyamtary = splyamtary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasidtary(String basidtary){
		this.basidtary = basidtary;
	}

	public void setBocdary(String bocdary){
		this.bocdary = bocdary;
	}

	public void setPayqtyary(String payqtyary){
		this.payqtyary = payqtyary;
	}

	public void setUprcary(String uprcary){
		this.uprcary = uprcary;
	}

	public void setSplyamtary(String splyamtary){
		this.splyamtary = splyamtary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasidtary(){
		return this.basidtary;
	}

	public String getBocdary(){
		return this.bocdary;
	}

	public String getPayqtyary(){
		return this.payqtyary;
	}

	public String getUprcary(){
		return this.uprcary;
	}

	public String getSplyamtary(){
		return this.splyamtary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_RDR_EXTN_SLSCOST( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_RDR_EXTN_SLSCOSTDM dm = (SS_U_RDR_EXTN_SLSCOSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.basidtary);
		cstmt.setString(5, dm.bocdary);
		cstmt.setString(6, dm.payqtyary);
		cstmt.setString(7, dm.uprcary);
		cstmt.setString(8, dm.splyamtary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_RDR_EXTN_SLSCOSTDataSet();
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
String basidtary = req.getParameter("basidtary");
if( basidtary == null){
	System.out.println(this.toString+" : basidtary is null" );
}else{
	System.out.println(this.toString+" : basidtary is "+basidtary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
	System.out.println(this.toString+" : bocdary is null" );
}else{
	System.out.println(this.toString+" : bocdary is "+bocdary );
}
String payqtyary = req.getParameter("payqtyary");
if( payqtyary == null){
	System.out.println(this.toString+" : payqtyary is null" );
}else{
	System.out.println(this.toString+" : payqtyary is "+payqtyary );
}
String uprcary = req.getParameter("uprcary");
if( uprcary == null){
	System.out.println(this.toString+" : uprcary is null" );
}else{
	System.out.println(this.toString+" : uprcary is "+uprcary );
}
String splyamtary = req.getParameter("splyamtary");
if( splyamtary == null){
	System.out.println(this.toString+" : splyamtary is null" );
}else{
	System.out.println(this.toString+" : splyamtary is "+splyamtary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String basidtary = Util.checkString(req.getParameter("basidtary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
String payqtyary = Util.checkString(req.getParameter("payqtyary"));
String uprcary = Util.checkString(req.getParameter("uprcary"));
String splyamtary = Util.checkString(req.getParameter("splyamtary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basidtary = Util.Uni2Ksc(Util.checkString(req.getParameter("basidtary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
String payqtyary = Util.Uni2Ksc(Util.checkString(req.getParameter("payqtyary")));
String uprcary = Util.Uni2Ksc(Util.checkString(req.getParameter("uprcary")));
String splyamtary = Util.Uni2Ksc(Util.checkString(req.getParameter("splyamtary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBasidtary(basidtary);
dm.setBocdary(bocdary);
dm.setPayqtyary(payqtyary);
dm.setUprcary(uprcary);
dm.setSplyamtary(splyamtary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 18 18:58:37 KST 2003 */