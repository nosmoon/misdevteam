/***************************************************************************************************
* ���ϸ� : SS_L_ACCTCD_INITDM.java
* ��� : ������-�����ڵ�-�ʱ�ȭ���� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�����ڵ�-�ʱ�ȭ���� ���� DM
 */


public class SS_L_ACCTCD_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_ACCTCD_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_ACCTCD_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ACCTCD_INITDM dm = (SS_L_ACCTCD_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_ACCTCD_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 03 17:12:04 KST 2004 */