/***************************************************************************************************
* 파일명 : SS_A_RCPCMSBSDM.java
* 기능 : 지국지원-빌링-수납수수료-등록,수정,상세
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
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
 * 지국지원-빌링-수납수수료-등록,수정,상세
 *
 */


public class SS_A_RCPCMSBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String comscd;
	public String comsnm;
	public String clamtmthdcd;
	public String calcbasiclsf;
	public String coms;
	public String comsrate;
	public String remk;
	public String etc1;
	public String etc2;
	public String etc3;

	public SS_A_RCPCMSBSDM(){}
	public SS_A_RCPCMSBSDM(String incmgpers, String accflag, String comscd, String comsnm, String clamtmthdcd, String calcbasiclsf, String coms, String comsrate, String remk, String etc1, String etc2, String etc3){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.comscd = comscd;
		this.comsnm = comsnm;
		this.clamtmthdcd = clamtmthdcd;
		this.calcbasiclsf = calcbasiclsf;
		this.coms = coms;
		this.comsrate = comsrate;
		this.remk = remk;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setComscd(String comscd){
		this.comscd = comscd;
	}

	public void setComsnm(String comsnm){
		this.comsnm = comsnm;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setCalcbasiclsf(String calcbasiclsf){
		this.calcbasiclsf = calcbasiclsf;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setComsrate(String comsrate){
		this.comsrate = comsrate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getComscd(){
		return this.comscd;
	}

	public String getComsnm(){
		return this.comsnm;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getCalcbasiclsf(){
		return this.calcbasiclsf;
	}

	public String getComs(){
		return this.coms;
	}

	public String getComsrate(){
		return this.comsrate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_RCPCMSBS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_RCPCMSBSDM dm = (SS_A_RCPCMSBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.comscd);
		cstmt.setString(6, dm.comsnm);
		cstmt.setString(7, dm.clamtmthdcd);
		cstmt.setString(8, dm.calcbasiclsf);
		cstmt.setString(9, dm.coms);
		cstmt.setString(10, dm.comsrate);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.etc1);
		cstmt.setString(13, dm.etc2);
		cstmt.setString(14, dm.etc3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_RCPCMSBSDataSet();
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
String comscd = req.getParameter("comscd");
if( comscd == null){
	System.out.println(this.toString+" : comscd is null" );
}else{
	System.out.println(this.toString+" : comscd is "+comscd );
}
String comsnm = req.getParameter("comsnm");
if( comsnm == null){
	System.out.println(this.toString+" : comsnm is null" );
}else{
	System.out.println(this.toString+" : comsnm is "+comsnm );
}
String clamtmthdcd = req.getParameter("clamtmthdcd");
if( clamtmthdcd == null){
	System.out.println(this.toString+" : clamtmthdcd is null" );
}else{
	System.out.println(this.toString+" : clamtmthdcd is "+clamtmthdcd );
}
String calcbasiclsf = req.getParameter("calcbasiclsf");
if( calcbasiclsf == null){
	System.out.println(this.toString+" : calcbasiclsf is null" );
}else{
	System.out.println(this.toString+" : calcbasiclsf is "+calcbasiclsf );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String comsrate = req.getParameter("comsrate");
if( comsrate == null){
	System.out.println(this.toString+" : comsrate is null" );
}else{
	System.out.println(this.toString+" : comsrate is "+comsrate );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String comscd = Util.checkString(req.getParameter("comscd"));
String comsnm = Util.checkString(req.getParameter("comsnm"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String calcbasiclsf = Util.checkString(req.getParameter("calcbasiclsf"));
String coms = Util.checkString(req.getParameter("coms"));
String comsrate = Util.checkString(req.getParameter("comsrate"));
String remk = Util.checkString(req.getParameter("remk"));
String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String comscd = Util.Uni2Ksc(Util.checkString(req.getParameter("comscd")));
String comsnm = Util.Uni2Ksc(Util.checkString(req.getParameter("comsnm")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String calcbasiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("calcbasiclsf")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String comsrate = Util.Uni2Ksc(Util.checkString(req.getParameter("comsrate")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setComscd(comscd);
dm.setComsnm(comsnm);
dm.setClamtmthdcd(clamtmthdcd);
dm.setCalcbasiclsf(calcbasiclsf);
dm.setComs(coms);
dm.setComsrate(comsrate);
dm.setRemk(remk);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 21:09:10 KST 2004 */