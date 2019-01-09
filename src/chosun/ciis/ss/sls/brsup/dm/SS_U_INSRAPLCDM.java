/***************************************************************************************************
* 파일명 : SS_U_INSRAPLCDM.java
* 기능 : 지국지원-상해보험-신규신청-저장(수정)을 위한 DM
* 작성일자 : 2004-02-19
* 작성자 : 김대섭
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
 * 지국지원-상해보험-신규신청-저장(수정)을 위한 DM
 */

public class SS_U_INSRAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String incmgpers;
    public String cntryyary;
    public String bocdary;
    public String hdqtsplyquntary;
    public String checkedary;

    public SS_U_INSRAPLCDM(){}
    public SS_U_INSRAPLCDM(String incmgpers, String cntryyary, String bocdary, String hdqtsplyquntary, String checkedary){
        this.incmgpers = incmgpers;
        this.cntryyary = cntryyary;
        this.bocdary = bocdary;
        this.hdqtsplyquntary = hdqtsplyquntary;
        this.checkedary = checkedary;
    }

    public void setIncmgpers(String incmgpers){
        this.incmgpers = incmgpers;
    }

    public void setCntryyary(String cntryyary){
        this.cntryyary = cntryyary;
    }

    public void setBocdary(String bocdary){
        this.bocdary = bocdary;
    }

    public void setHdqtsplyquntary(String hdqtsplyquntary){
        this.hdqtsplyquntary = hdqtsplyquntary;
    }

    public void setCheckedary(String checkedary){
        this.checkedary = checkedary;
    }

    public String getIncmgpers(){
        return this.incmgpers;
    }

    public String getCntryyary(){
        return this.cntryyary;
    }

    public String getBocdary(){
        return this.bocdary;
    }

    public String getHdqtsplyquntary(){
        return this.hdqtsplyquntary;
    }

    public String getCheckedary(){
        return this.checkedary;
    }

    public String getSQL(){
         return "{ call SP_SS_U_INSRAPLC( ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_U_INSRAPLCDM dm = (SS_U_INSRAPLCDM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.incmgpers);
        cstmt.setString(4, dm.cntryyary);
        cstmt.setString(5, dm.bocdary);
        cstmt.setString(6, dm.hdqtsplyquntary);
        cstmt.setString(7, dm.checkedary);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.brsup.ds.SS_U_INSRAPLCDataSet();
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
    System.out.println(this.toString+" : incmgpers is null" );
}else{
    System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cntryyary = req.getParameter("cntryyary");
if( cntryyary == null){
    System.out.println(this.toString+" : cntryyary is null" );
}else{
    System.out.println(this.toString+" : cntryyary is "+cntryyary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
    System.out.println(this.toString+" : bocdary is null" );
}else{
    System.out.println(this.toString+" : bocdary is "+bocdary );
}
String hdqtsplyquntary = req.getParameter("hdqtsplyquntary");
if( hdqtsplyquntary == null){
    System.out.println(this.toString+" : hdqtsplyquntary is null" );
}else{
    System.out.println(this.toString+" : hdqtsplyquntary is "+hdqtsplyquntary );
}
String checkedary = req.getParameter("checkedary");
if( checkedary == null){
    System.out.println(this.toString+" : checkedary is null" );
}else{
    System.out.println(this.toString+" : checkedary is "+checkedary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cntryyary = Util.checkString(req.getParameter("cntryyary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
String hdqtsplyquntary = Util.checkString(req.getParameter("hdqtsplyquntary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cntryyary = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryyary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
String hdqtsplyquntary = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtsplyquntary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setCntryyary(cntryyary);
dm.setBocdary(bocdary);
dm.setHdqtsplyquntary(hdqtsplyquntary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 11:54:02 KST 2004 */
