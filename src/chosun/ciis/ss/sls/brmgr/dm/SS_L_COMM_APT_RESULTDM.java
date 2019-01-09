/***************************************************************************************************
* 파일명 : .java
* 기능 : *아파트투입현황(결과보기)
* 작성일자 : 2009-05-29
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 아파트투입현황(결과보기)
 */

public class SS_L_COMM_APT_RESULTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String invsgdt1;
	public String invsgdt2;
	public String deptlist;
	public String partlist;
	public String arealist;
	public String fullclsf;
	public String orderclsf;
	public String addrcd;
	public String dongno;
	public long pageno;
	public long pagesize;
	public String regtype1;
	public String regtype2;
	public String invsgpers;
	public String jobcdset;

	public SS_L_COMM_APT_RESULTDM(){}
	public SS_L_COMM_APT_RESULTDM(String bocd, String invsgdt1, String invsgdt2, String deptlist, String partlist, String arealist, String fullclsf, String orderclsf, String addrcd, String dongno, long pageno, long pagesize, String regtype1, String regtype2, String invsgpers, String jobcdset){
		this.bocd = bocd;
		this.invsgdt1 = invsgdt1;
		this.invsgdt2 = invsgdt2;
		this.deptlist = deptlist;
		this.partlist = partlist;
		this.arealist = arealist;
		this.fullclsf = fullclsf;
		this.orderclsf = orderclsf;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.regtype1 = regtype1;
		this.regtype2 = regtype2;
		this.invsgpers = invsgpers;
		this.jobcdset = jobcdset;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt1(String invsgdt1){
		this.invsgdt1 = invsgdt1;
	}

	public void setInvsgdt2(String invsgdt2){
		this.invsgdt2 = invsgdt2;
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

	public void setFullclsf(String fullclsf){
		this.fullclsf = fullclsf;
	}

	public void setOrderclsf(String orderclsf){
		this.orderclsf = orderclsf;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setRegtype1(String regtype1){
		this.regtype1 = regtype1;
	}

	public void setRegtype2(String regtype2){
		this.regtype2 = regtype2;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setJobcdset(String jobcdset){
		this.jobcdset = jobcdset;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt1(){
		return this.invsgdt1;
	}

	public String getInvsgdt2(){
		return this.invsgdt2;
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

	public String getFullclsf(){
		return this.fullclsf;
	}

	public String getOrderclsf(){
		return this.orderclsf;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getRegtype1(){
		return this.regtype1;
	}

	public String getRegtype2(){
		return this.regtype2;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getJobcdset(){
		return this.jobcdset;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_COMM_APT_RESULT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_COMM_APT_RESULTDM dm = (SS_L_COMM_APT_RESULTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.invsgdt1);
		cstmt.setString(5, dm.invsgdt2);
		cstmt.setString(6, dm.deptlist);
		cstmt.setString(7, dm.partlist);
		cstmt.setString(8, dm.arealist);
		cstmt.setString(9, dm.fullclsf);
		cstmt.setString(10, dm.orderclsf);
		cstmt.setString(11, dm.addrcd);
		cstmt.setString(12, dm.dongno);
		cstmt.setLong(13, dm.pageno);
		cstmt.setLong(14, dm.pagesize);
		cstmt.setString(15, dm.regtype1);
		cstmt.setString(16, dm.regtype2);
		cstmt.setString(17, dm.invsgpers);
		cstmt.setString(18, dm.jobcdset);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_COMM_APT_RESULTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String invsgdt1 = req.getParameter("invsgdt1");
if( invsgdt1 == null){
	System.out.println(this.toString+" : invsgdt1 is null" );
}else{
	System.out.println(this.toString+" : invsgdt1 is "+invsgdt1 );
}
String invsgdt2 = req.getParameter("invsgdt2");
if( invsgdt2 == null){
	System.out.println(this.toString+" : invsgdt2 is null" );
}else{
	System.out.println(this.toString+" : invsgdt2 is "+invsgdt2 );
}
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
String fullclsf = req.getParameter("fullclsf");
if( fullclsf == null){
	System.out.println(this.toString+" : fullclsf is null" );
}else{
	System.out.println(this.toString+" : fullclsf is "+fullclsf );
}
String orderclsf = req.getParameter("orderclsf");
if( orderclsf == null){
	System.out.println(this.toString+" : orderclsf is null" );
}else{
	System.out.println(this.toString+" : orderclsf is "+orderclsf );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
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
String regtype1 = req.getParameter("regtype1");
if( regtype1 == null){
	System.out.println(this.toString+" : regtype1 is null" );
}else{
	System.out.println(this.toString+" : regtype1 is "+regtype1 );
}
String regtype2 = req.getParameter("regtype2");
if( regtype2 == null){
	System.out.println(this.toString+" : regtype2 is null" );
}else{
	System.out.println(this.toString+" : regtype2 is "+regtype2 );
}
String invsgpers = req.getParameter("invsgpers");
if( invsgpers == null){
	System.out.println(this.toString+" : invsgpers is null" );
}else{
	System.out.println(this.toString+" : invsgpers is "+invsgpers );
}
String jobcdset = req.getParameter("jobcdset");
if( jobcdset == null){
	System.out.println(this.toString+" : jobcdset is null" );
}else{
	System.out.println(this.toString+" : jobcdset is "+jobcdset );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
String deptlist = Util.checkString(req.getParameter("deptlist"));
String partlist = Util.checkString(req.getParameter("partlist"));
String arealist = Util.checkString(req.getParameter("arealist"));
String fullclsf = Util.checkString(req.getParameter("fullclsf"));
String orderclsf = Util.checkString(req.getParameter("orderclsf"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String regtype1 = Util.checkString(req.getParameter("regtype1"));
String regtype2 = Util.checkString(req.getParameter("regtype2"));
String invsgpers = Util.checkString(req.getParameter("invsgpers"));
String jobcdset = Util.checkString(req.getParameter("jobcdset"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String invsgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt1")));
String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
String deptlist = Util.Uni2Ksc(Util.checkString(req.getParameter("deptlist")));
String partlist = Util.Uni2Ksc(Util.checkString(req.getParameter("partlist")));
String arealist = Util.Uni2Ksc(Util.checkString(req.getParameter("arealist")));
String fullclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fullclsf")));
String orderclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("orderclsf")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String regtype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("regtype1")));
String regtype2 = Util.Uni2Ksc(Util.checkString(req.getParameter("regtype2")));
String invsgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgpers")));
String jobcdset = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcdset")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setInvsgdt1(invsgdt1);
dm.setInvsgdt2(invsgdt2);
dm.setDeptlist(deptlist);
dm.setPartlist(partlist);
dm.setArealist(arealist);
dm.setFullclsf(fullclsf);
dm.setOrderclsf(orderclsf);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setRegtype1(regtype1);
dm.setRegtype2(regtype2);
dm.setInvsgpers(invsgpers);
dm.setJobcdset(jobcdset);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:08:00 KST 2009 */