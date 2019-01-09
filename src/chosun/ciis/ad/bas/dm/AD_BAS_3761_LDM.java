/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3761_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String pubc_asse_cd;
	public String chk_asse;
	public String advt_cont;
	public String sect_nm_cd;
	public String sect_nm_detail;
	public String remk;
	public String slcrg_pers;

	public AD_BAS_3761_LDM(){}
	public AD_BAS_3761_LDM(String cmpy_cd, String frdt, String todt, String pubc_asse_cd, String chk_asse, String advt_cont, String sect_nm_cd, String sect_nm_detail, String remk, String slcrg_pers){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.pubc_asse_cd = pubc_asse_cd;
		this.chk_asse = chk_asse;
		this.advt_cont = advt_cont;
		this.sect_nm_cd = sect_nm_cd;
		this.sect_nm_detail = sect_nm_detail;
		this.remk = remk;
		this.slcrg_pers = slcrg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setPubc_asse_cd(String pubc_asse_cd){
		this.pubc_asse_cd = pubc_asse_cd;
	}

	public void setChk_asse(String chk_asse){
		this.chk_asse = chk_asse;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm_detail(String sect_nm_detail){
		this.sect_nm_detail = sect_nm_detail;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getPubc_asse_cd(){
		return this.pubc_asse_cd;
	}

	public String getChk_asse(){
		return this.chk_asse;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm_detail(){
		return this.sect_nm_detail;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3761_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3761_LDM dm = (AD_BAS_3761_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.pubc_asse_cd);
		cstmt.setString(7, dm.chk_asse);
		cstmt.setString(8, dm.advt_cont);
		cstmt.setString(9, dm.sect_nm_cd);
		cstmt.setString(10, dm.sect_nm_detail);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.slcrg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3761_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("pubc_asse_cd = [" + getPubc_asse_cd() + "]");
		System.out.println("chk_asse = [" + getChk_asse() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("sect_nm_detail = [" + getSect_nm_detail() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String pubc_asse_cd = req.getParameter("pubc_asse_cd");
if( pubc_asse_cd == null){
	System.out.println(this.toString+" : pubc_asse_cd is null" );
}else{
	System.out.println(this.toString+" : pubc_asse_cd is "+pubc_asse_cd );
}
String chk_asse = req.getParameter("chk_asse");
if( chk_asse == null){
	System.out.println(this.toString+" : chk_asse is null" );
}else{
	System.out.println(this.toString+" : chk_asse is "+chk_asse );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
String sect_nm_detail = req.getParameter("sect_nm_detail");
if( sect_nm_detail == null){
	System.out.println(this.toString+" : sect_nm_detail is null" );
}else{
	System.out.println(this.toString+" : sect_nm_detail is "+sect_nm_detail );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String pubc_asse_cd = Util.checkString(req.getParameter("pubc_asse_cd"));
String chk_asse = Util.checkString(req.getParameter("chk_asse"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String sect_nm_detail = Util.checkString(req.getParameter("sect_nm_detail"));
String remk = Util.checkString(req.getParameter("remk"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String pubc_asse_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_asse_cd")));
String chk_asse = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_asse")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String sect_nm_detail = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_detail")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setPubc_asse_cd(pubc_asse_cd);
dm.setChk_asse(chk_asse);
dm.setAdvt_cont(advt_cont);
dm.setSect_nm_cd(sect_nm_cd);
dm.setSect_nm_detail(sect_nm_detail);
dm.setRemk(remk);
dm.setSlcrg_pers(slcrg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 14 15:49:33 KST 2015 */