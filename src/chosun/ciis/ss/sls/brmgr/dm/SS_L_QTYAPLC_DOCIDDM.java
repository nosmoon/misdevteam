/***************************************************************************************************
* ���ϸ� : SS_L_QTYAPLC_DOCIDDM.java
* ��� : �����濵 - �μ����� - ����(���) - ���繮��ID ��ȸ
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


public class SS_L_QTYAPLC_DOCIDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String documenttype;

	public SS_L_QTYAPLC_DOCIDDM(){}
	public SS_L_QTYAPLC_DOCIDDM(String documenttype){
		this.documenttype = documenttype;
	}

	public void setDocumenttype(String documenttype){
		this.documenttype = documenttype;
	}

	public String getDocumenttype(){
		return this.documenttype;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_QTYAPLC_DOCID( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_QTYAPLC_DOCIDDM dm = (SS_L_QTYAPLC_DOCIDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.documenttype);
		cstmt.registerOutParameter(4, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_DOCIDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String documenttype = req.getParameter("documenttype");
if( documenttype == null){
	System.out.println(this.toString+" : documenttype is null" );
}else{
	System.out.println(this.toString+" : documenttype is "+documenttype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String documenttype = Util.checkString(req.getParameter("documenttype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String documenttype = Util.Uni2Ksc(Util.checkString(req.getParameter("documenttype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDocumenttype(documenttype);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 15:53:20 KST 2009 */