/***************************************************************************************************
* ���ϸ� : SS_L_CA_HEAD_INITDM.java
* ��� : ���̹�����-���̹�������-�ʱ�ȭ��
* �ۼ����� : 2005-04-18
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * ���̹�����-���̹�������-�ʱ�ȭ��
 */


public class SS_L_CA_HEAD_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_CA_HEAD_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_CA_HEAD_INIT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CA_HEAD_INITDM dm = (SS_L_CA_HEAD_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_L_CA_HEAD_INITDataSet();
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


/* �ۼ��ð� : Mon Apr 18 15:31:40 KST 2005 */