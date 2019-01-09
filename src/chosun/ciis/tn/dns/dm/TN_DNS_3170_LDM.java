/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_3170_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String receiptbulkissueidx;

	public TN_DNS_3170_LDM(){}
	public TN_DNS_3170_LDM(String cmpy_cd, String receiptbulkissueidx){
		this.cmpy_cd = cmpy_cd;
		this.receiptbulkissueidx = receiptbulkissueidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReceiptbulkissueidx(String receiptbulkissueidx){
		this.receiptbulkissueidx = receiptbulkissueidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReceiptbulkissueidx(){
		return this.receiptbulkissueidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3170_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3170_LDM dm = (TN_DNS_3170_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.receiptbulkissueidx);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3170_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("receiptbulkissueidx = [" + getReceiptbulkissueidx() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String receiptbulkissueidx = req.getParameter("receiptbulkissueidx");
if( receiptbulkissueidx == null){
	System.out.println(this.toString+" : receiptbulkissueidx is null" );
}else{
	System.out.println(this.toString+" : receiptbulkissueidx is "+receiptbulkissueidx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String receiptbulkissueidx = Util.checkString(req.getParameter("receiptbulkissueidx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String receiptbulkissueidx = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptbulkissueidx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setReceiptbulkissueidx(receiptbulkissueidx);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 19 15:06:43 KST 2016 */