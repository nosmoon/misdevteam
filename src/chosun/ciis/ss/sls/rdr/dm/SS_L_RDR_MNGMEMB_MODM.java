/***************************************************************************************************
* 파일명 : .java
* 기능 : 비독자관리 조회
* 작성일자 : 2009-08-07
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 비독자관리 조회 
 */

public class SS_L_RDR_MNGMEMB_MODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String type;
	public String clsf;
	public String from;
	public String to;
	public String custnm;
	public String sex;
	public String age;
	public String yyyy;

	public SS_L_RDR_MNGMEMB_MODM(){}
	public SS_L_RDR_MNGMEMB_MODM(String type, String clsf, String from, String to, String custnm, String sex, String age, String yyyy){
		this.type = type;
		this.clsf = clsf;
		this.from = from;
		this.to = to;
		this.custnm = custnm;
		this.sex = sex;
		this.age = age;
		this.yyyy = yyyy;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setFrom(String from){
		this.from = from;
	}

	public void setTo(String to){
		this.to = to;
	}

	public void setCustnm(String custnm){
		this.custnm = custnm;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public String getType(){
		return this.type;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getFrom(){
		return this.from;
	}

	public String getTo(){
		return this.to;
	}

	public String getCustnm(){
		return this.custnm;
	}

	public String getSex(){
		return this.sex;
	}

	public String getAge(){
		return this.age;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_MNGMEMB_MO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_MNGMEMB_MODM dm = (SS_L_RDR_MNGMEMB_MODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.type);
		cstmt.setString(4, dm.clsf);
		cstmt.setString(5, dm.from);
		cstmt.setString(6, dm.to);
		cstmt.setString(7, dm.custnm);
		cstmt.setString(8, dm.sex);
		cstmt.setString(9, dm.age);
		cstmt.setString(10, dm.yyyy);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_MNGMEMB_MODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String from = req.getParameter("from");
if( from == null){
	System.out.println(this.toString+" : from is null" );
}else{
	System.out.println(this.toString+" : from is "+from );
}
String to = req.getParameter("to");
if( to == null){
	System.out.println(this.toString+" : to is null" );
}else{
	System.out.println(this.toString+" : to is "+to );
}
String custnm = req.getParameter("custnm");
if( custnm == null){
	System.out.println(this.toString+" : custnm is null" );
}else{
	System.out.println(this.toString+" : custnm is "+custnm );
}
String sex = req.getParameter("sex");
if( sex == null){
	System.out.println(this.toString+" : sex is null" );
}else{
	System.out.println(this.toString+" : sex is "+sex );
}
String age = req.getParameter("age");
if( age == null){
	System.out.println(this.toString+" : age is null" );
}else{
	System.out.println(this.toString+" : age is "+age );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String type = Util.checkString(req.getParameter("type"));
String clsf = Util.checkString(req.getParameter("clsf"));
String from = Util.checkString(req.getParameter("from"));
String to = Util.checkString(req.getParameter("to"));
String custnm = Util.checkString(req.getParameter("custnm"));
String sex = Util.checkString(req.getParameter("sex"));
String age = Util.checkString(req.getParameter("age"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String from = Util.Uni2Ksc(Util.checkString(req.getParameter("from")));
String to = Util.Uni2Ksc(Util.checkString(req.getParameter("to")));
String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setType(type);
dm.setClsf(clsf);
dm.setFrom(from);
dm.setTo(to);
dm.setCustnm(custnm);
dm.setSex(sex);
dm.setAge(age);
dm.setYyyy(yyyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 16:44:11 KST 2009 */