/***************************************************************************************************
* ���ϸ� : SS_L_SHFTAPLC_INIT_TMDM.java
* ��� : ����-�ڵ���ü����-�ʱ�ȭ���� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * ����-�ڵ���ü����-�ʱ�ȭ���� ���� DM
 */


public class SS_L_SHFTAPLC_INIT_TMDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_SHFTAPLC_INIT_TMDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTAPLC_INIT_TM( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTAPLC_INIT_TMDM dm = (SS_L_SHFTAPLC_INIT_TMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.cns.ds.SS_L_SHFTAPLC_INIT_TMDataSet();
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


/* �ۼ��ð� : Fri Jul 16 20:50:05 KST 2004 */