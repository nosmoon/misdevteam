/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_SRCHDM.java
* 기능 : 정보공유 게시판 -
* 작성일자 : 2004-03-29
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판지사- 정보공유 게시판 -
 *
 */


public class PS_L_INFOEXG_SRCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String search_word;
	public String search_word_kind;
	public String rmsgexttcd;
	public String cmpycd;
	public String pub_branch;
	public long pageno;
	public long pagesize;

	public PS_L_INFOEXG_SRCHDM(){}
	public PS_L_INFOEXG_SRCHDM(String clsf, String search_word, String search_word_kind, String rmsgexttcd, String cmpycd, String pub_branch, long pageno, long pagesize){
		this.clsf = clsf;
		this.search_word = search_word;
		this.search_word_kind = search_word_kind;
		this.rmsgexttcd = rmsgexttcd;
		this.cmpycd = cmpycd;
		this.pub_branch = pub_branch;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSearch_word(String search_word){
		this.search_word = search_word;
	}

	public void setSearch_word_kind(String search_word_kind){
		this.search_word_kind = search_word_kind;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPub_branch(String pub_branch){
		this.pub_branch = pub_branch;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSearch_word(){
		return this.search_word;
	}

	public String getSearch_word_kind(){
		return this.search_word_kind;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getPub_branch(){
		return this.pub_branch;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_INFOEXG_SRCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_INFOEXG_SRCHDM dm = (PS_L_INFOEXG_SRCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.search_word);
		cstmt.setString(5, dm.search_word_kind);
		cstmt.setString(6, dm.rmsgexttcd);
		cstmt.setString(7, dm.cmpycd);
		cstmt.setString(8, dm.pub_branch);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_L_INFOEXG_SRCHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
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
String rmsgexttcd = req.getParameter("rmsgexttcd");
if( rmsgexttcd == null){
	System.out.println(this.toString+" : rmsgexttcd is null" );
}else{
	System.out.println(this.toString+" : rmsgexttcd is "+rmsgexttcd );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String pub_branch = req.getParameter("pub_branch");
if( pub_branch == null){
	System.out.println(this.toString+" : pub_branch is null" );
}else{
	System.out.println(this.toString+" : pub_branch is "+pub_branch );
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

String clsf = Util.checkString(req.getParameter("clsf"));
String search_word = Util.checkString(req.getParameter("search_word"));
String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String pub_branch = Util.checkString(req.getParameter("pub_branch"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String search_word_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_kind")));
String rmsgexttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgexttcd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String pub_branch = Util.Uni2Ksc(Util.checkString(req.getParameter("pub_branch")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setSearch_word(search_word);
dm.setSearch_word_kind(search_word_kind);
dm.setRmsgexttcd(rmsgexttcd);
dm.setCmpycd(cmpycd);
dm.setPub_branch(pub_branch);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 18:39:32 KST 2004 */