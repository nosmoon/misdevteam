/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_L_BOACCT_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptlist;
	public String partlist;
	public String arealist;
	public String bocd;
	public String acctitem;
	public String shacctno;
	public String shacctnm;
	public String cntr_fr_dt;
	public String cntr_to_dt;
	public long pageno;
	public long pagesize;

	public SS_L_BOACCT_LISTDM(){}
	public SS_L_BOACCT_LISTDM(String deptlist, String partlist, String arealist, String bocd, String acctitem, String shacctno, String shacctnm, String cntr_fr_dt, String cntr_to_dt, long pageno, long pagesize){
		this.deptlist = deptlist;
		this.partlist = partlist;
		this.arealist = arealist;
		this.bocd = bocd;
		this.acctitem = acctitem;
		this.shacctno = shacctno;
		this.shacctnm = shacctnm;
		this.cntr_fr_dt = cntr_fr_dt;
		this.cntr_to_dt = cntr_to_dt;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setDeptlist(String deptlist){
		this.deptlist = deptlist;
	}

	public void setPartlist(String partlist){
		this.partlist = partlist;
	}

	public void setArealist(String arealist){
		this.arealist = arealist;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setShacctno(String shacctno){
		this.shacctno = shacctno;
	}

	public void setShacctnm(String shacctnm){
		this.shacctnm = shacctnm;
	}

	public void setCntr_fr_dt(String cntr_fr_dt){
		this.cntr_fr_dt = cntr_fr_dt;
	}

	public void setCntr_to_dt(String cntr_to_dt){
		this.cntr_to_dt = cntr_to_dt;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getDeptlist(){
		return this.deptlist;
	}

	public String getPartlist(){
		return this.partlist;
	}

	public String getArealist(){
		return this.arealist;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getShacctno(){
		return this.shacctno;
	}

	public String getShacctnm(){
		return this.shacctnm;
	}

	public String getCntr_fr_dt(){
		return this.cntr_fr_dt;
	}

	public String getCntr_to_dt(){
		return this.cntr_to_dt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_BOACCT_LIST(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BOACCT_LISTDM dm = (SS_L_BOACCT_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptlist);
		cstmt.setString(4, dm.partlist);
		cstmt.setString(5, dm.arealist);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.acctitem);
		cstmt.setString(8, dm.shacctno);
		cstmt.setString(9, dm.shacctnm);
		cstmt.setString(10, dm.cntr_fr_dt);
		cstmt.setString(11, dm.cntr_to_dt);
		cstmt.setLong(12, dm.pageno);
		cstmt.setLong(13, dm.pagesize);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_L_BOACCT_LISTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptlist = [" + getDeptlist() + "]");
		System.out.println("partlist = [" + getPartlist() + "]");
		System.out.println("arealist = [" + getArealist() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("acctitem = [" + getAcctitem() + "]");
		System.out.println("shacctno = [" + getShacctno() + "]");
		System.out.println("shacctnm = [" + getShacctnm() + "]");
		System.out.println("cntr_fr_dt = [" + getCntr_fr_dt() + "]");
		System.out.println("cntr_to_dt = [" + getCntr_to_dt() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptlist = req.getParameter("deptlist");
if( deptlist == null){
	System.out.println(this.toString+" : deptlist is null" );
}else{
	System.out.println(this.toString+" : deptlist is "+deptlist );
}
String partlist = req.getParameter("partlist");
if( partlist == null){
	System.out.println(this.toString+" : partlist is null" );
}else{
	System.out.println(this.toString+" : partlist is "+partlist );
}
String arealist = req.getParameter("arealist");
if( arealist == null){
	System.out.println(this.toString+" : arealist is null" );
}else{
	System.out.println(this.toString+" : arealist is "+arealist );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String acctitem = req.getParameter("acctitem");
if( acctitem == null){
	System.out.println(this.toString+" : acctitem is null" );
}else{
	System.out.println(this.toString+" : acctitem is "+acctitem );
}
String shacctno = req.getParameter("shacctno");
if( shacctno == null){
	System.out.println(this.toString+" : shacctno is null" );
}else{
	System.out.println(this.toString+" : shacctno is "+shacctno );
}
String shacctnm = req.getParameter("shacctnm");
if( shacctnm == null){
	System.out.println(this.toString+" : shacctnm is null" );
}else{
	System.out.println(this.toString+" : shacctnm is "+shacctnm );
}
String cntr_fr_dt = req.getParameter("cntr_fr_dt");
if( cntr_fr_dt == null){
	System.out.println(this.toString+" : cntr_fr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_fr_dt is "+cntr_fr_dt );
}
String cntr_to_dt = req.getParameter("cntr_to_dt");
if( cntr_to_dt == null){
	System.out.println(this.toString+" : cntr_to_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_to_dt is "+cntr_to_dt );
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptlist = Util.checkString(req.getParameter("deptlist"));
String partlist = Util.checkString(req.getParameter("partlist"));
String arealist = Util.checkString(req.getParameter("arealist"));
String bocd = Util.checkString(req.getParameter("bocd"));
String acctitem = Util.checkString(req.getParameter("acctitem"));
String shacctno = Util.checkString(req.getParameter("shacctno"));
String shacctnm = Util.checkString(req.getParameter("shacctnm"));
String cntr_fr_dt = Util.checkString(req.getParameter("cntr_fr_dt"));
String cntr_to_dt = Util.checkString(req.getParameter("cntr_to_dt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptlist = Util.Uni2Ksc(Util.checkString(req.getParameter("deptlist")));
String partlist = Util.Uni2Ksc(Util.checkString(req.getParameter("partlist")));
String arealist = Util.Uni2Ksc(Util.checkString(req.getParameter("arealist")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String acctitem = Util.Uni2Ksc(Util.checkString(req.getParameter("acctitem")));
String shacctno = Util.Uni2Ksc(Util.checkString(req.getParameter("shacctno")));
String shacctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("shacctnm")));
String cntr_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_fr_dt")));
String cntr_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_to_dt")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptlist(deptlist);
dm.setPartlist(partlist);
dm.setArealist(arealist);
dm.setBocd(bocd);
dm.setAcctitem(acctitem);
dm.setShacctno(shacctno);
dm.setShacctnm(shacctnm);
dm.setCntr_fr_dt(cntr_fr_dt);
dm.setCntr_to_dt(cntr_to_dt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 19 14:54:23 KST 2017 */