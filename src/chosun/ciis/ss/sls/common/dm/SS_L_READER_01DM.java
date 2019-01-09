/***************************************************************************************************
* 파일명 : SS_L_READER_01DM.java
* 기능 : 독자조회(기본형) 한 독자에 한 건 조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 독자조회(기본형) 한 독자에 한 건 조회를 위한 DataModel
 */


public class SS_L_READER_01DM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String bocd;
    public String rdr_extndt;
    public String rdr_extnno;
    public String search_order;
    public String search_ad;
    public String search_cond;
    public String search_word;
    public String search_stop;
    public long pageno;
    public long pagesize;

    public SS_L_READER_01DM(){}
    public SS_L_READER_01DM(String bocd, String rdr_extndt, String rdr_extnno, String search_order, String search_ad, String search_cond, String search_word, String search_stop, long pageno, long pagesize){
        this.bocd = bocd;
        this.rdr_extndt = rdr_extndt;
        this.rdr_extnno = rdr_extnno;
        this.search_order = search_order;
        this.search_ad = search_ad;
        this.search_cond = search_cond;
        this.search_word = search_word;
        this.search_stop = search_stop;
        this.pageno = pageno;
        this.pagesize = pagesize;
    }

    public void setBocd(String bocd){
        this.bocd = bocd;
    }

    public void setRdr_extndt(String rdr_extndt){
        this.rdr_extndt = rdr_extndt;
    }

    public void setRdr_extnno(String rdr_extnno){
        this.rdr_extnno = rdr_extnno;
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

    public String getRdr_extndt(){
        return this.rdr_extndt;
    }

    public String getRdr_extnno(){
        return this.rdr_extnno;
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
         return "{ call SP_SL_L_READER_01( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_L_READER_01DM dm = (SS_L_READER_01DM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.bocd);
        cstmt.setString(4, dm.rdr_extndt);
        cstmt.setString(5, dm.rdr_extnno);
        cstmt.setString(6, dm.search_order);
        cstmt.setString(7, dm.search_ad);
        cstmt.setString(8, dm.search_cond);
        cstmt.setString(9, dm.search_word);
        cstmt.setString(10, dm.search_stop);
        cstmt.setLong(11, dm.pageno);
        cstmt.setLong(12, dm.pagesize);
        cstmt.registerOutParameter(13, Types.INTEGER);
        cstmt.registerOutParameter(14, OracleTypes.CURSOR);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.common.ds.SS_L_READER_01DataSet();
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
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
    System.out.println(this.toString+" : rdr_extndt is null" );
}else{
    System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
    System.out.println(this.toString+" : rdr_extnno is null" );
}else{
    System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
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
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String search_order = Util.checkString(req.getParameter("search_order"));
String search_ad = Util.checkString(req.getParameter("search_ad"));
String search_cond = Util.checkString(req.getParameter("search_cond"));
String search_word = Util.checkString(req.getParameter("search_word"));
String search_stop = Util.checkString(req.getParameter("search_stop"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));
String search_ad = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ad")));
String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String search_stop = Util.Uni2Ksc(Util.checkString(req.getParameter("search_stop")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setSearch_order(search_order);
dm.setSearch_ad(search_ad);
dm.setSearch_cond(search_cond);
dm.setSearch_word(search_word);
dm.setSearch_stop(search_stop);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 16 17:20:24 KST 2004 */