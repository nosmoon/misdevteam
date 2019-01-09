/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SS_L_SQL_EXECUTE_SAMPLEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String execute_dt;
	public String sql_seq;

	public SS_L_SQL_EXECUTE_SAMPLEDM(){}
	public SS_L_SQL_EXECUTE_SAMPLEDM(String execute_dt, String sql_seq){
		this.execute_dt = execute_dt;
		this.sql_seq = sql_seq;
	}

	public void setExecute_dt(String execute_dt){
		this.execute_dt = execute_dt;
	}

	public void setSql_seq(String sql_seq){
		this.sql_seq = sql_seq;
	}

	public String getExecute_dt(){
		return this.execute_dt;
	}

	public String getSql_seq(){
		return this.sql_seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_SQL_EXECUTE_SAMPLE(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SQL_EXECUTE_SAMPLEDM dm = (SS_L_SQL_EXECUTE_SAMPLEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.execute_dt);
		cstmt.setString(4, dm.sql_seq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_SQL_EXECUTE_SAMPLEDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("execute_dt = [" + getExecute_dt() + "]");
		System.out.println("sql_seq = [" + getSql_seq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String execute_dt = req.getParameter("execute_dt");
if( execute_dt == null){
	System.out.println(this.toString+" : execute_dt is null" );
}else{
	System.out.println(this.toString+" : execute_dt is "+execute_dt );
}
String sql_seq = req.getParameter("sql_seq");
if( sql_seq == null){
	System.out.println(this.toString+" : sql_seq is null" );
}else{
	System.out.println(this.toString+" : sql_seq is "+sql_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String execute_dt = Util.checkString(req.getParameter("execute_dt"));
String sql_seq = Util.checkString(req.getParameter("sql_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String execute_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("execute_dt")));
String sql_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setExecute_dt(execute_dt);
dm.setSql_seq(sql_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 29 05:41:38 GMT 2014 */