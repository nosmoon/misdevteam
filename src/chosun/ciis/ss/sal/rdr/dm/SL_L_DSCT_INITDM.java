/***************************************************************************************************
* ���ϸ� : SL_L_DSCT_INITDM.java
* ��� : �������(�ʱ�ȭ��)
* �ۼ����� : 2003-12-27
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * �������(�ʱ�ȭ��)
 *
 */
public class SL_L_DSCT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SL_L_DSCT_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SL_L_DSCT_INIT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_DSCT_INITDM dm = (SL_L_DSCT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_DSCT_INITDataSet();
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


/* �ۼ��ð� : Wed Jan 28 12:06:00 KST 2004 */