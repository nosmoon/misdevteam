/***************************************************************************************************
* ���ϸ� : SS_L_MIGLLMMTCLOS_INITDM.java
* ��� : �����濵-���ϸ�����Ȳ �ʱ�ȭ
* �ۼ����� : 2004-03-16
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * �����濵-���ϸ�����Ȳ �ʱ�ȭ
 *
 */

public class SS_L_MIGLLMMTCLOS_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_MIGLLMMTCLOS_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_MIGLLMMTCLOS_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MIGLLMMTCLOS_INITDM dm = (SS_L_MIGLLMMTCLOS_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_MIGLLMMTCLOS_INITDataSet();
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


/* �ۼ��ð� : Tue Mar 16 20:55:10 KST 2004 */