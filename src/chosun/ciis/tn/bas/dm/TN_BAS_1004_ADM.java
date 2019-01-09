/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.io.Serializable;
import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1004_ADM extends BaseDM
  implements Serializable
{
  public String cmpy_cd;
  public String incmg_pers;
  public String organidx;
  public String stampimagepath;
  public byte[] phot;

  public TN_BAS_1004_ADM()
  {
  }

  public TN_BAS_1004_ADM(String cmpy_cd, String incmg_pers, String organidx, String stampimagepath, byte[] phot)
  {
    this.cmpy_cd = cmpy_cd;
    this.incmg_pers = incmg_pers;
    this.organidx = organidx;
    this.stampimagepath = stampimagepath;
    this.phot = phot;
  }

  public void setCmpy_cd(String cmpy_cd) {
    this.cmpy_cd = cmpy_cd;
  }

  public void setIncmg_pers(String incmg_pers) {
    this.incmg_pers = incmg_pers;
  }

  public void setOrganidx(String organidx) {
    this.organidx = organidx;
  }

  public void setStampimagepath(String stampimagepath) {
    this.stampimagepath = stampimagepath;
  }

  public void setPhot(byte[] phot) {
    this.phot = phot;
  }

  public String getCmpy_cd() {
    return this.cmpy_cd;
  }

  public String getIncmg_pers() {
    return this.incmg_pers;
  }

  public String getOrganidx() {
    return this.organidx;
  }

  public String getStampimagepath() {
    return this.stampimagepath;
  }

  public byte[] getPhot() {
    return this.phot;
  }

  public String getSQL() {
    return "{ call MISTNN.SP_TN_BAS_1004_A(? ,? ,? ,? ,? ,? ,?) }";
  }

  public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException {
    TN_BAS_1004_ADM dm = (TN_BAS_1004_ADM)bdm;
    cstmt.registerOutParameter(1, 12);
    cstmt.registerOutParameter(2, 12);
    cstmt.setString(3, dm.cmpy_cd);
    cstmt.setString(4, dm.incmg_pers);
    cstmt.setString(5, dm.organidx);
    cstmt.setString(6, dm.stampimagepath);
    cstmt.setBytes(7, dm.phot);
  }

  public BaseDataSet createDataSetObject() {
    return new TN_BAS_1004_ADataSet();
  }

  public void print()
  {
    System.out.println("SQL = " + getSQL());
    System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
    System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
    System.out.println("organidx = [" + getOrganidx() + "]");
    System.out.println("stampimagepath = [" + getStampimagepath() + "]");
    System.out.println("phot = [" + getPhot() + "]");
  }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
String stampimagepath = req.getParameter("stampimagepath");
if( stampimagepath == null){
	System.out.println(this.toString+" : stampimagepath is null" );
}else{
	System.out.println(this.toString+" : stampimagepath is "+stampimagepath );
}
String phot = req.getParameter("phot");
if( phot == null){
	System.out.println(this.toString+" : phot is null" );
}else{
	System.out.println(this.toString+" : phot is "+phot );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String organidx = Util.checkString(req.getParameter("organidx"));
String stampimagepath = Util.checkString(req.getParameter("stampimagepath"));
String phot = Util.checkString(req.getParameter("phot"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
String stampimagepath = Util.Uni2Ksc(Util.checkString(req.getParameter("stampimagepath")));
String phot = Util.Uni2Ksc(Util.checkString(req.getParameter("phot")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setOrganidx(organidx);
dm.setStampimagepath(stampimagepath);
dm.setPhot(phot);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 26 11:39:07 KST 2016 */