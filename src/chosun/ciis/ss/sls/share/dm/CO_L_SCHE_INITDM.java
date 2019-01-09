/***************************************************************************************************
* ���ϸ� : CO_L_SCHE_INITDM.java
* ��� : ��������-����-����� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-����-����� ���� DM
 */

public class CO_L_SCHE_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public CO_L_SCHE_INITDM(){}

	public String getSQL(){
		 return "{ call SP_CO_L_SCHE_INIT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_SCHE_INITDM dm = (CO_L_SCHE_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.CO_L_SCHE_INITDataSet();
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


/* �ۼ��ð� : Sat Jun 05 22:19:40 KST 2004 */