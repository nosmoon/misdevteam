/***************************************************************************************************
* ���ϸ� : SP_PS_U_RDR_ARBT.java
* ��� :   ����-����ó�� ����ó��ȭ��
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
 * ����-����ó�� ����ó��ȭ��
 *
 */


public class PS_U_RDR_ARBTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String arbtno;
	public String arbtaplcdt;
	public String aprvproccd;
	public String arbtprocresn;

	public PS_U_RDR_ARBTDM(){}
	public PS_U_RDR_ARBTDM(String cmpycd, String incmgpers, String arbtno, String arbtaplcdt, String aprvproccd, String arbtprocresn){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.arbtno = arbtno;
		this.arbtaplcdt = arbtaplcdt;
		this.aprvproccd = aprvproccd;
		this.arbtprocresn = arbtprocresn;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
	}

	public void setAprvproccd(String aprvproccd){
		this.aprvproccd = aprvproccd;
	}

	public void setArbtprocresn(String arbtprocresn){
		this.arbtprocresn = arbtprocresn;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getArbtno(){
		return this.arbtno;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
	}

	public String getAprvproccd(){
		return this.aprvproccd;
	}

	public String getArbtprocresn(){
		return this.arbtprocresn;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_RDR_ARBT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_RDR_ARBTDM dm = (PS_U_RDR_ARBTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.arbtno);
		cstmt.setString(6, dm.arbtaplcdt);
		cstmt.setString(7, dm.aprvproccd);
		cstmt.setString(8, dm.arbtprocresn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_U_RDR_ARBTDataSet();
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
String aprvproccd = req.getParameter("aprvproccd");
if( aprvproccd == null){
	System.out.println(this.toString+" : aprvproccd is null" );
}else{
	System.out.println(this.toString+" : aprvproccd is "+aprvproccd );
}
String arbtprocresn = req.getParameter("arbtprocresn");
if( arbtprocresn == null){
	System.out.println(this.toString+" : arbtprocresn is null" );
}else{
	System.out.println(this.toString+" : arbtprocresn is "+arbtprocresn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String arbtno = Util.checkString(req.getParameter("arbtno"));
String arbtaplcdt = Util.checkString(req.getParameter("arbtaplcdt"));
String aprvproccd = Util.checkString(req.getParameter("aprvproccd"));
String arbtprocresn = Util.checkString(req.getParameter("arbtprocresn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String arbtno = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtno")));
String arbtaplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtaplcdt")));
String aprvproccd = Util.Uni2Ksc(Util.checkString(req.getParameter("aprvproccd")));
String arbtprocresn = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtprocresn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setArbtno(arbtno);
dm.setArbtaplcdt(arbtaplcdt);
dm.setAprvproccd(aprvproccd);
dm.setArbtprocresn(arbtprocresn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 26 21:58:27 KST 2004 */