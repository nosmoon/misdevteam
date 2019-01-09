/***************************************************************************************************
* 파일명 : SS_I_ANNCBODM.java
* 기능 : 실시간 지국공지 등록
* 작성일자 : 2003-12-19
* 작성자 : 고윤홍
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


public class SS_I_ANNCBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makepersid;
	public String makepersnm;
	public String posicd;
	public String posinm;
	public String deptcd;
	public String deptnm;
	public String rmsgclsf;
	public String rmsgdept;
	public String rmsgdeptnm;
	public String rmsgarea;
	public String rmsgareanm;
	public String anncbgntm;
	public String anncendtm;
	public String annctitl;
	public String annccont;
	public String incmgpers;

	public SS_I_ANNCBODM(){}
	public SS_I_ANNCBODM(String makepersid, String makepersnm, String posicd, String posinm, String deptcd, String deptnm, String rmsgclsf, String rmsgdept, String rmsgdeptnm, String rmsgarea, String rmsgareanm, String anncbgntm, String anncendtm, String annctitl, String annccont, String incmgpers){
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.posicd = posicd;
		this.posinm = posinm;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.rmsgclsf = rmsgclsf;
		this.rmsgdept = rmsgdept;
		this.rmsgdeptnm = rmsgdeptnm;
		this.rmsgarea = rmsgarea;
		this.rmsgareanm = rmsgareanm;
		this.anncbgntm = anncbgntm;
		this.anncendtm = anncendtm;
		this.annctitl = annctitl;
		this.annccont = annccont;
		this.incmgpers = incmgpers;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setPosicd(String posicd){
		this.posicd = posicd;
	}

	public void setPosinm(String posinm){
		this.posinm = posinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setRmsgclsf(String rmsgclsf){
		this.rmsgclsf = rmsgclsf;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgdeptnm(String rmsgdeptnm){
		this.rmsgdeptnm = rmsgdeptnm;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgareanm(String rmsgareanm){
		this.rmsgareanm = rmsgareanm;
	}

	public void setAnncbgntm(String anncbgntm){
		this.anncbgntm = anncbgntm;
	}

	public void setAnncendtm(String anncendtm){
		this.anncendtm = anncendtm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getPosicd(){
		return this.posicd;
	}

	public String getPosinm(){
		return this.posinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getRmsgclsf(){
		return this.rmsgclsf;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgdeptnm(){
		return this.rmsgdeptnm;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgareanm(){
		return this.rmsgareanm;
	}

	public String getAnncbgntm(){
		return this.anncbgntm;
	}

	public String getAnncendtm(){
		return this.anncendtm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_ANNCBO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_ANNCBODM dm = (SS_I_ANNCBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makepersid);
		cstmt.setString(4, dm.makepersnm);
		cstmt.setString(5, dm.posicd);
		cstmt.setString(6, dm.posinm);
		cstmt.setString(7, dm.deptcd);
		cstmt.setString(8, dm.deptnm);
		cstmt.setString(9, dm.rmsgclsf);
		cstmt.setString(10, dm.rmsgdept);
		cstmt.setString(11, dm.rmsgdeptnm);
		cstmt.setString(12, dm.rmsgarea);
		cstmt.setString(13, dm.rmsgareanm);
		cstmt.setString(14, dm.anncbgntm);
		cstmt.setString(15, dm.anncendtm);
		cstmt.setString(16, dm.annctitl);
		cstmt.setString(17, dm.annccont);
		cstmt.setString(18, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_I_ANNCBODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
}
String makepersnm = req.getParameter("makepersnm");
if( makepersnm == null){
	System.out.println(this.toString+" : makepersnm is null" );
}else{
	System.out.println(this.toString+" : makepersnm is "+makepersnm );
}
String posicd = req.getParameter("posicd");
if( posicd == null){
	System.out.println(this.toString+" : posicd is null" );
}else{
	System.out.println(this.toString+" : posicd is "+posicd );
}
String posinm = req.getParameter("posinm");
if( posinm == null){
	System.out.println(this.toString+" : posinm is null" );
}else{
	System.out.println(this.toString+" : posinm is "+posinm );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
	System.out.println(this.toString+" : deptnm is null" );
}else{
	System.out.println(this.toString+" : deptnm is "+deptnm );
}
String rmsgclsf = req.getParameter("rmsgclsf");
if( rmsgclsf == null){
	System.out.println(this.toString+" : rmsgclsf is null" );
}else{
	System.out.println(this.toString+" : rmsgclsf is "+rmsgclsf );
}
String rmsgdept = req.getParameter("rmsgdept");
if( rmsgdept == null){
	System.out.println(this.toString+" : rmsgdept is null" );
}else{
	System.out.println(this.toString+" : rmsgdept is "+rmsgdept );
}
String rmsgdeptnm = req.getParameter("rmsgdeptnm");
if( rmsgdeptnm == null){
	System.out.println(this.toString+" : rmsgdeptnm is null" );
}else{
	System.out.println(this.toString+" : rmsgdeptnm is "+rmsgdeptnm );
}
String rmsgarea = req.getParameter("rmsgarea");
if( rmsgarea == null){
	System.out.println(this.toString+" : rmsgarea is null" );
}else{
	System.out.println(this.toString+" : rmsgarea is "+rmsgarea );
}
String rmsgareanm = req.getParameter("rmsgareanm");
if( rmsgareanm == null){
	System.out.println(this.toString+" : rmsgareanm is null" );
}else{
	System.out.println(this.toString+" : rmsgareanm is "+rmsgareanm );
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
String annctitl = req.getParameter("annctitl");
if( annctitl == null){
	System.out.println(this.toString+" : annctitl is null" );
}else{
	System.out.println(this.toString+" : annctitl is "+annctitl );
}
String annccont = req.getParameter("annccont");
if( annccont == null){
	System.out.println(this.toString+" : annccont is null" );
}else{
	System.out.println(this.toString+" : annccont is "+annccont );
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

String makepersid = Util.checkString(req.getParameter("makepersid"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String posicd = Util.checkString(req.getParameter("posicd"));
String posinm = Util.checkString(req.getParameter("posinm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String rmsgclsf = Util.checkString(req.getParameter("rmsgclsf"));
String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));
String rmsgdeptnm = Util.checkString(req.getParameter("rmsgdeptnm"));
String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));
String rmsgareanm = Util.checkString(req.getParameter("rmsgareanm"));
String anncbgntm = Util.checkString(req.getParameter("anncbgntm"));
String anncendtm = Util.checkString(req.getParameter("anncendtm"));
String annctitl = Util.checkString(req.getParameter("annctitl"));
String annccont = Util.checkString(req.getParameter("annccont"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String posicd = Util.Uni2Ksc(Util.checkString(req.getParameter("posicd")));
String posinm = Util.Uni2Ksc(Util.checkString(req.getParameter("posinm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String deptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm")));
String rmsgclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgclsf")));
String rmsgdept = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdept")));
String rmsgdeptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm")));
String rmsgarea = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgarea")));
String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm")));
String anncbgntm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncbgntm")));
String anncendtm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncendtm")));
String annctitl = Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl")));
String annccont = Util.Uni2Ksc(Util.checkString(req.getParameter("annccont")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakepersid(makepersid);
dm.setMakepersnm(makepersnm);
dm.setPosicd(posicd);
dm.setPosinm(posinm);
dm.setDeptcd(deptcd);
dm.setDeptnm(deptnm);
dm.setRmsgclsf(rmsgclsf);
dm.setRmsgdept(rmsgdept);
dm.setRmsgdeptnm(rmsgdeptnm);
dm.setRmsgarea(rmsgarea);
dm.setRmsgareanm(rmsgareanm);
dm.setAnncbgntm(anncbgntm);
dm.setAnncendtm(anncendtm);
dm.setAnnctitl(annctitl);
dm.setAnnccont(annccont);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 19 21:48:04 KST 2003 */