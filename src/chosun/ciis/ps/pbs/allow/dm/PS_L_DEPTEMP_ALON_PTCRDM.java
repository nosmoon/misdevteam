/***************************************************************************************************
 * ���ϸ�   : PS_L_DEPTEMP_ALON_PTCR.java
 * ���     : ����-��������� ��ȸ
 * �ۼ����� : 2004-03-08
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
 * ����-��������� �˻�
 */

public class PS_L_DEPTEMP_ALON_PTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String closmm;
	public String bocd;
	public String deptcd;

	public PS_L_DEPTEMP_ALON_PTCRDM(){}
	public PS_L_DEPTEMP_ALON_PTCRDM(String cmpycd, String incmgpers, String closmm, String bocd, String deptcd){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.closmm = closmm;
		this.bocd = bocd;
		this.deptcd = deptcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_DEPTEMP_ALON_PTCR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_DEPTEMP_ALON_PTCRDM dm = (PS_L_DEPTEMP_ALON_PTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.closmm);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.deptcd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_L_DEPTEMP_ALON_PTCRDataSet();
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
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String closmm = Util.checkString(req.getParameter("closmm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setClosmm(closmm);
dm.setBocd(bocd);
dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 21 17:43:19 KST 2007 */