/***************************************************************************************************
* 파일명 : PS_U_BNSBK.java
* 기능 :   코드관리-보너스북내역 수정처리
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드관리-보너스북내역 수정처리
 *
 */

public class PS_U_BNSBKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String bns_bookcd;
	public String bns_booknm;
	public String bgnvdtydt;
	public String endvdtydt;
	public String remk;
	public String vipcont;
	public String incmgpers;

	public PS_U_BNSBKDM(){}
	public PS_U_BNSBKDM(String cmpycd, String medicd, String bns_bookcd, String bns_booknm, String bgnvdtydt, String endvdtydt, String remk, String vipcont, String incmgpers){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.bns_bookcd = bns_bookcd;
		this.bns_booknm = bns_booknm;
		this.bgnvdtydt = bgnvdtydt;
		this.endvdtydt = endvdtydt;
		this.remk = remk;
		this.vipcont = vipcont;
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setBgnvdtydt(String bgnvdtydt){
		this.bgnvdtydt = bgnvdtydt;
	}

	public void setEndvdtydt(String endvdtydt){
		this.endvdtydt = endvdtydt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setVipcont(String vipcont){
		this.vipcont = vipcont;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getBgnvdtydt(){
		return this.bgnvdtydt;
	}

	public String getEndvdtydt(){
		return this.endvdtydt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getVipcont(){
		return this.vipcont;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_BNSBK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_BNSBKDM dm = (PS_U_BNSBKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.bns_bookcd);
		cstmt.setString(6, dm.bns_booknm);
		cstmt.setString(7, dm.bgnvdtydt);
		cstmt.setString(8, dm.endvdtydt);
		cstmt.setString(9, dm.remk);
		cstmt.setString(10, dm.vipcont);
		cstmt.setString(11, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_U_BNSBKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String bns_bookcd = req.getParameter("bns_bookcd");
if( bns_bookcd == null){
	System.out.println(this.toString+" : bns_bookcd is null" );
}else{
	System.out.println(this.toString+" : bns_bookcd is "+bns_bookcd );
}
String bns_booknm = req.getParameter("bns_booknm");
if( bns_booknm == null){
	System.out.println(this.toString+" : bns_booknm is null" );
}else{
	System.out.println(this.toString+" : bns_booknm is "+bns_booknm );
}
String bgnvdtydt = req.getParameter("bgnvdtydt");
if( bgnvdtydt == null){
	System.out.println(this.toString+" : bgnvdtydt is null" );
}else{
	System.out.println(this.toString+" : bgnvdtydt is "+bgnvdtydt );
}
String endvdtydt = req.getParameter("endvdtydt");
if( endvdtydt == null){
	System.out.println(this.toString+" : endvdtydt is null" );
}else{
	System.out.println(this.toString+" : endvdtydt is "+endvdtydt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String vipcont = req.getParameter("vipcont");
if( vipcont == null){
	System.out.println(this.toString+" : vipcont is null" );
}else{
	System.out.println(this.toString+" : vipcont is "+vipcont );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));
String bns_booknm = Util.checkString(req.getParameter("bns_booknm"));
String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
String remk = Util.checkString(req.getParameter("remk"));
String vipcont = Util.checkString(req.getParameter("vipcont"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String bns_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_bookcd")));
String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
String bgnvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnvdtydt")));
String endvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("endvdtydt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setBns_bookcd(bns_bookcd);
dm.setBns_booknm(bns_booknm);
dm.setBgnvdtydt(bgnvdtydt);
dm.setEndvdtydt(endvdtydt);
dm.setRemk(remk);
dm.setVipcont(vipcont);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 19:16:28 KST 2007 */