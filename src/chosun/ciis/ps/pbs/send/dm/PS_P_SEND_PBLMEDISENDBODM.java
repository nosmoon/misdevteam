/***************************************************************************************************
* ���ϸ� : PS_P_SEND_PBLMEDISENDBO.java
* ���   : �߼� - ������ ����Ʈ
* �ۼ����� : 2007-04-13
* �ۼ��� : ����ǥ
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
 * �߼� - ������ ����Ʈ
 */

public class PS_P_SEND_PBLMEDISENDBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String senddt;
	public String mediser_fr;
	public String mediser_to;
	public String medicd;
	public String deptcd;
	public String areacd;
	public String bocd;

	public PS_P_SEND_PBLMEDISENDBODM(){}
	public PS_P_SEND_PBLMEDISENDBODM(String cmpycd, String senddt, String mediser_fr, String mediser_to, String medicd, String deptcd, String areacd, String bocd){
		this.cmpycd = cmpycd;
		this.senddt = senddt;
		this.mediser_fr = mediser_fr;
		this.mediser_to = mediser_to;
		this.medicd = medicd;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setMediser_fr(String mediser_fr){
		this.mediser_fr = mediser_fr;
	}

	public void setMediser_to(String mediser_to){
		this.mediser_to = mediser_to;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getMediser_fr(){
		return this.mediser_fr;
	}

	public String getMediser_to(){
		return this.mediser_to;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_PS_P_SEND_PBLMEDISENDBO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_P_SEND_PBLMEDISENDBODM dm = (PS_P_SEND_PBLMEDISENDBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.senddt);
		cstmt.setString(5, dm.mediser_fr);
		cstmt.setString(6, dm.mediser_to);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.deptcd);
		cstmt.setString(9, dm.areacd);
		cstmt.setString(10, dm.bocd);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_P_SEND_PBLMEDISENDBODataSet();
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
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String mediser_fr = req.getParameter("mediser_fr");
if( mediser_fr == null){
	System.out.println(this.toString+" : mediser_fr is null" );
}else{
	System.out.println(this.toString+" : mediser_fr is "+mediser_fr );
}
String mediser_to = req.getParameter("mediser_to");
if( mediser_to == null){
	System.out.println(this.toString+" : mediser_to is null" );
}else{
	System.out.println(this.toString+" : mediser_to is "+mediser_to );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String senddt = Util.checkString(req.getParameter("senddt"));
String mediser_fr = Util.checkString(req.getParameter("mediser_fr"));
String mediser_to = Util.checkString(req.getParameter("mediser_to"));
String medicd = Util.checkString(req.getParameter("medicd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String mediser_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_fr")));
String mediser_to = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_to")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setSenddt(senddt);
dm.setMediser_fr(mediser_fr);
dm.setMediser_to(mediser_to);
dm.setMedicd(medicd);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 17 14:25:54 KST 2007 */