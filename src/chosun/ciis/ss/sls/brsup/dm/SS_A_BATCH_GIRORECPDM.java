/***************************************************************************************************
* ���ϸ� : SS_A_BATCH_GIRORECPDM.java
* ��� : ����EDI �����ͼ���
* �ۼ����� : 2004-03-18
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
 * ����EDI �����ͼ���
 *
 */


public class SS_A_BATCH_GIRORECPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;

	public SS_A_BATCH_GIRORECPDM(){}
	public SS_A_BATCH_GIRORECPDM(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BATCH_GIRORECP( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BATCH_GIRORECPDM dm = (SS_A_BATCH_GIRORECPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_BATCH_GIRORECPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 18 17:17:49 KST 2004 */