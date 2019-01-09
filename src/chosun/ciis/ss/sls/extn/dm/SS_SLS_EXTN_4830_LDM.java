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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4830_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String valmm;

	public SS_SLS_EXTN_4830_LDM(){}
	public SS_SLS_EXTN_4830_LDM(String bocd, String valmm){
		this.bocd = bocd;
		this.valmm = valmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4830_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4830_LDM dm = (SS_SLS_EXTN_4830_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.valmm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4830_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 26 14:55:06 KST 2016 */