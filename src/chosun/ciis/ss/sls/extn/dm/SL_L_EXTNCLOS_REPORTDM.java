/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ-Ȳ������ ��ǥ��ȸ
* �ۼ����� : 2011-11-14
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SL_L_EXTNCLOS_REPORTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frextndt;
	public String toextndt;
	public String pageflag;
	public long pageno;
	public long pagesize;

	public SL_L_EXTNCLOS_REPORTDM(){}
	public SL_L_EXTNCLOS_REPORTDM(String frextndt, String toextndt, String pageflag, long pageno, long pagesize){
		this.frextndt = frextndt;
		this.toextndt = toextndt;
		this.pageflag = pageflag;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFrextndt(String frextndt){
		this.frextndt = frextndt;
	}

	public void setToextndt(String toextndt){
		this.toextndt = toextndt;
	}

	public void setPageflag(String pageflag){
		this.pageflag = pageflag;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFrextndt(){
		return this.frextndt;
	}

	public String getToextndt(){
		return this.toextndt;
	}

	public String getPageflag(){
		return this.pageflag;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_EXTNCLOS_REPORT(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_EXTNCLOS_REPORTDM dm = (SL_L_EXTNCLOS_REPORTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frextndt);
		cstmt.setString(4, dm.toextndt);
		cstmt.setString(5, dm.pageflag);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, Types.INTEGER);
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
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_EXTNCLOS_REPORTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("frextndt = [" + getFrextndt() + "]");
		System.out.println("toextndt = [" + getToextndt() + "]");
		System.out.println("pageflag = [" + getPageflag() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String frextndt = req.getParameter("frextndt");
if( frextndt == null){
	System.out.println(this.toString+" : frextndt is null" );
}else{
	System.out.println(this.toString+" : frextndt is "+frextndt );
}
String toextndt = req.getParameter("toextndt");
if( toextndt == null){
	System.out.println(this.toString+" : toextndt is null" );
}else{
	System.out.println(this.toString+" : toextndt is "+toextndt );
}
String pageflag = req.getParameter("pageflag");
if( pageflag == null){
	System.out.println(this.toString+" : pageflag is null" );
}else{
	System.out.println(this.toString+" : pageflag is "+pageflag );
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

String frextndt = Util.checkString(req.getParameter("frextndt"));
String toextndt = Util.checkString(req.getParameter("toextndt"));
String pageflag = Util.checkString(req.getParameter("pageflag"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String frextndt = Util.Uni2Ksc(Util.checkString(req.getParameter("frextndt")));
String toextndt = Util.Uni2Ksc(Util.checkString(req.getParameter("toextndt")));
String pageflag = Util.Uni2Ksc(Util.checkString(req.getParameter("pageflag")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrextndt(frextndt);
dm.setToextndt(toextndt);
dm.setPageflag(pageflag);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 23 15:00:57 KST 2011 */