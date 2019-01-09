/***************************************************************************************************
* ���ϸ� : SS_L_QTYAPLC_ILGYEDM.java
* ��� : �����濵 - �μ����� - ����(���) - �������� �μ���Ȳ ��ȸ
* �ۼ����� : 2009-04-30
* �ۼ��� : Ȳ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_L_QTYAPLC_ILGYEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String arealist;

	public SS_L_QTYAPLC_ILGYEDM(){}
	public SS_L_QTYAPLC_ILGYEDM(String arealist){
		this.arealist = arealist;
	}

	public void setArealist(String arealist){
		this.arealist = arealist;
	}

	public String getArealist(){
		return this.arealist;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_QTYAPLC_ILGYE( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_QTYAPLC_ILGYEDM dm = (SS_L_QTYAPLC_ILGYEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.arealist);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_ILGYEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String arealist = req.getParameter("arealist");
if( arealist == null){
	System.out.println(this.toString+" : arealist is null" );
}else{
	System.out.println(this.toString+" : arealist is "+arealist );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String arealist = Util.checkString(req.getParameter("arealist"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String arealist = Util.Uni2Ksc(Util.checkString(req.getParameter("arealist")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setArealist(arealist);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 30 17:41:27 KST 2009 */