/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감-본지신청(영업)-저장
* 작성일자 : 2009-07-23
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감-본지신청(영업)-저장
 */

public class SS_U_QTYAPLC_MAIN_NWSPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String aplcdt;
	public String issudt;
	public String chrgupdicdcqty;
	public String chrgcnfmyn;
	public String preclosyn;
	public String chkyn;
	public String incmgpers;
	public String documentid;
	public String remk;

	public SS_U_QTYAPLC_MAIN_NWSPDM(){}
	public SS_U_QTYAPLC_MAIN_NWSPDM(String bocd, String aplcdt, String issudt, String chrgupdicdcqty, String chrgcnfmyn, String preclosyn, String chkyn, String incmgpers, String documentid, String remk){
		this.bocd = bocd;
		this.aplcdt = aplcdt;
		this.issudt = issudt;
		this.chrgupdicdcqty = chrgupdicdcqty;
		this.chrgcnfmyn = chrgcnfmyn;
		this.preclosyn = preclosyn;
		this.chkyn = chkyn;
		this.incmgpers = incmgpers;
		this.documentid = documentid;
		this.remk = remk;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setChrgupdicdcqty(String chrgupdicdcqty){
		this.chrgupdicdcqty = chrgupdicdcqty;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public void setPreclosyn(String preclosyn){
		this.preclosyn = preclosyn;
	}

	public void setChkyn(String chkyn){
		this.chkyn = chkyn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setDocumentid(String documentid){
		this.documentid = documentid;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getChrgupdicdcqty(){
		return this.chrgupdicdcqty;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}

	public String getPreclosyn(){
		return this.preclosyn;
	}

	public String getChkyn(){
		return this.chkyn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getDocumentid(){
		return this.documentid;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_QTYAPLC_MAIN_NWSP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_QTYAPLC_MAIN_NWSPDM dm = (SS_U_QTYAPLC_MAIN_NWSPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.aplcdt);
		cstmt.setString(5, dm.issudt);
		cstmt.setString(6, dm.chrgupdicdcqty);
		cstmt.setString(7, dm.chrgcnfmyn);
		cstmt.setString(8, dm.preclosyn);
		cstmt.setString(9, dm.chkyn);
		cstmt.setString(10, dm.incmgpers);
		cstmt.setString(11, dm.documentid);
		cstmt.setString(12, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_U_QTYAPLC_MAIN_NWSPDataSet();
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
String issudt = req.getParameter("issudt");
if( issudt == null){
	System.out.println(this.toString+" : issudt is null" );
}else{
	System.out.println(this.toString+" : issudt is "+issudt );
}
String chrgupdicdcqty = req.getParameter("chrgupdicdcqty");
if( chrgupdicdcqty == null){
	System.out.println(this.toString+" : chrgupdicdcqty is null" );
}else{
	System.out.println(this.toString+" : chrgupdicdcqty is "+chrgupdicdcqty );
}
String chrgcnfmyn = req.getParameter("chrgcnfmyn");
if( chrgcnfmyn == null){
	System.out.println(this.toString+" : chrgcnfmyn is null" );
}else{
	System.out.println(this.toString+" : chrgcnfmyn is "+chrgcnfmyn );
}
String preclosyn = req.getParameter("preclosyn");
if( preclosyn == null){
	System.out.println(this.toString+" : preclosyn is null" );
}else{
	System.out.println(this.toString+" : preclosyn is "+preclosyn );
}
String chkyn = req.getParameter("chkyn");
if( chkyn == null){
	System.out.println(this.toString+" : chkyn is null" );
}else{
	System.out.println(this.toString+" : chkyn is "+chkyn );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String documentid = req.getParameter("documentid");
if( documentid == null){
	System.out.println(this.toString+" : documentid is null" );
}else{
	System.out.println(this.toString+" : documentid is "+documentid );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String issudt = Util.checkString(req.getParameter("issudt"));
String chrgupdicdcqty = Util.checkString(req.getParameter("chrgupdicdcqty"));
String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));
String preclosyn = Util.checkString(req.getParameter("preclosyn"));
String chkyn = Util.checkString(req.getParameter("chkyn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String documentid = Util.checkString(req.getParameter("documentid"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String chrgupdicdcqty = Util.Uni2Ksc(Util.checkString(req.getParameter("chrgupdicdcqty")));
String chrgcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("chrgcnfmyn")));
String preclosyn = Util.Uni2Ksc(Util.checkString(req.getParameter("preclosyn")));
String chkyn = Util.Uni2Ksc(Util.checkString(req.getParameter("chkyn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String documentid = Util.Uni2Ksc(Util.checkString(req.getParameter("documentid")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setIssudt(issudt);
dm.setChrgupdicdcqty(chrgupdicdcqty);
dm.setChrgcnfmyn(chrgcnfmyn);
dm.setPreclosyn(preclosyn);
dm.setChkyn(chkyn);
dm.setIncmgpers(incmgpers);
dm.setDocumentid(documentid);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 14:32:48 KST 2009 */