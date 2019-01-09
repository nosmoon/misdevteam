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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String appr_gubun;
	public String extncdusage;
	public String resitypecd;

	public SS_L_EXCDDM(){}
	public SS_L_EXCDDM(String deptcd, String partcd, String areacd, String bocd, String appr_gubun, String extncdusage, String resitypecd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.appr_gubun = appr_gubun;
		this.extncdusage = extncdusage;
		this.resitypecd = resitypecd;
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

	public void setAppr_gubun(String appr_gubun){
		this.appr_gubun = appr_gubun;
	}

	public void setExtncdusage(String extncdusage){
		this.extncdusage = extncdusage;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
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

	public String getAppr_gubun(){
		return this.appr_gubun;
	}

	public String getExtncdusage(){
		return this.extncdusage;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EXCD(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXCDDM dm = (SS_L_EXCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.appr_gubun);
		cstmt.setString(8, dm.extncdusage);
		cstmt.setString(9, dm.resitypecd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXCDDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("appr_gubun = [" + getAppr_gubun() + "]");
		System.out.println("extncdusage = [" + getExtncdusage() + "]");
		System.out.println("resitypecd = [" + getResitypecd() + "]");
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
String appr_gubun = req.getParameter("appr_gubun");
if( appr_gubun == null){
	System.out.println(this.toString+" : appr_gubun is null" );
}else{
	System.out.println(this.toString+" : appr_gubun is "+appr_gubun );
}
String extncdusage = req.getParameter("extncdusage");
if( extncdusage == null){
	System.out.println(this.toString+" : extncdusage is null" );
}else{
	System.out.println(this.toString+" : extncdusage is "+extncdusage );
}
String resitypecd = req.getParameter("resitypecd");
if( resitypecd == null){
	System.out.println(this.toString+" : resitypecd is null" );
}else{
	System.out.println(this.toString+" : resitypecd is "+resitypecd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String appr_gubun = Util.checkString(req.getParameter("appr_gubun"));
String extncdusage = Util.checkString(req.getParameter("extncdusage"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String appr_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("appr_gubun")));
String extncdusage = Util.Uni2Ksc(Util.checkString(req.getParameter("extncdusage")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setAppr_gubun(appr_gubun);
dm.setExtncdusage(extncdusage);
dm.setResitypecd(resitypecd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 13:27:20 KST 2015 */