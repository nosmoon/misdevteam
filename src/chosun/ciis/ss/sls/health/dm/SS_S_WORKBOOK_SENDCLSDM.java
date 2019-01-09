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


package chosun.ciis.ss.sls.health.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.rec.*;

/**
 * 
 */


public class SS_S_WORKBOOK_SENDCLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsdt;

	public SS_S_WORKBOOK_SENDCLSDM(){}
	public SS_S_WORKBOOK_SENDCLSDM(String clsdt){
		this.clsdt = clsdt;
	}

	public void setClsdt(String clsdt){
		this.clsdt = clsdt;
	}

	public String getClsdt(){
		return this.clsdt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_S_WORKBOOK_SENDCLS(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_WORKBOOK_SENDCLSDM dm = (SS_S_WORKBOOK_SENDCLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsdt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.health.ds.SS_S_WORKBOOK_SENDCLSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("clsdt = [" + getClsdt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String clsdt = req.getParameter("clsdt");
if( clsdt == null){
	System.out.println(this.toString+" : clsdt is null" );
}else{
	System.out.println(this.toString+" : clsdt is "+clsdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String clsdt = Util.checkString(req.getParameter("clsdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String clsdt = Util.Uni2Ksc(Util.checkString(req.getParameter("clsdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClsdt(clsdt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 05 13:53:59 KST 2015 */