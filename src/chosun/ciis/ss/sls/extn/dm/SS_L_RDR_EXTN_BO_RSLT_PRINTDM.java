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


public class SS_L_RDR_EXTN_BO_RSLT_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String stafnm;

	public SS_L_RDR_EXTN_BO_RSLT_PRINTDM(){}
	public SS_L_RDR_EXTN_BO_RSLT_PRINTDM(String frdt, String stafnm){
		this.frdt = frdt;
		this.stafnm = stafnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_RDR_EXTN_BO_RSLT_PRINT(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_BO_RSLT_PRINTDM dm = (SS_L_RDR_EXTN_BO_RSLT_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.stafnm);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("stafnm = [" + getStafnm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.checkString(req.getParameter("frdt"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrdt(frdt);
dm.setStafnm(stafnm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 21 09:42:38 KST 2015 */