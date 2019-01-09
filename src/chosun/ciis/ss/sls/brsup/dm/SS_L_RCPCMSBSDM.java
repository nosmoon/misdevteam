/***************************************************************************************************
* ���ϸ� : SS_L_RCPCMSBSDM.java
* ��� : ��������-����-����������-����-���
* �ۼ����� : 2004-02-23
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
 * ��������-����-����������-����-���
 *
 */


public class SS_L_RCPCMSBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String comscd;
	public String comsnm;
	public String clamtmthdcd;
	public String calcbasiclsf;
	public String remk;
	public long pageno;
	public long pagesize;

	public SS_L_RCPCMSBSDM(){}
	public SS_L_RCPCMSBSDM(String comscd, String comsnm, String clamtmthdcd, String calcbasiclsf, String remk, long pageno, long pagesize){
		this.comscd = comscd;
		this.comsnm = comsnm;
		this.clamtmthdcd = clamtmthdcd;
		this.calcbasiclsf = calcbasiclsf;
		this.remk = remk;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setComscd(String comscd){
		this.comscd = comscd;
	}

	public void setComsnm(String comsnm){
		this.comsnm = comsnm;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setCalcbasiclsf(String calcbasiclsf){
		this.calcbasiclsf = calcbasiclsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getComscd(){
		return this.comscd;
	}

	public String getComsnm(){
		return this.comsnm;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getCalcbasiclsf(){
		return this.calcbasiclsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RCPCMSBS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RCPCMSBSDM dm = (SS_L_RCPCMSBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.comscd);
		cstmt.setString(4, dm.comsnm);
		cstmt.setString(5, dm.clamtmthdcd);
		cstmt.setString(6, dm.calcbasiclsf);
		cstmt.setString(7, dm.remk);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_RCPCMSBSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String comscd = req.getParameter("comscd");
if( comscd == null){
	System.out.println(this.toString+" : comscd is null" );
}else{
	System.out.println(this.toString+" : comscd is "+comscd );
}
String comsnm = req.getParameter("comsnm");
if( comsnm == null){
	System.out.println(this.toString+" : comsnm is null" );
}else{
	System.out.println(this.toString+" : comsnm is "+comsnm );
}
String clamtmthdcd = req.getParameter("clamtmthdcd");
if( clamtmthdcd == null){
	System.out.println(this.toString+" : clamtmthdcd is null" );
}else{
	System.out.println(this.toString+" : clamtmthdcd is "+clamtmthdcd );
}
String calcbasiclsf = req.getParameter("calcbasiclsf");
if( calcbasiclsf == null){
	System.out.println(this.toString+" : calcbasiclsf is null" );
}else{
	System.out.println(this.toString+" : calcbasiclsf is "+calcbasiclsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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

String comscd = Util.checkString(req.getParameter("comscd"));
String comsnm = Util.checkString(req.getParameter("comsnm"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String calcbasiclsf = Util.checkString(req.getParameter("calcbasiclsf"));
String remk = Util.checkString(req.getParameter("remk"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String comscd = Util.Uni2Ksc(Util.checkString(req.getParameter("comscd")));
String comsnm = Util.Uni2Ksc(Util.checkString(req.getParameter("comsnm")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String calcbasiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("calcbasiclsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setComscd(comscd);
dm.setComsnm(comsnm);
dm.setClamtmthdcd(clamtmthdcd);
dm.setCalcbasiclsf(calcbasiclsf);
dm.setRemk(remk);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 25 10:45:34 KST 2004 */