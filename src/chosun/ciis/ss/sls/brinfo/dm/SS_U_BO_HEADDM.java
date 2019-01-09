/***************************************************************************************************
* 파일명 : SS_U_BO_HEADDM.java
* 기능 : 지국Info-지국장정보 수정
* 작성일자 : 2004-03-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국장정보 수정
 *
 */


public class SS_U_BO_HEADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String prn;
	public String lastschir;
	public String nativ;
	public String hby;
	public String spc;
	public String relg;
	public String drink;
	public String smok;
	public String idea1;
	public String idea2;
	public String idea3;
	public String incmgpers;
	public String ideamakepersnm;
	public String sb_seq;
	public String sb_flnm;
	public String sb_rshp;
	public String sb_bidt;

	public SS_U_BO_HEADDM(){}
	public SS_U_BO_HEADDM(String bocd, String prn, String lastschir, String nativ, String hby, String spc, String relg, String drink, String smok, String idea1, String idea2, String idea3, String incmgpers, String ideamakepersnm, String sb_seq, String sb_flnm, String sb_rshp, String sb_bidt){
		this.bocd = bocd;
		this.prn = prn;
		this.lastschir = lastschir;
		this.nativ = nativ;
		this.hby = hby;
		this.spc = spc;
		this.relg = relg;
		this.drink = drink;
		this.smok = smok;
		this.idea1 = idea1;
		this.idea2 = idea2;
		this.idea3 = idea3;
		this.incmgpers = incmgpers;
		this.ideamakepersnm = ideamakepersnm;
		this.sb_seq = sb_seq;
		this.sb_flnm = sb_flnm;
		this.sb_rshp = sb_rshp;
		this.sb_bidt = sb_bidt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setLastschir(String lastschir){
		this.lastschir = lastschir;
	}

	public void setNativ(String nativ){
		this.nativ = nativ;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setSpc(String spc){
		this.spc = spc;
	}

	public void setRelg(String relg){
		this.relg = relg;
	}

	public void setDrink(String drink){
		this.drink = drink;
	}

	public void setSmok(String smok){
		this.smok = smok;
	}

	public void setIdea1(String idea1){
		this.idea1 = idea1;
	}

	public void setIdea2(String idea2){
		this.idea2 = idea2;
	}

	public void setIdea3(String idea3){
		this.idea3 = idea3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIdeamakepersnm(String ideamakepersnm){
		this.ideamakepersnm = ideamakepersnm;
	}

	public void setSb_seq(String sb_seq){
		this.sb_seq = sb_seq;
	}

	public void setSb_flnm(String sb_flnm){
		this.sb_flnm = sb_flnm;
	}

	public void setSb_rshp(String sb_rshp){
		this.sb_rshp = sb_rshp;
	}

	public void setSb_bidt(String sb_bidt){
		this.sb_bidt = sb_bidt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getLastschir(){
		return this.lastschir;
	}

	public String getNativ(){
		return this.nativ;
	}

	public String getHby(){
		return this.hby;
	}

	public String getSpc(){
		return this.spc;
	}

	public String getRelg(){
		return this.relg;
	}

	public String getDrink(){
		return this.drink;
	}

	public String getSmok(){
		return this.smok;
	}

	public String getIdea1(){
		return this.idea1;
	}

	public String getIdea2(){
		return this.idea2;
	}

	public String getIdea3(){
		return this.idea3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIdeamakepersnm(){
		return this.ideamakepersnm;
	}

	public String getSb_seq(){
		return this.sb_seq;
	}

	public String getSb_flnm(){
		return this.sb_flnm;
	}

	public String getSb_rshp(){
		return this.sb_rshp;
	}

	public String getSb_bidt(){
		return this.sb_bidt;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_BO_HEAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_BO_HEADDM dm = (SS_U_BO_HEADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.prn);
		cstmt.setString(5, dm.lastschir);
		cstmt.setString(6, dm.nativ);
		cstmt.setString(7, dm.hby);
		cstmt.setString(8, dm.spc);
		cstmt.setString(9, dm.relg);
		cstmt.setString(10, dm.drink);
		cstmt.setString(11, dm.smok);
		cstmt.setString(12, dm.idea1);
		cstmt.setString(13, dm.idea2);
		cstmt.setString(14, dm.idea3);
		cstmt.setString(15, dm.incmgpers);
		cstmt.setString(16, dm.ideamakepersnm);
		cstmt.setString(17, dm.sb_seq);
		cstmt.setString(18, dm.sb_flnm);
		cstmt.setString(19, dm.sb_rshp);
		cstmt.setString(20, dm.sb_bidt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_U_BO_HEADDataSet();
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
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String lastschir = req.getParameter("lastschir");
if( lastschir == null){
	System.out.println(this.toString+" : lastschir is null" );
}else{
	System.out.println(this.toString+" : lastschir is "+lastschir );
}
String nativ = req.getParameter("nativ");
if( nativ == null){
	System.out.println(this.toString+" : nativ is null" );
}else{
	System.out.println(this.toString+" : nativ is "+nativ );
}
String hby = req.getParameter("hby");
if( hby == null){
	System.out.println(this.toString+" : hby is null" );
}else{
	System.out.println(this.toString+" : hby is "+hby );
}
String spc = req.getParameter("spc");
if( spc == null){
	System.out.println(this.toString+" : spc is null" );
}else{
	System.out.println(this.toString+" : spc is "+spc );
}
String relg = req.getParameter("relg");
if( relg == null){
	System.out.println(this.toString+" : relg is null" );
}else{
	System.out.println(this.toString+" : relg is "+relg );
}
String drink = req.getParameter("drink");
if( drink == null){
	System.out.println(this.toString+" : drink is null" );
}else{
	System.out.println(this.toString+" : drink is "+drink );
}
String smok = req.getParameter("smok");
if( smok == null){
	System.out.println(this.toString+" : smok is null" );
}else{
	System.out.println(this.toString+" : smok is "+smok );
}
String idea1 = req.getParameter("idea1");
if( idea1 == null){
	System.out.println(this.toString+" : idea1 is null" );
}else{
	System.out.println(this.toString+" : idea1 is "+idea1 );
}
String idea2 = req.getParameter("idea2");
if( idea2 == null){
	System.out.println(this.toString+" : idea2 is null" );
}else{
	System.out.println(this.toString+" : idea2 is "+idea2 );
}
String idea3 = req.getParameter("idea3");
if( idea3 == null){
	System.out.println(this.toString+" : idea3 is null" );
}else{
	System.out.println(this.toString+" : idea3 is "+idea3 );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String ideamakepersnm = req.getParameter("ideamakepersnm");
if( ideamakepersnm == null){
	System.out.println(this.toString+" : ideamakepersnm is null" );
}else{
	System.out.println(this.toString+" : ideamakepersnm is "+ideamakepersnm );
}
String sb_seq = req.getParameter("sb_seq");
if( sb_seq == null){
	System.out.println(this.toString+" : sb_seq is null" );
}else{
	System.out.println(this.toString+" : sb_seq is "+sb_seq );
}
String sb_flnm = req.getParameter("sb_flnm");
if( sb_flnm == null){
	System.out.println(this.toString+" : sb_flnm is null" );
}else{
	System.out.println(this.toString+" : sb_flnm is "+sb_flnm );
}
String sb_rshp = req.getParameter("sb_rshp");
if( sb_rshp == null){
	System.out.println(this.toString+" : sb_rshp is null" );
}else{
	System.out.println(this.toString+" : sb_rshp is "+sb_rshp );
}
String sb_bidt = req.getParameter("sb_bidt");
if( sb_bidt == null){
	System.out.println(this.toString+" : sb_bidt is null" );
}else{
	System.out.println(this.toString+" : sb_bidt is "+sb_bidt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String prn = Util.checkString(req.getParameter("prn"));
String lastschir = Util.checkString(req.getParameter("lastschir"));
String nativ = Util.checkString(req.getParameter("nativ"));
String hby = Util.checkString(req.getParameter("hby"));
String spc = Util.checkString(req.getParameter("spc"));
String relg = Util.checkString(req.getParameter("relg"));
String drink = Util.checkString(req.getParameter("drink"));
String smok = Util.checkString(req.getParameter("smok"));
String idea1 = Util.checkString(req.getParameter("idea1"));
String idea2 = Util.checkString(req.getParameter("idea2"));
String idea3 = Util.checkString(req.getParameter("idea3"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String ideamakepersnm = Util.checkString(req.getParameter("ideamakepersnm"));
String sb_seq = Util.checkString(req.getParameter("sb_seq"));
String sb_flnm = Util.checkString(req.getParameter("sb_flnm"));
String sb_rshp = Util.checkString(req.getParameter("sb_rshp"));
String sb_bidt = Util.checkString(req.getParameter("sb_bidt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String lastschir = Util.Uni2Ksc(Util.checkString(req.getParameter("lastschir")));
String nativ = Util.Uni2Ksc(Util.checkString(req.getParameter("nativ")));
String hby = Util.Uni2Ksc(Util.checkString(req.getParameter("hby")));
String spc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc")));
String relg = Util.Uni2Ksc(Util.checkString(req.getParameter("relg")));
String drink = Util.Uni2Ksc(Util.checkString(req.getParameter("drink")));
String smok = Util.Uni2Ksc(Util.checkString(req.getParameter("smok")));
String idea1 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea1")));
String idea2 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea2")));
String idea3 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea3")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String ideamakepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("ideamakepersnm")));
String sb_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_seq")));
String sb_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_flnm")));
String sb_rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_rshp")));
String sb_bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_bidt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPrn(prn);
dm.setLastschir(lastschir);
dm.setNativ(nativ);
dm.setHby(hby);
dm.setSpc(spc);
dm.setRelg(relg);
dm.setDrink(drink);
dm.setSmok(smok);
dm.setIdea1(idea1);
dm.setIdea2(idea2);
dm.setIdea3(idea3);
dm.setIncmgpers(incmgpers);
dm.setIdeamakepersnm(ideamakepersnm);
dm.setSb_seq(sb_seq);
dm.setSb_flnm(sb_flnm);
dm.setSb_rshp(sb_rshp);
dm.setSb_bidt(sb_bidt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 16 11:27:18 KST 2004 */