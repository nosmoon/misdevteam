/***************************************************************************************************
* ���ϸ� : SS_L_PYMT_CNTRDM.java
* ��� : ������������-Billing�ڵ���ü-���ΰ����
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
 * ������������-Billing�ڵ���ü-���ΰ����
 *
 */


public class SS_L_PYMT_CNTRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String subsstat;

	public SS_L_PYMT_CNTRDM(){}
	public SS_L_PYMT_CNTRDM(String subsstat){
		this.subsstat = subsstat;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
	}

	public String getSubsstat(){
		return this.subsstat;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PYMT_CNTR( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PYMT_CNTRDM dm = (SS_L_PYMT_CNTRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.subsstat);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PYMT_CNTRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String subsstat = req.getParameter("subsstat");
if( subsstat == null){
	System.out.println(this.toString+" : subsstat is null" );
}else{
	System.out.println(this.toString+" : subsstat is "+subsstat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String subsstat = Util.checkString(req.getParameter("subsstat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String subsstat = Util.Uni2Ksc(Util.checkString(req.getParameter("subsstat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSubsstat(subsstat);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 22 22:02:33 KST 2004 */