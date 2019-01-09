/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자관리 비독자관리 조회 
* 작성일자 : 2009/09/25
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
 * 독자관리 비독자관리 조회
 */

public class SS_L_RDR_MNGMEMBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String type;
	public String type2;
	public String area;
	public String clsf;
	public String from;
	public String to;
	public String custnm;
	public String sex;
	public String age;
	public String yyyy;
	public String child;
	public String startcount;
	public String endcount;

	public SS_L_RDR_MNGMEMBDM(){}
	public SS_L_RDR_MNGMEMBDM(String type, String type2, String area, String clsf, String from, String to, String custnm, String sex, String age, String yyyy, String child, String startcount, String endcount){
		this.type = type;
		this.type2 = type2;
		this.area = area;
		this.clsf = clsf;
		this.from = from;
		this.to = to;
		this.custnm = custnm;
		this.sex = sex;
		this.age = age;
		this.yyyy = yyyy;
		this.child = child;
		this.startcount = startcount;
		this.endcount = endcount;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setType2(String type2){
		this.type2 = type2;
	}

	public void setArea(String area){
		this.area = area;
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

	public void setChild(String child){
		this.child = child;
	}

	public void setStartcount(String startcount){
		this.startcount = startcount;
	}

	public void setEndcount(String endcount){
		this.endcount = endcount;
	}

	public String getType(){
		return this.type;
	}

	public String getType2(){
		return this.type2;
	}

	public String getArea(){
		return this.area;
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

	public String getChild(){
		return this.child;
	}

	public String getStartcount(){
		return this.startcount;
	}

	public String getEndcount(){
		return this.endcount;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_MNGMEMB( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_MNGMEMBDM dm = (SS_L_RDR_MNGMEMBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.type);
		cstmt.setString(4, dm.type2);
		cstmt.setString(5, dm.area);
		cstmt.setString(6, dm.clsf);
		cstmt.setString(7, dm.from);
		cstmt.setString(8, dm.to);
		cstmt.setString(9, dm.custnm);
		cstmt.setString(10, dm.sex);
		cstmt.setString(11, dm.age);
		cstmt.setString(12, dm.yyyy);
		cstmt.setString(13, dm.child);
		cstmt.setString(14, dm.startcount);
		cstmt.setString(15, dm.endcount);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_MNGMEMBDataSet();
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
String type2 = req.getParameter("type2");
if( type2 == null){
	System.out.println(this.toString+" : type2 is null" );
}else{
	System.out.println(this.toString+" : type2 is "+type2 );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
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
String child = req.getParameter("child");
if( child == null){
	System.out.println(this.toString+" : child is null" );
}else{
	System.out.println(this.toString+" : child is "+child );
}
String startcount = req.getParameter("startcount");
if( startcount == null){
	System.out.println(this.toString+" : startcount is null" );
}else{
	System.out.println(this.toString+" : startcount is "+startcount );
}
String endcount = req.getParameter("endcount");
if( endcount == null){
	System.out.println(this.toString+" : endcount is null" );
}else{
	System.out.println(this.toString+" : endcount is "+endcount );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String type = Util.checkString(req.getParameter("type"));
String type2 = Util.checkString(req.getParameter("type2"));
String area = Util.checkString(req.getParameter("area"));
String clsf = Util.checkString(req.getParameter("clsf"));
String from = Util.checkString(req.getParameter("from"));
String to = Util.checkString(req.getParameter("to"));
String custnm = Util.checkString(req.getParameter("custnm"));
String sex = Util.checkString(req.getParameter("sex"));
String age = Util.checkString(req.getParameter("age"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String child = Util.checkString(req.getParameter("child"));
String startcount = Util.checkString(req.getParameter("startcount"));
String endcount = Util.checkString(req.getParameter("endcount"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String from = Util.Uni2Ksc(Util.checkString(req.getParameter("from")));
String to = Util.Uni2Ksc(Util.checkString(req.getParameter("to")));
String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String child = Util.Uni2Ksc(Util.checkString(req.getParameter("child")));
String startcount = Util.Uni2Ksc(Util.checkString(req.getParameter("startcount")));
String endcount = Util.Uni2Ksc(Util.checkString(req.getParameter("endcount")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setType(type);
dm.setType2(type2);
dm.setArea(area);
dm.setClsf(clsf);
dm.setFrom(from);
dm.setTo(to);
dm.setCustnm(custnm);
dm.setSex(sex);
dm.setAge(age);
dm.setYyyy(yyyy);
dm.setChild(child);
dm.setStartcount(startcount);
dm.setEndcount(endcount);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 15:12:29 KST 2009 */