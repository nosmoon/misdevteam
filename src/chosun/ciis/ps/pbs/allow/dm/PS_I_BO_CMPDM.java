/***************************************************************************************************
* ���ϸ� : SP_PS_I_BO_CMP.java
* ����-ķ���ΰ��� ķ���� ���ȭ��
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-ķ���ΰ��� ķ���ε��
 *
 */ 

  

public class PS_I_BO_CMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String campnm;
	public String bgncampdt;
	public String endcampdt;
	public String cont;

	public PS_I_BO_CMPDM(){}
	public PS_I_BO_CMPDM(String cmpycd, String incmgpers, String bocd, String campnm, String bgncampdt, String endcampdt, String cont){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.campnm = campnm;
		this.bgncampdt = bgncampdt;
		this.endcampdt = endcampdt;
		this.cont = cont;
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

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setBgncampdt(String bgncampdt){
		this.bgncampdt = bgncampdt;
	}

	public void setEndcampdt(String endcampdt){
		this.endcampdt = endcampdt;
	}

	public void setCont(String cont){
		this.cont = cont;
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

	public String getCampnm(){
		return this.campnm;
	}

	public String getBgncampdt(){
		return this.bgncampdt;
	}

	public String getEndcampdt(){
		return this.endcampdt;
	}

	public String getCont(){
		return this.cont;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_BO_CMP( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_BO_CMPDM dm = (PS_I_BO_CMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.campnm);
		cstmt.setString(7, dm.bgncampdt);
		cstmt.setString(8, dm.endcampdt);
		cstmt.setString(9, dm.cont);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_I_BO_CMPDataSet();
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
String campnm = req.getParameter("campnm");
if( campnm == null){
	System.out.println(this.toString+" : campnm is null" );
}else{
	System.out.println(this.toString+" : campnm is "+campnm );
}
String bgncampdt = req.getParameter("bgncampdt");
if( bgncampdt == null){
	System.out.println(this.toString+" : bgncampdt is null" );
}else{
	System.out.println(this.toString+" : bgncampdt is "+bgncampdt );
}
String endcampdt = req.getParameter("endcampdt");
if( endcampdt == null){
	System.out.println(this.toString+" : endcampdt is null" );
}else{
	System.out.println(this.toString+" : endcampdt is "+endcampdt );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String campnm = Util.checkString(req.getParameter("campnm"));
String bgncampdt = Util.checkString(req.getParameter("bgncampdt"));
String endcampdt = Util.checkString(req.getParameter("endcampdt"));
String cont = Util.checkString(req.getParameter("cont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
String bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgncampdt")));
String endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("endcampdt")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setCampnm(campnm);
dm.setBgncampdt(bgncampdt);
dm.setEndcampdt(endcampdt);
dm.setCont(cont);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 10 20:34:26 KST 2004 */