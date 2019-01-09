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


public class SS_SLS_EXTN_4602_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String srch_word;

	public SS_SLS_EXTN_4602_LDM(){}
	public SS_SLS_EXTN_4602_LDM(String srch_word){
		this.srch_word = srch_word;
	}

	public void setSrch_word(String srch_word){
		this.srch_word = srch_word;
	}

	public String getSrch_word(){
		return this.srch_word;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4602_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4602_LDM dm = (SS_SLS_EXTN_4602_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.srch_word);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4602_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("srch_word = [" + getSrch_word() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String srch_word = req.getParameter("srch_word");
if( srch_word == null){
	System.out.println(this.toString+" : srch_word is null" );
}else{
	System.out.println(this.toString+" : srch_word is "+srch_word );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String srch_word = Util.checkString(req.getParameter("srch_word"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSrch_word(srch_word);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 15 19:58:43 KST 2016 */