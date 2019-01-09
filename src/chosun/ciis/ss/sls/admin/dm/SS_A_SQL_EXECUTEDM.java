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


public class SS_A_SQL_EXECUTEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dt;
	public String seq;

	public SS_A_SQL_EXECUTEDM(){}
	public SS_A_SQL_EXECUTEDM(String dt, String seq){
		this.dt = dt;
		this.seq = seq;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDt(){
		return this.dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_SQL_EXECUTE(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_SQL_EXECUTEDM dm = (SS_A_SQL_EXECUTEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dt);
		cstmt.setString(4, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_SQL_EXECUTEDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dt = [" + getDt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String dt = Util.checkString(req.getParameter("dt"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDt(dt);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 17 08:50:01 GMT 2013 */