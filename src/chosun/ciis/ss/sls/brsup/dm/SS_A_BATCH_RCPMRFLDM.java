/***************************************************************************************************
* ���ϸ� : SS_A_BATCH_RCPMRFLDM.java
* ��� : ��������-����-����EDI-�Աݹݿ�
* �ۼ����� : 2004-06-24
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
 * ��������-����-����EDI-�Աݹݿ�
 *
 */


public class SS_A_BATCH_RCPMRFLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basedt;

	public SS_A_BATCH_RCPMRFLDM(){}
	public SS_A_BATCH_RCPMRFLDM(String incmgpers, String basedt){
		this.incmgpers = incmgpers;
		this.basedt = basedt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasedt(String basedt){
		this.basedt = basedt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasedt(){
		return this.basedt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BATCH_RCPMRFL( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BATCH_RCPMRFLDM dm = (SS_A_BATCH_RCPMRFLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.basedt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_BATCH_RCPMRFLDataSet();
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
String basedt = req.getParameter("basedt");
if( basedt == null){
	System.out.println(this.toString+" : basedt is null" );
}else{
	System.out.println(this.toString+" : basedt is "+basedt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String basedt = Util.checkString(req.getParameter("basedt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basedt = Util.Uni2Ksc(Util.checkString(req.getParameter("basedt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setBasedt(basedt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 30 20:39:27 KST 2004 */