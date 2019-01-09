/***************************************************************************************************
* ���ϸ� : SS_L_JIYEOGCDDM.java
* ��� : ����-�����ڵ�,�ڵ�� ����� ���� DM
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * ����-�����ڵ�,�ڵ�� ����� ���� DM
 */

public class SS_L_JIYEOGCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;

	public SS_L_JIYEOGCDDM(){}
	public SS_L_JIYEOGCDDM(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_JIYEOGCD( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_JIYEOGCDDM dm = (SS_L_JIYEOGCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_JIYEOGCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String Deptcd = req.getParameter("Deptcd");
if( Deptcd == null){
	System.out.println(this.toString+" : Deptcd is null" );
}else{
	System.out.println(this.toString+" : Deptcd is "+Deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String Deptcd = req.getParameter("Deptcd");
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 19 14:18:54 KST 2003 */