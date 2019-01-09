/***************************************************************************************************
* 파일명 : CO_L_TAOCC_CDVDM.java
* 기능 : 공통코드 목록조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통코드 목록조회를 위한 DataModel
 */
public class CO_L_TAOCC_CDVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cimgtcd1;
	public String cimgtcd2;
	public String cimgtcd3;
	public String cimgtcd4;
	public String cimgtcd5;
	public String cimgtcd6;
	public String cimgtcd7;

	public CO_L_TAOCC_CDVDM(){}
	public CO_L_TAOCC_CDVDM(String ciymgbcd, String cicdgb, String cimgtcd1, String cimgtcd2, String cimgtcd3, String cimgtcd4, String cimgtcd5, String cimgtcd6, String cimgtcd7){
		this.ciymgbcd = ciymgbcd;
		this.cicdgb = cicdgb;
		this.cimgtcd1 = cimgtcd1;
		this.cimgtcd2 = cimgtcd2;
		this.cimgtcd3 = cimgtcd3;
		this.cimgtcd4 = cimgtcd4;
		this.cimgtcd5 = cimgtcd5;
		this.cimgtcd6 = cimgtcd6;
		this.cimgtcd7 = cimgtcd7;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCimgtcd1(String cimgtcd1){
		this.cimgtcd1 = cimgtcd1;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public void setCimgtcd3(String cimgtcd3){
		this.cimgtcd3 = cimgtcd3;
	}

	public void setCimgtcd4(String cimgtcd4){
		this.cimgtcd4 = cimgtcd4;
	}

	public void setCimgtcd5(String cimgtcd5){
		this.cimgtcd5 = cimgtcd5;
	}

	public void setCimgtcd6(String cimgtcd6){
		this.cimgtcd6 = cimgtcd6;
	}

	public void setCimgtcd7(String cimgtcd7){
		this.cimgtcd7 = cimgtcd7;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCimgtcd1(){
		return this.cimgtcd1;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}

	public String getCimgtcd3(){
		return this.cimgtcd3;
	}

	public String getCimgtcd4(){
		return this.cimgtcd4;
	}

	public String getCimgtcd5(){
		return this.cimgtcd5;
	}

	public String getCimgtcd6(){
		return this.cimgtcd6;
	}

	public String getCimgtcd7(){
		return this.cimgtcd7;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_TAOCC_CDV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_TAOCC_CDVDM dm = (CO_L_TAOCC_CDVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ciymgbcd);
		cstmt.setString(4, dm.cicdgb);
		cstmt.setString(5, dm.cimgtcd1);
		cstmt.setString(6, dm.cimgtcd2);
		cstmt.setString(7, dm.cimgtcd3);
		cstmt.setString(8, dm.cimgtcd4);
		cstmt.setString(9, dm.cimgtcd5);
		cstmt.setString(10, dm.cimgtcd6);
		cstmt.setString(11, dm.cimgtcd7);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.CO_L_TAOCC_CDVDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ciymgbcd = req.getParameter("ciymgbcd");
if( ciymgbcd == null){
	System.out.println(this.toString+" : ciymgbcd is null" );
}else{
	System.out.println(this.toString+" : ciymgbcd is "+ciymgbcd );
}
String cicdgb = req.getParameter("cicdgb");
if( cicdgb == null){
	System.out.println(this.toString+" : cicdgb is null" );
}else{
	System.out.println(this.toString+" : cicdgb is "+cicdgb );
}
String cimgtcd1 = req.getParameter("cimgtcd1");
if( cimgtcd1 == null){
	System.out.println(this.toString+" : cimgtcd1 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd1 is "+cimgtcd1 );
}
String cimgtcd2 = req.getParameter("cimgtcd2");
if( cimgtcd2 == null){
	System.out.println(this.toString+" : cimgtcd2 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd2 is "+cimgtcd2 );
}
String cimgtcd3 = req.getParameter("cimgtcd3");
if( cimgtcd3 == null){
	System.out.println(this.toString+" : cimgtcd3 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd3 is "+cimgtcd3 );
}
String cimgtcd4 = req.getParameter("cimgtcd4");
if( cimgtcd4 == null){
	System.out.println(this.toString+" : cimgtcd4 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd4 is "+cimgtcd4 );
}
String cimgtcd5 = req.getParameter("cimgtcd5");
if( cimgtcd5 == null){
	System.out.println(this.toString+" : cimgtcd5 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd5 is "+cimgtcd5 );
}
String cimgtcd6 = req.getParameter("cimgtcd6");
if( cimgtcd6 == null){
	System.out.println(this.toString+" : cimgtcd6 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd6 is "+cimgtcd6 );
}
String cimgtcd7 = req.getParameter("cimgtcd7");
if( cimgtcd7 == null){
	System.out.println(this.toString+" : cimgtcd7 is null" );
}else{
	System.out.println(this.toString+" : cimgtcd7 is "+cimgtcd7 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
String cicdgb = Util.checkString(req.getParameter("cicdgb"));
String cimgtcd1 = Util.checkString(req.getParameter("cimgtcd1"));
String cimgtcd2 = Util.checkString(req.getParameter("cimgtcd2"));
String cimgtcd3 = Util.checkString(req.getParameter("cimgtcd3"));
String cimgtcd4 = Util.checkString(req.getParameter("cimgtcd4"));
String cimgtcd5 = Util.checkString(req.getParameter("cimgtcd5"));
String cimgtcd6 = Util.checkString(req.getParameter("cimgtcd6"));
String cimgtcd7 = Util.checkString(req.getParameter("cimgtcd7"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
String cicdgb = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdgb")));
String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCiymgbcd(ciymgbcd);
dm.setCicdgb(cicdgb);
dm.setCimgtcd1(cimgtcd1);
dm.setCimgtcd2(cimgtcd2);
dm.setCimgtcd3(cimgtcd3);
dm.setCimgtcd4(cimgtcd4);
dm.setCimgtcd5(cimgtcd5);
dm.setCimgtcd6(cimgtcd6);
dm.setCimgtcd7(cimgtcd7);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 15 13:55:36 KST 2003 */