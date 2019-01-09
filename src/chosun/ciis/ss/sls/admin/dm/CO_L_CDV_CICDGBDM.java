/***************************************************************************************************
* ���ϸ� : CO_L_CDV_CICDGBDM.java
* ��� : ������-�����ڵ�-�ڵ屸�� ����� ���� DM
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�����ڵ�-�ڵ屸�� ����� ���� DM
 */

public class CO_L_CDV_CICDGBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ciymgbcd;

	public CO_L_CDV_CICDGBDM(){}
	public CO_L_CDV_CICDGBDM(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_CDV_CICDGB( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_CDV_CICDGBDM dm = (CO_L_CDV_CICDGBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ciymgbcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.CO_L_CDV_CICDGBDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String ciymgbcd = req.getParameter("ciymgbcd");
if( ciymgbcd == null){
	System.out.println(this.toString+" : ciymgbcd is null" );
}else{
	System.out.println(this.toString+" : ciymgbcd is "+ciymgbcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCiymgbcd(ciymgbcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 09 13:57:19 KST 2004 */