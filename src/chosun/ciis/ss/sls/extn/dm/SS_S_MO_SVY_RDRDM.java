/***************************************************************************************************
* 파일명 : SS_S_MO_SVY_RDRDM.java
* 기능 :  문자점검독자관리 설문응답에 해당하는 독자의 상세정보와 응답리스트를 보여준다.
* 작성일자 : 2015.12.04
* 작성자 : 장선희
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


public class SS_S_MO_SVY_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String extndt;
	public String rdr_no;
	public String bocd;
	public String seq;
	public String closmm;
	public String camptype;
	public String svyid;
	public String campid;

	public SS_S_MO_SVY_RDRDM(){}
	public SS_S_MO_SVY_RDRDM(String extndt, String rdr_no, String bocd, String seq, String closmm, String camptype, String svyid, String campid){
		this.extndt = extndt;
		this.rdr_no = rdr_no;
		this.bocd = bocd;
		this.seq = seq;
		this.closmm = closmm;
		this.camptype = camptype;
		this.svyid = svyid;
		this.campid = campid;
	}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_MO_SVY_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_MO_SVY_RDRDM dm = (SS_S_MO_SVY_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.extndt);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.closmm);
		cstmt.setString(8, dm.camptype);
		cstmt.setString(9, dm.svyid);
		cstmt.setString(10, dm.campid);
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
		cstmt.registerOutParameter(37, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_MO_SVY_RDRDataSet();
	}



    public void print(){
        System.out.println("extndt = " + getExtndt());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("bocd = " + getBocd());
        System.out.println("seq = " + getSeq());
        System.out.println("closmm = " + getClosmm());
        System.out.println("camptype = " + getCamptype());
        System.out.println("svyid = " + getSvyid());
        System.out.println("campid = " + getCampid());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String camptype = req.getParameter("camptype");
if( camptype == null){
	System.out.println(this.toString+" : camptype is null" );
}else{
	System.out.println(this.toString+" : camptype is "+camptype );
}
String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String extndt = Util.checkString(req.getParameter("extndt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String bocd = Util.checkString(req.getParameter("bocd"));
String seq = Util.checkString(req.getParameter("seq"));
String closmm = Util.checkString(req.getParameter("closmm"));
String camptype = Util.checkString(req.getParameter("camptype"));
String svyid = Util.checkString(req.getParameter("svyid"));
String campid = Util.checkString(req.getParameter("campid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setExtndt(extndt);
dm.setRdr_no(rdr_no);
dm.setBocd(bocd);
dm.setSeq(seq);
dm.setClosmm(closmm);
dm.setCamptype(camptype);
dm.setSvyid(svyid);
dm.setCampid(campid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 18 17:40:53 KST 2015 */