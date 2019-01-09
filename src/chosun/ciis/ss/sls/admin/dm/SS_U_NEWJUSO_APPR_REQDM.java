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


public class SS_U_NEWJUSO_APPR_REQDM extends somo.framework.db.BaseDM implements java.io.Serializable{
	
	public String uid;
	public String chgbocd;
	public String bldmngnn;

	public SS_U_NEWJUSO_APPR_REQDM(){}
	public SS_U_NEWJUSO_APPR_REQDM(String uid, String chgbocd, String bldmngnn){
		this.uid = uid;
		this.chgbocd = chgbocd;
		this.bldmngnn = bldmngnn;
	}
	
	public void setUid(String uid){
		this.uid = uid;
	}
	
	public void setChgbocd(String chgbocd){
		this.chgbocd = chgbocd;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}
	
	public String getUid(){
		return this.uid;
	}

	public String getChgbocd(){
		return this.chgbocd;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_NEWJUSO_APPR_REQ(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_NEWJUSO_APPR_REQDM dm = (SS_U_NEWJUSO_APPR_REQDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.chgbocd);
		cstmt.setString(5, dm.bldmngnn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_U_NEWJUSO_APPR_REQDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("chgbocd = [" + getChgbocd() + "]");
		System.out.println("bldmngnn = [" + getBldmngnn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String chgbocd = req.getParameter("chgbocd");
if( chgbocd == null){
	System.out.println(this.toString+" : chgbocd is null" );
}else{
	System.out.println(this.toString+" : chgbocd is "+chgbocd );
}
String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String chgbocd = Util.checkString(req.getParameter("chgbocd"));
String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String chgbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("chgbocd")));
String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setChgbocd(chgbocd);
dm.setBldmngnn(bldmngnn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Nov 22 07:06:18 GMT 2013 */