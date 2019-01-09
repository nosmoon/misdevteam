/***************************************************************************************************
* 파일명 : SL_A_CLAMTRDRDM.java
* 기능 : 공통-입금내역정보저장
* 작성일자 : 2004-08-10
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통-입금내역정보저장
 *
 */

public class SL_A_CLAMTRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String bocd;
    public String incmgpers;
    public String rdr_no;
    public String medicd;
    public String subsmappli;
    public String dlvdstccd;
    public String clamtmthdcd;
    public String rcpmclsfcd;
    public String clamt;
    public String recpdt;

    public SL_A_CLAMTRDRDM(){}
    public SL_A_CLAMTRDRDM(String bocd, String incmgpers, String rdr_no, String medicd, String subsmappli, String dlvdstccd, String clamtmthdcd, String rcpmclsfcd, String clamt, String recpdt){
        this.bocd = bocd;
        this.incmgpers = incmgpers;
        this.rdr_no = rdr_no;
        this.medicd = medicd;
        this.subsmappli = subsmappli;
        this.dlvdstccd = dlvdstccd;
        this.clamtmthdcd = clamtmthdcd;
        this.rcpmclsfcd = rcpmclsfcd;
        this.clamt = clamt;
        this.recpdt = recpdt;
    }

    public void setBocd(String bocd){
        this.bocd = bocd;
    }

    public void setIncmgpers(String incmgpers){
        this.incmgpers = incmgpers;
    }

    public void setRdr_no(String rdr_no){
        this.rdr_no = rdr_no;
    }

    public void setMedicd(String medicd){
        this.medicd = medicd;
    }

    public void setSubsmappli(String subsmappli){
        this.subsmappli = subsmappli;
    }

    public void setDlvdstccd(String dlvdstccd){
        this.dlvdstccd = dlvdstccd;
    }

    public void setClamtmthdcd(String clamtmthdcd){
        this.clamtmthdcd = clamtmthdcd;
    }

    public void setRcpmclsfcd(String rcpmclsfcd){
        this.rcpmclsfcd = rcpmclsfcd;
    }

    public void setClamt(String clamt){
        this.clamt = clamt;
    }

    public void setRecpdt(String recpdt){
        this.recpdt = recpdt;
    }

    public String getBocd(){
        return this.bocd;
    }

    public String getIncmgpers(){
        return this.incmgpers;
    }

    public String getRdr_no(){
        return this.rdr_no;
    }

    public String getMedicd(){
        return this.medicd;
    }

    public String getSubsmappli(){
        return this.subsmappli;
    }

    public String getDlvdstccd(){
        return this.dlvdstccd;
    }

    public String getClamtmthdcd(){
        return this.clamtmthdcd;
    }

    public String getRcpmclsfcd(){
        return this.rcpmclsfcd;
    }

    public String getClamt(){
        return this.clamt;
    }

    public String getRecpdt(){
        return this.recpdt;
    }

    public String getSQL(){
         return "{ call SP_SL_A_CLAMTRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SL_A_CLAMTRDRDM dm = (SL_A_CLAMTRDRDM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.bocd);
        cstmt.setString(4, dm.incmgpers);
        cstmt.setString(5, dm.rdr_no);
        cstmt.setString(6, dm.medicd);
        cstmt.setString(7, dm.subsmappli);
        cstmt.setString(8, dm.dlvdstccd);
        cstmt.setString(9, dm.clamtmthdcd);
        cstmt.setString(10, dm.rcpmclsfcd);
        cstmt.setString(11, dm.clamt);
        cstmt.setString(12, dm.recpdt);
        cstmt.registerOutParameter(13, OracleTypes.CURSOR);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sal.common.ds.SL_A_CLAMTRDRDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
    System.out.println(this.toString+" : incmgpers is null" );
}else{
    System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
    System.out.println(this.toString+" : rdr_no is null" );
}else{
    System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
    System.out.println(this.toString+" : medicd is null" );
}else{
    System.out.println(this.toString+" : medicd is "+medicd );
}
String subsmappli = req.getParameter("subsmappli");
if( subsmappli == null){
    System.out.println(this.toString+" : subsmappli is null" );
}else{
    System.out.println(this.toString+" : subsmappli is "+subsmappli );
}
String dlvdstccd = req.getParameter("dlvdstccd");
if( dlvdstccd == null){
    System.out.println(this.toString+" : dlvdstccd is null" );
}else{
    System.out.println(this.toString+" : dlvdstccd is "+dlvdstccd );
}
String clamtmthdcd = req.getParameter("clamtmthdcd");
if( clamtmthdcd == null){
    System.out.println(this.toString+" : clamtmthdcd is null" );
}else{
    System.out.println(this.toString+" : clamtmthdcd is "+clamtmthdcd );
}
String rcpmclsfcd = req.getParameter("rcpmclsfcd");
if( rcpmclsfcd == null){
    System.out.println(this.toString+" : rcpmclsfcd is null" );
}else{
    System.out.println(this.toString+" : rcpmclsfcd is "+rcpmclsfcd );
}
String clamt = req.getParameter("clamt");
if( clamt == null){
    System.out.println(this.toString+" : clamt is null" );
}else{
    System.out.println(this.toString+" : clamt is "+clamt );
}
String recpdt = req.getParameter("recpdt");
if( recpdt == null){
    System.out.println(this.toString+" : recpdt is null" );
}else{
    System.out.println(this.toString+" : recpdt is "+recpdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String subsmappli = Util.checkString(req.getParameter("subsmappli"));
String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String rcpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd"));
String clamt = Util.checkString(req.getParameter("clamt"));
String recpdt = Util.checkString(req.getParameter("recpdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String subsmappli = Util.Uni2Ksc(Util.checkString(req.getParameter("subsmappli")));
String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String rcpmclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmclsfcd")));
String clamt = Util.Uni2Ksc(Util.checkString(req.getParameter("clamt")));
String recpdt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setSubsmappli(subsmappli);
dm.setDlvdstccd(dlvdstccd);
dm.setClamtmthdcd(clamtmthdcd);
dm.setRcpmclsfcd(rcpmclsfcd);
dm.setClamt(clamt);
dm.setRecpdt(recpdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 11 01:38:44 KST 2004 */