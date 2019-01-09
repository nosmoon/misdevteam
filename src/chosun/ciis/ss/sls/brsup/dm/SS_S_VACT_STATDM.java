/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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
 * 
 */


public class SS_S_VACT_STATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fr_dt;
	public String to_dt;
	public String medicd;
	public String bankcd;
	public String d_bocd;
	public String d_fr_dt;
	public String d_to_dt;
	public String d_bankcd;

	public SS_S_VACT_STATDM(){}
	public SS_S_VACT_STATDM(String deptcd, String partcd, String areacd, String bocd, String fr_dt, String to_dt, String medicd, String bankcd, String d_bocd, String d_fr_dt, String d_to_dt, String d_bankcd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.medicd = medicd;
		this.bankcd = bankcd;
		this.d_bocd = d_bocd;
		this.d_fr_dt = d_fr_dt;
		this.d_to_dt = d_to_dt;
		this.d_bankcd = d_bankcd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setD_bocd(String d_bocd){
		this.d_bocd = d_bocd;
	}

	public void setD_fr_dt(String d_fr_dt){
		this.d_fr_dt = d_fr_dt;
	}

	public void setD_to_dt(String d_to_dt){
		this.d_to_dt = d_to_dt;
	}

	public void setD_bankcd(String d_bankcd){
		this.d_bankcd = d_bankcd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getD_bocd(){
		return this.d_bocd;
	}

	public String getD_fr_dt(){
		return this.d_fr_dt;
	}

	public String getD_to_dt(){
		return this.d_to_dt;
	}

	public String getD_bankcd(){
		return this.d_bankcd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_S_VACT_STAT(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_VACT_STATDM dm = (SS_S_VACT_STATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fr_dt);
		cstmt.setString(8, dm.to_dt);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.bankcd);
		cstmt.setString(11, dm.d_bocd);
		cstmt.setString(12, dm.d_fr_dt);
		cstmt.setString(13, dm.d_to_dt);
		cstmt.setString(14, dm.d_bankcd);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_VACT_STATDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("bankcd = [" + getBankcd() + "]");
		System.out.println("d_bocd = [" + getD_bocd() + "]");
		System.out.println("d_fr_dt = [" + getD_fr_dt() + "]");
		System.out.println("d_to_dt = [" + getD_to_dt() + "]");
		System.out.println("d_bankcd = [" + getD_bankcd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String bankcd = req.getParameter("bankcd");
if( bankcd == null){
	System.out.println(this.toString+" : bankcd is null" );
}else{
	System.out.println(this.toString+" : bankcd is "+bankcd );
}
String d_bocd = req.getParameter("d_bocd");
if( d_bocd == null){
	System.out.println(this.toString+" : d_bocd is null" );
}else{
	System.out.println(this.toString+" : d_bocd is "+d_bocd );
}
String d_fr_dt = req.getParameter("d_fr_dt");
if( d_fr_dt == null){
	System.out.println(this.toString+" : d_fr_dt is null" );
}else{
	System.out.println(this.toString+" : d_fr_dt is "+d_fr_dt );
}
String d_to_dt = req.getParameter("d_to_dt");
if( d_to_dt == null){
	System.out.println(this.toString+" : d_to_dt is null" );
}else{
	System.out.println(this.toString+" : d_to_dt is "+d_to_dt );
}
String d_bankcd = req.getParameter("d_bankcd");
if( d_bankcd == null){
	System.out.println(this.toString+" : d_bankcd is null" );
}else{
	System.out.println(this.toString+" : d_bankcd is "+d_bankcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String d_bocd = Util.checkString(req.getParameter("d_bocd"));
String d_fr_dt = Util.checkString(req.getParameter("d_fr_dt"));
String d_to_dt = Util.checkString(req.getParameter("d_to_dt"));
String d_bankcd = Util.checkString(req.getParameter("d_bankcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String d_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("d_bocd")));
String d_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_fr_dt")));
String d_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_to_dt")));
String d_bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("d_bankcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setMedicd(medicd);
dm.setBankcd(bankcd);
dm.setD_bocd(d_bocd);
dm.setD_fr_dt(d_fr_dt);
dm.setD_to_dt(d_to_dt);
dm.setD_bankcd(d_bankcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 01 18:33:42 KST 2015 */