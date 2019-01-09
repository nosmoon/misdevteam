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


public class SS_SLS_EXTN_5040_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_yymm;
	public String to_yymm;
	public String dncomp;
	public String adv_nm;
	public String adv_cmpycd;
	public String adv_officd;
	public String adv_deptcd;

	public SS_SLS_EXTN_5040_LDM(){}
	public SS_SLS_EXTN_5040_LDM(String fr_yymm, String to_yymm, String dncomp, String adv_nm, String adv_cmpycd, String adv_officd, String adv_deptcd){
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.dncomp = dncomp;
		this.adv_nm = adv_nm;
		this.adv_cmpycd = adv_cmpycd;
		this.adv_officd = adv_officd;
		this.adv_deptcd = adv_deptcd;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setAdv_nm(String adv_nm){
		this.adv_nm = adv_nm;
	}

	public void setAdv_cmpycd(String adv_cmpycd){
		this.adv_cmpycd = adv_cmpycd;
	}

	public void setAdv_officd(String adv_officd){
		this.adv_officd = adv_officd;
	}

	public void setAdv_deptcd(String adv_deptcd){
		this.adv_deptcd = adv_deptcd;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getAdv_nm(){
		return this.adv_nm;
	}

	public String getAdv_cmpycd(){
		return this.adv_cmpycd;
	}

	public String getAdv_officd(){
		return this.adv_officd;
	}

	public String getAdv_deptcd(){
		return this.adv_deptcd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5040_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5040_LDM dm = (SS_SLS_EXTN_5040_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_yymm);
		cstmt.setString(4, dm.to_yymm);
		cstmt.setString(5, dm.dncomp);
		cstmt.setString(6, dm.adv_nm);
		cstmt.setString(7, dm.adv_cmpycd);
		cstmt.setString(8, dm.adv_officd);
		cstmt.setString(9, dm.adv_deptcd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5040_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("dncomp = [" + getDncomp() + "]");
		System.out.println("adv_nm = [" + getAdv_nm() + "]");
		System.out.println("adv_cmpycd = [" + getAdv_cmpycd() + "]");
		System.out.println("adv_officd = [" + getAdv_officd() + "]");
		System.out.println("adv_deptcd = [" + getAdv_deptcd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String dncomp = req.getParameter("dncomp");
if( dncomp == null){
	System.out.println(this.toString+" : dncomp is null" );
}else{
	System.out.println(this.toString+" : dncomp is "+dncomp );
}
String adv_nm = req.getParameter("adv_nm");
if( adv_nm == null){
	System.out.println(this.toString+" : adv_nm is null" );
}else{
	System.out.println(this.toString+" : adv_nm is "+adv_nm );
}
String adv_cmpycd = req.getParameter("adv_cmpycd");
if( adv_cmpycd == null){
	System.out.println(this.toString+" : adv_cmpycd is null" );
}else{
	System.out.println(this.toString+" : adv_cmpycd is "+adv_cmpycd );
}
String adv_officd = req.getParameter("adv_officd");
if( adv_officd == null){
	System.out.println(this.toString+" : adv_officd is null" );
}else{
	System.out.println(this.toString+" : adv_officd is "+adv_officd );
}
String adv_deptcd = req.getParameter("adv_deptcd");
if( adv_deptcd == null){
	System.out.println(this.toString+" : adv_deptcd is null" );
}else{
	System.out.println(this.toString+" : adv_deptcd is "+adv_deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String dncomp = Util.checkString(req.getParameter("dncomp"));
String adv_nm = Util.checkString(req.getParameter("adv_nm"));
String adv_cmpycd = Util.checkString(req.getParameter("adv_cmpycd"));
String adv_officd = Util.checkString(req.getParameter("adv_officd"));
String adv_deptcd = Util.checkString(req.getParameter("adv_deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
String adv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_nm")));
String adv_cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_cmpycd")));
String adv_officd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_officd")));
String adv_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setDncomp(dncomp);
dm.setAdv_nm(adv_nm);
dm.setAdv_cmpycd(adv_cmpycd);
dm.setAdv_officd(adv_officd);
dm.setAdv_deptcd(adv_deptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 08 14:10:00 KST 2016 */