/***************************************************************************************************
* ���ϸ� : 
* ��� :  �߼�-�������� �߼�ó��
* �ۼ����� : 2004-03-11
* �ۼ��� : ���ȯ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-��������߼� �߼�ó��
 *
 */

public class PS_L_SEND_GIRONORMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String cmpycd;
	public String girosenddt;
	public long pageno;
	public long pagesize;

	public PS_L_SEND_GIRONORMDM(){}
	public PS_L_SEND_GIRONORMDM(String bocd, String cmpycd, String girosenddt, long pageno, long pagesize){
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.girosenddt = girosenddt;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setGirosenddt(String girosenddt){
		this.girosenddt = girosenddt;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getGirosenddt(){
		return this.girosenddt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_GIRONORM( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_GIRONORMDM dm = (PS_L_SEND_GIRONORMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.girosenddt);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_GIRONORMDataSet();
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
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String girosenddt = req.getParameter("girosenddt");
if( girosenddt == null){
	System.out.println(this.toString+" : girosenddt is null" );
}else{
	System.out.println(this.toString+" : girosenddt is "+girosenddt );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String girosenddt = Util.checkString(req.getParameter("girosenddt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String girosenddt = Util.Uni2Ksc(Util.checkString(req.getParameter("girosenddt")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setGirosenddt(girosenddt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 11 20:32:41 KST 2004 */