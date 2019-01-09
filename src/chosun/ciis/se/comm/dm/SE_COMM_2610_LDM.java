/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pg_nm;
	public String dt;
	public String team;
	public String part;
	public String area;
	public String val1;
	public String val2;
	public String val3;
	public String val4;
	public String val5;
	public String incmg_pers;

	public SE_COMM_2610_LDM(){}
	public SE_COMM_2610_LDM(String cmpy_cd, String pg_nm, String dt, String team, String part, String area, String val1, String val2, String val3, String val4, String val5, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.pg_nm = pg_nm;
		this.dt = dt;
		this.team = team;
		this.part = part;
		this.area = area;
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
		this.val5 = val5;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPg_nm(String pg_nm){
		this.pg_nm = pg_nm;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setVal1(String val1){
		this.val1 = val1;
	}

	public void setVal2(String val2){
		this.val2 = val2;
	}

	public void setVal3(String val3){
		this.val3 = val3;
	}

	public void setVal4(String val4){
		this.val4 = val4;
	}

	public void setVal5(String val5){
		this.val5 = val5;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPg_nm(){
		return this.pg_nm;
	}

	public String getDt(){
		return this.dt;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getVal1(){
		return this.val1;
	}

	public String getVal2(){
		return this.val2;
	}

	public String getVal3(){
		return this.val3;
	}

	public String getVal4(){
		return this.val4;
	}

	public String getVal5(){
		return this.val5;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_COMM_2610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_2610_LDM dm = (SE_COMM_2610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pg_nm);
		cstmt.setString(5, dm.dt);
		cstmt.setString(6, dm.team);
		cstmt.setString(7, dm.part);
		cstmt.setString(8, dm.area);
		cstmt.setString(9, dm.val1);
		cstmt.setString(10, dm.val2);
		cstmt.setString(11, dm.val3);
		cstmt.setString(12, dm.val4);
		cstmt.setString(13, dm.val5);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_2610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pg_nm = [" + getPg_nm() + "]");
		System.out.println("dt = [" + getDt() + "]");
		System.out.println("team = [" + getTeam() + "]");
		System.out.println("part = [" + getPart() + "]");
		System.out.println("area = [" + getArea() + "]");
		System.out.println("val1 = [" + getVal1() + "]");
		System.out.println("val2 = [" + getVal2() + "]");
		System.out.println("val3 = [" + getVal3() + "]");
		System.out.println("val4 = [" + getVal4() + "]");
		System.out.println("val5 = [" + getVal5() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pg_nm = req.getParameter("pg_nm");
if( pg_nm == null){
	System.out.println(this.toString+" : pg_nm is null" );
}else{
	System.out.println(this.toString+" : pg_nm is "+pg_nm );
}
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String part = req.getParameter("part");
if( part == null){
	System.out.println(this.toString+" : part is null" );
}else{
	System.out.println(this.toString+" : part is "+part );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String val1 = req.getParameter("val1");
if( val1 == null){
	System.out.println(this.toString+" : val1 is null" );
}else{
	System.out.println(this.toString+" : val1 is "+val1 );
}
String val2 = req.getParameter("val2");
if( val2 == null){
	System.out.println(this.toString+" : val2 is null" );
}else{
	System.out.println(this.toString+" : val2 is "+val2 );
}
String val3 = req.getParameter("val3");
if( val3 == null){
	System.out.println(this.toString+" : val3 is null" );
}else{
	System.out.println(this.toString+" : val3 is "+val3 );
}
String val4 = req.getParameter("val4");
if( val4 == null){
	System.out.println(this.toString+" : val4 is null" );
}else{
	System.out.println(this.toString+" : val4 is "+val4 );
}
String val5 = req.getParameter("val5");
if( val5 == null){
	System.out.println(this.toString+" : val5 is null" );
}else{
	System.out.println(this.toString+" : val5 is "+val5 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pg_nm = Util.checkString(req.getParameter("pg_nm"));
String dt = Util.checkString(req.getParameter("dt"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String val1 = Util.checkString(req.getParameter("val1"));
String val2 = Util.checkString(req.getParameter("val2"));
String val3 = Util.checkString(req.getParameter("val3"));
String val4 = Util.checkString(req.getParameter("val4"));
String val5 = Util.checkString(req.getParameter("val5"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pg_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pg_nm")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String val1 = Util.Uni2Ksc(Util.checkString(req.getParameter("val1")));
String val2 = Util.Uni2Ksc(Util.checkString(req.getParameter("val2")));
String val3 = Util.Uni2Ksc(Util.checkString(req.getParameter("val3")));
String val4 = Util.Uni2Ksc(Util.checkString(req.getParameter("val4")));
String val5 = Util.Uni2Ksc(Util.checkString(req.getParameter("val5")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPg_nm(pg_nm);
dm.setDt(dt);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setVal1(val1);
dm.setVal2(val2);
dm.setVal3(val3);
dm.setVal4(val4);
dm.setVal5(val5);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 29 17:20:47 KST 2009 */