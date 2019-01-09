/***************************************************************************************************
 * ���ϸ�   : SSExtn2280.java
 * ���     : �ϰ�Ȯ�� ���
 * �ۼ����� : 2011-03-30
 * �ۼ���   : ������
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


public class SS_L_BATCH_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no_list;

	public SS_L_BATCH_EXTNDM(){}
	public SS_L_BATCH_EXTNDM(String rdr_no_list){
		this.rdr_no_list = rdr_no_list;
	}

	public void setRdr_no_list(String rdr_no_list){
		this.rdr_no_list = rdr_no_list;
	}

	public String getRdr_no_list(){
		return this.rdr_no_list;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BATCH_EXTN( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BATCH_EXTNDM dm = (SS_L_BATCH_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no_list);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_BATCH_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_no_list = req.getParameter("rdr_no_list");
if( rdr_no_list == null){
	System.out.println(this.toString+" : rdr_no_list is null" );
}else{
	System.out.println(this.toString+" : rdr_no_list is "+rdr_no_list );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no_list = Util.checkString(req.getParameter("rdr_no_list"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no_list")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_no_list(rdr_no_list);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 05 10:56:32 KST 2011 */