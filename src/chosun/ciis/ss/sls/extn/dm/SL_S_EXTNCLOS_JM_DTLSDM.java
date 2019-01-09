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


public class SL_S_EXTNCLOS_JM_DTLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String extndt;
	public String rdr_no;
	public String closmm;
	public String searchcd;
	public String seq;

	public SL_S_EXTNCLOS_JM_DTLSDM(){}
	public SL_S_EXTNCLOS_JM_DTLSDM(String bocd, String extndt, String rdr_no, String closmm, String searchcd, String seq){
		this.bocd = bocd;
		this.extndt = extndt;
		this.rdr_no = rdr_no;
		this.closmm = closmm;
		this.searchcd = searchcd;
		this.seq = seq;
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

	public void setSearchcd(String searchcd){
		this.searchcd = searchcd;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getSearchcd(){
		return this.searchcd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_S_EXTNCLOS_JM_DTLS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_EXTNCLOS_JM_DTLSDM dm = (SL_S_EXTNCLOS_JM_DTLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.extndt);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.closmm);
		cstmt.setString(7, dm.searchcd);
		cstmt.setString(8, dm.seq);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_S_EXTNCLOS_JM_DTLSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("extndt = [" + getExtndt() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("searchcd = [" + getSearchcd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String searchcd = req.getParameter("searchcd");
if( searchcd == null){
	System.out.println(this.toString+" : searchcd is null" );
}else{
	System.out.println(this.toString+" : searchcd is "+searchcd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String extndt = Util.checkString(req.getParameter("extndt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String closmm = Util.checkString(req.getParameter("closmm"));
String searchcd = Util.checkString(req.getParameter("searchcd"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String searchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("searchcd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setExtndt(extndt);
dm.setRdr_no(rdr_no);
dm.setClosmm(closmm);
dm.setSearchcd(searchcd);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 01 15:19:53 KST 2015 */