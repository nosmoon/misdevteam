/***************************************************************************************************
* ���ϸ� : SP_PS_S_BILL_SEPR.java
* ����-�����Ա� �ʱ�ȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ���ȣ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * ����-�����Ա� �ʱ�ȭ��
 *
 */

public class PS_S_BILL_SEPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;

	public PS_S_BILL_SEPRDM(){}
	public PS_S_BILL_SEPRDM(String cmpycd, String incmgpers){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_BILL_SEPR( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_BILL_SEPRDM dm = (PS_S_BILL_SEPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_S_BILL_SEPRDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 03 17:23:22 KST 2006 */