/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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
 * 
 */


public class SS_A_SQL_EXECUTE_QUERYLISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String seq;
	public String sql_nm;
	public String sql_text;
	public String flag;
	public String db_nm;

	public SS_A_SQL_EXECUTE_QUERYLISTDM(){}
	public SS_A_SQL_EXECUTE_QUERYLISTDM(String incmgpers, String seq, String sql_nm, String sql_text, String flag, String db_nm){
		this.incmgpers = incmgpers;
		this.seq = seq;
		this.sql_nm = sql_nm;
		this.sql_text = sql_text;
		this.flag = flag;
		this.db_nm = db_nm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSql_nm(String sql_nm){
		this.sql_nm = sql_nm;
	}

	public void setSql_text(String sql_text){
		this.sql_text = sql_text;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setDb_nm(String db_nm){
		this.db_nm = db_nm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSql_nm(){
		return this.sql_nm;
	}

	public String getSql_text(){
		return this.sql_text;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getDb_nm(){
		return this.db_nm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_SQL_EXECUTE_QUERYLIST(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_SQL_EXECUTE_QUERYLISTDM dm = (SS_A_SQL_EXECUTE_QUERYLISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.sql_nm);
		cstmt.setString(6, dm.sql_text);
		cstmt.setString(7, dm.flag);
		cstmt.setString(8, dm.db_nm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_SQL_EXECUTE_QUERYLISTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sql_nm = [" + getSql_nm() + "]");
		System.out.println("sql_text = [" + getSql_text() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("db_nm = [" + getDb_nm() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String sql_nm = req.getParameter("sql_nm");
if( sql_nm == null){
	System.out.println(this.toString+" : sql_nm is null" );
}else{
	System.out.println(this.toString+" : sql_nm is "+sql_nm );
}
String sql_text = req.getParameter("sql_text");
if( sql_text == null){
	System.out.println(this.toString+" : sql_text is null" );
}else{
	System.out.println(this.toString+" : sql_text is "+sql_text );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String db_nm = req.getParameter("db_nm");
if( db_nm == null){
	System.out.println(this.toString+" : db_nm is null" );
}else{
	System.out.println(this.toString+" : db_nm is "+db_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String seq = Util.checkString(req.getParameter("seq"));
String sql_nm = Util.checkString(req.getParameter("sql_nm"));
String sql_text = Util.checkString(req.getParameter("sql_text"));
String flag = Util.checkString(req.getParameter("flag"));
String db_nm = Util.checkString(req.getParameter("db_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sql_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_nm")));
String sql_text = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_text")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String db_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("db_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setSeq(seq);
dm.setSql_nm(sql_nm);
dm.setSql_text(sql_text);
dm.setFlag(flag);
dm.setDb_nm(db_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 13 00:46:34 GMT 2014 */