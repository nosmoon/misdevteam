/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_INIT_CYEXTN.java
* ��� :   Ȯ����Ȳ-���̹�Ȯ��-���
* �ۼ����� : 2004-10-13
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������	: 
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-���
 *
 */


public class SS_L_PROMSTAF_INIT_CYEXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_PROMSTAF_INIT_CYEXTNDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_PROMSTAF_INIT_CYEXTN( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_INIT_CYEXTNDM dm = (SS_L_PROMSTAF_INIT_CYEXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_PROMSTAF_INIT_CYEXTNDataSet();
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


/* �ۼ��ð� : Tue Oct 12 20:45:03 KST 2004 */