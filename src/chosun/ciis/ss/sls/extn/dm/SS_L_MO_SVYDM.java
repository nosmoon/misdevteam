/***************************************************************************************************
* ���ϸ� : SS_L_MO_SVYDM.java
* ��� :  �������˵��ڰ��� ��������� �����ش�.
* �ۼ����� : 2015.11.11
* �ۼ��� : �弱��
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


public class SS_L_MO_SVYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String svynm;
	public String svyid;
	public String stat;
	public long pageno;
	public long pagesize;

	public SS_L_MO_SVYDM(){}
	public SS_L_MO_SVYDM(String frdt, String todt, String svynm, String svyid, String stat, long pageno, long pagesize){
		this.frdt = frdt;
		this.todt = todt;
		this.svynm = svynm;
		this.svyid = svyid;
		this.svyid = stat;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}
	
	public void setStat(String stat){
		this.stat = stat;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSvynm(){
		return this.svynm;
	}

	public String getSvyid(){
		return this.svyid;
	}
	
	public String getStat(){
		return this.stat;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MO_SVY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?  ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MO_SVYDM dm = (SS_L_MO_SVYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.svynm);
		cstmt.setString(6, dm.svyid);
		cstmt.setString(7, dm.stat);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_MO_SVYDataSet();
	}



    public void print(){
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("svynm = " + getSvynm());
        System.out.println("svyid = " + getSvyid());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String svynm = req.getParameter("svynm");
if( svynm == null){
	System.out.println(this.toString+" : svynm is null" );
}else{
	System.out.println(this.toString+" : svynm is "+svynm );
}
String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
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

String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String svynm = Util.checkString(req.getParameter("svynm"));
String svyid = Util.checkString(req.getParameter("svyid"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String svynm = Util.Uni2Ksc(Util.checkString(req.getParameter("svynm")));
String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSvynm(svynm);
dm.setSvyid(svyid);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 26 13:56:17 KST 2015 */