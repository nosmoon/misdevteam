/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장점검-담당확인/지국소견 저장
* 작성일자 : 2011-12-16
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class SL_A_EXTNCLOS_DTLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String extndt;
	public String rdr_no;
	public String closmm;
	public String workflag;
	public String bocont;
	public String ddcont;
	public String seq;
	public String chgid;

	public SL_A_EXTNCLOS_DTLSDM(){}
	public SL_A_EXTNCLOS_DTLSDM(String bocd, String extndt, String rdr_no, String closmm, String workflag, String bocont, String ddcont, String seq, String chgid){
		this.bocd = bocd;
		this.extndt = extndt;
		this.rdr_no = rdr_no;
		this.closmm = closmm;
		this.workflag = workflag;
		this.bocont = bocont;
		this.ddcont = ddcont;
		this.seq = seq;
		this.chgid = chgid;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setWorkflag(String workflag){
		this.workflag = workflag;
	}

	public void setBocont(String bocont){
		this.bocont = bocont;
	}

	public void setDdcont(String ddcont){
		this.ddcont = ddcont;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChgid(String chgid){
		this.chgid = chgid;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getWorkflag(){
		return this.workflag;
	}

	public String getBocont(){
		return this.bocont;
	}

	public String getDdcont(){
		return this.ddcont;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChgid(){
		return this.chgid;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_A_EXTNCLOS_DTLS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_EXTNCLOS_DTLSDM dm = (SL_A_EXTNCLOS_DTLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.extndt);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.closmm);
		cstmt.setString(7, dm.workflag);
		cstmt.setString(8, dm.bocont);
		cstmt.setString(9, dm.ddcont);
		cstmt.setString(10, dm.seq);
		cstmt.setString(11, dm.chgid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_A_EXTNCLOS_DTLSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("extndt = [" + getExtndt() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("workflag = [" + getWorkflag() + "]");
		System.out.println("bocont = [" + getBocont() + "]");
		System.out.println("ddcont = [" + getDdcont() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("chgid = [" + getChgid() + "]");
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
String extndt = req.getParameter("extndt");
if( extndt == null){
	System.out.println(this.toString+" : extndt is null" );
}else{
	System.out.println(this.toString+" : extndt is "+extndt );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String workflag = req.getParameter("workflag");
if( workflag == null){
	System.out.println(this.toString+" : workflag is null" );
}else{
	System.out.println(this.toString+" : workflag is "+workflag );
}
String bocont = req.getParameter("bocont");
if( bocont == null){
	System.out.println(this.toString+" : bocont is null" );
}else{
	System.out.println(this.toString+" : bocont is "+bocont );
}
String ddcont = req.getParameter("ddcont");
if( ddcont == null){
	System.out.println(this.toString+" : ddcont is null" );
}else{
	System.out.println(this.toString+" : ddcont is "+ddcont );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String chgid = req.getParameter("chgid");
if( chgid == null){
	System.out.println(this.toString+" : chgid is null" );
}else{
	System.out.println(this.toString+" : chgid is "+chgid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String extndt = Util.checkString(req.getParameter("extndt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String closmm = Util.checkString(req.getParameter("closmm"));
String workflag = Util.checkString(req.getParameter("workflag"));
String bocont = Util.checkString(req.getParameter("bocont"));
String ddcont = Util.checkString(req.getParameter("ddcont"));
String seq = Util.checkString(req.getParameter("seq"));
String chgid = Util.checkString(req.getParameter("chgid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String workflag = Util.Uni2Ksc(Util.checkString(req.getParameter("workflag")));
String bocont = Util.Uni2Ksc(Util.checkString(req.getParameter("bocont")));
String ddcont = Util.Uni2Ksc(Util.checkString(req.getParameter("ddcont")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String chgid = Util.Uni2Ksc(Util.checkString(req.getParameter("chgid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setExtndt(extndt);
dm.setRdr_no(rdr_no);
dm.setClosmm(closmm);
dm.setWorkflag(workflag);
dm.setBocont(bocont);
dm.setDdcont(ddcont);
dm.setSeq(seq);
dm.setChgid(chgid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 16 16:22:20 KST 2011 */