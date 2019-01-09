/***************************************************************************************************
* ���ϸ� : PS_L_SEND_BNSBK.java
* ��� :   �߼�-���ʽ��Ϲ߼�Ȯ��ó��  ��ȸȭ��
* �ۼ����� : 2004-02-28
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-���ʽ��Ϲ߼� Ȯ��ó��  ��ȸȭ��
 *
 */ 

public class PS_L_SEND_BNSBKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String senddt;
	public String asinbocd;
	public String bnsbk_cd;

	public PS_L_SEND_BNSBKDM(){}
	public PS_L_SEND_BNSBKDM(String cmpycd, String incmgpers, String senddt, String asinbocd, String bnsbk_cd){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.senddt = senddt;
		this.asinbocd = asinbocd;
		this.bnsbk_cd = bnsbk_cd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
	}

	public void setBnsbk_cd(String bnsbk_cd){
		this.bnsbk_cd = bnsbk_cd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public String getBnsbk_cd(){
		return this.bnsbk_cd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_BNSBK( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_BNSBKDM dm = (PS_L_SEND_BNSBKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.senddt);
		cstmt.setString(6, dm.asinbocd);
		cstmt.setString(7, dm.bnsbk_cd);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_BNSBKDataSet();
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
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
}
String bnsbk_cd = req.getParameter("bnsbk_cd");
if( bnsbk_cd == null){
	System.out.println(this.toString+" : bnsbk_cd is null" );
}else{
	System.out.println(this.toString+" : bnsbk_cd is "+bnsbk_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String senddt = Util.checkString(req.getParameter("senddt"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String bnsbk_cd = Util.checkString(req.getParameter("bnsbk_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String bnsbk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bnsbk_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setSenddt(senddt);
dm.setAsinbocd(asinbocd);
dm.setBnsbk_cd(bnsbk_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 07 21:27:00 KST 2005 */