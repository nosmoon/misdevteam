/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매지국-빌링 
* 작성일자 : 2009-08-28
* 작성자 : 권정윤 //
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 판매지국-빌링 //
 */

public class SS_U_PROCAUTOTRASDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String bastdt;
	public String filenm;
	public String sb;

	public SS_U_PROCAUTOTRASDM(){}
	public SS_U_PROCAUTOTRASDM(String uid, String bastdt, String filenm, String sb){
		this.uid = uid;
		this.bastdt = bastdt;
		this.filenm = filenm;
		this.sb = sb;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setBastdt(String bastdt){
		this.bastdt = bastdt;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setSb(String sb){
		this.sb = sb;
	}

	public String getUid(){
		return this.uid;
	}

	public String getBastdt(){
		return this.bastdt;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getSb(){
		return this.sb;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_PROCAUTOTRAS( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_PROCAUTOTRASDM dm = (SS_U_PROCAUTOTRASDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.bastdt);
		cstmt.setString(5, dm.filenm);
		cstmt.setString(6, dm.sb);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_PROCAUTOTRASDataSet();
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
String bastdt = req.getParameter("bastdt");
if( bastdt == null){
	System.out.println(this.toString+" : bastdt is null" );
}else{
	System.out.println(this.toString+" : bastdt is "+bastdt );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String sb = req.getParameter("sb");
if( sb == null){
	System.out.println(this.toString+" : sb is null" );
}else{
	System.out.println(this.toString+" : sb is "+sb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String bastdt = Util.checkString(req.getParameter("bastdt"));
String filenm = Util.checkString(req.getParameter("filenm"));
String sb = Util.checkString(req.getParameter("sb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String bastdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bastdt")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String sb = Util.Uni2Ksc(Util.checkString(req.getParameter("sb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setBastdt(bastdt);
dm.setFilenm(filenm);
dm.setSb(sb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 28 22:09:53 KST 2009 */