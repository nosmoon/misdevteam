/***************************************************************************************************
* ���ϸ� : SS_L_OTHQTYDM.java
* ��� : ��������-Ÿ��߼ۺμ�-����� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-Ÿ��߼ۺμ�-����� ���� DM
 */


public class SS_L_OTHQTYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String invsgdt;
	public String invsgdt2;
	public long pageno;
	public long pagesize;

	public SS_L_OTHQTYDM(){}
	public SS_L_OTHQTYDM(String invsgdt, String invsgdt2, long pageno, long pagesize){
		this.invsgdt = invsgdt;
		this.invsgdt2 = invsgdt2;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgdt2(String invsgdt2){
		this.invsgdt2 = invsgdt2;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgdt2(){
		return this.invsgdt2;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_OTHQTY( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_OTHQTYDM dm = (SS_L_OTHQTYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.invsgdt);
		cstmt.setString(4, dm.invsgdt2);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_L_OTHQTYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String invsgdt2 = req.getParameter("invsgdt2");
if( invsgdt2 == null){
	System.out.println(this.toString+" : invsgdt2 is null" );
}else{
	System.out.println(this.toString+" : invsgdt2 is "+invsgdt2 );
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

String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setInvsgdt(invsgdt);
dm.setInvsgdt2(invsgdt2);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 03 15:53:19 KST 2004 */