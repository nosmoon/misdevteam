/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
* 작성일자 :2009/05/20 
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
 */

public class SS_L_SHFTAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String aplcclsf;
	public String search_word_kind;
	public String fromdata;
	public String todata;

	public SS_L_SHFTAPLCDM(){}
	public SS_L_SHFTAPLCDM(String aplcclsf, String search_word_kind, String fromdata, String todata){
		this.aplcclsf = aplcclsf;
		this.search_word_kind = search_word_kind;
		this.fromdata = fromdata;
		this.todata = todata;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setSearch_word_kind(String search_word_kind){
		this.search_word_kind = search_word_kind;
	}

	public void setFromdata(String fromdata){
		this.fromdata = fromdata;
	}

	public void setTodata(String todata){
		this.todata = todata;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getSearch_word_kind(){
		return this.search_word_kind;
	}

	public String getFromdata(){
		return this.fromdata;
	}

	public String getTodata(){
		return this.todata;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTAPLC( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTAPLCDM dm = (SS_L_SHFTAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.aplcclsf);
		cstmt.setString(4, dm.search_word_kind);
		cstmt.setString(5, dm.fromdata);
		cstmt.setString(6, dm.todata);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFTAPLCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String aplcclsf = req.getParameter("aplcclsf");
if( aplcclsf == null){
	System.out.println(this.toString+" : aplcclsf is null" );
}else{
	System.out.println(this.toString+" : aplcclsf is "+aplcclsf );
}
String search_word_kind = req.getParameter("search_word_kind");
if( search_word_kind == null){
	System.out.println(this.toString+" : search_word_kind is null" );
}else{
	System.out.println(this.toString+" : search_word_kind is "+search_word_kind );
}
String fromdata = req.getParameter("fromdata");
if( fromdata == null){
	System.out.println(this.toString+" : fromdata is null" );
}else{
	System.out.println(this.toString+" : fromdata is "+fromdata );
}
String todata = req.getParameter("todata");
if( todata == null){
	System.out.println(this.toString+" : todata is null" );
}else{
	System.out.println(this.toString+" : todata is "+todata );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
String fromdata = Util.checkString(req.getParameter("fromdata"));
String todata = Util.checkString(req.getParameter("todata"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
String search_word_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_kind")));
String fromdata = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdata")));
String todata = Util.Uni2Ksc(Util.checkString(req.getParameter("todata")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAplcclsf(aplcclsf);
dm.setSearch_word_kind(search_word_kind);
dm.setFromdata(fromdata);
dm.setTodata(todata);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 10:43:55 PDT 2009 */