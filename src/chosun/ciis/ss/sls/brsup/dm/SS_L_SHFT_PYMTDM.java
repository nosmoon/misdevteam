/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMTDM.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
* �ۼ����� : 2004-04-01
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
 *
 */


public class SS_L_SHFT_PYMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sechcond;
	public String sechcont;

	public SS_L_SHFT_PYMTDM(){}
	public SS_L_SHFT_PYMTDM(String sechcond, String sechcont){
		this.sechcond = sechcond;
		this.sechcont = sechcont;
	}

	public void setSechcond(String sechcond){
		this.sechcond = sechcond;
	}

	public void setSechcont(String sechcont){
		this.sechcont = sechcont;
	}

	public String getSechcond(){
		return this.sechcond;
	}

	public String getSechcont(){
		return this.sechcont;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFT_PYMT( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFT_PYMTDM dm = (SS_L_SHFT_PYMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sechcond);
		cstmt.setString(4, dm.sechcont);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFT_PYMTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String sechcond = req.getParameter("sechcond");
if( sechcond == null){
	System.out.println(this.toString+" : sechcond is null" );
}else{
	System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
	System.out.println(this.toString+" : sechcont is null" );
}else{
	System.out.println(this.toString+" : sechcont is "+sechcont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 09 13:58:55 KST 2004 */