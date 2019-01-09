/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국중지마감 저장
* 작성일자 :2009/07/10
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
 * 확장현황 - 지국중지마감 저장
 */

public class SS_U_TASLM_BOSUSPCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String suspexclyn;
	public String cmpycd;
	public String closmm;
	public String bocd;
	public String rdr_no;
	public String seq;

	public SS_U_TASLM_BOSUSPCLOSDM(){}
	public SS_U_TASLM_BOSUSPCLOSDM(String suspexclyn, String cmpycd, String closmm, String bocd, String rdr_no, String seq){
		this.suspexclyn = suspexclyn;
		this.cmpycd = cmpycd;
		this.closmm = closmm;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.seq = seq;
	}

	public void setSuspexclyn(String suspexclyn){
		this.suspexclyn = suspexclyn;
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

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSuspexclyn(){
		return this.suspexclyn;
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

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_TASLM_BOSUSPCLOS( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_TASLM_BOSUSPCLOSDM dm = (SS_U_TASLM_BOSUSPCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.suspexclyn);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.closmm);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.rdr_no);
		cstmt.setString(8, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_TASLM_BOSUSPCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String suspexclyn = req.getParameter("suspexclyn");
if( suspexclyn == null){
	System.out.println(this.toString+" : suspexclyn is null" );
}else{
	System.out.println(this.toString+" : suspexclyn is "+suspexclyn );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String suspexclyn = Util.checkString(req.getParameter("suspexclyn"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String closmm = Util.checkString(req.getParameter("closmm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String suspexclyn = Util.Uni2Ksc(Util.checkString(req.getParameter("suspexclyn")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSuspexclyn(suspexclyn);
dm.setCmpycd(cmpycd);
dm.setClosmm(closmm);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 17:42:39 PDT 2009 */