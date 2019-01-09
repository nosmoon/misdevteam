/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링-파일업로드-EDI
* 작성일자 : 2008-05-26
* 작성자 : 노상현
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *지국지원-빌링-파일업로드 */

public class CO_A_WRKDTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String id;
	public String execno;
	public String execdtlsno;
	public String workdescri;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String srctbl;
	public String targtbl;
	public String noit1;
	public String noit2;
	public String errcd;
	public String errmsg;

	public CO_A_WRKDTLDM(){}
	public CO_A_WRKDTLDM(String accflag, String id, String execno, String execdtlsno, String workdescri, Timestamp workfrdt, Timestamp worktodt, String srctbl, String targtbl, String noit1, String noit2, String errcd, String errmsg){
		this.accflag = accflag;
		this.id = id;
		this.execno = execno;
		this.execdtlsno = execdtlsno;
		this.workdescri = workdescri;
		this.workfrdt = workfrdt;
		this.worktodt = worktodt;
		this.srctbl = srctbl;
		this.targtbl = targtbl;
		this.noit1 = noit1;
		this.noit2 = noit2;
		this.errcd = errcd;
		this.errmsg = errmsg;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setExecno(String execno){
		this.execno = execno;
	}

	public void setExecdtlsno(String execdtlsno){
		this.execdtlsno = execdtlsno;
	}

	public void setWorkdescri(String workdescri){
		this.workdescri = workdescri;
	}

	public void setWorkfrdt(Timestamp workfrdt){
		this.workfrdt = workfrdt;
	}

	public void setWorktodt(Timestamp worktodt){
		this.worktodt = worktodt;
	}

	public void setSrctbl(String srctbl){
		this.srctbl = srctbl;
	}

	public void setTargtbl(String targtbl){
		this.targtbl = targtbl;
	}

	public void setNoit1(String noit1){
		this.noit1 = noit1;
	}

	public void setNoit2(String noit2){
		this.noit2 = noit2;
	}

	public void setErrcd(String errcd){
		this.errcd = errcd;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getId(){
		return this.id;
	}

	public String getExecno(){
		return this.execno;
	}

	public String getExecdtlsno(){
		return this.execdtlsno;
	}

	public String getWorkdescri(){
		return this.workdescri;
	}

	public Timestamp getWorkfrdt(){
		return this.workfrdt;
	}

	public Timestamp getWorktodt(){
		return this.worktodt;
	}

	public String getSrctbl(){
		return this.srctbl;
	}

	public String getTargtbl(){
		return this.targtbl;
	}

	public String getNoit1(){
		return this.noit1;
	}

	public String getNoit2(){
		return this.noit2;
	}

	public String getErrcd(){
		return this.errcd;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_WRKDTL( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_WRKDTLDM dm = (CO_A_WRKDTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.id);
		cstmt.setString(5, dm.execno);
		cstmt.setString(6, dm.execdtlsno);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.workdescri);
		cstmt.setTimestamp(8, dm.workfrdt);
		cstmt.setTimestamp(9, dm.worktodt);
		cstmt.setString(10, dm.srctbl);
		cstmt.setString(11, dm.targtbl);
		cstmt.setString(12, dm.noit1);
		cstmt.setString(13, dm.noit2);
		cstmt.setString(14, dm.errcd);
		cstmt.setString(15, dm.errmsg);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.CO_A_WRKDTLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
}
String execno = req.getParameter("execno");
if( execno == null){
	System.out.println(this.toString+" : execno is null" );
}else{
	System.out.println(this.toString+" : execno is "+execno );
}
String execdtlsno = req.getParameter("execdtlsno");
if( execdtlsno == null){
	System.out.println(this.toString+" : execdtlsno is null" );
}else{
	System.out.println(this.toString+" : execdtlsno is "+execdtlsno );
}
String workdescri = req.getParameter("workdescri");
if( workdescri == null){
	System.out.println(this.toString+" : workdescri is null" );
}else{
	System.out.println(this.toString+" : workdescri is "+workdescri );
}
String workfrdt = req.getParameter("workfrdt");
if( workfrdt == null){
	System.out.println(this.toString+" : workfrdt is null" );
}else{
	System.out.println(this.toString+" : workfrdt is "+workfrdt );
}
String worktodt = req.getParameter("worktodt");
if( worktodt == null){
	System.out.println(this.toString+" : worktodt is null" );
}else{
	System.out.println(this.toString+" : worktodt is "+worktodt );
}
String srctbl = req.getParameter("srctbl");
if( srctbl == null){
	System.out.println(this.toString+" : srctbl is null" );
}else{
	System.out.println(this.toString+" : srctbl is "+srctbl );
}
String targtbl = req.getParameter("targtbl");
if( targtbl == null){
	System.out.println(this.toString+" : targtbl is null" );
}else{
	System.out.println(this.toString+" : targtbl is "+targtbl );
}
String noit1 = req.getParameter("noit1");
if( noit1 == null){
	System.out.println(this.toString+" : noit1 is null" );
}else{
	System.out.println(this.toString+" : noit1 is "+noit1 );
}
String noit2 = req.getParameter("noit2");
if( noit2 == null){
	System.out.println(this.toString+" : noit2 is null" );
}else{
	System.out.println(this.toString+" : noit2 is "+noit2 );
}
String errcd = req.getParameter("errcd");
if( errcd == null){
	System.out.println(this.toString+" : errcd is null" );
}else{
	System.out.println(this.toString+" : errcd is "+errcd );
}
String errmsg = req.getParameter("errmsg");
if( errmsg == null){
	System.out.println(this.toString+" : errmsg is null" );
}else{
	System.out.println(this.toString+" : errmsg is "+errmsg );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String id = Util.checkString(req.getParameter("id"));
String execno = Util.checkString(req.getParameter("execno"));
String execdtlsno = Util.checkString(req.getParameter("execdtlsno"));
String workdescri = Util.checkString(req.getParameter("workdescri"));
String workfrdt = Util.checkString(req.getParameter("workfrdt"));
String worktodt = Util.checkString(req.getParameter("worktodt"));
String srctbl = Util.checkString(req.getParameter("srctbl"));
String targtbl = Util.checkString(req.getParameter("targtbl"));
String noit1 = Util.checkString(req.getParameter("noit1"));
String noit2 = Util.checkString(req.getParameter("noit2"));
String errcd = Util.checkString(req.getParameter("errcd"));
String errmsg = Util.checkString(req.getParameter("errmsg"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String execno = Util.Uni2Ksc(Util.checkString(req.getParameter("execno")));
String execdtlsno = Util.Uni2Ksc(Util.checkString(req.getParameter("execdtlsno")));
String workdescri = Util.Uni2Ksc(Util.checkString(req.getParameter("workdescri")));
String workfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("workfrdt")));
String worktodt = Util.Uni2Ksc(Util.checkString(req.getParameter("worktodt")));
String srctbl = Util.Uni2Ksc(Util.checkString(req.getParameter("srctbl")));
String targtbl = Util.Uni2Ksc(Util.checkString(req.getParameter("targtbl")));
String noit1 = Util.Uni2Ksc(Util.checkString(req.getParameter("noit1")));
String noit2 = Util.Uni2Ksc(Util.checkString(req.getParameter("noit2")));
String errcd = Util.Uni2Ksc(Util.checkString(req.getParameter("errcd")));
String errmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("errmsg")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setId(id);
dm.setExecno(execno);
dm.setExecdtlsno(execdtlsno);
dm.setWorkdescri(workdescri);
dm.setWorkfrdt(workfrdt);
dm.setWorktodt(worktodt);
dm.setSrctbl(srctbl);
dm.setTargtbl(targtbl);
dm.setNoit1(noit1);
dm.setNoit2(noit2);
dm.setErrcd(errcd);
dm.setErrmsg(errmsg);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 26 17:02:59 KST 2008 */