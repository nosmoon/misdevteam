/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
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


public class SS_L_YEARLY_SUBS_GETUSERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String srch_word;

	public SS_L_YEARLY_SUBS_GETUSERDM(){}
	public SS_L_YEARLY_SUBS_GETUSERDM(String srch_word){
		this.srch_word = srch_word;
	}

	public void setSrch_word(String srch_word){
		this.srch_word = srch_word;
	}

	public String getSrch_word(){
		return this.srch_word;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_YEARLY_SUBS_GETUSER(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_YEARLY_SUBS_GETUSERDM dm = (SS_L_YEARLY_SUBS_GETUSERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.srch_word);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_YEARLY_SUBS_GETUSERDataSet();
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


/* �ۼ��ð� : Wed Jan 30 01:41:34 GMT 2013 */