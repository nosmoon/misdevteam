/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면
* 작성일자 :009/05/04
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템-판촉물재고현황-상세조회화면
 */

public class SS_S_DETASLM_BNSITEMINOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemclsf;
	public String itemcd;
	public String itemnm;
	public String frdt;
	public String todt;
	public String cmpycd;

	public SS_S_DETASLM_BNSITEMINOUTDM(){}
	public SS_S_DETASLM_BNSITEMINOUTDM(String itemclsf, String itemcd, String itemnm, String frdt, String todt, String cmpycd){
		this.itemclsf = itemclsf;
		this.itemcd = itemcd;
		this.itemnm = itemnm;
		this.frdt = frdt;
		this.todt = todt;
		this.cmpycd = cmpycd;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_DETASLM_BNSITEMINOUT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_DETASLM_BNSITEMINOUTDM dm = (SS_S_DETASLM_BNSITEMINOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemclsf);
		cstmt.setString(4, dm.itemcd);
		cstmt.setString(5, dm.itemnm);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.cmpycd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_DETASLM_BNSITEMINOUTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String itemnm = req.getParameter("itemnm");
if( itemnm == null){
	System.out.println(this.toString+" : itemnm is null" );
}else{
	System.out.println(this.toString+" : itemnm is "+itemnm );
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
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String itemnm = Util.checkString(req.getParameter("itemnm"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("itemnm")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setItemclsf(itemclsf);
dm.setItemcd(itemcd);
dm.setItemnm(itemnm);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 10:50:55 PDT 2009 */