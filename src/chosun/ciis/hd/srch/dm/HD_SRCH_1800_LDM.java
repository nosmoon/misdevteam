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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1800_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basic_dt;
	public String query;
	public String vaca_ck;
	public String incmg_pers;

	public HD_SRCH_1800_LDM(){}
	public HD_SRCH_1800_LDM(String cmpy_cd, String basic_dt, String query, String vaca_ck, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basic_dt = basic_dt;
		this.query = query;
		this.vaca_ck = vaca_ck;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasic_dt(String basic_dt){
		this.basic_dt = basic_dt;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public void setVaca_ck(String vaca_ck){
		this.vaca_ck = vaca_ck;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasic_dt(){
		return this.basic_dt;
	}

	public String getQuery(){
		return this.query;
	}

	public String getVaca_ck(){
		return this.vaca_ck;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1800_L(? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1800_LDM dm = (HD_SRCH_1800_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.basic_dt);
		cstmt.setString(5, dm.query);
		cstmt.setString(6, dm.vaca_ck);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_1800_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basic_dt = [" + getBasic_dt() + "]");
		System.out.println("query = [" + getQuery() + "]");
		System.out.println("vaca_ck = [" + getVaca_ck() + "]");
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
String basic_dt = req.getParameter("basic_dt");
if( basic_dt == null){
	System.out.println(this.toString+" : basic_dt is null" );
}else{
	System.out.println(this.toString+" : basic_dt is "+basic_dt );
}
String query = req.getParameter("query");
if( query == null){
	System.out.println(this.toString+" : query is null" );
}else{
	System.out.println(this.toString+" : query is "+query );
}
String vaca_ck = req.getParameter("vaca_ck");
if( vaca_ck == null){
	System.out.println(this.toString+" : vaca_ck is null" );
}else{
	System.out.println(this.toString+" : vaca_ck is "+vaca_ck );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basic_dt = Util.checkString(req.getParameter("basic_dt"));
String query = Util.checkString(req.getParameter("query"));
String vaca_ck = Util.checkString(req.getParameter("vaca_ck"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basic_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basic_dt")));
String query = Util.Uni2Ksc(Util.checkString(req.getParameter("query")));
String vaca_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_ck")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasic_dt(basic_dt);
dm.setQuery(query);
dm.setVaca_ck(vaca_ck);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 14:46:34 KST 2009 */