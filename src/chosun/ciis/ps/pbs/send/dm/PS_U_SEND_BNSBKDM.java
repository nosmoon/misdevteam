/***************************************************************************************************
* ���ϸ� : SP_PS_U_SEND_BNSBK.java
* ��� :   �߼�-���ʽ��Ϲ߼�Ȯ��ó��  
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
 * �߼�-���ʽ��Ϲ߼� Ȯ��ó��  
 *
 */ 


public class PS_U_SEND_BNSBKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd_cnfm;
	public String senddt_cnfm;
	public String chkcnfm_cnfm;
	public String hdqtsend_dt_cnfm;

	public PS_U_SEND_BNSBKDM(){}
	public PS_U_SEND_BNSBKDM(String cmpycd, String incmgpers, String bocd_cnfm, String senddt_cnfm, String chkcnfm_cnfm, String hdqtsend_dt_cnfm){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd_cnfm = bocd_cnfm;
		this.senddt_cnfm = senddt_cnfm;
		this.chkcnfm_cnfm = chkcnfm_cnfm;
		this.hdqtsend_dt_cnfm = hdqtsend_dt_cnfm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd_cnfm(String bocd_cnfm){
		this.bocd_cnfm = bocd_cnfm;
	}

	public void setSenddt_cnfm(String senddt_cnfm){
		this.senddt_cnfm = senddt_cnfm;
	}

	public void setChkcnfm_cnfm(String chkcnfm_cnfm){
		this.chkcnfm_cnfm = chkcnfm_cnfm;
	}

	public void setHdqtsend_dt_cnfm(String hdqtsend_dt_cnfm){
		this.hdqtsend_dt_cnfm = hdqtsend_dt_cnfm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd_cnfm(){
		return this.bocd_cnfm;
	}

	public String getSenddt_cnfm(){
		return this.senddt_cnfm;
	}

	public String getChkcnfm_cnfm(){
		return this.chkcnfm_cnfm;
	}

	public String getHdqtsend_dt_cnfm(){
		return this.hdqtsend_dt_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_SEND_BNSBK( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_SEND_BNSBKDM dm = (PS_U_SEND_BNSBKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd_cnfm);
		cstmt.setString(6, dm.senddt_cnfm);
		cstmt.setString(7, dm.chkcnfm_cnfm);
		cstmt.setString(8, dm.hdqtsend_dt_cnfm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_U_SEND_BNSBKDataSet();
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
String bocd_cnfm = req.getParameter("bocd_cnfm");
if( bocd_cnfm == null){
	System.out.println(this.toString+" : bocd_cnfm is null" );
}else{
	System.out.println(this.toString+" : bocd_cnfm is "+bocd_cnfm );
}
String senddt_cnfm = req.getParameter("senddt_cnfm");
if( senddt_cnfm == null){
	System.out.println(this.toString+" : senddt_cnfm is null" );
}else{
	System.out.println(this.toString+" : senddt_cnfm is "+senddt_cnfm );
}
String chkcnfm_cnfm = req.getParameter("chkcnfm_cnfm");
if( chkcnfm_cnfm == null){
	System.out.println(this.toString+" : chkcnfm_cnfm is null" );
}else{
	System.out.println(this.toString+" : chkcnfm_cnfm is "+chkcnfm_cnfm );
}
String hdqtsend_dt_cnfm = req.getParameter("hdqtsend_dt_cnfm");
if( hdqtsend_dt_cnfm == null){
	System.out.println(this.toString+" : hdqtsend_dt_cnfm is null" );
}else{
	System.out.println(this.toString+" : hdqtsend_dt_cnfm is "+hdqtsend_dt_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
String senddt_cnfm = Util.checkString(req.getParameter("senddt_cnfm"));
String chkcnfm_cnfm = Util.checkString(req.getParameter("chkcnfm_cnfm"));
String hdqtsend_dt_cnfm = Util.checkString(req.getParameter("hdqtsend_dt_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd_cnfm")));
String senddt_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt_cnfm")));
String chkcnfm_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("chkcnfm_cnfm")));
String hdqtsend_dt_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtsend_dt_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd_cnfm(bocd_cnfm);
dm.setSenddt_cnfm(senddt_cnfm);
dm.setChkcnfm_cnfm(chkcnfm_cnfm);
dm.setHdqtsend_dt_cnfm(hdqtsend_dt_cnfm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 03 15:22:15 KST 2004 */