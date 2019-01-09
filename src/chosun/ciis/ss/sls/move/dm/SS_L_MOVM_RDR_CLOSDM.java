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


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_L_MOVM_RDR_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String yyyymm;
	public String rdrnm;
	public String medicd;
	public String aplcpathcd;
	public String post_dlvyn;
	public String movmrdrtype;
	public String rstsubsmonth;
	public String closgb;
	public String rdr_no;
	public long pageno;
	public long pagesize;

	public SS_L_MOVM_RDR_CLOSDM(){}
	public SS_L_MOVM_RDR_CLOSDM(String deptcd, String partcd, String areacd, String bocd, String yyyymm, String rdrnm, String medicd, String aplcpathcd, String post_dlvyn, String movmrdrtype, String rstsubsmonth, String closgb, String rdr_no, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.yyyymm = yyyymm;
		this.rdrnm = rdrnm;
		this.medicd = medicd;
		this.aplcpathcd = aplcpathcd;
		this.post_dlvyn = post_dlvyn;
		this.movmrdrtype = movmrdrtype;
		this.rstsubsmonth = rstsubsmonth;
		this.closgb = closgb;
		this.rdr_no = rdr_no;
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

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setMovmrdrtype(String movmrdrtype){
		this.movmrdrtype = movmrdrtype;
	}

	public void setRstsubsmonth(String rstsubsmonth){
		this.rstsubsmonth = rstsubsmonth;
	}

	public void setClosgb(String closgb){
		this.closgb = closgb;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
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

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getMovmrdrtype(){
		return this.movmrdrtype;
	}

	public String getRstsubsmonth(){
		return this.rstsubsmonth;
	}

	public String getClosgb(){
		return this.closgb;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_MOVM_RDR_CLOS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MOVM_RDR_CLOSDM dm = (SS_L_MOVM_RDR_CLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.yyyymm);
		cstmt.setString(8, dm.rdrnm);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.aplcpathcd);
		cstmt.setString(11, dm.post_dlvyn);
		cstmt.setString(12, dm.movmrdrtype);
		cstmt.setString(13, dm.rstsubsmonth);
		cstmt.setString(14, dm.closgb);
		cstmt.setString(15, dm.rdr_no);
		cstmt.setLong(16, dm.pageno);
		cstmt.setLong(17, dm.pagesize);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
		cstmt.registerOutParameter(19, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_CLOSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("aplcpathcd = [" + getAplcpathcd() + "]");
		System.out.println("post_dlvyn = [" + getPost_dlvyn() + "]");
		System.out.println("movmrdrtype = [" + getMovmrdrtype() + "]");
		System.out.println("rstsubsmonth = [" + getRstsubsmonth() + "]");
		System.out.println("closgb = [" + getClosgb() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String post_dlvyn = req.getParameter("post_dlvyn");
if( post_dlvyn == null){
	System.out.println(this.toString+" : post_dlvyn is null" );
}else{
	System.out.println(this.toString+" : post_dlvyn is "+post_dlvyn );
}
String movmrdrtype = req.getParameter("movmrdrtype");
if( movmrdrtype == null){
	System.out.println(this.toString+" : movmrdrtype is null" );
}else{
	System.out.println(this.toString+" : movmrdrtype is "+movmrdrtype );
}
String rstsubsmonth = req.getParameter("rstsubsmonth");
if( rstsubsmonth == null){
	System.out.println(this.toString+" : rstsubsmonth is null" );
}else{
	System.out.println(this.toString+" : rstsubsmonth is "+rstsubsmonth );
}
String closgb = req.getParameter("closgb");
if( closgb == null){
	System.out.println(this.toString+" : closgb is null" );
}else{
	System.out.println(this.toString+" : closgb is "+closgb );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String medicd = Util.checkString(req.getParameter("medicd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
String rstsubsmonth = Util.checkString(req.getParameter("rstsubsmonth"));
String closgb = Util.checkString(req.getParameter("closgb"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String post_dlvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvyn")));
String movmrdrtype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmrdrtype")));
String rstsubsmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("rstsubsmonth")));
String closgb = Util.Uni2Ksc(Util.checkString(req.getParameter("closgb")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setYyyymm(yyyymm);
dm.setRdrnm(rdrnm);
dm.setMedicd(medicd);
dm.setAplcpathcd(aplcpathcd);
dm.setPost_dlvyn(post_dlvyn);
dm.setMovmrdrtype(movmrdrtype);
dm.setRstsubsmonth(rstsubsmonth);
dm.setClosgb(closgb);
dm.setRdr_no(rdr_no);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 30 05:05:25 GMT 2014 */