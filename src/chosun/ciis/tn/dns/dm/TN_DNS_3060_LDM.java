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


public class TN_DNS_3060_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String receiptidx;
	public String receiptcode;

	public TN_DNS_3060_LDM(){}
	public TN_DNS_3060_LDM(String cmpy_cd, String receiptidx, String receiptcode){
		this.cmpy_cd = cmpy_cd;
		this.receiptidx = receiptidx;
		this.receiptcode = receiptcode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3060_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3060_LDM dm = (TN_DNS_3060_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.receiptidx);
		cstmt.setString(5, dm.receiptcode);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3060_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("receiptidx = [" + getReceiptidx() + "]");
		System.out.println("receiptcode = [" + getReceiptcode() + "]");
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
String receiptidx = req.getParameter("receiptidx");
if( receiptidx == null){
	System.out.println(this.toString+" : receiptidx is null" );
}else{
	System.out.println(this.toString+" : receiptidx is "+receiptidx );
}
String receiptcode = req.getParameter("receiptcode");
if( receiptcode == null){
	System.out.println(this.toString+" : receiptcode is null" );
}else{
	System.out.println(this.toString+" : receiptcode is "+receiptcode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String receiptidx = Util.checkString(req.getParameter("receiptidx"));
String receiptcode = Util.checkString(req.getParameter("receiptcode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String receiptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptidx")));
String receiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setReceiptidx(receiptidx);
dm.setReceiptcode(receiptcode);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 05 09:27:37 KST 2016 */