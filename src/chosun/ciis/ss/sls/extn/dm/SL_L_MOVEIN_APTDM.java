/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-���־���Ʈ��Ȳ-���־���Ʈ��ȸ
* �ۼ����� : 2009-04-03
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * �����濵-���־���Ʈ��Ȳ-���־���Ʈ��ȸ
 */

public class SL_L_MOVEIN_APTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromdt;
	public String todt;
	public String moveinyn;
	public long pageno;
	public long pagesize;

	public SL_L_MOVEIN_APTDM(){}
	public SL_L_MOVEIN_APTDM(String deptcd, String partcd, String areacd, String bocd, String fromdt, String todt, String moveinyn, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromdt = fromdt;
		this.todt = todt;
		this.moveinyn = moveinyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMoveinyn(String moveinyn){
		this.moveinyn = moveinyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMoveinyn(){
		return this.moveinyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_MOVEIN_APT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_MOVEIN_APTDM dm = (SL_L_MOVEIN_APTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.moveinyn);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_MOVEIN_APTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
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
String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String moveinyn = req.getParameter("moveinyn");
if( moveinyn == null){
	System.out.println(this.toString+" : moveinyn is null" );
}else{
	System.out.println(this.toString+" : moveinyn is "+moveinyn );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String moveinyn = Util.checkString(req.getParameter("moveinyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setMoveinyn(moveinyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 14:59:53 KST 2009 */