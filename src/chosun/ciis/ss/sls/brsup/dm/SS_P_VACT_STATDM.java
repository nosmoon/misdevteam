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


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_P_VACT_STATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_dt;
	public String to_dt;

	public SS_P_VACT_STATDM(){}
	public SS_P_VACT_STATDM(String fr_dt, String to_dt){
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_P_VACT_STAT(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_P_VACT_STATDM dm = (SS_P_VACT_STATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_dt);
		cstmt.setString(4, dm.to_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_P_VACT_STATDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 07 10:16:46 KST 2015 */