/***************************************************************************************************
* 파일명 : SS_U_QTYAPLC_MAIN_NWSP_CLOSDM.java
* 기능 : 지국경영-부수증감-본지신청(부수담당)-저장을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감-본지신청(부수담당)-저장을 위한 DM
 */

public class SS_U_QTYAPLC_MAIN_NWSP_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String bocd;
    public String aplcdt;
    public String prvissudt;
    public String issudt;
    public String chrgcnfmyn;
    public String closyn;
    public String incmgpers;

    public SS_U_QTYAPLC_MAIN_NWSP_CLOSDM(){}
    public SS_U_QTYAPLC_MAIN_NWSP_CLOSDM(String bocd, String aplcdt, String prvissudt, String issudt, String chrgcnfmyn, String closyn, String incmgpers){
        this.bocd = bocd;
        this.aplcdt = aplcdt;
        this.prvissudt = prvissudt;
        this.issudt = issudt;
        this.chrgcnfmyn = chrgcnfmyn;
        this.closyn = closyn;
        this.incmgpers = incmgpers;
    }

    public void setBocd(String bocd){
        this.bocd = bocd;
    }

    public void setAplcdt(String aplcdt){
        this.aplcdt = aplcdt;
    }

    public void setPrvissudt(String prvissudt){
        this.prvissudt = prvissudt;
    }

    public void setIssudt(String issudt){
        this.issudt = issudt;
    }

    public void setChrgcnfmyn(String chrgcnfmyn){
        this.chrgcnfmyn = chrgcnfmyn;
    }

    public void setClosyn(String closyn){
        this.closyn = closyn;
    }

    public void setIncmgpers(String incmgpers){
        this.incmgpers = incmgpers;
    }

    public String getBocd(){
        return this.bocd;
    }

    public String getAplcdt(){
        return this.aplcdt;
    }

    public String getPrvissudt(){
        return this.prvissudt;
    }

    public String getIssudt(){
        return this.issudt;
    }

    public String getChrgcnfmyn(){
        return this.chrgcnfmyn;
    }

    public String getClosyn(){
        return this.closyn;
    }

    public String getIncmgpers(){
        return this.incmgpers;
    }

    public String getSQL(){
         return "{ call SP_SS_U_QTYAPLC_MAIN_NWSP_CLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_U_QTYAPLC_MAIN_NWSP_CLOSDM dm = (SS_U_QTYAPLC_MAIN_NWSP_CLOSDM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.bocd);
        cstmt.setString(4, dm.aplcdt);
        cstmt.setString(5, dm.prvissudt);
        cstmt.setString(6, dm.issudt);
        cstmt.setString(7, dm.chrgcnfmyn);
        cstmt.setString(8, dm.closyn);
        cstmt.setString(9, dm.incmgpers);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.brmgr.ds.SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet();
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
    System.out.println(this.toString+" : aplcdt is null" );
}else{
    System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String prvissudt = req.getParameter("prvissudt");
if( prvissudt == null){
    System.out.println(this.toString+" : prvissudt is null" );
}else{
    System.out.println(this.toString+" : prvissudt is "+prvissudt );
}
String issudt = req.getParameter("issudt");
if( issudt == null){
    System.out.println(this.toString+" : issudt is null" );
}else{
    System.out.println(this.toString+" : issudt is "+issudt );
}
String chrgcnfmyn = req.getParameter("chrgcnfmyn");
if( chrgcnfmyn == null){
    System.out.println(this.toString+" : chrgcnfmyn is null" );
}else{
    System.out.println(this.toString+" : chrgcnfmyn is "+chrgcnfmyn );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
    System.out.println(this.toString+" : closyn is null" );
}else{
    System.out.println(this.toString+" : closyn is "+closyn );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
    System.out.println(this.toString+" : incmgpers is null" );
}else{
    System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String prvissudt = Util.checkString(req.getParameter("prvissudt"));
String issudt = Util.checkString(req.getParameter("issudt"));
String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));
String closyn = Util.checkString(req.getParameter("closyn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String prvissudt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvissudt")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String chrgcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("chrgcnfmyn")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setPrvissudt(prvissudt);
dm.setIssudt(issudt);
dm.setChrgcnfmyn(chrgcnfmyn);
dm.setClosyn(closyn);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 03 13:10:05 KST 2004 */
