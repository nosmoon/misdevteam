/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڰ��� ����
* �ۼ����� : 2009-08-11
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * ���ڰ��� ����
 */

public class SS_D_RDR_MNGMEMBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String custclas;
	public String custseq;

	public SS_D_RDR_MNGMEMBDM(){}
	public SS_D_RDR_MNGMEMBDM(String cmpycd, String custclas, String custseq){
		this.cmpycd = cmpycd;
		this.custclas = custclas;
		this.custseq = custseq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCustclas(String custclas){
		this.custclas = custclas;
	}

	public void setCustseq(String custseq){
		this.custseq = custseq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCustclas(){
		return this.custclas;
	}

	public String getCustseq(){
		return this.custseq;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_RDR_MNGMEMB( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_RDR_MNGMEMBDM dm = (SS_D_RDR_MNGMEMBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.custclas);
		cstmt.setString(5, dm.custseq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_D_RDR_MNGMEMBDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String custclas = req.getParameter("custclas");
if( custclas == null){
	System.out.println(this.toString+" : custclas is null" );
}else{
	System.out.println(this.toString+" : custclas is "+custclas );
}
String custseq = req.getParameter("custseq");
if( custseq == null){
	System.out.println(this.toString+" : custseq is null" );
}else{
	System.out.println(this.toString+" : custseq is "+custseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String custclas = Util.checkString(req.getParameter("custclas"));
String custseq = Util.checkString(req.getParameter("custseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setCustclas(custclas);
dm.setCustseq(custseq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 11 19:25:34 KST 2009 */