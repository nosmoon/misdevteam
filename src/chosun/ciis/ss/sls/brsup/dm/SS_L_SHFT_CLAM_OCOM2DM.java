/***************************************************************************************************
* 파일명 : SS_L_SHFT_CLAM_OCOM2DM.java
* 기능 : 지국업무지원-Billing자동이체-청구결과관리-자동이체청구결과목록검색
* 작성일자 : 2004-06-07
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-청구결과관리-자동이체청구결과목록검색
 *
 */


public class SS_L_SHFT_CLAM_OCOM2DM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String bocd;
    public long pageno;
    public long pagesize;
    public String sechcond;
    public String sechcont;
    public String f_basidt;
    public String t_basidt;
    public String basidt;
    public String shftclsfcd;
    public String subsmappli;
    public String erryn;

    public SS_L_SHFT_CLAM_OCOM2DM(){}
    public SS_L_SHFT_CLAM_OCOM2DM(String bocd, long pageno, long pagesize, String sechcond, String sechcont, String f_basidt, String t_basidt, String basidt, String shftclsfcd, String subsmappli, String erryn){
        this.bocd = bocd;
        this.pageno = pageno;
        this.pagesize = pagesize;
        this.sechcond = sechcond;
        this.sechcont = sechcont;
        this.f_basidt = f_basidt;
        this.t_basidt = t_basidt;
        this.basidt = basidt;
        this.shftclsfcd = shftclsfcd;
        this.subsmappli = subsmappli;
        this.erryn = erryn;
    }

    public void setBocd(String bocd){
        this.bocd = bocd;
    }

    public void setPageno(long pageno){
        this.pageno = pageno;
    }

    public void setPagesize(long pagesize){
        this.pagesize = pagesize;
    }

    public void setSechcond(String sechcond){
        this.sechcond = sechcond;
    }

    public void setSechcont(String sechcont){
        this.sechcont = sechcont;
    }

    public void setF_basidt(String f_basidt){
        this.f_basidt = f_basidt;
    }

    public void setT_basidt(String t_basidt){
        this.t_basidt = t_basidt;
    }

    public void setBasidt(String basidt){
        this.basidt = basidt;
    }

    public void setShftclsfcd(String shftclsfcd){
        this.shftclsfcd = shftclsfcd;
    }

    public void setSubsmappli(String subsmappli){
        this.subsmappli = subsmappli;
    }

    public void setErryn(String erryn){
        this.erryn = erryn;
    }

    public String getBocd(){
        return this.bocd;
    }

    public long getPageno(){
        return this.pageno;
    }

    public long getPagesize(){
        return this.pagesize;
    }

    public String getSechcond(){
        return this.sechcond;
    }

    public String getSechcont(){
        return this.sechcont;
    }

    public String getF_basidt(){
        return this.f_basidt;
    }

    public String getT_basidt(){
        return this.t_basidt;
    }

    public String getBasidt(){
        return this.basidt;
    }

    public String getShftclsfcd(){
        return this.shftclsfcd;
    }

    public String getSubsmappli(){
        return this.subsmappli;
    }

    public String getErryn(){
        return this.erryn;
    }

    public String getSQL(){
         return "{ call SP_SS_L_SHFT_CLAM_OCOM2( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_L_SHFT_CLAM_OCOM2DM dm = (SS_L_SHFT_CLAM_OCOM2DM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.bocd);
        cstmt.setLong(4, dm.pageno);
        cstmt.setLong(5, dm.pagesize);
        cstmt.setString(6, dm.sechcond);
        cstmt.setString(7, dm.sechcont);
        cstmt.setString(8, dm.f_basidt);
        cstmt.setString(9, dm.t_basidt);
        cstmt.setString(10, dm.basidt);
        cstmt.setString(11, dm.shftclsfcd);
        cstmt.setString(12, dm.subsmappli);
        cstmt.setString(13, dm.erryn);
        cstmt.registerOutParameter(14, Types.INTEGER);
        cstmt.registerOutParameter(15, Types.INTEGER);
        cstmt.registerOutParameter(16, Types.INTEGER);
        cstmt.registerOutParameter(17, Types.INTEGER);
        cstmt.registerOutParameter(18, Types.INTEGER);
        cstmt.registerOutParameter(19, Types.INTEGER);
        cstmt.registerOutParameter(20, Types.INTEGER);
        cstmt.registerOutParameter(21, OracleTypes.CURSOR);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFT_CLAM_OCOM2DataSet();
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
String sechcond = req.getParameter("sechcond");
if( sechcond == null){
    System.out.println(this.toString+" : sechcond is null" );
}else{
    System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
    System.out.println(this.toString+" : sechcont is null" );
}else{
    System.out.println(this.toString+" : sechcont is "+sechcont );
}
String f_basidt = req.getParameter("f_basidt");
if( f_basidt == null){
    System.out.println(this.toString+" : f_basidt is null" );
}else{
    System.out.println(this.toString+" : f_basidt is "+f_basidt );
}
String t_basidt = req.getParameter("t_basidt");
if( t_basidt == null){
    System.out.println(this.toString+" : t_basidt is null" );
}else{
    System.out.println(this.toString+" : t_basidt is "+t_basidt );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
    System.out.println(this.toString+" : basidt is null" );
}else{
    System.out.println(this.toString+" : basidt is "+basidt );
}
String shftclsfcd = req.getParameter("shftclsfcd");
if( shftclsfcd == null){
    System.out.println(this.toString+" : shftclsfcd is null" );
}else{
    System.out.println(this.toString+" : shftclsfcd is "+shftclsfcd );
}
String subsmappli = req.getParameter("subsmappli");
if( subsmappli == null){
    System.out.println(this.toString+" : subsmappli is null" );
}else{
    System.out.println(this.toString+" : subsmappli is "+subsmappli );
}
String erryn = req.getParameter("erryn");
if( erryn == null){
    System.out.println(this.toString+" : erryn is null" );
}else{
    System.out.println(this.toString+" : erryn is "+erryn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
String f_basidt = Util.checkString(req.getParameter("f_basidt"));
String t_basidt = Util.checkString(req.getParameter("t_basidt"));
String basidt = Util.checkString(req.getParameter("basidt"));
String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
String subsmappli = Util.checkString(req.getParameter("subsmappli"));
String erryn = Util.checkString(req.getParameter("erryn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
String f_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("f_basidt")));
String t_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("t_basidt")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String shftclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsfcd")));
String subsmappli = Util.Uni2Ksc(Util.checkString(req.getParameter("subsmappli")));
String erryn = Util.Uni2Ksc(Util.checkString(req.getParameter("erryn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
dm.setF_basidt(f_basidt);
dm.setT_basidt(t_basidt);
dm.setBasidt(basidt);
dm.setShftclsfcd(shftclsfcd);
dm.setSubsmappli(subsmappli);
dm.setErryn(erryn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 21:17:24 KST 2004 */