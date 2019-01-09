/***************************************************************************************************
* 파일명 : SS_MO_L_INFOEXG_SRCHDM.java
* 기능 : CIIS-판매-센터관리-정보공유-공지사항-리스트_모바일용
* 작성일자 : 2017-01-24
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_MO_L_INFOEXG_SRCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpycd;
	public String jobcd;
	public String uid;
	public String deptcd;
	public String areacd;
	public String sb_dealdeptcd;
	public String sb_areacd;
	public String deptplacyn;
	public String search_word;
	public String search_word_kind;
	public String rmsgexttcd;
	public String rmsgdept;
	public String rmsgarea;
	public long pageno;
	public long pagesize;

	public SS_MO_L_INFOEXG_SRCHDM(){}
	public SS_MO_L_INFOEXG_SRCHDM(String clsf, String cmpycd, String jobcd, String uid, String deptcd, String areacd, String sb_dealdeptcd, String sb_areacd, String deptplacyn, String search_word, String search_word_kind, String rmsgexttcd, String rmsgdept, String rmsgarea, long pageno, long pagesize){
		this.clsf = clsf;
		this.cmpycd = cmpycd;
		this.jobcd = jobcd;
		this.uid = uid;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.sb_dealdeptcd = sb_dealdeptcd;
		this.sb_areacd = sb_areacd;
		this.deptplacyn = deptplacyn;
		this.search_word = search_word;
		this.search_word_kind = search_word_kind;
		this.rmsgexttcd = rmsgexttcd;
		this.rmsgdept = rmsgdept;
		this.rmsgarea = rmsgarea;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
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

	public void setSb_dealdeptcd(String sb_dealdeptcd){
		this.sb_dealdeptcd = sb_dealdeptcd;
	}

	public void setSb_areacd(String sb_areacd){
		this.sb_areacd = sb_areacd;
	}

	public void setDeptplacyn(String deptplacyn){
		this.deptplacyn = deptplacyn;
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

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
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

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getJobcd(){
		return this.jobcd;
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

	public String getSb_dealdeptcd(){
		return this.sb_dealdeptcd;
	}

	public String getSb_areacd(){
		return this.sb_areacd;
	}

	public String getDeptplacyn(){
		return this.deptplacyn;
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

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_MO_L_INFOEXG_SRCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_L_INFOEXG_SRCHDM dm = (SS_MO_L_INFOEXG_SRCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.jobcd);
		cstmt.setString(6, dm.uid);
		cstmt.setString(7, dm.deptcd);
		cstmt.setString(8, dm.areacd);
		cstmt.setString(9, dm.sb_dealdeptcd);
		cstmt.setString(10, dm.sb_areacd);
		cstmt.setString(11, dm.deptplacyn);
		cstmt.setString(12, dm.search_word);
		cstmt.setString(13, dm.search_word_kind);
		cstmt.setString(14, dm.rmsgexttcd);
		cstmt.setString(15, dm.rmsgdept);
		cstmt.setString(16, dm.rmsgarea);
		cstmt.setLong(17, dm.pageno);
		cstmt.setLong(18, dm.pagesize);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_MO_L_INFOEXG_SRCHDataSet();
	}



    public void print(){
        System.out.println("clsf = " + getClsf());
        System.out.println("cmpycd = " + getCmpycd());
        System.out.println("jobcd = " + getJobcd());
        System.out.println("uid = " + getUid());
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("areacd = " + getAreacd());
        System.out.println("sb_dealdeptcd = " + getSb_dealdeptcd());
        System.out.println("sb_areacd = " + getSb_areacd());
        System.out.println("deptplacyn = " + getDeptplacyn());
        System.out.println("search_word = " + getSearch_word());
        System.out.println("search_word_kind = " + getSearch_word_kind());
        System.out.println("rmsgexttcd = " + getRmsgexttcd());
        System.out.println("rmsgdept = " + getRmsgdept());
        System.out.println("rmsgarea = " + getRmsgarea());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
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
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
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
String sb_dealdeptcd = req.getParameter("sb_dealdeptcd");
if( sb_dealdeptcd == null){
	System.out.println(this.toString+" : sb_dealdeptcd is null" );
}else{
	System.out.println(this.toString+" : sb_dealdeptcd is "+sb_dealdeptcd );
}
String sb_areacd = req.getParameter("sb_areacd");
if( sb_areacd == null){
	System.out.println(this.toString+" : sb_areacd is null" );
}else{
	System.out.println(this.toString+" : sb_areacd is "+sb_areacd );
}
String deptplacyn = req.getParameter("deptplacyn");
if( deptplacyn == null){
	System.out.println(this.toString+" : deptplacyn is null" );
}else{
	System.out.println(this.toString+" : deptplacyn is "+deptplacyn );
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
String rmsgdept = req.getParameter("rmsgdept");
if( rmsgdept == null){
	System.out.println(this.toString+" : rmsgdept is null" );
}else{
	System.out.println(this.toString+" : rmsgdept is "+rmsgdept );
}
String rmsgarea = req.getParameter("rmsgarea");
if( rmsgarea == null){
	System.out.println(this.toString+" : rmsgarea is null" );
}else{
	System.out.println(this.toString+" : rmsgarea is "+rmsgarea );
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
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String jobcd = Util.checkString(req.getParameter("jobcd"));
String uid = Util.checkString(req.getParameter("uid"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String sb_dealdeptcd = Util.checkString(req.getParameter("sb_dealdeptcd"));
String sb_areacd = Util.checkString(req.getParameter("sb_areacd"));
String deptplacyn = Util.checkString(req.getParameter("deptplacyn"));
String search_word = Util.checkString(req.getParameter("search_word"));
String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));
String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String sb_dealdeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_dealdeptcd")));
String sb_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_areacd")));
String deptplacyn = Util.Uni2Ksc(Util.checkString(req.getParameter("deptplacyn")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String search_word_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_kind")));
String rmsgexttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgexttcd")));
String rmsgdept = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdept")));
String rmsgarea = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgarea")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpycd(cmpycd);
dm.setJobcd(jobcd);
dm.setUid(uid);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setSb_dealdeptcd(sb_dealdeptcd);
dm.setSb_areacd(sb_areacd);
dm.setDeptplacyn(deptplacyn);
dm.setSearch_word(search_word);
dm.setSearch_word_kind(search_word_kind);
dm.setRmsgexttcd(rmsgexttcd);
dm.setRmsgdept(rmsgdept);
dm.setRmsgarea(rmsgarea);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 24 17:40:47 KST 2017 */