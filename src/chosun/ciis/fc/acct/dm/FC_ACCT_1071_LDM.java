/***************************************************************************************************
* ���ϸ� : .java
* ��� : ȸ�����-��������ڵ���ȸ
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;


import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * ȸ�����-��������ڵ���ȸ
 */


public class FC_ACCT_1071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cccodeval;
	public String cccdynm;

	public FC_ACCT_1071_LDM(){}
	public FC_ACCT_1071_LDM(String cmpy_cd, String cccodeval, String cccdynm){
		this.cmpy_cd = cmpy_cd;
		this.cccodeval = cccodeval;
		this.cccdynm = cccdynm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCccodeval(String cccodeval){
		this.cccodeval = cccodeval;
	}

	public void setCccdynm(String cccdynm){
		this.cccdynm = cccdynm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCccodeval(){
		return this.cccodeval;
	}

	public String getCccdynm(){
		return this.cccdynm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1071_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1071_LDM dm = (FC_ACCT_1071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cccodeval);
		cstmt.setString(5, dm.cccdynm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1071_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cccodeval = [" + getCccodeval() + "]");
		System.out.println("cccdynm = [" + getCccdynm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cccodeval = req.getParameter("cccodeval");
if( cccodeval == null){
	System.out.println(this.toString+" : cccodeval is null" );
}else{
	System.out.println(this.toString+" : cccodeval is "+cccodeval );
}
String cccdynm = req.getParameter("cccdynm");
if( cccdynm == null){
	System.out.println(this.toString+" : cccdynm is null" );
}else{
	System.out.println(this.toString+" : cccdynm is "+cccdynm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cccodeval = Util.checkString(req.getParameter("cccodeval"));
String cccdynm = Util.checkString(req.getParameter("cccdynm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cccodeval = Util.Uni2Ksc(Util.checkString(req.getParameter("cccodeval")));
String cccdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cccdynm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCccodeval(cccodeval);
dm.setCccdynm(cccdynm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 03 14:47:23 KST 2009 */