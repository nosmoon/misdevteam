/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_QSEARCH.java
 * ���     : �����濵-����������-����Ʈ���� �ٷΰ���
 * �ۼ����� : 2006/06/21
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String qsearch;

	public SL_S_COMM_APT_QSEARCHDM(){}
	public SL_S_COMM_APT_QSEARCHDM(String qsearch){
		this.qsearch = qsearch;
	}

	public void setQsearch(String qsearch){
		this.qsearch = qsearch;
	}

	public String getQsearch(){
		return this.qsearch;
	}

	public String getSQL(){
		 return "{ call SP_SL_S_COMM_APT_QSEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_COMM_APT_QSEARCHDM dm = (SL_S_COMM_APT_QSEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.qsearch);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_S_COMM_APT_QSEARCHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String qsearch = req.getParameter("qsearch");
if( qsearch == null){
	System.out.println(this.toString+" : qsearch is null" );
}else{
	System.out.println(this.toString+" : qsearch is "+qsearch );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String qsearch = Util.checkString(req.getParameter("qsearch"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String qsearch = Util.Uni2Ksc(Util.checkString(req.getParameter("qsearch")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setQsearch(qsearch);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 22 11:08:44 KST 2006 */