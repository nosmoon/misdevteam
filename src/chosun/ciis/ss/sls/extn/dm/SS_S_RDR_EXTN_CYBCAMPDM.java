/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_CYBCAMPDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ �󼼸� ���� DM
* �ۼ����� : 2004-07-24
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
 * Ȯ����Ȳ-���̹�Ȯ��-��ȸ �󼼸� ���� DM
 */


public class SS_S_RDR_EXTN_CYBCAMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;

	public SS_S_RDR_EXTN_CYBCAMPDM(){}
	public SS_S_RDR_EXTN_CYBCAMPDM(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_RDR_EXTN_CYBCAMP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_RDR_EXTN_CYBCAMPDM dm = (SS_S_RDR_EXTN_CYBCAMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_RDR_EXTN_CYBCAMPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_extncampno(rdr_extncampno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Aug 07 14:15:15 KST 2004 */