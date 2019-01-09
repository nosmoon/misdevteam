/***************************************************************************************************
* ���ϸ� : SS_L_VSCD_AREANMDM.java
* ��� : ������Ȳ VacationStop ��� �ް����ڵ�, �ڵ�� ��ȸ
* �ۼ����� : 2004-01-16
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * ������Ȳ VacationStop ��� �ް����ڵ�, �ڵ�� ��ȸ
 *
 */


public class SS_L_VSCD_AREANMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String vaca_arearegncd;

	public SS_L_VSCD_AREANMDM(){}
	public SS_L_VSCD_AREANMDM(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_VSCD_AREANM( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VSCD_AREANMDM dm = (SS_L_VSCD_AREANMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.vaca_arearegncd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_VSCD_AREANMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setVaca_arearegncd(vaca_arearegncd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jan 17 19:13:37 KST 2004 */