/***************************************************************************************************
* ���ϸ� : SS_L_PYMTDM.java
* ��� : ������������-Billing�ڵ���ü-�����ڸ��
* �ۼ����� : 2004-03-18
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ������������-Billing�ڵ���ü-�����ڸ��
 *
 */


public class SS_L_PYMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String shftclsf;
	public String shftstatclsfcd;
	public String pymt;

	public SS_L_PYMTDM(){}
	public SS_L_PYMTDM(String shftclsf, String shftstatclsfcd, String pymt){
		this.shftclsf = shftclsf;
		this.shftstatclsfcd = shftstatclsfcd;
		this.pymt = pymt;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftstatclsfcd(String shftstatclsfcd){
		this.shftstatclsfcd = shftstatclsfcd;
	}

	public void setPymt(String pymt){
		this.pymt = pymt;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftstatclsfcd(){
		return this.shftstatclsfcd;
	}

	public String getPymt(){
		return this.pymt;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PYMT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PYMTDM dm = (SS_L_PYMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.shftclsf);
		cstmt.setString(4, dm.shftstatclsfcd);
		cstmt.setString(5, dm.pymt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PYMTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String shftstatclsfcd = req.getParameter("shftstatclsfcd");
if( shftstatclsfcd == null){
	System.out.println(this.toString+" : shftstatclsfcd is null" );
}else{
	System.out.println(this.toString+" : shftstatclsfcd is "+shftstatclsfcd );
}
String pymt = req.getParameter("pymt");
if( pymt == null){
	System.out.println(this.toString+" : pymt is null" );
}else{
	System.out.println(this.toString+" : pymt is "+pymt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String shftstatclsfcd = Util.checkString(req.getParameter("shftstatclsfcd"));
String pymt = Util.checkString(req.getParameter("pymt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String shftstatclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftstatclsfcd")));
String pymt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setShftclsf(shftclsf);
dm.setShftstatclsfcd(shftstatclsfcd);
dm.setPymt(pymt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 23 14:50:46 KST 2004 */