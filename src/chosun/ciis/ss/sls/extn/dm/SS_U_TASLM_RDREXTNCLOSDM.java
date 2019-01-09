/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국확장마감 저장 
* 작성일자 : 2009-07-10
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 지국확장마감 저장 
 */

public class SS_U_TASLM_RDREXTNCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extnexclyn;
	public String cmpycd;
	public String closmm;
	public String bocd;
	public String rdr_no;
	public String cntrno;
	public String medicd;
	public String seq;

	public SS_U_TASLM_RDREXTNCLOSDM(){}
	public SS_U_TASLM_RDREXTNCLOSDM(String rdr_extnexclyn, String cmpycd, String closmm, String bocd, String rdr_no, String cntrno, String medicd, String seq){
		this.rdr_extnexclyn = rdr_extnexclyn;
		this.cmpycd = cmpycd;
		this.closmm = closmm;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.cntrno = cntrno;
		this.medicd = medicd;
		this.seq = seq;
	}

	public void setRdr_extnexclyn(String rdr_extnexclyn){
		this.rdr_extnexclyn = rdr_extnexclyn;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getRdr_extnexclyn(){
		return this.rdr_extnexclyn;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_TASLM_RDREXTNCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_TASLM_RDREXTNCLOSDM dm = (SS_U_TASLM_RDREXTNCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extnexclyn);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.closmm);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.rdr_no);
		cstmt.setString(8, dm.cntrno);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_TASLM_RDREXTNCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extnexclyn = req.getParameter("rdr_extnexclyn");
if( rdr_extnexclyn == null){
	System.out.println(this.toString+" : rdr_extnexclyn is null" );
}else{
	System.out.println(this.toString+" : rdr_extnexclyn is "+rdr_extnexclyn );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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

String rdr_extnexclyn = Util.checkString(req.getParameter("rdr_extnexclyn"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String closmm = Util.checkString(req.getParameter("closmm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String cntrno = Util.checkString(req.getParameter("cntrno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extnexclyn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnexclyn")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extnexclyn(rdr_extnexclyn);
dm.setCmpycd(cmpycd);
dm.setClosmm(closmm);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setCntrno(cntrno);
dm.setMedicd(medicd);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 05 13:28:55 KST 2009 */