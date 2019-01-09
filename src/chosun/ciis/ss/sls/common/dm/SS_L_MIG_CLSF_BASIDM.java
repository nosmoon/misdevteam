/***************************************************************************************************
* ���ϸ� : SS_L_MIG_CLSF_BASIDM.java
* ��� : ����-���ޱ����ڵ�(��ޱ��к�)(���ϸ���)�� ���� DM
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * ����-���ޱ����ڵ�(��ޱ��к�)(���ϸ���)�� ���� DM
 */

public class SS_L_MIG_CLSF_BASIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String payclsfcd;

	public SS_L_MIG_CLSF_BASIDM(){}
	public SS_L_MIG_CLSF_BASIDM(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MIG_CLSF_BASI( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MIG_CLSF_BASIDM dm = (SS_L_MIG_CLSF_BASIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.payclsfcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_MIG_CLSF_BASIDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String payclsfcd = req.getParameter("payclsfcd");
if( payclsfcd == null){
	System.out.println(this.toString+" : payclsfcd is null" );
}else{
	System.out.println(this.toString+" : payclsfcd is "+payclsfcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String payclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("payclsfcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setPayclsfcd(payclsfcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 20 16:47:30 KST 2004 */