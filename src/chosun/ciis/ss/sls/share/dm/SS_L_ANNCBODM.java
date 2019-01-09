/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 리스트(조회)
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 리스트(조회)
 */

public class SS_L_ANNCBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String deptcd;
	public String areacd;
	public String makepersnm;
	public String anncbgntm;
	public String anncendtm;
	public String search_word;
	public String search_word_kind;
	public long pageno;
	public long pagesize;

	public SS_L_ANNCBODM(){}
	public SS_L_ANNCBODM(String uid, String deptcd, String areacd, String makepersnm, String anncbgntm, String anncendtm, String search_word, String search_word_kind, long pageno, long pagesize){
		this.uid = uid;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.makepersnm = makepersnm;
		this.anncbgntm = anncbgntm;
		this.anncendtm = anncendtm;
		this.search_word = search_word;
		this.search_word_kind = search_word_kind;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setAnncbgntm(String anncbgntm){
		this.anncbgntm = anncbgntm;
	}

	public void setAnncendtm(String anncendtm){
		this.anncendtm = anncendtm;
	}

	public void setSearch_word(String search_word){
		this.search_word = search_word;
	}

	public void setSearch_word_kind(String search_word_kind){
		this.search_word_kind = search_word_kind;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getUid(){
		return this.uid;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getAnncbgntm(){
		return this.anncbgntm;
	}

	public String getAnncendtm(){
		return this.anncendtm;
	}

	public String getSearch_word(){
		return this.search_word;
	}

	public String getSearch_word_kind(){
		return this.search_word_kind;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_ANNCBO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ANNCBODM dm = (SS_L_ANNCBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.makepersnm);
		cstmt.setString(7, dm.anncbgntm);
		cstmt.setString(8, dm.anncendtm);
		cstmt.setString(9, dm.search_word);
		cstmt.setString(10, dm.search_word_kind);
		cstmt.setLong(11, dm.pageno);
		cstmt.setLong(12, dm.pagesize);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_L_ANNCBODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String makepersnm = req.getParameter("makepersnm");
if( makepersnm == null){
	System.out.println(this.toString+" : makepersnm is null" );
}else{
	System.out.println(this.toString+" : makepersnm is "+makepersnm );
}
String anncbgntm = req.getParameter("anncbgntm");
if( anncbgntm == null){
	System.out.println(this.toString+" : anncbgntm is null" );
}else{
	System.out.println(this.toString+" : anncbgntm is "+anncbgntm );
}
String anncendtm = req.getParameter("anncendtm");
if( anncendtm == null){
	System.out.println(this.toString+" : anncendtm is null" );
}else{
	System.out.println(this.toString+" : anncendtm is "+anncendtm );
}
String search_word = req.getParameter("search_word");
if( search_word == null){
	System.out.println(this.toString+" : search_word is null" );
}else{
	System.out.println(this.toString+" : search_word is "+search_word );
}
String search_word_kind = req.getParameter("search_word_kind");
if( search_word_kind == null){
	System.out.println(this.toString+" : search_word_kind is null" );
}else{
	System.out.println(this.toString+" : search_word_kind is "+search_word_kind );
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

String uid = Util.checkString(req.getParameter("uid"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String anncbgntm = Util.checkString(req.getParameter("anncbgntm"));
String anncendtm = Util.checkString(req.getParameter("anncendtm"));
String search_word = Util.checkString(req.getParameter("search_word"));
String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String anncbgntm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncbgntm")));
String anncendtm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncendtm")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String search_word_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_kind")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setMakepersnm(makepersnm);
dm.setAnncbgntm(anncbgntm);
dm.setAnncendtm(anncendtm);
dm.setSearch_word(search_word);
dm.setSearch_word_kind(search_word_kind);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 19:59:05 KST 2009 */