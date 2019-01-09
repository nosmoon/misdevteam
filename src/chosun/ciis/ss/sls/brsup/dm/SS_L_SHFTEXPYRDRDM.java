/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������������-Billing�ڵ���ü-��������-�����ȸ
* �ۼ����� : 2005-01-14
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ������������-Billing�ڵ���ü-��������-�����ȸ
 */


public class SS_L_SHFTEXPYRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_dt;
	public String to_dt;
	public String shftclsf;
	public String resv1;
	public String resv2;
	public String resv3;
	public String resv4;
	public long pageno;
	public long pagesize;

	public SS_L_SHFTEXPYRDRDM(){}
	public SS_L_SHFTEXPYRDRDM(String fr_dt, String to_dt, String shftclsf, String resv1, String resv2, String resv3, String resv4, long pageno, long pagesize){
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.shftclsf = shftclsf;
		this.resv1 = resv1;
		this.resv2 = resv2;
		this.resv3 = resv3;
		this.resv4 = resv4;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setResv1(String resv1){
		this.resv1 = resv1;
	}

	public void setResv2(String resv2){
		this.resv2 = resv2;
	}

	public void setResv3(String resv3){
		this.resv3 = resv3;
	}

	public void setResv4(String resv4){
		this.resv4 = resv4;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getResv1(){
		return this.resv1;
	}

	public String getResv2(){
		return this.resv2;
	}

	public String getResv3(){
		return this.resv3;
	}

	public String getResv4(){
		return this.resv4;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTEXPYRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTEXPYRDRDM dm = (SS_L_SHFTEXPYRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_dt);
		cstmt.setString(4, dm.to_dt);
		cstmt.setString(5, dm.shftclsf);
		cstmt.setString(6, dm.resv1);
		cstmt.setString(7, dm.resv2);
		cstmt.setString(8, dm.resv3);
		cstmt.setString(9, dm.resv4);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFTEXPYRDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String resv1 = req.getParameter("resv1");
if( resv1 == null){
	System.out.println(this.toString+" : resv1 is null" );
}else{
	System.out.println(this.toString+" : resv1 is "+resv1 );
}
String resv2 = req.getParameter("resv2");
if( resv2 == null){
	System.out.println(this.toString+" : resv2 is null" );
}else{
	System.out.println(this.toString+" : resv2 is "+resv2 );
}
String resv3 = req.getParameter("resv3");
if( resv3 == null){
	System.out.println(this.toString+" : resv3 is null" );
}else{
	System.out.println(this.toString+" : resv3 is "+resv3 );
}
String resv4 = req.getParameter("resv4");
if( resv4 == null){
	System.out.println(this.toString+" : resv4 is null" );
}else{
	System.out.println(this.toString+" : resv4 is "+resv4 );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String resv1 = Util.checkString(req.getParameter("resv1"));
String resv2 = Util.checkString(req.getParameter("resv2"));
String resv3 = Util.checkString(req.getParameter("resv3"));
String resv4 = Util.checkString(req.getParameter("resv4"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String resv1 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv1")));
String resv2 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv2")));
String resv3 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv3")));
String resv4 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv4")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setShftclsf(shftclsf);
dm.setResv1(resv1);
dm.setResv2(resv2);
dm.setResv3(resv3);
dm.setResv4(resv4);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 14 19:21:56 KST 2005 */
