/***************************************************************************************************
* ���ϸ� : SS_S_NWSPITEMDM.java
* ��� : ��������-�Ź�������ǰ-���-�󼼸� ���� DM
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-���-�󼼸� ���� DM
 */


public class SS_S_NWSPITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemcd;

	public SS_S_NWSPITEMDM(){}
	public SS_S_NWSPITEMDM(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_NWSPITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_NWSPITEMDM dm = (SS_S_NWSPITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemcd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_NWSPITEMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String itemcd = Util.checkString(req.getParameter("itemcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setItemcd(itemcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jan 29 21:06:58 KST 2004 */