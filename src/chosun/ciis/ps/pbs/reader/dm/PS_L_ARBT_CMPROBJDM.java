/***************************************************************************************************
* ���ϸ� : SP_PS_L_ARBT_CMPROBJ.java
* ��� :   ����-����ó�� �񱳴�󳻿� ��ȸȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * ����-����ó�� �񱳴�󳻿� ��ȸȭ��
 *
 */


public class PS_L_ARBT_CMPROBJDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String arbtno;
	public String arbtaplcdt;

	public PS_L_ARBT_CMPROBJDM(){}
	public PS_L_ARBT_CMPROBJDM(String cmpycd, String arbtno, String arbtaplcdt){
		this.cmpycd = cmpycd;
		this.arbtno = arbtno;
		this.arbtaplcdt = arbtaplcdt;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getArbtno(){
		return this.arbtno;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_ARBT_CMPROBJ( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_ARBT_CMPROBJDM dm = (PS_L_ARBT_CMPROBJDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.arbtno);
		cstmt.setString(5, dm.arbtaplcdt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_ARBT_CMPROBJDataSet();
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
String arbtno = req.getParameter("arbtno");
if( arbtno == null){
	System.out.println(this.toString+" : arbtno is null" );
}else{
	System.out.println(this.toString+" : arbtno is "+arbtno );
}
String arbtaplcdt = req.getParameter("arbtaplcdt");
if( arbtaplcdt == null){
	System.out.println(this.toString+" : arbtaplcdt is null" );
}else{
	System.out.println(this.toString+" : arbtaplcdt is "+arbtaplcdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String arbtno = Util.checkString(req.getParameter("arbtno"));
String arbtaplcdt = Util.checkString(req.getParameter("arbtaplcdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String arbtno = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtno")));
String arbtaplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtaplcdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setArbtno(arbtno);
dm.setArbtaplcdt(arbtaplcdt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 27 10:43:26 KST 2004 */