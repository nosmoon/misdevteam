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


public class SS_SLS_EXTN_4930_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String regdt;
	public String regno;

	public SS_SLS_EXTN_4930_LDM(){}
	public SS_SLS_EXTN_4930_LDM(String regdt, String regno){
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4930_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4930_LDM dm = (SS_SLS_EXTN_4930_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.regdt);
		cstmt.setString(4, dm.regno);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4930_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("regdt = [" + getRegdt() + "]");
		System.out.println("regno = [" + getRegno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRegdt(regdt);
dm.setRegno(regno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 17 16:44:45 KST 2016 */