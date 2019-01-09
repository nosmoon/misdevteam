/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
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
 * 
 */


public class SL_L_GUGUNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String citynm;

	public SL_L_GUGUNDM(){}
	public SL_L_GUGUNDM(String citynm){
		this.citynm = citynm;
	}

	public void setCitynm(String citynm){
		this.citynm = citynm;
	}

	public String getCitynm(){
		return this.citynm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_GUGUN(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_GUGUNDM dm = (SL_L_GUGUNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.citynm);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SL_L_GUGUNDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("citynm = [" + getCitynm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String citynm = req.getParameter("citynm");
if( citynm == null){
	System.out.println(this.toString+" : citynm is null" );
}else{
	System.out.println(this.toString+" : citynm is "+citynm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String citynm = Util.checkString(req.getParameter("citynm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String citynm = Util.Uni2Ksc(Util.checkString(req.getParameter("citynm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCitynm(citynm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Nov 29 07:18:25 GMT 2013 */