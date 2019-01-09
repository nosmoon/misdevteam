/***************************************************************************************************
* ���ϸ� : SP_PS_A_EMPCAMP_ALON.java
* ����-ķ���ΰ��� ������ 
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ : 
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-ķ���ΰ��� ������                  
 *
 */

  

public class PS_A_EMPCAMP_ALONDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String campseq;
	public String boemparr;
	public String bocdarr;
	public String amtarr;

	public PS_A_EMPCAMP_ALONDM(){}
	public PS_A_EMPCAMP_ALONDM(String cmpycd, String incmgpers, String bocd, String campseq, String boemparr, String bocdarr, String amtarr){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.campseq = campseq;
		this.boemparr = boemparr;
		this.bocdarr = bocdarr;
		this.amtarr = amtarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCampseq(String campseq){
		this.campseq = campseq;
	}

	public void setBoemparr(String boemparr){
		this.boemparr = boemparr;
	}

	public void setBocdarr(String bocdarr){
		this.bocdarr = bocdarr;
	}

	public void setAmtarr(String amtarr){
		this.amtarr = amtarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCampseq(){
		return this.campseq;
	}

	public String getBoemparr(){
		return this.boemparr;
	}

	public String getBocdarr(){
		return this.bocdarr;
	}

	public String getAmtarr(){
		return this.amtarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_EMPCAMP_ALON( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_EMPCAMP_ALONDM dm = (PS_A_EMPCAMP_ALONDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.campseq);
		cstmt.setString(7, dm.boemparr);
		cstmt.setString(8, dm.bocdarr);
		cstmt.setString(9, dm.amtarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_EMPCAMP_ALONDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String campseq = req.getParameter("campseq");
if( campseq == null){
	System.out.println(this.toString+" : campseq is null" );
}else{
	System.out.println(this.toString+" : campseq is "+campseq );
}
String boemparr = req.getParameter("boemparr");
if( boemparr == null){
	System.out.println(this.toString+" : boemparr is null" );
}else{
	System.out.println(this.toString+" : boemparr is "+boemparr );
}
String bocdarr = req.getParameter("bocdarr");
if( bocdarr == null){
	System.out.println(this.toString+" : bocdarr is null" );
}else{
	System.out.println(this.toString+" : bocdarr is "+bocdarr );
}
String amtarr = req.getParameter("amtarr");
if( amtarr == null){
	System.out.println(this.toString+" : amtarr is null" );
}else{
	System.out.println(this.toString+" : amtarr is "+amtarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String campseq = Util.checkString(req.getParameter("campseq"));
String boemparr = Util.checkString(req.getParameter("boemparr"));
String bocdarr = Util.checkString(req.getParameter("bocdarr"));
String amtarr = Util.checkString(req.getParameter("amtarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));
String boemparr = Util.Uni2Ksc(Util.checkString(req.getParameter("boemparr")));
String bocdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdarr")));
String amtarr = Util.Uni2Ksc(Util.checkString(req.getParameter("amtarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setCampseq(campseq);
dm.setBoemparr(boemparr);
dm.setBocdarr(bocdarr);
dm.setAmtarr(amtarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 09:34:14 KST 2004 */