/***************************************************************************************************
 * ���ϸ� : SS_L_RDR_EXTN_STAF_RSLTDM.java
 * ��� : Ȯ��뿪��� ����IS ������ȸ ���(�����)�� ���� DM
 * �ۼ����� : 2003-12-23
 * �ۼ��� : ��뼷
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_STAF_RSLTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String frdt;
	public String todt;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String stafnm;
	public long pageno;
	public long pagesize;

	public SS_L_RDR_EXTN_STAF_RSLTDM(){}
	public SS_L_RDR_EXTN_STAF_RSLTDM(String accflag, String frdt, String todt, String deptcd, String areacd, String bocd, String stafnm, long pageno, long pagesize){
		this.accflag = accflag;
		this.frdt = frdt;
		this.todt = todt;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.stafnm = stafnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_STAF_RSLT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_STAF_RSLTDM dm = (SS_L_RDR_EXTN_STAF_RSLTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.areacd);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.stafnm);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_STAF_RSLTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
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
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
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
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAccflag(accflag);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setStafnm(stafnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 23 18:09:37 KST 2003 */