/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-지국월마감-마감/마감취소
* 작성일자 : 2005-02-02
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-지국월마감-마감/마감취소
 */


public class SS_A_BOCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String bocd;
	public String yymm;
	public String closyn;
	public String closfrdt;
	public String clostodt;
	public String clos_dt;
	public String remk;
	public String ext1;
	public String ext2;
	public String ext3;

	public SS_A_BOCLOSDM(){}
	public SS_A_BOCLOSDM(String incmgpers, String accflag, String bocd, String yymm, String closyn, String closfrdt, String clostodt, String clos_dt, String remk, String ext1, String ext2, String ext3){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.bocd = bocd;
		this.yymm = yymm;
		this.closyn = closyn;
		this.closfrdt = closfrdt;
		this.clostodt = clostodt;
		this.clos_dt = clos_dt;
		this.remk = remk;
		this.ext1 = ext1;
		this.ext2 = ext2;
		this.ext3 = ext3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosfrdt(String closfrdt){
		this.closfrdt = closfrdt;
	}

	public void setClostodt(String clostodt){
		this.clostodt = clostodt;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setExt1(String ext1){
		this.ext1 = ext1;
	}

	public void setExt2(String ext2){
		this.ext2 = ext2;
	}

	public void setExt3(String ext3){
		this.ext3 = ext3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosfrdt(){
		return this.closfrdt;
	}

	public String getClostodt(){
		return this.clostodt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getExt1(){
		return this.ext1;
	}

	public String getExt2(){
		return this.ext2;
	}

	public String getExt3(){
		return this.ext3;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BOCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BOCLOSDM dm = (SS_A_BOCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.yymm);
		cstmt.setString(7, dm.closyn);
		cstmt.setString(8, dm.closfrdt);
		cstmt.setString(9, dm.clostodt);
		cstmt.setString(10, dm.clos_dt);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.ext1);
		cstmt.setString(13, dm.ext2);
		cstmt.setString(14, dm.ext3);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_BOCLOSDataSet();
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
}
String closfrdt = req.getParameter("closfrdt");
if( closfrdt == null){
	System.out.println(this.toString+" : closfrdt is null" );
}else{
	System.out.println(this.toString+" : closfrdt is "+closfrdt );
}
String clostodt = req.getParameter("clostodt");
if( clostodt == null){
	System.out.println(this.toString+" : clostodt is null" );
}else{
	System.out.println(this.toString+" : clostodt is "+clostodt );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String ext1 = req.getParameter("ext1");
if( ext1 == null){
	System.out.println(this.toString+" : ext1 is null" );
}else{
	System.out.println(this.toString+" : ext1 is "+ext1 );
}
String ext2 = req.getParameter("ext2");
if( ext2 == null){
	System.out.println(this.toString+" : ext2 is null" );
}else{
	System.out.println(this.toString+" : ext2 is "+ext2 );
}
String ext3 = req.getParameter("ext3");
if( ext3 == null){
	System.out.println(this.toString+" : ext3 is null" );
}else{
	System.out.println(this.toString+" : ext3 is "+ext3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String closyn = Util.checkString(req.getParameter("closyn"));
String closfrdt = Util.checkString(req.getParameter("closfrdt"));
String clostodt = Util.checkString(req.getParameter("clostodt"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String ext1 = Util.checkString(req.getParameter("ext1"));
String ext2 = Util.checkString(req.getParameter("ext2"));
String ext3 = Util.checkString(req.getParameter("ext3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
String closfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("closfrdt")));
String clostodt = Util.Uni2Ksc(Util.checkString(req.getParameter("clostodt")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String ext1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext1")));
String ext2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext2")));
String ext3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setYymm(yymm);
dm.setClosyn(closyn);
dm.setClosfrdt(closfrdt);
dm.setClostodt(clostodt);
dm.setClos_dt(clos_dt);
dm.setRemk(remk);
dm.setExt1(ext1);
dm.setExt2(ext2);
dm.setExt3(ext3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 02 14:48:47 KST 2005 */