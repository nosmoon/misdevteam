/***************************************************************************************************
 * ���ϸ�   : PS_A_BOEMP_ALONKINDDM.java
 * ���     : ����-������������
 * �ۼ����� : 2004-03-10
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
 * ����-������������
 */

public class PS_A_BOEMP_ALONKINDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String incmgpers;
	public String empalonkindarr;

	public PS_A_BOEMP_ALONKINDDM(){}
	public PS_A_BOEMP_ALONKINDDM(String cmpycd, String bocd, String incmgpers, String empalonkindarr){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.empalonkindarr = empalonkindarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setEmpalonkindarr(String empalonkindarr){
		this.empalonkindarr = empalonkindarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getEmpalonkindarr(){
		return this.empalonkindarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_BOEMP_ALONKIND( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_BOEMP_ALONKINDDM dm = (PS_A_BOEMP_ALONKINDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.empalonkindarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_BOEMP_ALONKINDDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String empalonkindarr = req.getParameter("empalonkindarr");
if( empalonkindarr == null){
	System.out.println(this.toString+" : empalonkindarr is null" );
}else{
	System.out.println(this.toString+" : empalonkindarr is "+empalonkindarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String empalonkindarr = Util.checkString(req.getParameter("empalonkindarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String empalonkindarr = Util.Uni2Ksc(Util.checkString(req.getParameter("empalonkindarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setEmpalonkindarr(empalonkindarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 10 10:49:23 KST 2004 */