/***************************************************************************************************
 * 파일명   : SP_SS_U_EDI_LOAD
 * 기능     : 지국지원-빌링-EDI
 * 작성일자 : 2007/07/23
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_U_EDI_LOAD
**/

public class SS_U_EDI_LOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String filename;
	public String header;
	public String body1;
	public String body2;
	public String body3;
	public String body4;
	public String body5;
	public String trail;
	public String incmgpers;

	public SS_U_EDI_LOADDM(){}
	public SS_U_EDI_LOADDM(String filename, String header, String body1, String body2, String body3, String body4, String body5, String trail, String incmgpers){
		this.filename = filename;
		this.header = header;
		this.body1 = body1;
		this.body2 = body2;
		this.body3 = body3;
		this.body4 = body4;
		this.body5 = body5;
		this.trail = trail;
		this.incmgpers = incmgpers;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public void setHeader(String header){
		this.header = header;
	}

	public void setBody1(String body1){
		this.body1 = body1;
	}

	public void setBody2(String body2){
		this.body2 = body2;
	}

	public void setBody3(String body3){
		this.body3 = body3;
	}

	public void setBody4(String body4){
		this.body4 = body4;
	}

	public void setBody5(String body5){
		this.body5 = body5;
	}

	public void setTrail(String trail){
		this.trail = trail;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getFilename(){
		return this.filename;
	}

	public String getHeader(){
		return this.header;
	}

	public String getBody1(){
		return this.body1;
	}

	public String getBody2(){
		return this.body2;
	}

	public String getBody3(){
		return this.body3;
	}

	public String getBody4(){
		return this.body4;
	}

	public String getBody5(){
		return this.body5;
	}

	public String getTrail(){
		return this.trail;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EDI_LOAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EDI_LOADDM dm = (SS_U_EDI_LOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.filename);
		cstmt.setString(4, dm.header);
		cstmt.setString(5, dm.body1);
		cstmt.setString(6, dm.body2);
		cstmt.setString(7, dm.body3);
		cstmt.setString(8, dm.body4);
		cstmt.setString(9, dm.body5);
		cstmt.setString(10, dm.trail);
		cstmt.setString(11, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_EDI_LOADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String filename = req.getParameter("filename");
if( filename == null){
	System.out.println(this.toString+" : filename is null" );
}else{
	System.out.println(this.toString+" : filename is "+filename );
}
String header = req.getParameter("header");
if( header == null){
	System.out.println(this.toString+" : header is null" );
}else{
	System.out.println(this.toString+" : header is "+header );
}
String body1 = req.getParameter("body1");
if( body1 == null){
	System.out.println(this.toString+" : body1 is null" );
}else{
	System.out.println(this.toString+" : body1 is "+body1 );
}
String body2 = req.getParameter("body2");
if( body2 == null){
	System.out.println(this.toString+" : body2 is null" );
}else{
	System.out.println(this.toString+" : body2 is "+body2 );
}
String body3 = req.getParameter("body3");
if( body3 == null){
	System.out.println(this.toString+" : body3 is null" );
}else{
	System.out.println(this.toString+" : body3 is "+body3 );
}
String body4 = req.getParameter("body4");
if( body4 == null){
	System.out.println(this.toString+" : body4 is null" );
}else{
	System.out.println(this.toString+" : body4 is "+body4 );
}
String body5 = req.getParameter("body5");
if( body5 == null){
	System.out.println(this.toString+" : body5 is null" );
}else{
	System.out.println(this.toString+" : body5 is "+body5 );
}
String trail = req.getParameter("trail");
if( trail == null){
	System.out.println(this.toString+" : trail is null" );
}else{
	System.out.println(this.toString+" : trail is "+trail );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String filename = Util.checkString(req.getParameter("filename"));
String header = Util.checkString(req.getParameter("header"));
String body1 = Util.checkString(req.getParameter("body1"));
String body2 = Util.checkString(req.getParameter("body2"));
String body3 = Util.checkString(req.getParameter("body3"));
String body4 = Util.checkString(req.getParameter("body4"));
String body5 = Util.checkString(req.getParameter("body5"));
String trail = Util.checkString(req.getParameter("trail"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String filename = Util.Uni2Ksc(Util.checkString(req.getParameter("filename")));
String header = Util.Uni2Ksc(Util.checkString(req.getParameter("header")));
String body1 = Util.Uni2Ksc(Util.checkString(req.getParameter("body1")));
String body2 = Util.Uni2Ksc(Util.checkString(req.getParameter("body2")));
String body3 = Util.Uni2Ksc(Util.checkString(req.getParameter("body3")));
String body4 = Util.Uni2Ksc(Util.checkString(req.getParameter("body4")));
String body5 = Util.Uni2Ksc(Util.checkString(req.getParameter("body5")));
String trail = Util.Uni2Ksc(Util.checkString(req.getParameter("trail")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFilename(filename);
dm.setHeader(header);
dm.setBody1(body1);
dm.setBody2(body2);
dm.setBody3(body3);
dm.setBody4(body4);
dm.setBody5(body5);
dm.setTrail(trail);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 24 18:42:27 KST 2007 */