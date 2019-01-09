/***************************************************************************************************
* ���ϸ� : SS_L_EXTNBLNGCDDM.java
* ��� : Ȯ���ڼҼ� ����� ���� DM
* �ۼ����� : 2003-11-30
* �ۼ��� : ��뼷
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
 * class definition
 *
 */


public class SS_L_EXTNBLNGCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extntypecd;

	public SS_L_EXTNBLNGCDDM(){}
	public SS_L_EXTNBLNGCDDM(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTNBLNGCD( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTNBLNGCDDM dm = (SS_L_EXTNBLNGCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extntypecd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTNBLNGCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_extntypecd(rdr_extntypecd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 20 22:16:45 KST 2003 */