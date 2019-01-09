/***************************************************************************************************
* 파일명 : .java
* 기능 : 아파트투입률 등록
* 작성일자 : 2009-08-14
* 작성자 : 권정윤
***************************************************************************************************/

 
package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 아파트투입률 등록
 */

public class SS_U_APTDONGUNITTHRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String addrcd;
	public String dongno;
	public String bocd;
	public String invsgdt;
	public String chothrwqty;
	public String jungthrwqty;
	public String dongthrwqty;
	public String etcthrwqty;

	public SS_U_APTDONGUNITTHRWDM(){}
	public SS_U_APTDONGUNITTHRWDM(String uid, String addrcd, String dongno, String bocd, String invsgdt, String chothrwqty, String jungthrwqty, String dongthrwqty, String etcthrwqty){
		this.uid = uid;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.bocd = bocd;
		this.invsgdt = invsgdt;
		this.chothrwqty = chothrwqty;
		this.jungthrwqty = jungthrwqty;
		this.dongthrwqty = dongthrwqty;
		this.etcthrwqty = etcthrwqty;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setChothrwqty(String chothrwqty){
		this.chothrwqty = chothrwqty;
	}

	public void setJungthrwqty(String jungthrwqty){
		this.jungthrwqty = jungthrwqty;
	}

	public void setDongthrwqty(String dongthrwqty){
		this.dongthrwqty = dongthrwqty;
	}

	public void setEtcthrwqty(String etcthrwqty){
		this.etcthrwqty = etcthrwqty;
	}

	public String getUid(){
		return this.uid;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getChothrwqty(){
		return this.chothrwqty;
	}

	public String getJungthrwqty(){
		return this.jungthrwqty;
	}

	public String getDongthrwqty(){
		return this.dongthrwqty;
	}

	public String getEtcthrwqty(){
		return this.etcthrwqty;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_APTDONGUNITTHRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_APTDONGUNITTHRWDM dm = (SS_U_APTDONGUNITTHRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.addrcd);
		cstmt.setString(5, dm.dongno);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.invsgdt);
		cstmt.setString(8, dm.chothrwqty);
		cstmt.setString(9, dm.jungthrwqty);
		cstmt.setString(10, dm.dongthrwqty);
		cstmt.setString(11, dm.etcthrwqty);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_U_APTDONGUNITTHRWDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String chothrwqty = req.getParameter("chothrwqty");
if( chothrwqty == null){
	System.out.println(this.toString+" : chothrwqty is null" );
}else{
	System.out.println(this.toString+" : chothrwqty is "+chothrwqty );
}
String jungthrwqty = req.getParameter("jungthrwqty");
if( jungthrwqty == null){
	System.out.println(this.toString+" : jungthrwqty is null" );
}else{
	System.out.println(this.toString+" : jungthrwqty is "+jungthrwqty );
}
String dongthrwqty = req.getParameter("dongthrwqty");
if( dongthrwqty == null){
	System.out.println(this.toString+" : dongthrwqty is null" );
}else{
	System.out.println(this.toString+" : dongthrwqty is "+dongthrwqty );
}
String etcthrwqty = req.getParameter("etcthrwqty");
if( etcthrwqty == null){
	System.out.println(this.toString+" : etcthrwqty is null" );
}else{
	System.out.println(this.toString+" : etcthrwqty is "+etcthrwqty );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String bocd = Util.checkString(req.getParameter("bocd"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String chothrwqty = Util.checkString(req.getParameter("chothrwqty"));
String jungthrwqty = Util.checkString(req.getParameter("jungthrwqty"));
String dongthrwqty = Util.checkString(req.getParameter("dongthrwqty"));
String etcthrwqty = Util.checkString(req.getParameter("etcthrwqty"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String chothrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("chothrwqty")));
String jungthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("jungthrwqty")));
String dongthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("dongthrwqty")));
String etcthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("etcthrwqty")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setBocd(bocd);
dm.setInvsgdt(invsgdt);
dm.setChothrwqty(chothrwqty);
dm.setJungthrwqty(jungthrwqty);
dm.setDongthrwqty(dongthrwqty);
dm.setEtcthrwqty(etcthrwqty);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 15:01:26 KST 2009 */