/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
* �ۼ����� : 2009-05-06
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
 */

public class SS_L_POPINBNSITEMINOUT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_POPINBNSITEMINOUT_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_POPINBNSITEMINOUT_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_POPINBNSITEMINOUT_INITDM dm = (SS_L_POPINBNSITEMINOUT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_POPINBNSITEMINOUT_INITDataSet();
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


/* �ۼ��ð� : Wed May 06 13:36:24 PDT 2009 */