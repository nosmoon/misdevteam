/***************************************************************************************************
* ���ϸ� : SS_S_RCPCMSBSDM.java
* ��� : ��������-����-����������-����-��
* �ۼ����� : 2004-02-23
* �ۼ��� : �迵��
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
 * ��������-����-����������-����-��
 *
 */


public class SS_S_RCPCMSBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String comscd;

	public SS_S_RCPCMSBSDM(){}
	public SS_S_RCPCMSBSDM(String comscd){
		this.comscd = comscd;
	}

	public void setComscd(String comscd){
		this.comscd = comscd;
	}

	public String getComscd(){
		return this.comscd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_RCPCMSBS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_RCPCMSBSDM dm = (SS_S_RCPCMSBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.comscd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_RCPCMSBSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String comscd = req.getParameter("comscd");
if( comscd == null){
	System.out.println(this.toString+" : comscd is null" );
}else{
	System.out.println(this.toString+" : comscd is "+comscd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String comscd = Util.checkString(req.getParameter("comscd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String comscd = Util.Uni2Ksc(Util.checkString(req.getParameter("comscd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setComscd(comscd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 25 11:24:46 KST 2004 */