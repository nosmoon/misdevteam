/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
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
 * 
 */


public class SS_L_EMP_NWSPRDR_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_EMP_NWSPRDR_INITDM(){}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EMP_NWSPRDR_INIT(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EMP_NWSPRDR_INITDM dm = (SS_L_EMP_NWSPRDR_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EMP_NWSPRDR_INITDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
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


/* �ۼ��ð� : Tue Mar 05 08:26:43 GMT 2013 */