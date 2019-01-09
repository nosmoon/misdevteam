/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_CAMP_EVENT_LIST.java
 * ���     : ķ����Ȯ��
 * �ۼ����� : 2005/05/26
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.rec.*;

/**
 * ķ����Ȯ��
 */

public class SS_L_CAMP_EVENT_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String camptypecd;

	public SS_L_CAMP_EVENT_LISTDM(){}
	public SS_L_CAMP_EVENT_LISTDM(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CAMP_EVENT_LIST( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CAMP_EVENT_LISTDM dm = (SS_L_CAMP_EVENT_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.camptypecd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.camp.ds.SS_L_CAMP_EVENT_LISTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String camptypecd = req.getParameter("camptypecd");
if( camptypecd == null){
	System.out.println(this.toString+" : camptypecd is null" );
}else{
	System.out.println(this.toString+" : camptypecd is "+camptypecd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String camptypecd = Util.checkString(req.getParameter("camptypecd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String camptypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("camptypecd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCamptypecd(camptypecd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 27 14:31:44 KST 2005 */