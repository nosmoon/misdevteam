/***************************************************************************************************
* 파일명 : PS_I_BNSBK.java
* 기능 :   코드관리-보너스북내역 등록처리
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
 * 코드관리-보너스북내역 등록처리
 *
 */

public class PS_I_BNSBKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bns_booknm;
	public String bgnvdtydt;
	public String endvdtydt;
	public String remk;
	public String vipcont;
	public String medicd;
	public String incmgpers;

	public PS_I_BNSBKDM(){}
	public PS_I_BNSBKDM(String cmpycd, String bns_booknm, String bgnvdtydt, String endvdtydt, String remk, String vipcont, String medicd, String incmgpers){
		this.cmpycd = cmpycd;
		this.bns_booknm = bns_booknm;
		this.bgnvdtydt = bgnvdtydt;
		this.endvdtydt = endvdtydt;
		this.remk = remk;
		this.vipcont = vipcont;
		this.medicd = medicd;
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
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

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_BNSBK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_BNSBKDM dm = (PS_I_BNSBKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bns_booknm);
		cstmt.setString(5, dm.bgnvdtydt);
		cstmt.setString(6, dm.endvdtydt);
		cstmt.setString(7, dm.remk);
		cstmt.setString(8, dm.vipcont);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_I_BNSBKDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String bns_booknm = Util.checkString(req.getParameter("bns_booknm"));
String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
String remk = Util.checkString(req.getParameter("remk"));
String vipcont = Util.checkString(req.getParameter("vipcont"));
String medicd = Util.checkString(req.getParameter("medicd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
String bgnvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnvdtydt")));
String endvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("endvdtydt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBns_booknm(bns_booknm);
dm.setBgnvdtydt(bgnvdtydt);
dm.setEndvdtydt(endvdtydt);
dm.setRemk(remk);
dm.setVipcont(vipcont);
dm.setMedicd(medicd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 19:12:13 KST 2007 */