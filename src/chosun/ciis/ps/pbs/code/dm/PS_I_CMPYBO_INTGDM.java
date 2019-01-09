/***************************************************************************************************
* 파일명 : SP_PS_I_CMPYBO_INTG.java
* 코드-지사별 통합코드관리 저장화면 
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드-지사별 통합코드관리 저장화면           
 *
 */

  

public class PS_I_CMPYBO_INTGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String sendintgyn;
	public String clamtintgyn;
	public String alonintgyn;
	public String intgaftboalonpaypoint;
	public String intgafthdqtalonpaypoint;

	public PS_I_CMPYBO_INTGDM(){}
	public PS_I_CMPYBO_INTGDM(String cmpycd, String incmgpers, String bocd, String sendintgyn, String clamtintgyn, String alonintgyn, String intgaftboalonpaypoint, String intgafthdqtalonpaypoint){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.sendintgyn = sendintgyn;
		this.clamtintgyn = clamtintgyn;
		this.alonintgyn = alonintgyn;
		this.intgaftboalonpaypoint = intgaftboalonpaypoint;
		this.intgafthdqtalonpaypoint = intgafthdqtalonpaypoint;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSendintgyn(String sendintgyn){
		this.sendintgyn = sendintgyn;
	}

	public void setClamtintgyn(String clamtintgyn){
		this.clamtintgyn = clamtintgyn;
	}

	public void setAlonintgyn(String alonintgyn){
		this.alonintgyn = alonintgyn;
	}

	public void setIntgaftboalonpaypoint(String intgaftboalonpaypoint){
		this.intgaftboalonpaypoint = intgaftboalonpaypoint;
	}

	public void setIntgafthdqtalonpaypoint(String intgafthdqtalonpaypoint){
		this.intgafthdqtalonpaypoint = intgafthdqtalonpaypoint;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSendintgyn(){
		return this.sendintgyn;
	}

	public String getClamtintgyn(){
		return this.clamtintgyn;
	}

	public String getAlonintgyn(){
		return this.alonintgyn;
	}

	public String getIntgaftboalonpaypoint(){
		return this.intgaftboalonpaypoint;
	}

	public String getIntgafthdqtalonpaypoint(){
		return this.intgafthdqtalonpaypoint;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_CMPYBO_INTG( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_CMPYBO_INTGDM dm = (PS_I_CMPYBO_INTGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.sendintgyn);
		cstmt.setString(7, dm.clamtintgyn);
		cstmt.setString(8, dm.alonintgyn);
		cstmt.setString(9, dm.intgaftboalonpaypoint);
		cstmt.setString(10, dm.intgafthdqtalonpaypoint);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_I_CMPYBO_INTGDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String sendintgyn = req.getParameter("sendintgyn");
if( sendintgyn == null){
	System.out.println(this.toString+" : sendintgyn is null" );
}else{
	System.out.println(this.toString+" : sendintgyn is "+sendintgyn );
}
String clamtintgyn = req.getParameter("clamtintgyn");
if( clamtintgyn == null){
	System.out.println(this.toString+" : clamtintgyn is null" );
}else{
	System.out.println(this.toString+" : clamtintgyn is "+clamtintgyn );
}
String alonintgyn = req.getParameter("alonintgyn");
if( alonintgyn == null){
	System.out.println(this.toString+" : alonintgyn is null" );
}else{
	System.out.println(this.toString+" : alonintgyn is "+alonintgyn );
}
String intgaftboalonpaypoint = req.getParameter("intgaftboalonpaypoint");
if( intgaftboalonpaypoint == null){
	System.out.println(this.toString+" : intgaftboalonpaypoint is null" );
}else{
	System.out.println(this.toString+" : intgaftboalonpaypoint is "+intgaftboalonpaypoint );
}
String intgafthdqtalonpaypoint = req.getParameter("intgafthdqtalonpaypoint");
if( intgafthdqtalonpaypoint == null){
	System.out.println(this.toString+" : intgafthdqtalonpaypoint is null" );
}else{
	System.out.println(this.toString+" : intgafthdqtalonpaypoint is "+intgafthdqtalonpaypoint );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String sendintgyn = Util.checkString(req.getParameter("sendintgyn"));
String clamtintgyn = Util.checkString(req.getParameter("clamtintgyn"));
String alonintgyn = Util.checkString(req.getParameter("alonintgyn"));
String intgaftboalonpaypoint = Util.checkString(req.getParameter("intgaftboalonpaypoint"));
String intgafthdqtalonpaypoint = Util.checkString(req.getParameter("intgafthdqtalonpaypoint"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String sendintgyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sendintgyn")));
String clamtintgyn = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtintgyn")));
String alonintgyn = Util.Uni2Ksc(Util.checkString(req.getParameter("alonintgyn")));
String intgaftboalonpaypoint = Util.Uni2Ksc(Util.checkString(req.getParameter("intgaftboalonpaypoint")));
String intgafthdqtalonpaypoint = Util.Uni2Ksc(Util.checkString(req.getParameter("intgafthdqtalonpaypoint")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setSendintgyn(sendintgyn);
dm.setClamtintgyn(clamtintgyn);
dm.setAlonintgyn(alonintgyn);
dm.setIntgaftboalonpaypoint(intgaftboalonpaypoint);
dm.setIntgafthdqtalonpaypoint(intgafthdqtalonpaypoint);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 16 09:33:41 KST 2004 */