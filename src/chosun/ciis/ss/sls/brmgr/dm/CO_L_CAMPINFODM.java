/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국경영-구독유지켐페인조회-캠페인목록조회
* 작성일자 : 2008-10-17
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
 *지국경영-구독유지켐페인조회-캠페인목록조회
 */

public class CO_L_CAMPINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String camptypecd;
	public String campdate_s;
	public String campdate_e;
	public String campnm;
	public String campplanpersid;
	public String campmclscd;

	public CO_L_CAMPINFODM(){}
	public CO_L_CAMPINFODM(String camptypecd, String campdate_s, String campdate_e, String campnm, String campplanpersid, String campmclscd){
		this.camptypecd = camptypecd;
		this.campdate_s = campdate_s;
		this.campdate_e = campdate_e;
		this.campnm = campnm;
		this.campplanpersid = campplanpersid;
		this.campmclscd = campmclscd;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public void setCampdate_s(String campdate_s){
		this.campdate_s = campdate_s;
	}

	public void setCampdate_e(String campdate_e){
		this.campdate_e = campdate_e;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setCampplanpersid(String campplanpersid){
		this.campplanpersid = campplanpersid;
	}

	public void setCampmclscd(String campmclscd){
		this.campmclscd = campmclscd;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}

	public String getCampdate_s(){
		return this.campdate_s;
	}

	public String getCampdate_e(){
		return this.campdate_e;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getCampplanpersid(){
		return this.campplanpersid;
	}

	public String getCampmclscd(){
		return this.campmclscd;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_CAMPINFO( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_CAMPINFODM dm = (CO_L_CAMPINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.camptypecd);
		cstmt.setString(4, dm.campdate_s);
		cstmt.setString(5, dm.campdate_e);
		cstmt.setString(6, dm.campnm);
		cstmt.setString(7, dm.campplanpersid);
		cstmt.setString(8, dm.campmclscd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.CO_L_CAMPINFODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String camptypecd = req.getParameter("camptypecd");
if( camptypecd == null){
	System.out.println(this.toString+" : camptypecd is null" );
}else{
	System.out.println(this.toString+" : camptypecd is "+camptypecd );
}
String campdate_s = req.getParameter("campdate_s");
if( campdate_s == null){
	System.out.println(this.toString+" : campdate_s is null" );
}else{
	System.out.println(this.toString+" : campdate_s is "+campdate_s );
}
String campdate_e = req.getParameter("campdate_e");
if( campdate_e == null){
	System.out.println(this.toString+" : campdate_e is null" );
}else{
	System.out.println(this.toString+" : campdate_e is "+campdate_e );
}
String campnm = req.getParameter("campnm");
if( campnm == null){
	System.out.println(this.toString+" : campnm is null" );
}else{
	System.out.println(this.toString+" : campnm is "+campnm );
}
String campplanpersid = req.getParameter("campplanpersid");
if( campplanpersid == null){
	System.out.println(this.toString+" : campplanpersid is null" );
}else{
	System.out.println(this.toString+" : campplanpersid is "+campplanpersid );
}
String campmclscd = req.getParameter("campmclscd");
if( campmclscd == null){
	System.out.println(this.toString+" : campmclscd is null" );
}else{
	System.out.println(this.toString+" : campmclscd is "+campmclscd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String camptypecd = Util.checkString(req.getParameter("camptypecd"));
String campdate_s = Util.checkString(req.getParameter("campdate_s"));
String campdate_e = Util.checkString(req.getParameter("campdate_e"));
String campnm = Util.checkString(req.getParameter("campnm"));
String campplanpersid = Util.checkString(req.getParameter("campplanpersid"));
String campmclscd = Util.checkString(req.getParameter("campmclscd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String camptypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("camptypecd")));
String campdate_s = Util.Uni2Ksc(Util.checkString(req.getParameter("campdate_s")));
String campdate_e = Util.Uni2Ksc(Util.checkString(req.getParameter("campdate_e")));
String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
String campplanpersid = Util.Uni2Ksc(Util.checkString(req.getParameter("campplanpersid")));
String campmclscd = Util.Uni2Ksc(Util.checkString(req.getParameter("campmclscd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCamptypecd(camptypecd);
dm.setCampdate_s(campdate_s);
dm.setCampdate_e(campdate_e);
dm.setCampnm(campnm);
dm.setCampplanpersid(campplanpersid);
dm.setCampmclscd(campmclscd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 17 16:27:18 KST 2008 */