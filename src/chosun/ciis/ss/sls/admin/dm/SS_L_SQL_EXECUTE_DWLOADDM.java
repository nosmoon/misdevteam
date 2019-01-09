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


public class SS_L_SQL_EXECUTE_DWLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String execute_dt;
	public String sql_seq;
	public String incmgpers;
	public String ipaddr;

	public SS_L_SQL_EXECUTE_DWLOADDM(){}
	public SS_L_SQL_EXECUTE_DWLOADDM(String execute_dt, String sql_seq, String incmgpers, String ipaddr){
		this.execute_dt = execute_dt;
		this.sql_seq = sql_seq;
		this.incmgpers = incmgpers;
		this.ipaddr = ipaddr;
	}

	public void setExecute_dt(String execute_dt){
		this.execute_dt = execute_dt;
	}

	public void setSql_seq(String sql_seq){
		this.sql_seq = sql_seq;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIpaddr(String ipaddr){
		this.ipaddr = ipaddr;
	}

	public String getExecute_dt(){
		return this.execute_dt;
	}

	public String getSql_seq(){
		return this.sql_seq;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIpaddr(){
		return this.ipaddr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_SQL_EXECUTE_DWLOAD(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SQL_EXECUTE_DWLOADDM dm = (SS_L_SQL_EXECUTE_DWLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.execute_dt);
		cstmt.setString(4, dm.sql_seq);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.ipaddr);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_SQL_EXECUTE_DWLOADDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("executedt = [" + getExecute_dt() + "]");
		System.out.println("sql_seq = [" + getSql_seq() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("ipaddr = [" + getIpaddr() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String executedt = req.getParameter("executedt");
if( executedt == null){
	System.out.println(this.toString+" : executedt is null" );
}else{
	System.out.println(this.toString+" : executedt is "+executedt );
}
String sql_seq = req.getParameter("sql_seq");
if( sql_seq == null){
	System.out.println(this.toString+" : sql_seq is null" );
}else{
	System.out.println(this.toString+" : sql_seq is "+sql_seq );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String ipaddr = req.getParameter("ipaddr");
if( ipaddr == null){
	System.out.println(this.toString+" : ipaddr is null" );
}else{
	System.out.println(this.toString+" : ipaddr is "+ipaddr );
}
String file_fm = req.getParameter("file_fm");
if( file_fm == null){
	System.out.println(this.toString+" : file_fm is null" );
}else{
	System.out.println(this.toString+" : file_fm is "+file_fm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String executedt = Util.checkString(req.getParameter("executedt"));
String sql_seq = Util.checkString(req.getParameter("sql_seq"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String ipaddr = Util.checkString(req.getParameter("ipaddr"));
String file_fm = Util.checkString(req.getParameter("file_fm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String executedt = Util.Uni2Ksc(Util.checkString(req.getParameter("executedt")));
String sql_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_seq")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("ipaddr")));
String file_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("file_fm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setExecutedt(executedt);
dm.setSql_seq(sql_seq);
dm.setIncmgpers(incmgpers);
dm.setIpaddr(ipaddr);
dm.setFile_fm(file_fm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 26 03:52:16 GMT 2013 */