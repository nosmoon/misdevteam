/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 
 */


public class SS_L_CA_HEADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String stafclsfcd;
	public String cntrstatcd;
	public String stafno;
	public String stafnm;
	public String prn;
	public String ernno;
	public String empseq;
	public String empclsf;
	public long pageno;
	public long pagesize;

	public SS_L_CA_HEADDM(){}
	public SS_L_CA_HEADDM(String stafclsfcd, String cntrstatcd, String stafno, String stafnm, String prn, String ernno, String empseq, String empclsf, long pageno, long pagesize){
		this.stafclsfcd = stafclsfcd;
		this.cntrstatcd = cntrstatcd;
		this.stafno = stafno;
		this.stafnm = stafnm;
		this.prn = prn;
		this.ernno = ernno;
		this.empseq = empseq;
		this.empclsf = empclsf;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}
	
	public void setEmpclsf(String empclsf){
		this.empclsf = empclsf;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getEmpseq(){
		return this.empseq;
	}
	
	public String getEmpclsf(){
		return this.empclsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_CA_HEAD(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CA_HEADDM dm = (SS_L_CA_HEADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.stafclsfcd);
		cstmt.setString(4, dm.cntrstatcd);
		cstmt.setString(5, dm.stafno);
		cstmt.setString(6, dm.stafnm);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ernno);
		cstmt.setString(9, dm.empseq);		
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_L_CA_HEADDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("stafclsfcd = [" + getStafclsfcd() + "]");
		System.out.println("cntrstatcd = [" + getCntrstatcd() + "]");
		System.out.println("stafno = [" + getStafno() + "]");
		System.out.println("stafnm = [" + getStafnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("ernno = [" + getErnno() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
		System.out.println("empclsf = [" + getEmpclsf() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String cntrstatcd = req.getParameter("cntrstatcd");
if( cntrstatcd == null){
	System.out.println(this.toString+" : cntrstatcd is null" );
}else{
	System.out.println(this.toString+" : cntrstatcd is "+cntrstatcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ernno = req.getParameter("ernno");
if( ernno == null){
	System.out.println(this.toString+" : ernno is null" );
}else{
	System.out.println(this.toString+" : ernno is "+ernno );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
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

String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String empseq = Util.checkString(req.getParameter("empseq"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String cntrstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrstatcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setStafclsfcd(stafclsfcd);
dm.setCntrstatcd(cntrstatcd);
dm.setStafno(stafno);
dm.setStafnm(stafnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setEmpseq(empseq);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 03 14:20:16 KST 2015 */