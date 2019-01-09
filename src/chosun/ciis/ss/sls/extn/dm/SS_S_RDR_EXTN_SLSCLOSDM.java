/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_SLSCLOSDM.java
* ��� : Ȯ��������� ���� �󼼸� ���� DM
* �ۼ����� : 2003-12-17
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


public class SS_S_RDR_EXTN_SLSCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;

	public SS_S_RDR_EXTN_SLSCLOSDM(){}
	public SS_S_RDR_EXTN_SLSCLOSDM(String basidt){
		this.basidt = basidt;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_RDR_EXTN_SLSCLOS( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_RDR_EXTN_SLSCLOSDM dm = (SS_S_RDR_EXTN_SLSCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_RDR_EXTN_SLSCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String basidt = Util.checkString(req.getParameter("basidt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBasidt(basidt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 17 17:53:53 KST 2003 */