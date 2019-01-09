/***************************************************************************************************
 * ���ϸ�   : PS_A_BO_ALON_COLSDM.java
 * ���     : ����-���������
 * �ۼ����� : 2004-03-12
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-���������
 */

public class PS_A_BO_ALON_COLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String closmm;
	public String paydt;

	public PS_A_BO_ALON_COLSDM(){}
	public PS_A_BO_ALON_COLSDM(String cmpycd, String incmgpers, String bocd, String closmm, String paydt){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.closmm = closmm;
		this.paydt = paydt;
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

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
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

	public String getClosmm(){
		return this.closmm;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BO_ALON_COLS( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BO_ALON_COLSDM dm = (PS_A_BO_ALON_COLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.closmm);
		cstmt.setString(7, dm.paydt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_BO_ALON_COLSDataSet();
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
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String paydt = req.getParameter("paydt");
if( paydt == null){
	System.out.println(this.toString+" : paydt is null" );
}else{
	System.out.println(this.toString+" : paydt is "+paydt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String closmm = Util.checkString(req.getParameter("closmm"));
String paydt = Util.checkString(req.getParameter("paydt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String paydt = Util.Uni2Ksc(Util.checkString(req.getParameter("paydt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setClosmm(closmm);
dm.setPaydt(paydt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 12 17:45:25 KST 2004 */