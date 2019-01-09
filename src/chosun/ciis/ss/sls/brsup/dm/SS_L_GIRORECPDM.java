/***************************************************************************************************
 * ���ϸ�   : SS_L_GIRORECPDM.java
 * ���     : ��������-����-����EDI
 * �ۼ����� : 2007/02/22
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_GIRORECP
**/

public class SS_L_GIRORECPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String ordcond;
	public String acqdt;
	public long pageno;
	public long pagesize;
	public String recpclsf;

	public SS_L_GIRORECPDM(){}
	public SS_L_GIRORECPDM(String bocd, String ordcond, String acqdt, long pageno, long pagesize, String recpclsf){
		this.bocd = bocd;
		this.ordcond = ordcond;
		this.acqdt = acqdt;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.recpclsf = recpclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setOrdcond(String ordcond){
		this.ordcond = ordcond;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getOrdcond(){
		return this.ordcond;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_GIRORECP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_GIRORECPDM dm = (SS_L_GIRORECPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.ordcond);
		cstmt.setString(5, dm.acqdt);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.setString(8, dm.recpclsf);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_GIRORECPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String ordcond = req.getParameter("ordcond");
if( ordcond == null){
	System.out.println(this.toString+" : ordcond is null" );
}else{
	System.out.println(this.toString+" : ordcond is "+ordcond );
}
String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
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
String recpclsf = req.getParameter("recpclsf");
if( recpclsf == null){
	System.out.println(this.toString+" : recpclsf is null" );
}else{
	System.out.println(this.toString+" : recpclsf is "+recpclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String ordcond = Util.checkString(req.getParameter("ordcond"));
String acqdt = Util.checkString(req.getParameter("acqdt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String recpclsf = Util.checkString(req.getParameter("recpclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String ordcond = Util.Uni2Ksc(Util.checkString(req.getParameter("ordcond")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String recpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recpclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setOrdcond(ordcond);
dm.setAcqdt(acqdt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setRecpclsf(recpclsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 22 16:45:43 KST 2007 */