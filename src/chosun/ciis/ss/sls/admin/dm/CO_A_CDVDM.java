/***************************************************************************************************
* 파일명 : CO_A_CDVDM.java
* 기능 : 관리자-공통코드-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-공통코드-등록,수정,삭제를 위한 DM
 */

public class CO_A_CDVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String cimgtcd1;
	public String cimgtcd2;
	public String cimgtcd3;
	public String cimgtcd4;
	public String cimgtcd5;
	public String cimgtcd6;
	public String cimgtcd7;
	public String ciremarks;
	public String sabun;

	public CO_A_CDVDM(){}
	public CO_A_CDVDM(String accflag, String ciymgbcd, String cicdgb, String cicodeval, String cicdnm, String cicdynm, String cimgtcd1, String cimgtcd2, String cimgtcd3, String cimgtcd4, String cimgtcd5, String cimgtcd6, String cimgtcd7, String ciremarks, String sabun){
		this.accflag = accflag;
		this.ciymgbcd = ciymgbcd;
		this.cicdgb = cicdgb;
		this.cicodeval = cicodeval;
		this.cicdnm = cicdnm;
		this.cicdynm = cicdynm;
		this.cimgtcd1 = cimgtcd1;
		this.cimgtcd2 = cimgtcd2;
		this.cimgtcd3 = cimgtcd3;
		this.cimgtcd4 = cimgtcd4;
		this.cimgtcd5 = cimgtcd5;
		this.cimgtcd6 = cimgtcd6;
		this.cimgtcd7 = cimgtcd7;
		this.ciremarks = ciremarks;
		this.sabun = sabun;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
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

	public void setCiremarks(String ciremarks){
		this.ciremarks = ciremarks;
	}

	public void setSabun(String sabun){
		this.sabun = sabun;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
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

	public String getCiremarks(){
		return this.ciremarks;
	}

	public String getSabun(){
		return this.sabun;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_CDV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_CDVDM dm = (CO_A_CDVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.ciymgbcd);
		cstmt.setString(5, dm.cicdgb);
		cstmt.setString(6, dm.cicodeval);
		cstmt.setString(7, dm.cicdnm);
		cstmt.setString(8, dm.cicdynm);
		cstmt.setString(9, dm.cimgtcd1);
		cstmt.setString(10, dm.cimgtcd2);
		cstmt.setString(11, dm.cimgtcd3);
		cstmt.setString(12, dm.cimgtcd4);
		cstmt.setString(13, dm.cimgtcd5);
		cstmt.setString(14, dm.cimgtcd6);
		cstmt.setString(15, dm.cimgtcd7);
		cstmt.setString(16, dm.ciremarks);
		cstmt.setString(17, dm.sabun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.CO_A_CDVDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
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
String cicodeval = req.getParameter("cicodeval");
if( cicodeval == null){
	System.out.println(this.toString+" : cicodeval is null" );
}else{
	System.out.println(this.toString+" : cicodeval is "+cicodeval );
}
String cicdnm = req.getParameter("cicdnm");
if( cicdnm == null){
	System.out.println(this.toString+" : cicdnm is null" );
}else{
	System.out.println(this.toString+" : cicdnm is "+cicdnm );
}
String cicdynm = req.getParameter("cicdynm");
if( cicdynm == null){
	System.out.println(this.toString+" : cicdynm is null" );
}else{
	System.out.println(this.toString+" : cicdynm is "+cicdynm );
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
String ciremarks = req.getParameter("ciremarks");
if( ciremarks == null){
	System.out.println(this.toString+" : ciremarks is null" );
}else{
	System.out.println(this.toString+" : ciremarks is "+ciremarks );
}
String sabun = req.getParameter("sabun");
if( sabun == null){
	System.out.println(this.toString+" : sabun is null" );
}else{
	System.out.println(this.toString+" : sabun is "+sabun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
String cicdgb = Util.checkString(req.getParameter("cicdgb"));
String cicodeval = Util.checkString(req.getParameter("cicodeval"));
String cicdnm = Util.checkString(req.getParameter("cicdnm"));
String cicdynm = Util.checkString(req.getParameter("cicdynm"));
String cimgtcd1 = Util.checkString(req.getParameter("cimgtcd1"));
String cimgtcd2 = Util.checkString(req.getParameter("cimgtcd2"));
String cimgtcd3 = Util.checkString(req.getParameter("cimgtcd3"));
String cimgtcd4 = Util.checkString(req.getParameter("cimgtcd4"));
String cimgtcd5 = Util.checkString(req.getParameter("cimgtcd5"));
String cimgtcd6 = Util.checkString(req.getParameter("cimgtcd6"));
String cimgtcd7 = Util.checkString(req.getParameter("cimgtcd7"));
String ciremarks = Util.checkString(req.getParameter("ciremarks"));
String sabun = Util.checkString(req.getParameter("sabun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
String cicdgb = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdgb")));
String cicodeval = Util.Uni2Ksc(Util.checkString(req.getParameter("cicodeval")));
String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
String cicdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdynm")));
String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
String ciremarks = Util.Uni2Ksc(Util.checkString(req.getParameter("ciremarks")));
String sabun = Util.Uni2Ksc(Util.checkString(req.getParameter("sabun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCiymgbcd(ciymgbcd);
dm.setCicdgb(cicdgb);
dm.setCicodeval(cicodeval);
dm.setCicdnm(cicdnm);
dm.setCicdynm(cicdynm);
dm.setCimgtcd1(cimgtcd1);
dm.setCimgtcd2(cimgtcd2);
dm.setCimgtcd3(cimgtcd3);
dm.setCimgtcd4(cimgtcd4);
dm.setCimgtcd5(cimgtcd5);
dm.setCimgtcd6(cimgtcd6);
dm.setCimgtcd7(cimgtcd7);
dm.setCiremarks(ciremarks);
dm.setSabun(sabun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 20:41:27 KST 2004 */