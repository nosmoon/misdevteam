/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXPAY_INITDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ���� ���� DM
* �ۼ����� : 2004-09-13
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
 * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ���� ���� DM
 */


public class SS_L_PROMSTAF_CYEXPAY_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;

	public SS_L_PROMSTAF_CYEXPAY_INITDM(){}
	public SS_L_PROMSTAF_CYEXPAY_INITDM(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PROMSTAF_CYEXPAY_INIT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_CYEXPAY_INITDM dm = (SS_L_PROMSTAF_CYEXPAY_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_PROMSTAF_CYEXPAY_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 14 19:44:43 KST 2004 */