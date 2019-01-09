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


public class SS_A_SQL_EXECUTE_TABLELISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String db_cd;

	public SS_A_SQL_EXECUTE_TABLELISTDM(){}
	public SS_A_SQL_EXECUTE_TABLELISTDM(String db_cd){
		this.db_cd = db_cd;
	}

	public void setDb_cd(String db_cd){
		this.db_cd = db_cd;
	}

	public String getDb_cd(){
		return this.db_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_SQL_EXECUTE_TABLELIST(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_SQL_EXECUTE_TABLELISTDM dm = (SS_A_SQL_EXECUTE_TABLELISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.db_cd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_SQL_EXECUTE_TABLELISTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("db_cd = [" + getDb_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String db_cd = req.getParameter("db_cd");
if( db_cd == null){
	System.out.println(this.toString+" : db_cd is null" );
}else{
	System.out.println(this.toString+" : db_cd is "+db_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String db_cd = Util.checkString(req.getParameter("db_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String db_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("db_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDb_cd(db_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 12 01:16:08 GMT 2014 */