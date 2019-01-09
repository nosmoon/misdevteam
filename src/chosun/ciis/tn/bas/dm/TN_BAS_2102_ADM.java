/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_2102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String relationidx;
	public String relationtype;
	public String relation1;
	public String relation2;
	public String displayorder;
	public String incmg_pers;

	public TN_BAS_2102_ADM(){}
	public TN_BAS_2102_ADM(String cmpy_cd, String relationidx, String relationtype, String relation1, String relation2, String displayorder, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.relationidx = relationidx;
		this.relationtype = relationtype;
		this.relation1 = relation1;
		this.relation2 = relation2;
		this.displayorder = displayorder;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRelationidx(String relationidx){
		this.relationidx = relationidx;
	}

	public void setRelationtype(String relationtype){
		this.relationtype = relationtype;
	}

	public void setRelation1(String relation1){
		this.relation1 = relation1;
	}

	public void setRelation2(String relation2){
		this.relation2 = relation2;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRelationidx(){
		return this.relationidx;
	}

	public String getRelationtype(){
		return this.relationtype;
	}

	public String getRelation1(){
		return this.relation1;
	}

	public String getRelation2(){
		return this.relation2;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_2102_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_2102_ADM dm = (TN_BAS_2102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.relationidx);
		cstmt.setString(5, dm.relationtype);
		cstmt.setString(6, dm.relation1);
		cstmt.setString(7, dm.relation2);
		cstmt.setString(8, dm.displayorder);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_2102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("relationidx = [" + getRelationidx() + "]");
		System.out.println("relationtype = [" + getRelationtype() + "]");
		System.out.println("relation1 = [" + getRelation1() + "]");
		System.out.println("relation2 = [" + getRelation2() + "]");
		System.out.println("displayorder = [" + getDisplayorder() + "]");
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
String relationidx = req.getParameter("relationidx");
if( relationidx == null){
	System.out.println(this.toString+" : relationidx is null" );
}else{
	System.out.println(this.toString+" : relationidx is "+relationidx );
}
String relationtype = req.getParameter("relationtype");
if( relationtype == null){
	System.out.println(this.toString+" : relationtype is null" );
}else{
	System.out.println(this.toString+" : relationtype is "+relationtype );
}
String relation1 = req.getParameter("relation1");
if( relation1 == null){
	System.out.println(this.toString+" : relation1 is null" );
}else{
	System.out.println(this.toString+" : relation1 is "+relation1 );
}
String relation2 = req.getParameter("relation2");
if( relation2 == null){
	System.out.println(this.toString+" : relation2 is null" );
}else{
	System.out.println(this.toString+" : relation2 is "+relation2 );
}
String displayorder = req.getParameter("displayorder");
if( displayorder == null){
	System.out.println(this.toString+" : displayorder is null" );
}else{
	System.out.println(this.toString+" : displayorder is "+displayorder );
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
String relationidx = Util.checkString(req.getParameter("relationidx"));
String relationtype = Util.checkString(req.getParameter("relationtype"));
String relation1 = Util.checkString(req.getParameter("relation1"));
String relation2 = Util.checkString(req.getParameter("relation2"));
String displayorder = Util.checkString(req.getParameter("displayorder"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String relationidx = Util.Uni2Ksc(Util.checkString(req.getParameter("relationidx")));
String relationtype = Util.Uni2Ksc(Util.checkString(req.getParameter("relationtype")));
String relation1 = Util.Uni2Ksc(Util.checkString(req.getParameter("relation1")));
String relation2 = Util.Uni2Ksc(Util.checkString(req.getParameter("relation2")));
String displayorder = Util.Uni2Ksc(Util.checkString(req.getParameter("displayorder")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRelationidx(relationidx);
dm.setRelationtype(relationtype);
dm.setRelation1(relation1);
dm.setRelation2(relation2);
dm.setDisplayorder(displayorder);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 20 11:40:56 KST 2016 */