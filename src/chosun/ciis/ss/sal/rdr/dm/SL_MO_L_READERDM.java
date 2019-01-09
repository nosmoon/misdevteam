/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 *
 */


public class SL_MO_L_READERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String search_order;
	public String search_ad;
	public String search_cond;
	public String search_pttn;
	public String search_word;
	public String search_stop;
	public long pageno;
	public long pagesize;

	public SL_MO_L_READERDM(){}
	public SL_MO_L_READERDM(String bocd, String search_order, String search_ad, String search_cond, String search_pttn, String search_word, String search_stop, long pageno, long pagesize){
		this.bocd = bocd;
		this.search_order = search_order;
		this.search_ad = search_ad;
		this.search_cond = search_cond;
		this.search_pttn = search_pttn;
		this.search_word = search_word;
		this.search_stop = search_stop;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSearch_order(String search_order){
		this.search_order = search_order;
	}

	public void setSearch_ad(String search_ad){
		this.search_ad = search_ad;
	}

	public void setSearch_cond(String search_cond){
		this.search_cond = search_cond;
	}

	public void setSearch_pttn(String search_pttn){
		this.search_pttn = search_pttn;
	}

	public void setSearch_word(String search_word){
		this.search_word = search_word;
	}

	public void setSearch_stop(String search_stop){
		this.search_stop = search_stop;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSearch_order(){
		return this.search_order;
	}

	public String getSearch_ad(){
		return this.search_ad;
	}

	public String getSearch_cond(){
		return this.search_cond;
	}

	public String getSearch_pttn(){
		return this.search_pttn;
	}

	public String getSearch_word(){
		return this.search_word;
	}

	public String getSearch_stop(){
		return this.search_stop;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_MO_L_READER( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_MO_L_READERDM dm = (SL_MO_L_READERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.search_order);
		cstmt.setString(5, dm.search_ad);
		cstmt.setString(6, dm.search_cond);
		cstmt.setString(7, dm.search_pttn);
		cstmt.setString(8, dm.search_word);
		cstmt.setString(9, dm.search_stop);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_MO_L_READERDataSet();
	}



    public void print(){
        System.out.println("bocd = " + getBocd());
        System.out.println("search_order = " + getSearch_order());
        System.out.println("search_ad = " + getSearch_ad());
        System.out.println("search_cond = " + getSearch_cond());
        System.out.println("search_pttn = " + getSearch_pttn());
        System.out.println("search_word = " + getSearch_word());
        System.out.println("search_stop = " + getSearch_stop());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
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
String search_order = req.getParameter("search_order");
if( search_order == null){
	System.out.println(this.toString+" : search_order is null" );
}else{
	System.out.println(this.toString+" : search_order is "+search_order );
}
String search_ad = req.getParameter("search_ad");
if( search_ad == null){
	System.out.println(this.toString+" : search_ad is null" );
}else{
	System.out.println(this.toString+" : search_ad is "+search_ad );
}
String search_cond = req.getParameter("search_cond");
if( search_cond == null){
	System.out.println(this.toString+" : search_cond is null" );
}else{
	System.out.println(this.toString+" : search_cond is "+search_cond );
}
String search_pttn = req.getParameter("search_pttn");
if( search_pttn == null){
	System.out.println(this.toString+" : search_pttn is null" );
}else{
	System.out.println(this.toString+" : search_pttn is "+search_pttn );
}
String search_word = req.getParameter("search_word");
if( search_word == null){
	System.out.println(this.toString+" : search_word is null" );
}else{
	System.out.println(this.toString+" : search_word is "+search_word );
}
String search_stop = req.getParameter("search_stop");
if( search_stop == null){
	System.out.println(this.toString+" : search_stop is null" );
}else{
	System.out.println(this.toString+" : search_stop is "+search_stop );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String search_order = Util.checkString(req.getParameter("search_order"));
String search_ad = Util.checkString(req.getParameter("search_ad"));
String search_cond = Util.checkString(req.getParameter("search_cond"));
String search_pttn = Util.checkString(req.getParameter("search_pttn"));
String search_word = Util.checkString(req.getParameter("search_word"));
String search_stop = Util.checkString(req.getParameter("search_stop"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));
String search_ad = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ad")));
String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));
String search_pttn = Util.Uni2Ksc(Util.checkString(req.getParameter("search_pttn")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String search_stop = Util.Uni2Ksc(Util.checkString(req.getParameter("search_stop")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setSearch_order(search_order);
dm.setSearch_ad(search_ad);
dm.setSearch_cond(search_cond);
dm.setSearch_pttn(search_pttn);
dm.setSearch_word(search_word);
dm.setSearch_stop(search_stop);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 06 13:58:32 KST 2016 */