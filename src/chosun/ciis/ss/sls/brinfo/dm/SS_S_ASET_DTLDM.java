/***************************************************************************************************
* 파일명 : SS_S_ASET_DTLDM.java
* 기능 : 지국Info-지국비품현황-상세 상세
* 작성일자 : 2004-02-01
* 작성자 : 고윤홍
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
 * 지국Info-지국비품현황-상세 상세
 *
 */


public class SS_S_ASET_DTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String asetseq;

	public SS_S_ASET_DTLDM(){}
	public SS_S_ASET_DTLDM(String bocd, String asetseq){
		this.bocd = bocd;
		this.asetseq = asetseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAsetseq(String asetseq){
		this.asetseq = asetseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAsetseq(){
		return this.asetseq;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_ASET_DTL( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_ASET_DTLDM dm = (SS_S_ASET_DTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.asetseq);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_S_ASET_DTLDataSet();
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
String asetseq = req.getParameter("asetseq");
if( asetseq == null){
	System.out.println(this.toString+" : asetseq is null" );
}else{
	System.out.println(this.toString+" : asetseq is "+asetseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String asetseq = Util.checkString(req.getParameter("asetseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String asetseq = Util.Uni2Ksc(Util.checkString(req.getParameter("asetseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAsetseq(asetseq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 01 21:21:34 KST 2004 */