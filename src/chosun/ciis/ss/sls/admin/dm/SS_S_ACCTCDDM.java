/***************************************************************************************************
* ���ϸ� : SS_S_ACCTCDDM.java
* ��� : ������-�����ڵ�-�󼼸� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�����ڵ�-�󼼸� ���� DM
 */


public class SS_S_ACCTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acctcd;

	public SS_S_ACCTCDDM(){}
	public SS_S_ACCTCDDM(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_ACCTCD( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_ACCTCDDM dm = (SS_S_ACCTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acctcd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_S_ACCTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String acctcd = req.getParameter("acctcd");
if( acctcd == null){
	System.out.println(this.toString+" : acctcd is null" );
}else{
	System.out.println(this.toString+" : acctcd is "+acctcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String acctcd = Util.checkString(req.getParameter("acctcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String acctcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAcctcd(acctcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 03 17:43:58 KST 2004 */