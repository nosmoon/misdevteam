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


public class SL_L_CLOS_REPORTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;
	public String searchcd;

	public SL_L_CLOS_REPORTDM(){}
	public SL_L_CLOS_REPORTDM(String closmm, String searchcd){
		this.closmm = closmm;
		this.searchcd = searchcd;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setSearchcd(String searchcd){
		this.searchcd = searchcd;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getSearchcd(){
		return this.searchcd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_CLOS_REPORT(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_CLOS_REPORTDM dm = (SL_L_CLOS_REPORTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.setString(4, dm.searchcd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_CLOS_REPORTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("searchcd = [" + getSearchcd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String searchcd = req.getParameter("searchcd");
if( searchcd == null){
	System.out.println(this.toString+" : searchcd is null" );
}else{
	System.out.println(this.toString+" : searchcd is "+searchcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.checkString(req.getParameter("closmm"));
String searchcd = Util.checkString(req.getParameter("searchcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String searchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("searchcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClosmm(closmm);
dm.setSearchcd(searchcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 17 13:55:12 KST 2017 */