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


public class SS_U_EXCD_APPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String bocd;
	public String extncdusage;
	public String resitype;

	public SS_U_EXCD_APPRDM(){}
	public SS_U_EXCD_APPRDM(String uid, String bocd, String extncdusage, String resitype){
		this.uid = uid;
		this.bocd = bocd;
		this.extncdusage = extncdusage;
		this.resitype = resitype;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setExtncdusage(String extncdusage){
		this.extncdusage = extncdusage;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public String getUid(){
		return this.uid;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getExtncdusage(){
		return this.extncdusage;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_EXCD_APPR(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EXCD_APPRDM dm = (SS_U_EXCD_APPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.extncdusage);
		cstmt.setString(6, dm.resitype);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_EXCD_APPRDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("extncdusage = [" + getExtncdusage() + "]");
		System.out.println("resitype = [" + getResitype() + "]");
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String extncdusage = req.getParameter("extncdusage");
if( extncdusage == null){
	System.out.println(this.toString+" : extncdusage is null" );
}else{
	System.out.println(this.toString+" : extncdusage is "+extncdusage );
}
String resitype = req.getParameter("resitype");
if( resitype == null){
	System.out.println(this.toString+" : resitype is null" );
}else{
	System.out.println(this.toString+" : resitype is "+resitype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String bocd = Util.checkString(req.getParameter("bocd"));
String extncdusage = Util.checkString(req.getParameter("extncdusage"));
String resitype = Util.checkString(req.getParameter("resitype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String extncdusage = Util.Uni2Ksc(Util.checkString(req.getParameter("extncdusage")));
String resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("resitype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setBocd(bocd);
dm.setExtncdusage(extncdusage);
dm.setResitype(resitype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 21 17:11:40 KST 2015 */