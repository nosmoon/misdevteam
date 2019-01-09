/***************************************************************************************************
* ���ϸ� :PS_S_PAYADV.java
* ��� : �����ޱ� �� ��ȸ
* �ۼ����� : 2004-04-10
* �ۼ��� : ����ǥ
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
 * ���Ǳ� - �����ޱ� �� ��ȸ
 *
 */

public class PS_S_PAYADVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String supp_yymm;
	public String boemp_no;

	public PS_S_PAYADVDM(){}
	public PS_S_PAYADVDM(String cmpycd, String bocd, String supp_yymm, String boemp_no){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.supp_yymm = supp_yymm;
		this.boemp_no = boemp_no;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSupp_yymm(String supp_yymm){
		this.supp_yymm = supp_yymm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSupp_yymm(){
		return this.supp_yymm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_PAYADV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_PAYADVDM dm = (PS_S_PAYADVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.supp_yymm);
		cstmt.setString(6, dm.boemp_no);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, Types.INTEGER);
		cstmt.registerOutParameter(25, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_S_PAYADVDataSet();
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
String supp_yymm = req.getParameter("supp_yymm");
if( supp_yymm == null){
	System.out.println(this.toString+" : supp_yymm is null" );
}else{
	System.out.println(this.toString+" : supp_yymm is "+supp_yymm );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String supp_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("supp_yymm")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setSupp_yymm(supp_yymm);
dm.setBoemp_no(boemp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jan 13 12:02:02 KST 2007 */