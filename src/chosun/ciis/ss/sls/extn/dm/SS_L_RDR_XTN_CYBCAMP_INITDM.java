/***************************************************************************************************
* ���ϸ� : SS_L_RDR_XTN_CYBCAMP_INITDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-�ʱ�ȭ
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-�ʱ�ȭ
 *
 */

public class SS_L_RDR_XTN_CYBCAMP_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_RDR_XTN_CYBCAMP_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_XTN_CYBCAMP_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_XTN_CYBCAMP_INITDM dm = (SS_L_RDR_XTN_CYBCAMP_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_XTN_CYBCAMP_INITDataSet();
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


/* �ۼ��ð� : Tue Apr 06 16:33:25 KST 2004 */